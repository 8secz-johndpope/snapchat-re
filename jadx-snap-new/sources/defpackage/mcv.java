package defpackage;

import defpackage.mde.b;

/* renamed from: mcv */
public final class mcv implements ajdu<b, b> {
    private final ajdp<Boolean> a;

    /* renamed from: mcv$a */
    static final class a<T> implements ajfl<Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldHide");
            return bool.booleanValue();
        }
    }

    /* renamed from: mcv$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return new defpackage.mde.b.b();
        }
    }

    public mcv(ajdp<Boolean> ajdp) {
        akcr.b(ajdp, "hideWhen");
        this.a = ajdp;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object e = ajdp.e((ajdt) this.a.a((ajfl) a.a).p(b.a));
        akcr.a(e, "upstream.mergeWith(\n    …lugView.Model.Hidden() })");
        return (ajdt) e;
    }
}
