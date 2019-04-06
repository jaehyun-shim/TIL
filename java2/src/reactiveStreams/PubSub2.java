package reactiveStreams;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jhshim3478@gmail.com on 2019-03-19
 * Blog : http://jaehyun-shim.github.io/blog/
 * Github : http://github.com/jaehyun-shim
 * <p>
 * <p>
 * Publisher > [Data1] > Operator(가공) > [Data2] > Op2 > [Data3] > Subscriber
 * <p>
 * Stream mapping filter readSub operator
 * <p>
 * 1. map (d1 > fn > d2)
 */
@Slf4j
public class PubSub2 {
    public static void main(String[] args) throws InterruptedException {
        Flow.Publisher<Integer> pub = iterPub(Stream.iterate(1, a -> a + 1).limit(10).collect(Collectors.toList()));
        //Flow.Publisher<Integer> mapPub = mapPub(pub, (Function<Integer, Integer>) s -> s * 10);
        //Flow.Publisher<Integer> map2Pub = mapPub(mapPub, (Function<Integer, Integer>) s -> -s);
        //Flow.Publisher<Integer> sumPub = sumPub(pub);
        Flow.Publisher<Integer> reducePub = reducePub(pub, 0, (BiFunction<Integer, Integer, Integer>) (a, b) -> a + b); //BiFunction: Param three
        reducePub.subscribe(logSub());
    }

    /*
     * BiFunction 을 이용하여 시작(기준 a)값과 합할 b를 각자릿수에 Sum Mapping
     * */
    private static Flow.Publisher<Integer> reducePub(Flow.Publisher<Integer> pub, int init, BiFunction<Integer, Integer, Integer> bf) {
        return new Flow.Publisher<Integer>() {
            @Override
            public void subscribe(Flow.Subscriber<? super Integer> sub) {
                pub.subscribe(new DelegateSub(sub) {
                    int result = init;

                    @Override
                    public void onNext(Integer i) {
                        result = bf.apply(result, i);
                    }

                    @Override
                    public void onComplete() {
                        sub.onNext(result);
                        sub.onComplete();
                    }
                });
            }
        };
    }

    /*
     * Function 을 이용한 Next 의 각자릿수에 합계 Mapping
     * */
    private static Flow.Publisher<Integer> mapPub(Flow.Publisher<Integer> pub, Function<Integer, Integer> f) {
        return new Flow.Publisher<Integer>() {

            @Override
            public void subscribe(Flow.Subscriber<? super Integer> sub) {
                pub.subscribe(new DelegateSub(sub) {
                    @Override
                    public void onNext(Integer i) {
                        super.onNext(f.apply(i));
                    }
                });
            }
        };
    }

    /*
     * Function 을 이용한 Next 의 각자릿수에 음수 Mapping
     * */
    private static Flow.Publisher<Integer> sumPub(Flow.Publisher<Integer> pub) {
        return new Flow.Publisher<Integer>() {
            @Override
            public void subscribe(Flow.Subscriber<? super Integer> sub) {
                pub.subscribe(new DelegateSub(sub) {
                    int sum = 0;

                    @Override
                    public void onNext(Integer i) {
                        sum += i;
                    }

                    @Override
                    public void onComplete() {
                        sub.onNext(sum);
                        super.onComplete();
                    }
                });
            }
        };
    }

    /*
     * 출력 Sub
     * */
    private static Flow.Subscriber<Integer> logSub() {
        return new Flow.Subscriber<Integer>() {
            @Override
            public void onSubscribe(Flow.Subscription s) {
                System.out.println("onSubscribe:");
                log.debug("onSubscribe:");
                s.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(Integer i) {
                System.out.println("onNext:" + i);
                log.debug("onNext:{}", i);

            }

            @Override
            public void onError(Throwable t) {
                System.out.println("onError:");
                log.debug("onError:", t);

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete:");
                log.debug("onComplete:");

            }
        };
    }

    /*
     * 요청값에 대한 루프 반환
     * */
    private static Flow.Publisher<Integer> iterPub(List<Integer> iter) {
        return new Flow.Publisher<Integer>() {
            @Override
            public void subscribe(Flow.Subscriber<? super Integer> sub) {
                sub.onSubscribe(new Flow.Subscription() {
                    @Override
                    public void request(long n) {
                        try {
                            System.out.println("iterPub:");

                            iter.forEach(s -> sub.onNext(s));
                            sub.onComplete();
                        } catch (Throwable t) {
                            sub.onError(t);
                        }
                    }

                    @Override
                    public void cancel() {
                        // 중간에 데이터 전송을 차단함
                    }
                });
            }
        };
    }

}
