package defpackage;

import android.content.Context;
import com.snap.core.durablejob.schedulers.work.WorkManagerWorker;
import defpackage.gca.b;
import defpackage.pl.a;
import java.util.concurrent.TimeUnit;

/* renamed from: gbx */
public final class gbx implements gby {
    private final Context a;
    private final ajwy<ftl> b;
    private final ajwy<gca> c;

    /* renamed from: gbx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public gbx(Context context, ajwy<ftl> ajwy, ajwy<gca> ajwy2) {
        akcr.b(context, "context");
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "workManagerInitializer");
        this.a = context;
        this.b = ajwy;
        this.c = ajwy2;
    }

    public final void a(gcc gcc, boolean z) {
        String str = "injector";
        akcr.b(gcc, str);
        this.c.get();
        Context context = this.a;
        akcr.b(context, "context");
        akcr.b(gcc, str);
        Object a = new a().a(new b(gcc)).a();
        akcr.a(a, "Configuration.Builder()\n….setMaxSchedulerLimit(20)");
        if (z) {
            a.b();
        }
        pw.a(context, a.c());
    }

    public final void b() {
        String str = "WorkManagerWakeUpScheduler";
        Object c = ((pt.a) ((pt.a) new pt.a(WorkManagerWorker.class, (long) ((ftl) this.b.get()).f(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_START), TimeUnit.MINUTES).a(pk.LINEAR, TimeUnit.SECONDS)).a(str)).c();
        akcr.a(c, "PeriodicWorkRequest\n    …                 .build()");
        akcr.a(pw.a().a(str, 1, (pt) c), "WorkManager.getInstance(…kPolicy.REPLACE, request)");
    }

    public final void c() {
        pw.a().a("WorkManagerWakeUpScheduler");
    }
}
