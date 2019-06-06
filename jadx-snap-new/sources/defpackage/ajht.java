package defpackage;

/* renamed from: ajht */
public final class ajht extends ajcx {
    private Runnable a;

    public ajht(Runnable runnable) {
        this.a = runnable;
    }

    public final void b(ajcz ajcz) {
        ajej a = ajek.a(ajfu.b);
        ajcz.a(a);
        try {
            this.a.run();
            if (!a.isDisposed()) {
                ajcz.a();
            }
        } catch (Throwable th) {
            ajep.a(th);
            if (!a.isDisposed()) {
                ajcz.a(th);
            }
        }
    }
}
