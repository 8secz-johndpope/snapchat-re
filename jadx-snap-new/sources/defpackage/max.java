package defpackage;

import defpackage.mbh.b;

/* renamed from: max */
public final class max implements ajdu<b, b> {
    private final ajdp<Boolean> a;

    /* renamed from: max$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            b bVar = (b) ajxm.a;
            obj = (Boolean) ajxm.b;
            if (bVar instanceof b.b) {
                akcr.a(obj, "shouldHide");
                if (obj.booleanValue()) {
                    return defpackage.mbh.b.a.a;
                }
            }
            return bVar;
        }
    }

    public max(ajdp<Boolean> ajdp) {
        akcr.b(ajdp, "hideWhen");
        this.a = ajdp;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object h = this.a.h(Boolean.FALSE);
        akcr.a(h, "hideWhen.startWith(false)");
        Object p = myu.a(ajdp, h).j(ajfu.a).p(a.a);
        akcr.a(p, "pairLatest(upstream, hid…      }\n                }");
        return (ajdt) p;
    }
}
