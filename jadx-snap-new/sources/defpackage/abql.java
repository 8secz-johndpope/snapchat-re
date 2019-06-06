package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: abql */
public final class abql implements SensorEventListener {
    private final abpx<abqm> a;
    private final SensorManager b;
    private final Sensor c;
    private final Sensor d;
    private final Sensor e;
    private final float[] f;
    private final float[] g;
    private final float[] h;
    private volatile boolean i;
    private volatile boolean j;
    private float k;
    private long l;
    private float m;
    private float n;

    /* renamed from: abql$a */
    public static class a {
        public static final abql a = new abql();
    }

    private abql() {
        this((SensorManager) AppContext.get().getSystemService("sensor"));
    }

    private abql(SensorManager sensorManager) {
        this.a = new abpx();
        this.f = new float[3];
        this.g = new float[3];
        this.h = new float[3];
        this.i = false;
        this.j = false;
        this.k = MapboxConstants.MINIMUM_ZOOM;
        this.l = 0;
        this.m = MapboxConstants.MINIMUM_ZOOM;
        this.n = MapboxConstants.MINIMUM_ZOOM;
        this.b = sensorManager;
        this.c = this.b.getDefaultSensor(9);
        this.d = this.b.getDefaultSensor(4);
        this.e = this.b.getDefaultSensor(1);
    }

    private static float a(float f) {
        double d;
        if (f > MapboxConstants.MINIMUM_ZOOM) {
            d = (double) f;
            Double.isNaN(d);
            return (float) (((d + 3.141592653589793d) % 6.283185307179586d) - 3.141592653589793d);
        }
        d = (double) f;
        Double.isNaN(d);
        return (float) (3.141592653589793d - ((3.141592653589793d - d) % 6.283185307179586d));
    }

    private static float a(float f, float f2, float f3) {
        float a = abql.a(f - f2);
        if (Math.abs(a / f3) <= 3.1415927f) {
            return f;
        }
        f = (float) Math.ceil((double) ((Math.abs(a) / 4.712389f) / f3));
        double log = Math.log(0.1d);
        double d = (double) f;
        Double.isNaN(d);
        return abql.a(f2 + (a * ((1.0f - ((float) Math.exp(log / d))) * 1.1111112f)));
    }

    private static float a(float f, float[] fArr, float f2) {
        float atan2 = (float) (Math.atan2((double) fArr[0], (double) fArr[1]) + 3.141592653589793d);
        if (f2 == MapboxConstants.MINIMUM_ZOOM) {
            return atan2;
        }
        return abql.a(f + ((Math.abs(fArr[2]) * abql.a(atan2 - f)) * 0.5f));
    }

    public static int a(int i, int i2) {
        return (int) Math.round(Math.hypot((double) i, (double) i2) * 1.0d);
    }

    public static int a(abtl abtl) {
        return abql.a(abtl.b(), abtl.c());
    }

    public static abql a() {
        return a.a;
    }

    private synchronized void c() {
        if (this.j) {
            this.j = false;
            e();
        }
    }

