package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.jwq.c;
import java.util.concurrent.TimeUnit;

/* renamed from: jym */
public final class jym extends zgi {
    final jyp a;
    final jwk b;
    final jwq c;
    private final ppn d;

    /* renamed from: jym$c */
    static final class c<T> implements ajfb<Integer> {
        private /* synthetic */ jym a;

        c(jym jym) {
            this.a = jym;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            jyp jyp = this.a.a;
            akcr.a(obj, "level");
            jyp.a(obj.intValue());
        }
    }

    /* renamed from: jym$a */
    static final class a implements ajev {
        private /* synthetic */ jym a;

        a(jym jym) {
            this.a = jym;
        }

        public final void run() {
            jym jym = this.a;
            jym.a.a();
            jwq jwq = jym.c;
            jwq.a.a();
            ajej a = jwq.a().b().a(new c(jwq), TelemetryConstants.FLUSH_DELAY_MS, TimeUnit.MILLISECONDS);
            akcr.a((Object) a, "animatedWebPSchedulers.c…S, TimeUnit.MILLISECONDS)");
            ajvv.a(a, jwq.a);
        }
    }

    /* renamed from: jym$b */
    static final class b implements ajev {
        private /* synthetic */ jym a;

        b(jym jym) {
            this.a = jym;
        }

        public final void run() {
            this.a.b.a(iot.BITMAP_BG_LEAK);
        }
    }

    public jym(ppn ppn, jyp jyp, jwk jwk, jwq jwq, zgk<b> zgk) {
        akcr.b(ppn, "appMemoryMonitor");
        akcr.b(jyp, "imageLoadingMemoryController");
        akcr.b(jwk, "disposableBitmapFactory");
        akcr.b(jwq, "imageLoadingViewDependencies");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.d = ppn;
        this.a = jyp;
        this.b = jwk;
        this.c = jwq;
    }

    public final ajej a() {
        this.c.a.a();
        ajei ajei = new ajei();
        ajej a = ajek.a((ajev) new a(this));
        akcr.a((Object) a, "Disposables.fromAction {…  clearMemory()\n        }");
        ajvv.a(a, ajei);
        a = ajek.a((ajev) new b(this));
        akcr.a((Object) a, "Disposables.fromAction {…BITMAP_BG_LEAK)\n        }");
        ajvv.a(a, ajei);
        return ajei;
    }

    public final ajej b() {
        Object f = this.d.a().f((ajfb) new c(this));
        akcr.a(f, "appMemoryMonitor.trimMem…imMemory(level)\n        }");
        return f;
    }
}
