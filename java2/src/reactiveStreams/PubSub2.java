package reactiveStreams;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.Flow;
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
//@Slf4j
public class PubSub2 {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PubSub2.class);

    public static void main(String[] args) throws InterruptedException {
        Flow.Publisher<Integer> pub = iterPub(Stream.iterate(1, a -> a + 1).limit(10).collect(Collectors.toList()));
        Flow.Publisher<Integer> mapPub = mapPub(pub, (Function<Integer, Integer>) s -> s * 10);
        //Flow.Publisher<Integer> map2Pub = mapPub(pub, (Function<Integer, Integer>) s -> -s);
        mapPub.subscribe(logSub());
    }

    private static Flow.Publisher<Integer> mapPub(Flow.Publisher<Integer> pub, Function<Integer, Integer> f) {
        return new Flow.Publisher<Integer>() {

            @Override
            public void subscribe(Flow.Subscriber<? super Integer> sub) {
                pub.subscribe(new Flow.Subscriber<Integer>() {
                    @Override
                    public void onSubscribe(Flow.Subscription s) {
                        sub.onSubscribe(s);
                    }

                    @Override
                    public void onNext(Integer i) {
                        sub.onNext(f.apply(i));
                    }

                    @Override
                    public void onError(Throwable t) {
                        sub.onError(t);
                    }

                    @Override
                    public void onComplete() {
                        sub.onComplete();
                    }
                });
            }
        };
    }


    private static Flow.Subscriber<Integer> logSub() {
        return new Flow.Subscriber<Integer>() {
            @Override
            public void onSubscribe(Flow.Subscription s) {
                log.debug("onSubscribe:");
                s.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(Integer i) {
                log.debug("onNext:{}", i);

            }

            @Override
            public void onError(Throwable t) {
                log.debug("onError:", t);

            }

            @Override
            public void onComplete() {
                log.debug("onComplete:");

            }
        };
    }

    private static Flow.Publisher<Integer> iterPub(List<Integer> iter) {
        return new Flow.Publisher<Integer>() {
            @Override
            public void subscribe(Flow.Subscriber<? super Integer> sub) {
                sub.onSubscribe(new Flow.Subscription() {
                    @Override
                    public void request(long n) {
                        try {
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
