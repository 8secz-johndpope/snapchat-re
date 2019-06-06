package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: lambda */
/* renamed from: -$$Lambda$igv$RF8r2UxGHNf3VWvl5U_JBu09I5E */
public final /* synthetic */ class -$$Lambda$igv$RF8r2UxGHNf3VWvl5U_JBu09I5E implements Runnable {
    private final /* synthetic */ AtomicBoolean f$0;
    private final /* synthetic */ Runnable f$1;

    public /* synthetic */ -$$Lambda$igv$RF8r2UxGHNf3VWvl5U_JBu09I5E(AtomicBoolean atomicBoolean, Runnable runnable) {
        this.f$0 = atomicBoolean;
        this.f$1 = runnable;
    }

    public final void run() {
        igv.a(this.f$0, this.f$1);
    }
}
