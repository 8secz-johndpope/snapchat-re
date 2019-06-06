package defpackage;

/* renamed from: acip */
public final class acip<T extends achg, C extends achd<T, C>> extends acii<T, C> {
    private final achb<T, C> a;
    private final C b;

    public /* synthetic */ acip(achb achb, achd achd, acgu acgu) {
        this(achb, achd, acgu, null);
    }

    public acip(achb<T, C> achb, C c, acgu<T> acgu, acih acih) {
        akcr.b(achb, "navigationHost");
        akcr.b(c, "pageController");
        akcr.b(acgu, "navigationAction");
        super((acgu) acgu, acih);
        this.a = achb;
        this.b = c;
    }

    public final void a(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        super.a(achc, acjd);
        achb achb = this.a;
        achd achd = this.b;
        akcr.b(achd, "unfixedPageController");
        achb.d();
        acgs acgs = achb.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        acgs.a(achd);
    }
}
