package defpackage;

import android.app.Activity;
import android.view.WindowManager;
import com.brightcove.player.event.Event;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ablg */
public abstract class ablg extends ablj {
    private volatile boolean a;
    public final ajwl<ablf> b;
    boolean c;
    AtomicInteger d = new AtomicInteger(0);
    private final ajen e = new ajen();
    private final ajxe f = ajxh.a(new a(this));
    private final Activity g;
    private final ajwy<ablk> h;

    /* renamed from: ablg$a */
    static final class a extends akcs implements akbk<Long> {
        private /* synthetic */ ablg a;

        a(ablg ablg) {
            this.a = ablg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.i());
        }
    }

    /* renamed from: ablg$d */
    static final class d<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            akcr.b(bool, "shouldMonitorBadFrame");
            akcr.b(bool2, "shouldMonitorSwipe");
            return Boolean.valueOf(bool.booleanValue() | bool2.booleanValue());
        }
    }

    /* renamed from: ablg$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ ablg a;

        e(ablg ablg) {
            this.a = ablg;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                ablg ablg = this.a;
                ablg.c = true;
                ablg.a(ablg.d.get());
            }
        }
    }

    /* renamed from: ablg$b */
    static final class b<T> implements ajfb<ajej> {
        private /* synthetic */ ablg a;

        b(ablg ablg) {
            this.a = ablg;
        }

        public final /* synthetic */ void accept(Object obj) {
            ablg ablg = this.a;
            ablg.a(ablg.d.incrementAndGet());
        }
    }

    /* renamed from: ablg$c */
    static final class c implements ajev {
        private /* synthetic */ ablg a;

        c(ablg ablg) {
            this.a = ablg;
        }

        public final void run() {
            ablg ablg = this.a;
            ablg.b(ablg.d.decrementAndGet());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ablg.class), "frameIntervalNanos", "getFrameIntervalNanos()J");
    }

    public ablg(Activity activity, ajwy<ablk> ajwy) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajwy, "perfMonitorConfig");
        this.g = activity;
        this.h = ajwy;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<FrameRateMetric>()");
        this.b = ajwl;
    }

    public void a() {
        this.a = true;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (this.c && !this.a && i > 0) {
            a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (i <= 0 && this.a) {
            d();
        }
    }

    public void d() {
        this.a = false;
    }

    public final void e() {
        this.e.a(ajdx.a(((ablk) this.h.get()).b(new aaag()), (ajeb) ((ablk) this.h.get()).b(new abgc()), (ajex) d.a).a(ajef.a()).e((ajfb) new e(this)));
    }

    public final void f() {
        this.e.a(null);
        this.c = false;
        b(this.d.get());
    }

    public final long g() {
        return ((Number) this.f.b()).longValue();
    }

    public final ajdp<ablf> h() {
        Object b = this.b.e((ajfb) new b(this)).b((ajev) new c(this));
        akcr.a(b, "frameRatePublishSubject.…OnDispose { onDispose() }");
        return b;
    }

    /* Access modifiers changed, original: protected|final */
    public final long i() {
        Object systemService = this.g.getSystemService("window");
        if (systemService != null) {
            systemService = ((WindowManager) systemService).getDefaultDisplay();
            akcr.a(systemService, "(activity.getSystemServi…owManager).defaultDisplay");
            float refreshRate = systemService.getRefreshRate();
            return refreshRate < 10.0f ? 16666667 : (long) (1.0E9f / refreshRate);
        } else {
            throw new ajxt("null cannot be cast to non-null type android.view.WindowManager");
        }
    }
}
