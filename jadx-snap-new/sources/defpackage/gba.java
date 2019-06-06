package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: gba */
public final class gba extends zgi {
    final ajwy<hwl> a;
    private final ajxe b = ajxh.a(new b(this));
    private zgb c;
    private final ajwy<ftl> d;

    /* renamed from: gba$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ gba a;

        b(gba gba) {
            this.a = gba;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hwj.a, "DurableJobLifecycleObserver");
        }
    }

    /* renamed from: gba$a */
    static final class a implements Runnable {
        private /* synthetic */ gba a;

        a(gba gba) {
            this.a = gba;
        }

        public final void run() {
            ((hwl) this.a.a.get()).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gba.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public gba(zgb zgb, ajwy<hwl> ajwy, ajwy<ftl> ajwy2, zgk<b> zgk) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "durableJobManager");
        akcr.b(ajwy2, "configurationProvider");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.c = zgb;
        this.a = ajwy;
        this.d = ajwy2;
    }

    public final ajej a() {
        ((ftl) this.d.get()).a((fth) fxq.DURABLE_JOB_MUSHROOM_WAKEUP_USE_CUSTOM_SCHEDULE);
        ((ftl) this.d.get()).w(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_USE_CUSTOM_SCHEDULE);
        ((ftl) this.d.get()).a((fth) fxq.DURABLE_JOB_MUSHROOM_WORKMANAGER_WAKEUP_EMABLED);
        ((ftl) this.d.get()).w(fxq.DURABLE_JOB_MUSHROOM_WORKMANAGER_WAKEUP_EMABLED);
        Object a = super.a();
        akcr.a(a, "super.onForeground()");
        return a;
    }

    public final ajej b() {
        Object a = ((zfw) this.b.b()).f().a((Runnable) new a(this));
        akcr.a(a, "schedulers.io().schedule…)\n            }\n        }");
        return a;
    }
}
