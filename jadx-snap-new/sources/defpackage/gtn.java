package defpackage;

import android.content.Context;
import defpackage.asj.a;

/* renamed from: gtn */
public final class gtn implements gpy {
    final Context a;
    final ajwy<zgb> b;
    private final ajxe c = ajxh.a(new a(this));
    private final ajwy<gtr> d;

    /* renamed from: gtn$b */
    static final class b<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ gtn a;

        b(gtn gtn) {
            this.a = gtn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            obj = ajcx.a((ajev) new c(this.a, bool.booleanValue()));
            akcr.a(obj, "Completable.fromAction {…)\n            }\n        }");
            return obj;
        }
    }

    /* renamed from: gtn$c */
    static final class c implements ajev {
        private /* synthetic */ gtn a;
        private /* synthetic */ boolean b;

        c(gtn gtn, boolean z) {
            this.a = gtn;
            this.b = z;
        }

        public final void run() {
            if (this.b) {
                aiqj.a(this.a.a, new a().a());
                asj.f().a("APP_NAME", "Mushroom");
            }
        }
    }

    /* renamed from: gtn$a */
    static final class a extends akcs implements akbk<zfw> {
        private /* synthetic */ gtn a;

        a(gtn gtn) {
            this.a = gtn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.b.get();
            return zgb.a(gqe.a, "CrashlyticsCrashProcessor");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gtn.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public gtn(Context context, ajwy<gtr> ajwy, ajwy<zgb> ajwy2) {
        akcr.b(context, "context");
        akcr.b(ajwy, "crashlyticsGateKeeper");
        akcr.b(ajwy2, "schedulersProvider");
        this.a = context;
        this.d = ajwy;
        this.b = ajwy2;
    }

    public final ajcx a() {
        Object e = ((gtr) this.d.get()).a().b((ajdw) ((zfw) this.c.b()).b()).e((ajfc) new b(this));
        akcr.a(e, "crashlyticsGateKeeper.ge…tupCrashlytics(enabled) }");
        return e;
    }
}
