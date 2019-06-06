package defpackage;

/* renamed from: krr */
public final class krr {
    public volatile krq a;
    public final mhk b;
    private final ksr c;

    public krr(ksr ksr, mhk mhk) {
        akcr.b(ksr, "lensAnalyticsReporter");
        akcr.b(mhk, "clock");
        this.c = ksr;
        this.b = mhk;
    }

    public final void a() {
        krq krq = this.a;
        if (krq != null) {
            this.a = null;
            this.c.a(krq.a(krm.a(this.b)));
        }
    }
}
