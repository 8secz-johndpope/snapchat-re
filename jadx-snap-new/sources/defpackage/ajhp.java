package defpackage;

/* renamed from: ajhp */
public final class ajhp extends ajcx {
    private ajev a;

    public ajhp(ajev ajev) {
        this.a = ajev;
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
