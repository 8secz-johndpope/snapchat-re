package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: lambda */
/* renamed from: -$$Lambda$lsimfB5AjtG4j9XnrYd5qD1G4b8 */
public final /* synthetic */ class -$$Lambda$lsimfB5AjtG4j9XnrYd5qD1G4b8 implements Callable {
    private final /* synthetic */ AtomicReference f$0;

    public /* synthetic */ -$$Lambda$lsimfB5AjtG4j9XnrYd5qD1G4b8(AtomicReference atomicReference) {
        this.f$0 = atomicReference;
    }

    public final Object call() {
        return (dva) this.f$0.get();
    }
}
