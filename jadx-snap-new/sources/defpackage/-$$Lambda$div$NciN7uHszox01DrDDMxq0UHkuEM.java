package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: lambda */
/* renamed from: -$$Lambda$div$NciN7uHszox01DrDDMxq0UHkuEM */
public final /* synthetic */ class -$$Lambda$div$NciN7uHszox01DrDDMxq0UHkuEM implements Runnable {
    private final /* synthetic */ div f$0;
    private final /* synthetic */ CountDownLatch f$1;

    public /* synthetic */ -$$Lambda$div$NciN7uHszox01DrDDMxq0UHkuEM(div div, CountDownLatch countDownLatch) {
        this.f$0 = div;
        this.f$1 = countDownLatch;
    }

    public final void run() {
        this.f$0.a(this.f$1);
    }
}
