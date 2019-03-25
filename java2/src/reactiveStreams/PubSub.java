package reactiveStreams;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jhshim3478@gmail.com on 2019-03-19
 * Blog : http://jaehyun-shim.github.io/blog/
 * Github : http://github.com/jaehyun-shim
 *
 *
 * Publisher > [Data1] > Operator(가공) > [Data2] > Op2 > [Data3] > Subscriber
 *
 * 스트림 맵핑 필터 리드서 가공작업
 *
 * 1. map (d1 > fn > d2)
 *
 *
 */
public class PubSub {
    public static void main(String[] args) throws InterruptedException {
        // Iterable<Integer> itr = Arrays.asList(1, 2, 3, 4, 5);
        ExecutorService es = Executors.newSingleThreadExecutor();

        Flow.Publisher p = new Flow.Publisher() {
            Iterable<Integer> iter = Stream.iterate(1, a -> a + 1).limit(10).collect(Collectors.toList());

            @Override
            public void subscribe(Flow.Subscriber subscriber) {

                Iterator<Integer> it = iter.iterator();

                subscriber.onSubscribe(new Flow.Subscription() {

                    @Override
                    public void request(long n) {
                        // iter.forEach(s -> subscriber.onNext(s));
                        // subscriber.onComplete();
                        // Future<?> f = es.submit(() -> { // 중간에 작업을 취소할 수 있음.(비동기)
                        es.execute(() -> {
                            int i = 0;
                            try {
                                while (i++ < n) { // while (true) { // n 스레드 한정위반
                                    if (it.hasNext()) {
                                        subscriber.onNext(it.next());
                                    } else {
                                        subscriber.onComplete();
                                        break;
                                    }
                                }
                            } catch (RuntimeException e) {
                                subscriber.onError(e);
                            }
                        });
                    }

                    @Override
                    public void cancel() {

                    }
                });
            }
        };

        Flow.Subscriber<Integer> s = new Flow.Subscriber<Integer>() {
            Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("onSubscribe");
                this.subscription = subscription;
                this.subscription.request(2); // subscription.request(Long.MAX_VALUE);
            }

            //int bufferSize = 2;

            @Override
            public void onNext(Integer item) {
                System.out.println("onNext" + item);
                /*if (--bufferSize <= 0) {
                    bufferSize = 2;
                    this.subscription.request(2);
                }*/
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError : " + throwable);
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        p.subscribe(s);

        es.awaitTermination(10, TimeUnit.HOURS);
        es.shutdown();

    }
}
