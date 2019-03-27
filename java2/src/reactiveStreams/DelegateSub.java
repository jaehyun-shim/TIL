package reactiveStreams;

import java.util.concurrent.Flow;

/**
 * Created by jhshim3478@gmail.com on 2019-03-26
 * Blog : http://jaehyun-shim.github.io/blog/
 * Github : http://github.com/jaehyun-shim
 */
public class DelegateSub implements Flow.Subscriber<Integer> {
    Flow.Subscriber sub;

    public DelegateSub(Flow.Subscriber sub) {
        this.sub = sub;
    }

    @Override
    public void onSubscribe(Flow.Subscription s) {
        sub.onSubscribe(s);
    }

    @Override
    public void onNext(Integer i) {
        sub.onNext(i);
    }

    @Override
    public void onError(Throwable t) {
        sub.onError(t);
    }

    @Override
    public void onComplete() {
        sub.onComplete();
    }
}
