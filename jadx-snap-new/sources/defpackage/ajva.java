package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajva */
public abstract class ajva<T> extends ajdp<T> {
    public final ajdp<T> a() {
        return ajvo.a(new ajqd(this));
    }

    public abstract void a(ajfb<? super ajej> ajfb);

    public final ajdp<T> g(long j, TimeUnit timeUnit, ajdw ajdw) {
        return h(j, timeUnit, ajdw);
    }

    public ajdp<T> g(ajfb<? super ajej> ajfb) {
        return ajvo.a(new ajnt(this, 1, ajfb));
    }

    public final ajdp<T> h(long j, TimeUnit timeUnit, ajdw ajdw) {
        ajfv.a(1, "subscriberCount");
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajqd(this, j, timeUnit, ajdw));
    }
}
