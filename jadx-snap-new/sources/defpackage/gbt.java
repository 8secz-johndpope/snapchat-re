package defpackage;

import android.content.Context;
import com.snap.core.durablejob.schedulers.direct.FirebasePeriodicWakeUpService;
import java.util.concurrent.TimeUnit;

/* renamed from: gbt */
public final class gbt implements gbv {
    final Context a;
    final ajwy<ftl> b;
    private final String c = "PeriodicFirebaseWakeUpScheduler";
    private final int d = 50;
    private final int e = 80;
    private final ajxe f = ajxh.a(new b(this));
    private final ajwy<gbw> g;

    /* renamed from: gbt$b */
    static final class b extends akcs implements akbk<baf> {
        private /* synthetic */ gbt a;

        b(gbt gbt) {
            this.a = gbt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new baf(new bah(this.a.a));
        }
    }

    /* renamed from: gbt$a */
    static final class a implements Runnable {
        private /* synthetic */ gbt a;

        a(gbt gbt) {
            this.a = gbt;
        }

        public final void run() {
            this.a.a().a(FirebasePeriodicWakeUpService.n);
        }
    }

    /* renamed from: gbt$c */
    static final class c implements Runnable {
        private /* synthetic */ gbt a;

        c(gbt gbt) {
            this.a = gbt;
        }

        public final void run() {
            baf a = this.a.a();
            gbt gbt = this.a;
            int i = 50;
            int i2 = 80;
            if (((ftl) gbt.b.get()).a((fth) fxq.DURABLE_JOB_MUSHROOM_WAKEUP_USE_CUSTOM_SCHEDULE)) {
                i = ((ftl) gbt.b.get()).f(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_START);
                i2 = ((ftl) gbt.b.get()).f(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_END);
            }
            bao k = gbt.a().a().a(FirebasePeriodicWakeUpService.class).a(FirebasePeriodicWakeUpService.n).a((bau) bay.a((int) TimeUnit.MINUTES.toSeconds((long) i), (int) TimeUnit.MINUTES.toSeconds((long) i2))).m().l().j().a(bax.b).k();
            akcr.a((Object) k, "jobScheduler.newJobBuild…\n                .build()");
            a.a(k);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gbt.class), "jobScheduler", "getJobScheduler()Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;");
    }

    public gbt(Context context, ajwy<ftl> ajwy, ajwy<gbw> ajwy2) {
        akcr.b(context, "context");
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "wakeupSerialSchedulerManager");
        this.a = context;
        this.b = ajwy;
        this.g = ajwy2;
    }

    /* Access modifiers changed, original: final */
    public final baf a() {
        return (baf) this.f.b();
    }

    public final void b() {
        ((gbw) this.g.get()).a.a((Runnable) new c(this));
    }

    public final void c() {
        ((gbw) this.g.get()).a.a((Runnable) new a(this));
    }
}
