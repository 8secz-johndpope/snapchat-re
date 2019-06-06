package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.Vibrator;
import defpackage.aimu.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wub */
public final class wub {
    final wrh a;
    final AtomicBoolean b = new AtomicBoolean();
    final Context c;
    WeakReference<Activity> d;
    SensorManager e;
    a f;
    aimu g;
    a h;
    int i = 0;
    private final zfw j;
    private final wrn k;
    private final abss l;
    private ajdw m;

    /* renamed from: wub$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            wub.this.d();
            wub wub = wub.this;
            wrh wrh = wub.a;
            if (wrh.a.f()) {
                wrh.c = (wrb) wrh.b.y(wrc.DEBUG_USER_TYPE);
            }
            wrh = wub.a;
            Object obj = (wrh.a.f() ? wrh.c != wrb.PROD || wrh.b.a(wrc.S2R_ELIGIBILITY_IN_PROD) : wrh.a.g() || wrh.b.a(wrc.S2R_ELIGIBILITY_IN_PROD)) ? 1 : null;
            if (obj != null && wub.b.get() && wub.d != null && wub.d.get() != null) {
                wub.i = 0;
                wub.e = (SensorManager) ((Activity) wub.d.get()).getSystemService("sensor");
                if (wub.e != null) {
                    if (wub.f == null) {
                        wub.f = new 4();
                    }
                    wub.g = new aimu(wub.f);
                    aimu aimu = wub.g;
                    int i = 6.a[wub.a.b().ordinal()];
                    int i2 = 13;
                    if (i == 1) {
                        i2 = 11;
                    } else if (i != 2) {
                        if (i == 3) {
                            i2 = 15;
                        } else if (i == 4) {
                            i2 = 21;
                        }
                    }
                    aimu.a = i2;
                    wub.g.a(wub.e);
                }
            }
        }
    }

    /* renamed from: wub$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            wub.this.d();
            if (wub.this.h != null) {
                wub.this.c.unregisterReceiver(wub.this.h);
                wub.this.h = null;
            }
        }
    }

    /* renamed from: wub$5 */
    class 5 implements Runnable {
        5() {
        }

        public final void run() {
            wub.a(wub.this, true);
        }
    }

    /* renamed from: wub$6 */
    static /* synthetic */ class 6 {
        static final /* synthetic */ int[] a = new int[aima.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.aima.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.aima.LIGHT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.aima.MEDIUM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.aima.HARD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.aima.HARDER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wub$6.<clinit>():void");
        }
    }

    /* renamed from: wub$a */
    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(wub wub, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (VERSION.SDK_INT >= 24) {
                wub wub = wub.this;
                if (wub.a.a()) {
                    wub.e().a(new 5());
                }
            }
        }
    }

    /* renamed from: wub$4 */
    class 4 implements a {

        /* renamed from: wub$4$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                wub.a(wub.this, false);
            }
        }

        4() {
        }

        public final void a() {
            wub.this.e().a(new 1());
        }
    }

    public wub(Context context, abss abss, jwb jwb, wtq wtq, wrh wrh, achb<zjm, zjk> achb, wqp wqp, hxs hxs, wqz wqz, wvl wvl) {
        Context context2 = context;
        this.c = context2;
        this.j = zgb.a(wqv.g, "MushroomShake2ReportDetector");
        this.k = new wrn(context2, this.j, abss, jwb, wtq, wrh, achb, this, wqp, hxs, wvl, wqz, false);
        this.a = wrh;
        this.l = abss;
    }

    static /* synthetic */ void a(wub wub, boolean z) {
        if (!z) {
            int i = wub.i + 1;
            wub.i = i;
            if (i < 2) {
                return;
            }
        }
        WeakReference weakReference = wub.d;
        if (weakReference != null && weakReference.get() != null) {
            wub.d();
            abxv.a((Vibrator) ((Activity) wub.d.get()).getSystemService("vibrator"), 350);
            wub.k.a(wub.d);
        }
    }

    public final void a() {
        e().a(new 1());
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.d = weakReference;
        if (this.l.f()) {
            if (this.h == null) {
                this.h = new a(this, (byte) 0);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.snap.SHAKE_REPORT");
            this.c.registerReceiver(this.h, intentFilter);
        }
    }

    public final void a(final boolean z) {
        e().a(new Runnable() {
            public final void run() {
                wub.this.b.set(z);
            }
        });
    }

    public final void b() {
        this.k.a();
    }

    public final void c() {
        e().a(new 2());
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        aimu aimu = this.g;
        if (aimu != null) {
            aimu.a();
            this.g = null;
        }
        this.f = null;
        this.e = null;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized ajdw e() {
        if (this.m == null) {
            this.m = zfw.a.a((ajdw) this.j.b(), 1);
        }
        return this.m;
    }
}