    private synchronized void d() {
        if (!this.j) {
            this.j = true;
            f();
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0022, code skipped:
            if (r0 != null) goto L_0x0018;
     */
    private void e() {
        /*
        r4 = this;
        r0 = r4.i;
        if (r0 != 0) goto L_0x0034;
    L_0x0004:
        r0 = r4.j;
        if (r0 != 0) goto L_0x0034;
    L_0x0008:
        r0 = r4.a;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0034;
    L_0x0011:
        r0 = r4.c;
        r1 = 1;
        r2 = 16666; // 0x411a float:2.3354E-41 double:8.234E-320;
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        r3 = r4.b;
        r3.registerListener(r4, r0, r2);
        r4.i = r1;
        goto L_0x0025;
    L_0x0020:
        r0 = r4.e;
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0018;
    L_0x0025:
        r0 = r4.d;
        if (r0 == 0) goto L_0x0034;
    L_0x0029:
        r0 = r4.i;
        if (r0 == 0) goto L_0x0034;
    L_0x002d:
        r0 = r4.b;
        r1 = r4.d;
        r0.registerListener(r4, r1, r2);
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abql.e():void");
    }

    private void f() {
        if (this.i) {
            this.b.unregisterListener(this);
            this.i = false;
        }
    }

    public final synchronized void a(abqm abqm) {
        this.a.c(abqm);
        e();
    }

    public final void a(boolean z) {
        if (z) {
            d();
        } else {
            c();
        }
    }

    public final float b() {
        return (float) Math.toDegrees((double) this.n);
    }

    public final synchronized void b(abqm abqm) {
        this.a.d(abqm);
        if (this.a.c()) {
            f();
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x015e A:{LOOP_END, LOOP:0: B:40:0x0158->B:42:0x015e} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015e A:{LOOP_END, LOOP:0: B:40:0x0158->B:42:0x015e} */
    public final void onSensorChanged(android.hardware.SensorEvent r10) {
        /*
        r9 = this;
        r0 = r9.a;
        r0 = r0.c();
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r9.f();
        return;
    L_0x000c:
        r0 = r10.sensor;
        r1 = r9.d;
        r2 = 3;
        r3 = 0;
        if (r0 != r1) goto L_0x001c;
    L_0x0014:
        r10 = r10.values;
        r0 = r9.f;
        java.lang.System.arraycopy(r10, r3, r0, r3, r2);
        return;
    L_0x001c:
        r0 = r10.sensor;
        r1 = r9.e;
        r4 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r5 = 1;
        r6 = 2;
        if (r0 != r1) goto L_0x006e;
    L_0x0027:
        r0 = r10.values;
        r0 = r0[r6];
        r1 = 1090194653; // 0x40fb0cdd float:7.84532 double:5.386277253E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r0 = r9.h;
        r1 = r0[r3];
        r1 = r1 * r4;
        r2 = r10.values;
        r2 = r2[r3];
        r7 = 1045220556; // 0x3e4ccccc float:0.19999999 double:5.16407569E-315;
        r2 = r2 * r7;
        r1 = r1 + r2;
        r0[r3] = r1;
        r0 = r9.h;
        r1 = r0[r5];
        r1 = r1 * r4;
        r2 = r10.values;
        r2 = r2[r5];
        r2 = r2 * r7;
        r1 = r1 + r2;
        r0[r5] = r1;
        r0 = r9.h;
        r1 = r0[r6];
        r1 = r1 * r4;
        r2 = r10.values;
        r2 = r2[r6];
        r2 = r2 * r7;
        r1 = r1 + r2;
        r0[r6] = r1;
        r0 = r9.g;
        r1 = r9.h;
        r2 = r1[r3];
        r0[r3] = r2;
        r2 = r1[r5];
        r0[r5] = r2;
        r1 = r1[r6];
        r0[r6] = r1;
        goto L_0x007b;
    L_0x006e:
        r0 = r10.sensor;
        r1 = r9.c;
        if (r0 != r1) goto L_0x007b;
    L_0x0074:
        r0 = r10.values;
        r1 = r9.g;
        java.lang.System.arraycopy(r0, r3, r1, r3, r2);
    L_0x007b:
        r0 = r10.sensor;
        r1 = r9.c;
        if (r0 == r1) goto L_0x0087;
    L_0x0081:
        r0 = r10.sensor;
        r1 = r9.e;
        if (r0 != r1) goto L_0x0168;
    L_0x0087:
        r0 = r9.g;
        r1 = r0[r3];
        r2 = r0[r3];
        r1 = r1 * r2;
        r2 = r0[r5];
        r7 = r0[r5];
        r2 = r2 * r7;
        r1 = r1 + r2;
        r2 = r0[r6];
        r0 = r0[r6];
        r2 = r2 * r0;
        r1 = r1 + r2;
        r0 = (double) r1;
        r0 = java.lang.Math.sqrt(r0);
        r2 = r9.g;
        r7 = r2[r3];
        r7 = -r7;
        r7 = (double) r7;
        java.lang.Double.isNaN(r7);
        r7 = r7 / r0;
        r7 = (float) r7;
        r2[r3] = r7;
        r3 = r2[r5];
        r3 = -r3;
        r7 = (double) r3;
        java.lang.Double.isNaN(r7);
        r7 = r7 / r0;
        r3 = (float) r7;
        r2[r5] = r3;
        r3 = r2[r6];
        r3 = -r3;
        r7 = (double) r3;
        java.lang.Double.isNaN(r7);
        r7 = r7 / r0;
        r0 = (float) r7;
        r2[r6] = r0;
        r0 = r9.l;
        r2 = 0;
        r5 = 0;
        r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r7 == 0) goto L_0x00f4;
    L_0x00cb:
        r0 = r10.timestamp;
        r2 = r9.l;
        r0 = r0 - r2;
        r0 = (float) r0;
        r1 = 1315859240; // 0x4e6e6b28 float:1.0E9 double:6.50120845E-315;
        r0 = r0 / r1;
        r1 = 1000593162; // 0x3ba3d70a float:0.005 double:4.94358707E-315;
        r2 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r0 = java.lang.Math.min(r2, r0);
        r0 = java.lang.Math.max(r1, r0);
        r1 = r9.k;
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r3 == 0) goto L_0x00f2;
    L_0x00e9:
        r3 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r1 = r1 * r3;
        r0 = r0 * r2;
        r1 = r1 + r0;
        r9.k = r1;
        goto L_0x00f4;
    L_0x00f2:
        r9.k = r0;
    L_0x00f4:
        r0 = r10.timestamp;
        r9.l = r0;
        r10 = r9.d;
        if (r10 == 0) goto L_0x012d;
    L_0x00fc:
        r10 = r9.f;
        r0 = r9.g;
        r1 = r9.k;
        r10 = r10[r6];
        r10 = r10 * r1;
        r2 = r9.m;
        r2 = r2 + r10;
        r10 = defpackage.abql.a(r2);
        r9.m = r10;
        r10 = r0[r6];
        r10 = java.lang.Math.abs(r10);
        r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r10 >= 0) goto L_0x0120;
    L_0x0118:
        r10 = r9.m;
        r10 = defpackage.abql.a(r10, r0, r1);
        r9.m = r10;
    L_0x0120:
        r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r10 <= 0) goto L_0x0146;
    L_0x0124:
        r10 = r9.m;
        r0 = r9.n;
        r10 = defpackage.abql.a(r10, r0, r1);
        goto L_0x0148;
    L_0x012d:
        r10 = r9.g;
        r0 = r9.k;
        r1 = r9.m;
        r10 = defpackage.abql.a(r1, r10, r0);
        r9.m = r10;
        r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r10 <= 0) goto L_0x0146;
    L_0x013d:
        r10 = r9.m;
        r1 = r9.n;
        r10 = defpackage.abql.a(r10, r1, r0);
        goto L_0x0148;
    L_0x0146:
        r10 = r9.m;
    L_0x0148:
        r9.n = r10;
        r10 = r9.n;
        r0 = (double) r10;
        r0 = java.lang.Math.toDegrees(r0);
        r10 = (float) r0;
        r0 = r9.a;
        r0 = r0.iterator();
    L_0x0158:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0168;
    L_0x015e:
        r1 = r0.next();
        r1 = (defpackage.abqm) r1;
        r1.a(r10);
        goto L_0x0158;
    L_0x0168:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abql.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
