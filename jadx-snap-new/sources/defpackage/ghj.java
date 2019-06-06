package defpackage;

import defpackage.sbm.a;

/* renamed from: ghj */
public final class ghj implements jws {
    final ihh a;
    private final gee b;

    /* renamed from: ghj$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ ghj a;
        private /* synthetic */ long b;

        a(ghj ghj, long j) {
            this.a = ghj;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return new gil(gej, this.a.a.c() - this.b);
        }
    }

    public ghj(gee gee, ihh ihh) {
        akcr.b(gee, "contentManager");
        akcr.b(ihh, "clock");
        this.b = gee;
        this.a = ihh;
    }

    public final ajdx<jxd> a(String str) {
        akcr.b(str, "url");
        long c = this.a.c();
        Object a = this.b.a(new gew(str, new a(str, sac.GET).e(), null, gii.a, ghv.a, rzg.a.a(idn.a), ajyy.a, 268)).a(false);
        akcr.a(a, "contentManager.submit(De…      )).getResult(false)");
        a = a.f(new a(this, c));
        akcr.a(a, "submit(url).map {\n      …time() - start)\n        }");
        return a;
    }
}
