package defpackage;

import defpackage.lsd.b;

/* renamed from: lri */
public final class lri implements ajdu<b, b> {
    private final ajdp<lrg.b> a;

    /* renamed from: lri$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            Object obj2 = (b) ajxm.a;
            lrg.b bVar = (lrg.b) ajxm.b;
            if (obj2 instanceof b.b) {
                b.b bVar2 = (b.b) obj2;
                if (bVar2.a && (bVar instanceof defpackage.lrg.b.a)) {
                    bVar2 = b.b.a(bVar2, false, null, 0, false, false, false, null, 126);
                }
                return bVar2;
            } else if (akcr.a(obj2, defpackage.lsd.b.a.a)) {
                return obj2;
            } else {
                throw new ajxk();
            }
        }
    }

    public lri(ajdp<lrg.b> ajdp) {
        akcr.b(ajdp, "closeButtonAppearance");
        this.a = ajdp;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object c = this.a.c(lrg.b.b.a);
        akcr.a(c, "closeButtonAppearance.de…ance.CloseButton.Visible)");
        Object p = myu.a(ajdp, c).p(a.a);
        akcr.a(p, "pairLatest(upstream, clo…      }\n                }");
        return (ajdt) p;
    }
}
