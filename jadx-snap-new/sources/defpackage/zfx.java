package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: zfx */
public final class zfx {

    /* renamed from: zfx$a */
    public static final class a extends zga {
        private /* synthetic */ ajdw d;
        private /* synthetic */ ajdw e;
        private /* synthetic */ int f;

        /* renamed from: zfx$a$a */
        static final class a implements Runnable {
            private /* synthetic */ a a;
            private /* synthetic */ ajei b;
            private /* synthetic */ Runnable c;

            a(a aVar, ajei ajei, Runnable runnable) {
                this.a = aVar;
                this.b = ajei;
                this.c = runnable;
            }

            public final void run() {
                this.b.a(super.a(this.c));
            }
        }

        /* renamed from: zfx$a$b */
        static final class b implements Runnable {
            private /* synthetic */ a a;
            private /* synthetic */ ajei b;
            private /* synthetic */ Runnable c;

            b(a aVar, ajei ajei, Runnable runnable) {
                this.a = aVar;
                this.b = ajei;
                this.c = runnable;
            }

            public final void run() {
                this.b.a(super.a(this.c));
            }
        }

        a(ajdw ajdw, ajdw ajdw2, int i, ajfc ajfc, ajdw ajdw3) {
            this.d = ajdw;
            this.e = ajdw2;
            this.f = i;
            super(ajfc, ajdw3);
        }

        public final ajej a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            akcr.b(runnable, "run");
            akcr.b(timeUnit, "unit");
            if (j > 0 || j2 > 0) {
                ajei ajei = new ajei();
                ajei.a(this.e.a(new b(this, ajei, runnable), j, j2, timeUnit));
                return ajei;
            }
            Object a = super.a(runnable, j, j2, timeUnit);
            akcr.a(a, "super.schedulePeriodical…itialDelay, period, unit)");
            return a;
        }

        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            akcr.b(runnable, "run");
            akcr.b(timeUnit, "unit");
            if (j > 0) {
                ajei ajei = new ajei();
                ajei.a(this.e.a(new a(this, ajei, runnable), j, timeUnit));
                return ajei;
            }
            Object a = super.a(runnable, j, timeUnit);
            akcr.a(a, "super.scheduleDirect(run, delay, unit)");
            return a;
        }
    }

    /* renamed from: zfx$b */
    static final class b<T, R> implements ajfc<ajde<ajde<ajcx>>, ajcx> {
        private /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajde ajde = (ajde) obj;
            akcr.b(ajde, "workers");
            akuw akuw = ajde;
            return ajcx.a((akuw) ajde.a(akuw).a(ajfu.a, ajde.a, ajde.a), this.a, false);
        }
    }

    private static ajdw a(ajdw ajdw, int i, ajdw ajdw2) {
        akcr.b(ajdw, "receiver$0");
        akcr.b(ajdw2, "delayScheduler");
        if (akcr.a((Object) ajdw2, (Object) ajdw)) {
            throw new IllegalArgumentException("You cannot use the same scheduler for scheduling delayed tasks");
        }
        return new a(ajdw, ajdw instanceof ajwi ? ajdw : ajdw2, i, new b(i), ajdw);
    }

    public static final zfg a(Handler handler, idd idd) {
        akcr.b(handler, "receiver$0");
        akcr.b(idd, "callsite");
        return new zfg(handler, idd);
    }
}
