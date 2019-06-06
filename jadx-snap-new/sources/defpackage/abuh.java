package defpackage;

import android.view.MotionEvent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.reflect.Method;

/* renamed from: abuh */
public final class abuh<T> {
    private static Method A = null;
    private static Method B = null;
    private static Method C = null;
    private static Method D = null;
    private static int E = 6;
    private static int F = 8;
    private static final float[] G = new float[20];
    private static final float[] H = new float[20];
    private static final float[] I = new float[20];
    private static final int[] J = new int[20];
    private static boolean v;
    private static Method w;
    private static Method x;
    private static Method y;
    private static Method z;
    private a<T> a;
    private b b;
    private b c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private T k;
    private final c l;
    private long m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private int u;

    /* renamed from: abuh$a */
    public interface a<T> {
        void a(T t);

        void a(T t, c cVar);

        boolean a(T t, c cVar, b bVar, b bVar2);

        T b();

        boolean c();
    }

    /* renamed from: abuh$b */
    public static class b {
        public int a;
        final float[] b = new float[20];
        final float[] c = new float[20];
        final float[] d = new float[20];
        final int[] e = new int[20];
        public float f;
        public float g;
        float h;
        float i;
        float j;
        float k;
        float l;
        float m;
        boolean n;
        boolean o;
        boolean p;
        boolean q;
        boolean r;
        int s;
        long t;

        public final float a() {
            return this.o ? this.i : MapboxConstants.MINIMUM_ZOOM;
        }

        public final float b() {
            return this.o ? this.j : MapboxConstants.MINIMUM_ZOOM;
        }

        public final int c() {
            return this.a;
        }

        public final float d() {
            return this.f;
        }

        public final float e() {
            return this.g;
        }
    }

    /* renamed from: abuh$c */
    public static class c {
        public float a;
        public float b;
        float c;
        float d;
        float e;
        float f;
        boolean g;
        boolean h;
        boolean i;

        public final float a() {
            return this.a;
        }

        public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a = f;
            this.b = f2;
            this.g = true;
            f2 = 1.0f;
            if (f3 == MapboxConstants.MINIMUM_ZOOM) {
                f3 = 1.0f;
            }
            this.c = f3;
            this.h = true;
            if (f4 == MapboxConstants.MINIMUM_ZOOM) {
                f4 = 1.0f;
            }
            this.d = f4;
            if (f5 != MapboxConstants.MINIMUM_ZOOM) {
                f2 = f5;
            }
            this.e = f2;
            this.i = true;
            this.f = f6;
        }

        public final float b() {
            return this.b;
        }

