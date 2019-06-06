package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: lambda */
/* renamed from: -$$Lambda$wYh067be8FNfa2u-WC-x-EKijwM */
public final /* synthetic */ class -$$Lambda$wYh067be8FNfa2u-WC-x-EKijwM implements Callable {
    private final /* synthetic */ AtomicReference f$0;

    public /* synthetic */ -$$Lambda$wYh067be8FNfa2u-WC-x-EKijwM(AtomicReference atomicReference) {
        this.f$0 = atomicReference;
    }

    public final Object call() {
        return this.f$0.get();
    }
}
