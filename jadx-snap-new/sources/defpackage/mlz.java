package defpackage;

import defpackage.miq.c.a;
import defpackage.miw.c;
import defpackage.mpf.a.b;

/* renamed from: mlz */
public final class mlz implements mpf {
    final miw a;
    final mpf b;
    private final ajxe c = ajxh.a(new b(this));
    private final a d;
    private final zfw e;

    /* renamed from: mlz$b */
    static final class b extends akcs implements akbk<c> {
        private /* synthetic */ mlz a;

        b(mlz mlz) {
            this.a = mlz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(defpackage.miw.b.a.a);
        }
    }

    /* renamed from: mlz$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mlz a;

        a(mlz mlz) {
            this.a = mlz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return this.a.b.a(new b(str));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mlz.class), "reader", "getReader()Lcom/snap/lenses/config/ConfigurationRepository$Reader;");
    }

    public mlz(a aVar, miw miw, mpf mpf, zfw zfw) {
        akcr.b(aVar, "defaultUri");
        akcr.b(miw, "configurationRepository");
        akcr.b(mpf, "nameResolvingRepository");
        akcr.b(zfw, "qualifiedSchedulers");
        this.d = aVar;
        this.a = miw;
        this.b = mpf;
        this.e = zfw;
    }

    public final ajdp<miq> a(mpf.a aVar) {
        ajdp h;
        akcr.b(aVar, "queryCriteria");
        if (akcr.a((Object) aVar, mpf.a.a.a)) {
            h = ((c) this.c.b()).f(mja.TRACKING_DATA_NAME).u(new a(this)).h(this.d);
        } else if (aVar instanceof b) {
            h = this.b.a(aVar);
        } else {
            throw new ajxk();
        }
        Object b = h.b((ajdw) this.e.f());
        akcr.a(b, "when (queryCriteria) {\n …qualifiedSchedulers.io())");
        return b;
    }
}
