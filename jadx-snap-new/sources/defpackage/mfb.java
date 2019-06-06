package defpackage;

import defpackage.mfu.b;

/* renamed from: mfb */
public final class mfb implements ajdu<b, b> {
    private final ajdp<Boolean> a;

    /* renamed from: mfb$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return ((Boolean) ajxm.b).booleanValue() ? defpackage.mfu.b.a.a : (b) ajxm.a;
        }
    }

    public mfb(ajdp<Boolean> ajdp) {
        akcr.b(ajdp, "startButtonHideSignal");
        this.a = ajdp;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object j = ajwa.a(ajdp, this.a).p(a.a).j(ajfu.a);
        akcr.a(j, "Observables\n            …  .distinctUntilChanged()");
        return (ajdt) j;
    }
}
