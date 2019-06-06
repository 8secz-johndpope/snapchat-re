package defpackage;

import defpackage.lrg.a;
import defpackage.lsd.b;

/* renamed from: lrh */
public final class lrh implements ajdu<b, b> {
    private final ajdp<a> a;

    /* renamed from: lrh$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            b bVar = (b) ajxm.a;
            defpackage.lrg.a aVar = (defpackage.lrg.a) ajxm.b;
            if (aVar instanceof defpackage.lrg.a.a) {
                return defpackage.lsd.b.a.a;
            }
            if (aVar instanceof defpackage.lrg.a.b) {
                return bVar;
            }
            throw new ajxk();
        }
    }

    public lrh(ajdp<a> ajdp) {
        akcr.b(ajdp, "closeButtonAppearance");
        this.a = ajdp;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object c = this.a.c(a.b.a);
        akcr.a(c, "closeButtonAppearance.de…elAppearance.All.Visible)");
        Object p = myu.a(ajdp, c).p(a.a);
        akcr.a(p, "pairLatest(upstream, clo…      }\n                }");
        return (ajdt) p;
    }
}
