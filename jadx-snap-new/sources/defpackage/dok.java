package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import defpackage.dol.a;

/* renamed from: dok */
public final class dok implements dot {
    final Handler a;
    public dpp b;
    private final SensorManager c;
    private final float d;
    private final Handler e;
    private final int f;
    private final Sensor g;
    private dol h;
    private final a i;

    /* renamed from: dok$1 */
    class 1 implements a {
        1() {
        }

        private /* synthetic */ void a() {
            if (dok.this.b() && dok.this.b != null) {
                dok.this.b.j();
            }
            dok.this.a();
        }

        public final void a(boolean z) {
            if (z) {
                dok.this.a.post(new -$$Lambda$dok$1$C9qsXn764y-2Defe_imzqQzf6C4(this));
            }
        }
    }

    /* renamed from: dok$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[ecd.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.ecd.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.ecd.AUTO;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.ecd.CONTINUOUS_PICTURE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.ecd.CONTINUOUS_VIDEO;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dok$2.<clinit>():void");
        }
    }

    public dok(Context context, Handler handler, Handler handler2) {
        this((SensorManager) context.getSystemService("sensor"), (float) Math.toRadians(10.0d), handler, handler2);
    }

    private dok(SensorManager sensorManager, float f, Handler handler, Handler handler2) {
        this.i = new 1();
        this.c = sensorManager;
        this.d = f;
        this.e = handler2;
        this.a = handler;
        this.f = 500000;
        this.g = this.c.getDefaultSensor(11);
    }

    private void c() {
        this.c.unregisterListener(this.h);
        this.h = null;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (b()) {
            c();
        }
    }

    public final void a(ecd ecd) {
        abmr.a();
        int i = 2.a[ecd.ordinal()];
        Object obj = 1;
        if (i != 1) {
            if (i == 2 || i == 3) {
                a();
            }
            return;
        }
        if (this.g == null) {
            obj = null;
        }
        if (obj != null) {
            if (b()) {
                c();
            }
            this.h = new dol(this.i, this.d);
            this.c.registerListener(this.h, this.g, 500000, this.e);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.h != null;
    }
}
