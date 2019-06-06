package defpackage;

import defpackage.mci.a;

/* renamed from: mby */
public final class mby implements ajdu<a, a> {
    private final ajdp<Boolean> a;

    /* renamed from: mby$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            defpackage.mci.a aVar = (defpackage.mci.a) ajxm.a;
            obj = (Boolean) ajxm.b;
            akcr.a(obj, "shouldHide");
            return obj.booleanValue() ? defpackage.mci.a.a.a : aVar;
        }
    }

    public mby(ajdp<Boolean> ajdp) {
        akcr.b(ajdp, "hideSignal");
        Object j = ajdp.h(Boolean.FALSE).c(Boolean.FALSE).j(ajfu.a);
        akcr.a(j, "hideSignal\n            .…  .distinctUntilChanged()");
        this.a = j;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object j = ajwa.a(ajdp, this.a).p(a.a).j(ajfu.a);
        akcr.a(j, "Observables\n            …  .distinctUntilChanged()");
        return (ajdt) j;
    }
}
