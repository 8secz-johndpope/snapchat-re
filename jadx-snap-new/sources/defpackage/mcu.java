package defpackage;

import defpackage.mde.b;

/* renamed from: mcu */
public final class mcu implements ajdu<b, b> {
    private final ajdp<lqf> a;
    private final zfw b;

    /* renamed from: mcu$a */
    static final class a<T> implements ajfl<Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isRecording");
            return bool.booleanValue();
        }
    }

    /* renamed from: mcu$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return new defpackage.mde.b.b();
        }
    }

    public mcu(ajdp<lqf> ajdp, zfw zfw) {
        akcr.b(ajdp, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = zfw;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object e = ajdp.e((ajdt) lqg.a(this.a, this.b).a((ajfl) a.a).p(b.a));
        akcr.a(e, "upstream.mergeWith(camer…lugView.Model.Hidden() })");
        return (ajdt) e;
    }
}