        /* Access modifiers changed, original: protected|final */
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a = f;
            this.b = f2;
            f = 1.0f;
            if (f3 == MapboxConstants.MINIMUM_ZOOM) {
                f3 = 1.0f;
            }
            this.c = f3;
            if (f4 == MapboxConstants.MINIMUM_ZOOM) {
                f4 = 1.0f;
            }
            this.d = f4;
            if (f5 != MapboxConstants.MINIMUM_ZOOM) {
                f = f5;
            }
            this.e = f;
            this.f = f6;
        }

        public final float c() {
            return !this.g ? 1.0f : this.c;
        }

        public final float d() {
            return !this.i ? MapboxConstants.MINIMUM_ZOOM : this.f;
        }
    }

    static {
        boolean z = true;
        try {
            w = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            x = MotionEvent.class.getMethod("getPointerId", new Class[]{Integer.TYPE});
            y = MotionEvent.class.getMethod("getPressure", new Class[]{Integer.TYPE});
            z = MotionEvent.class.getMethod("getHistoricalX", new Class[]{Integer.TYPE, Integer.TYPE});
            A = MotionEvent.class.getMethod("getHistoricalY", new Class[]{Integer.TYPE, Integer.TYPE});
            B = MotionEvent.class.getMethod("getHistoricalPressure", new Class[]{Integer.TYPE, Integer.TYPE});
            C = MotionEvent.class.getMethod("getX", new Class[]{Integer.TYPE});
            D = MotionEvent.class.getMethod("getY", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            z = false;
        }
        v = z;
        if (z) {
            try {
                E = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                F = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception unused2) {
            }
        }
    }

    public abuh(a<T> aVar) {
        this(aVar, (byte) 0);
    }

    private abuh(a<T> aVar, byte b) {
        this.k = null;
        this.l = new c();
        this.u = 0;
        this.b = new b();
        this.c = new b();
        this.j = true;
        this.a = aVar;
    }

    private void a() {
        b bVar;
        float f;
        this.d = this.b.f;
        this.e = this.b.g;
        boolean z = this.l.g;
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        if (z) {
            bVar = this.b;
            if (!bVar.q) {
                if (bVar.o) {
                    if (!bVar.p) {
                        bVar.l = bVar.o ? (bVar.i * bVar.i) + (bVar.j * bVar.j) : MapboxConstants.MINIMUM_ZOOM;
                        bVar.p = true;
                    }
                    float f3 = bVar.l;
                    if (f3 == MapboxConstants.MINIMUM_ZOOM) {
                        f3 = MapboxConstants.MINIMUM_ZOOM;
                    } else {
                        int i = (int) (f3 * 256.0f);
                        int i2 = 0;
                        int i3 = 32768;
                        int i4 = 15;
                        while (true) {
                            int i5 = i4 - 1;
                            i4 = ((i2 << 1) + i3) << i4;
                            if (i >= i4) {
                                i2 += i3;
                                i -= i4;
                            }
                            i3 >>= 1;
                            if (i3 <= 0) {
                                break;
                            }
                            i4 = i5;
                        }
                        f3 = ((float) i2) / 16.0f;
                    }
                    bVar.k = f3;
                    if (bVar.k < bVar.i) {
                        bVar.k = bVar.i;
                    }
                    if (bVar.k < bVar.j) {
                        bVar.k = bVar.j;
                    }
                } else {
                    bVar.k = MapboxConstants.MINIMUM_ZOOM;
                }
                bVar.q = true;
            }
            f = bVar.k;
        } else {
            f = MapboxConstants.MINIMUM_ZOOM;
        }
        this.f = Math.max(21.3f, f);
        this.g = Math.max(30.0f, !this.l.h ? MapboxConstants.MINIMUM_ZOOM : this.b.a());
        this.h = Math.max(30.0f, !this.l.h ? MapboxConstants.MINIMUM_ZOOM : this.b.b());
        if (this.l.i) {
            bVar = this.b;
            if (!bVar.r) {
                if (bVar.o) {
                    bVar.m = (float) Math.atan2((double) (bVar.c[1] - bVar.c[0]), (double) (bVar.b[1] - bVar.b[0]));
                } else {
                    bVar.m = MapboxConstants.MINIMUM_ZOOM;
                }
                bVar.r = true;
            }
            f2 = bVar.m;
        }
        this.i = f2;
    }

    private void b() {
        Object obj = this.k;
        if (obj != null) {
            this.a.a(obj, this.l);
            a();
            this.o = this.d - this.l.a;
            this.p = this.e - this.l.b;
            this.q = this.l.c / this.f;
            this.s = this.l.d / this.g;
            this.t = this.l.e / this.h;
            this.r = this.l.f - this.i;
        }
    }

    private void c() {
        if (this.k != null) {
            if (this.a.c()) {
                b();
                return;
            }
            a();
            this.l.b(this.d - this.o, this.e - this.p, this.q * this.f, this.s * this.g, this.t * this.h, this.r + this.i);
            this.a.a(this.k, this.l, this.b, this.c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x013e A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0139 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0158 A:{LOOP_END, Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }, LOOP:2: B:69:0x0156->B:70:0x0158} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017a A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0178 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0183 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02bc A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d1 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011f A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0124 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0139 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013e A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0158 A:{LOOP_END, Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }, LOOP:2: B:69:0x0156->B:70:0x0158} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0178 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017a A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0183 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d1 A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02bc A:{Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }} */
    /* JADX WARNING: Missing block: B:101:0x0253, code skipped:
            if (r0.b.t < r0.n) goto L_0x0255;
     */
    public final boolean a(android.view.MotionEvent r19) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = 0;
        r3 = v;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = 1;
        if (r3 == 0) goto L_0x0019;
    L_0x000a:
        r3 = w;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r5 = new java.lang.Object[r2];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r3 = r3.invoke(r1, r5);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r3 = (java.lang.Integer) r3;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r3 = r3.intValue();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x001a;
    L_0x0019:
        r3 = 1;
    L_0x001a:
        r5 = r0.u;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r5 != 0) goto L_0x0025;
    L_0x001e:
        r5 = r0.j;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r5 != 0) goto L_0x0025;
    L_0x0022:
        if (r3 != r4) goto L_0x0025;
    L_0x0024:
        return r2;
    L_0x0025:
        r5 = r19.getAction();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r6 = r19.getHistorySize();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r6 = r6 / r3;
        r7 = 0;
    L_0x002f:
        if (r7 > r6) goto L_0x02e9;
    L_0x0031:
        if (r7 >= r6) goto L_0x0035;
    L_0x0033:
        r8 = 1;
        goto L_0x0036;
    L_0x0035:
        r8 = 0;
    L_0x0036:
        r9 = v;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = 2;
        if (r9 == 0) goto L_0x00e8;
    L_0x003b:
        if (r3 != r4) goto L_0x003f;
    L_0x003d:
        goto L_0x00e8;
    L_0x003f:
        r9 = 20;
        r9 = java.lang.Math.min(r3, r9);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = 0;
    L_0x0046:
        if (r11 >= r9) goto L_0x0115;
    L_0x0048:
        r12 = x;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = new java.lang.Object[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13[r2] = r14;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = r12.invoke(r1, r13);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = (java.lang.Integer) r12;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = r12.intValue();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = J;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13[r11] = r12;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = G;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x0079;
    L_0x0064:
        r13 = z;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = new java.lang.Object[r10];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r2] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r4] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x0074:
        r13 = r13.invoke(r1, r14);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x0084;
    L_0x0079:
        r13 = C;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = new java.lang.Object[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r2] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x0074;
    L_0x0084:
        r13 = (java.lang.Float) r13;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = r13.floatValue();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12[r11] = r13;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = H;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x00a5;
    L_0x0090:
        r13 = A;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = new java.lang.Object[r10];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r2] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r4] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x00a0:
        r13 = r13.invoke(r1, r14);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x00b0;
    L_0x00a5:
        r13 = D;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = new java.lang.Object[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r2] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x00a0;
    L_0x00b0:
        r13 = (java.lang.Float) r13;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = r13.floatValue();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12[r11] = r13;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = I;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x00d1;
    L_0x00bc:
        r13 = B;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = new java.lang.Object[r10];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r2] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r4] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x00cc:
        r13 = r13.invoke(r1, r14);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x00dc;
    L_0x00d1:
        r13 = y;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = new java.lang.Object[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = java.lang.Integer.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14[r2] = r15;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x00cc;
    L_0x00dc:
        r13 = (java.lang.Float) r13;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = r13.floatValue();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12[r11] = r13;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r11 + 1;
        goto L_0x0046;
    L_0x00e8:
        r9 = G;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x00f1;
    L_0x00ec:
        r11 = r1.getHistoricalX(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x00f5;
    L_0x00f1:
        r11 = r19.getX();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x00f5:
        r9[r2] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = H;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x0100;
    L_0x00fb:
        r11 = r1.getHistoricalY(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x0104;
    L_0x0100:
        r11 = r19.getY();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x0104:
        r9[r2] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = I;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x010f;
    L_0x010a:
        r11 = r1.getHistoricalPressure(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x0113;
    L_0x010f:
        r11 = r19.getPressure();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x0113:
        r9[r2] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x0115:
        r9 = G;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = H;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = I;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = J;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r8 == 0) goto L_0x0121;
    L_0x011f:
        r14 = 2;
        goto L_0x0122;
    L_0x0121:
        r14 = r5;
    L_0x0122:
        if (r8 != 0) goto L_0x0136;
    L_0x0124:
        if (r5 == r4) goto L_0x0134;
    L_0x0126:
        r15 = F;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r15 = r4 << r15;
        r15 = r15 - r4;
        r15 = r15 & r5;
        r4 = E;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r15 == r4) goto L_0x0134;
    L_0x0130:
        r4 = 3;
        if (r5 == r4) goto L_0x0134;
    L_0x0133:
        goto L_0x0136;
    L_0x0134:
        r4 = 0;
        goto L_0x0137;
    L_0x0136:
        r4 = 1;
    L_0x0137:
        if (r8 == 0) goto L_0x013e;
    L_0x0139:
        r16 = r1.getHistoricalEventTime(r7);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x0142;
    L_0x013e:
        r16 = r19.getEventTime();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x0142:
        r15 = r11;
        r10 = r16;
        r8 = r0.c;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.c = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.b = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.t = r10;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.s = r14;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.a = r3;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = 0;
    L_0x0156:
        if (r8 >= r3) goto L_0x0173;
    L_0x0158:
        r10 = r2.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r9[r8];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10[r8] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = r2.c;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r15[r8];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10[r8] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = r2.d;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r12[r8];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10[r8] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = r2.e;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r13[r8];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10[r8] = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8 + 1;
        goto L_0x0156;
    L_0x0173:
        r2.n = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = 2;
        if (r3 < r4) goto L_0x017a;
    L_0x0178:
        r4 = 1;
        goto L_0x017b;
    L_0x017a:
        r4 = 0;
    L_0x017b:
        r2.o = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = r2.o;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r4 == 0) goto L_0x01b5;
    L_0x0183:
        r4 = 0;
        r11 = r9[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r13 = 1;
        r14 = r9[r13];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r11 + r14;
        r11 = r11 * r10;
        r2.f = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r15[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r14 = r15[r13];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r11 + r14;
        r11 = r11 * r10;
        r2.g = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r12[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r12 = r12[r13];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r11 + r12;
        r11 = r11 * r10;
        r2.h = r11;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r9[r13];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r9[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r11 - r9;
        r9 = java.lang.Math.abs(r11);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.i = r9;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r15[r13];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r11 = r15[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r9 - r11;
        r4 = java.lang.Math.abs(r9);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.j = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = 0;
        goto L_0x01c7;
    L_0x01b5:
        r4 = 0;
        r9 = r9[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.f = r9;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r15[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.g = r9;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r12[r4];	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.h = r9;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = 0;
        r2.j = r9;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.i = r9;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x01c7:
        r2.r = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.q = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.p = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.u;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 == 0) goto L_0x02bc;
    L_0x01d1:
        r4 = 0;
        r11 = 20;
        r9 = 1;
        if (r2 == r9) goto L_0x028e;
    L_0x01d7:
        r8 = 2;
        if (r2 == r8) goto L_0x01dc;
    L_0x01da:
        goto L_0x02e3;
    L_0x01dc:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.o;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 == 0) goto L_0x026e;
    L_0x01e2:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.n;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 != 0) goto L_0x01ea;
    L_0x01e8:
        goto L_0x026e;
    L_0x01ea:
        r2 = com.snapchat.android.framework.misc.AppContext.get();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r2 = defpackage.abtp.a(r4, r2);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = com.snapchat.android.framework.misc.AppContext.get();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = defpackage.abtp.a(r4, r8);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8.f;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r0.c;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r9.f;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8 - r9;
        r8 = java.lang.Math.abs(r8);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r8 > 0) goto L_0x025f;
    L_0x020d:
        r8 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8.g;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r0.c;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r9 = r9.g;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8 - r9;
        r8 = java.lang.Math.abs(r8);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x025f;
    L_0x021e:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.a();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r0.c;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8.a();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2 - r8;
        r2 = java.lang.Math.abs(r2);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2 * r10;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x025f;
    L_0x0234:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r0.c;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r8.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2 - r8;
        r2 = java.lang.Math.abs(r2);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2 * r10;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x024b;
    L_0x024a:
        goto L_0x025f;
    L_0x024b:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r2.t;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = r0.n;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 >= 0) goto L_0x025a;
    L_0x0255:
        r18.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x02e3;
    L_0x025a:
        r18.c();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x02e3;
    L_0x025f:
        r18.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r2.t;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.m = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r0.m;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x026a:
        r8 = r8 + r11;
        r0.n = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x02e3;
    L_0x026e:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.n;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 != 0) goto L_0x027f;
    L_0x0274:
        r2 = 0;
        r0.u = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.a;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.k = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x027b:
        r2.a(r4);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x02e3;
    L_0x027f:
        r2 = 1;
        r0.u = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r18.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r2.t;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.m = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r0.m;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x026a;
    L_0x028e:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.n;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 != 0) goto L_0x029c;
    L_0x0294:
        r2 = 0;
        r0.u = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.a;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.k = r4;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x027b;
    L_0x029c:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.o;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 == 0) goto L_0x02b1;
    L_0x02a2:
        r2 = 2;
        r0.u = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r18.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r2.t;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.m = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r0.m;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        goto L_0x026a;
    L_0x02b1:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r2.t;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r10 = r0.n;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 >= 0) goto L_0x025a;
    L_0x02bb:
        goto L_0x0255;
    L_0x02bc:
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.n;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 == 0) goto L_0x02e3;
    L_0x02c2:
        r2 = r0.a;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r2.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.k = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.k;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        if (r2 == 0) goto L_0x02e3;
    L_0x02ce:
        r2 = 1;
        r0.u = r2;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.a;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r4 = r0.k;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2.a(r4);	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r18.b();	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r2 = r0.b;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r8 = r2.t;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.n = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
        r0.m = r8;	 Catch:{ InvocationTargetException -> 0x02ed, IllegalAccessException -> 0x02eb }
    L_0x02e3:
        r7 = r7 + 1;
        r2 = 0;
        r4 = 1;
        goto L_0x002f;
    L_0x02e9:
        r1 = 1;
        return r1;
    L_0x02eb:
        r1 = 0;
        return r1;
    L_0x02ed:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuh.a(android.view.MotionEvent):boolean");
    }
}
