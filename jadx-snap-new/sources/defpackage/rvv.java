package defpackage;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.concurrent.TimeUnit;

/* renamed from: rvv */
public final class rvv extends zgi implements achk<zjm, zjk> {
    final Stopwatch a = Stopwatch.createUnstarted(new b(this));
    zjm b;
    final aipn<achb<zjm, zjk>> c;
    final ihh d;
    private zjm e;
    private final aipn<dib> f;
    private final zgk<b> g;
    private final ajwy<diw> h;

    /* renamed from: rvv$b */
    public static final class b extends Ticker {
        private /* synthetic */ rvv a;

        b(rvv rvv) {
            this.a = rvv;
        }

        public final long read() {
            return TimeUnit.NANOSECONDS.convert(this.a.d.c(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: rvv$a */
    static final class a implements ajev {
        private /* synthetic */ rvv a;

        a(rvv rvv) {
            this.a = rvv;
        }

        public final void run() {
            rvv rvv = this.a;
            ((achb) rvv.c.get()).b((achk) rvv);
            rvv.a(rvv.b, rvv.b, aajv.ENTER_BACKGROUND);
            rvv.a.reset();
            rvv.a(null);
            rvv.b(null);
        }
    }

    public rvv(aipn<achb<zjm, zjk>> aipn, aipn<dib> aipn2, ihh ihh, zgk<b> zgk, ajwy<diw> ajwy) {
        akcr.b(aipn, "navHost");
        akcr.b(aipn2, "logger");
        akcr.b(ihh, "clock");
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy, "sessionSummaryDataProvider");
        super(zgk);
        this.c = aipn;
        this.f = aipn2;
        this.d = ihh;
        this.g = zgk;
        this.h = ajwy;
    }

    private static /* synthetic */ void a(rvv rvv, zjm zjm, zjm zjm2, int i) {
        if ((i & 2) != 0) {
            zjm2 = null;
        }
        rvv.a(zjm, zjm2, null);
    }

    private static zjm c(zjm zjm) {
        return akcr.a((Object) zjm, zjn.a) ? null : zjm;
    }

    public final ajej a() {
        ((achb) this.c.get()).a((achk) this);
        Object c = ((achb) this.c.get()).c ? rvv.c((zjm) ((achb) this.c.get()).h()) : null;
        if ((akcr.a(c, this.b) ^ 1) != 0) {
            rvv.a(this, c, null, 6);
        }
        c = ajek.a((ajev) new a(this));
        akcr.a(c, "Disposables.fromAction({ onActivityPause() })");
        return c;
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public final void a(zjm zjm) {
        this.b = rvv.c(zjm);
    }

    /* Access modifiers changed, original: final */
    public final void a(zjm zjm, zjm zjm2, aajv aajv) {
        Object obj = this.a;
        akcr.a(obj, "stopwatch");
        if (obj.isRunning()) {
            long elapsed = this.a.stop().elapsed(TimeUnit.MILLISECONDS);
            zjm zjm3 = this.b;
            zjm zjm4 = this.e;
            if (rvv.c(zjm3) != null) {
                zjm3 = rvv.c(zjm3);
                if (zjm3 != null) {
                    idg idg = zjm3.d;
                    if (idg != null) {
                        String str = idg.a;
                        if (str != null) {
                            String str2;
                            double d;
                            diw diw;
                            aatw aatw = new aatw();
                            aatw.a(str);
                            zjm4 = rvv.c(zjm4);
                            if (zjm4 != null) {
                                idg idg2 = zjm4.d;
                                if (idg2 != null) {
                                    str2 = idg2.a;
                                    aatw.b(str2);
                                    d = (double) elapsed;
                                    Double.isNaN(d);
                                    aatw.a(Double.valueOf(d / 1000.0d));
                                    aatw.a(aajv);
                                    ((dib) this.f.get()).a((aajt) aatw);
                                    diw = (diw) this.h.get();
                                    obj = aatw.a();
                                    akcr.a(obj, "pagePageViewEvent.viewTimeSec");
                                    diw.a(str, obj.doubleValue());
                                }
                            }
                            str2 = null;
                            aatw.b(str2);
                            d = (double) elapsed;
                            Double.isNaN(d);
                            aatw.a(Double.valueOf(d / 1000.0d));
                            aatw.a(aajv);
                            ((dib) this.f.get()).a((aajt) aatw);
                            diw = (diw) this.h.get();
                            obj = aatw.a();
                            akcr.a(obj, "pagePageViewEvent.viewTimeSec");
                            diw.a(str, obj.doubleValue());
                        }
                    }
                }
            }
        }
        this.a.reset().start();
        a(zjm);
        b(zjm2);
    }

    public final ajej b() {
        ((achb) this.c.get()).a((achk) this);
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        return obj;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        rvv.a(this, (zjm) achi.f.e(), (zjm) achi.e.e(), 4);
    }

    public final void b(zjm zjm) {
        this.e = rvv.c(zjm);
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }
}
