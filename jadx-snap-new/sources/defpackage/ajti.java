package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.ThreadFactory;

/* renamed from: ajti */
public final class ajti extends ajdw {
    private static final ajtk b = new ajtk("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    private ThreadFactory a;

    public ajti() {
        this(b);
    }

    private ajti(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    public final c b() {
        return new ajtj(this.a);
    }
}
