package defpackage;

import defpackage.lvi.b;

/* renamed from: luz */
public final class luz implements ajdu<b, b> {
    private final ajdp<lqf> a;
    private final zfw b;

    /* renamed from: luz$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            b bVar = (b) ajxm.a;
            obj = (Boolean) ajxm.b;
            akcr.a(obj, "hide");
            return obj.booleanValue() ? defpackage.lvi.b.a.a : bVar;
        }
    }

    public luz(ajdp<lqf> ajdp, zfw zfw) {
        akcr.b(ajdp, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = zfw;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object h = lqg.a(this.a, this.b).h(Boolean.FALSE);
        akcr.a(h, "forcedHide");
        Object p = ajwa.a(ajdp, h).p(a.a);
        akcr.a(p, "combineLatest(upstream, …l\n            }\n        }");
        return (ajdt) p;
    }
}
