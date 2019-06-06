package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: lambda */
/* renamed from: -$$Lambda$GWA3ZX9cFeUehLlev1QS4uB3GHw */
public final /* synthetic */ class -$$Lambda$GWA3ZX9cFeUehLlev1QS4uB3GHw implements ajev {
    private final /* synthetic */ CountDownLatch f$0;

    public /* synthetic */ -$$Lambda$GWA3ZX9cFeUehLlev1QS4uB3GHw(CountDownLatch countDownLatch) {
        this.f$0 = countDownLatch;
    }

    public final void run() {
        this.f$0.countDown();
    }
}
