package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.bn.a;
import java.util.ArrayList;

/* renamed from: bo */
public class bo {
    private static float af = 0.5f;
    bo A = null;
    int B = 0;
    int C = 0;
    protected float D = MapboxConstants.MINIMUM_ZOOM;
    protected int E = 0;
    protected int F = 0;
    public int G = 0;
    protected int H;
    protected int I;
    public int J;
    public int K;
    public float L;
    public float M;
    public Object N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public float[] S;
    protected bo[] T;
    protected bo[] U;
    private bn V = new bn(this, a.CENTER_X);
    private bn W = new bn(this, a.CENTER_Y);
    private bn X = new bn(this, a.CENTER);
    private int Y = -1;
    private int Z = 0;
    private int a = -1;
    private int aa = 0;
    private int ab = 0;
    private int ac = 0;
    private int ad = 0;
    private int ae = 0;
    private int ag;
    private String ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private bo am;
    private bo an;
    private float b = 1.0f;
    public int c = -1;
    public int d = -1;
    bv e;
    bv f;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public float k = 1.0f;
    public int l = 0;
    public int m = 0;
    public float n = 1.0f;
    public boolean o;
    public boolean p;
    public int[] q = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float r = MapboxConstants.MINIMUM_ZOOM;
    bn s = new bn(this, a.LEFT);
    bn t = new bn(this, a.TOP);
    bn u = new bn(this, a.RIGHT);
    bn v = new bn(this, a.BOTTOM);
    bn w = new bn(this, a.BASELINE);
    protected bn[] x = new bn[]{this.s, this.u, this.t, this.v, this.w, this.X};
    protected ArrayList<bn> y = new ArrayList();
    protected int[] z = new int[]{1, 1};

    /* renamed from: bo$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] b = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        static {
            /*
            r0 = defpackage.bo.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3[r2] = r2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r3 = 4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x001e }
            r4[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            r4 = defpackage.bn.a.values();
            r4 = r4.length;
            r4 = new int[r4];
            a = r4;
            r4 = a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r5 = defpackage.bn.a.LEFT;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0031 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x003b }
            r4 = defpackage.bn.a.TOP;	 Catch:{ NoSuchFieldError -> 0x003b }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x003b }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x003b }
        L_0x003b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0045 }
            r1 = defpackage.bn.a.RIGHT;	 Catch:{ NoSuchFieldError -> 0x0045 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0045 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0045 }
        L_0x0045:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004f }
            r1 = defpackage.bn.a.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x004f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004f }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x004f }
        L_0x004f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x005a }
            r1 = defpackage.bn.a.BASELINE;	 Catch:{ NoSuchFieldError -> 0x005a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005a }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005a }
        L_0x005a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r1 = defpackage.bn.a.CENTER;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0065 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0065 }
        L_0x0065:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r1 = defpackage.bn.a.CENTER_X;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0070 }
        L_0x0070:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = defpackage.bn.a.CENTER_Y;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0088 }
            r1 = defpackage.bn.a.NONE;	 Catch:{ NoSuchFieldError -> 0x0088 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0088 }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0088 }
        L_0x0088:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bo$1.<clinit>():void");
        }
    }

    /* renamed from: bo$a */
    public enum a {
        ;

        static {
            a = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public bo() {
        float f = af;
        this.L = f;
        this.M = f;
        this.ag = 0;
        this.O = 0;
        this.P = null;
        this.ah = null;
        this.Q = 0;
        this.R = 0;
        this.S = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};
        this.T = new bo[]{null, null};
        this.U = new bo[]{null, null};
        this.am = null;
        this.an = null;
        this.y.add(this.s);
        this.y.add(this.t);
        this.y.add(this.u);
        this.y.add(this.v);
        this.y.add(this.V);
        this.y.add(this.W);
        this.y.add(this.X);
        this.y.add(this.w);
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARNING: Missing block: B:108:0x01eb, code skipped:
            if (r34 != false) goto L_0x01ed;
     */
    private void a(defpackage.bi r33, boolean r34, defpackage.bk r35, defpackage.bk r36, int r37, boolean r38, defpackage.bn r39, defpackage.bn r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, int r48, int r49, int r50, float r51, boolean r52) {
        /*
        r32 = this;
        r0 = r32;
        r10 = r33;
        r11 = r35;
        r12 = r36;
        r13 = r39;
        r14 = r40;
        r1 = r43;
        r2 = r44;
        r15 = r10.a(r13);
        r9 = r10.a(r14);
        r3 = r13.d;
        r8 = r10.a(r3);
        r3 = r14.d;
        r7 = r10.a(r3);
        r3 = r10.c;
        r6 = 1;
        r5 = 6;
        r4 = 0;
        if (r3 == 0) goto L_0x0049;
    L_0x002b:
        r3 = r13.a;
        r3 = r3.f;
        if (r3 != r6) goto L_0x0049;
    L_0x0031:
        r3 = r14.a;
        r3 = r3.f;
        if (r3 != r6) goto L_0x0049;
    L_0x0037:
        r1 = r13.a;
        r1.a(r10);
        r1 = r14.a;
        r1.a(r10);
        if (r47 != 0) goto L_0x0048;
    L_0x0043:
        if (r34 == 0) goto L_0x0048;
    L_0x0045:
        r10.a(r12, r9, r4, r5);
    L_0x0048:
        return;
    L_0x0049:
        r16 = r39.d();
        r17 = r40.d();
        r3 = r0.X;
        r18 = r3.d();
        if (r16 == 0) goto L_0x005b;
    L_0x0059:
        r3 = 1;
        goto L_0x005c;
    L_0x005b:
        r3 = 0;
    L_0x005c:
        if (r17 == 0) goto L_0x0060;
    L_0x005e:
        r3 = r3 + 1;
    L_0x0060:
        if (r18 == 0) goto L_0x0064;
    L_0x0062:
        r3 = r3 + 1;
    L_0x0064:
        if (r46 == 0) goto L_0x0069;
    L_0x0066:
        r20 = 3;
        goto L_0x006b;
    L_0x0069:
        r20 = r48;
    L_0x006b:
        r21 = defpackage.bo.1.b;
        r22 = r37 + -1;
        r5 = r21[r22];
        r4 = 2;
        if (r5 == r6) goto L_0x007c;
    L_0x0074:
        if (r5 == r4) goto L_0x007c;
    L_0x0076:
        r4 = 3;
        if (r5 == r4) goto L_0x007c;
    L_0x0079:
        r4 = 4;
        if (r5 == r4) goto L_0x007e;
    L_0x007c:
        r4 = 0;
        goto L_0x007f;
    L_0x007e:
        r4 = 1;
    L_0x007f:
        r5 = r0.O;
        r6 = 8;
        if (r5 != r6) goto L_0x0088;
    L_0x0085:
        r4 = 0;
        r5 = 0;
        goto L_0x008b;
    L_0x0088:
        r5 = r4;
        r4 = r42;
    L_0x008b:
        if (r52 == 0) goto L_0x00a8;
    L_0x008d:
        if (r16 != 0) goto L_0x0099;
    L_0x008f:
        if (r17 != 0) goto L_0x0099;
    L_0x0091:
        if (r18 != 0) goto L_0x0099;
    L_0x0093:
        r6 = r41;
        r10.a(r15, r6);
        goto L_0x00a8;
    L_0x0099:
        if (r16 == 0) goto L_0x00a8;
    L_0x009b:
        if (r17 != 0) goto L_0x00a8;
    L_0x009d:
        r6 = r39.b();
        r24 = r7;
        r7 = 6;
        r10.c(r15, r8, r6, r7);
        goto L_0x00ab;
    L_0x00a8:
        r24 = r7;
        r7 = 6;
    L_0x00ab:
        if (r5 != 0) goto L_0x00dd;
    L_0x00ad:
        if (r38 == 0) goto L_0x00c6;
    L_0x00af:
        r6 = 3;
        r7 = 0;
        r10.c(r9, r15, r7, r6);
        if (r1 <= 0) goto L_0x00bb;
    L_0x00b6:
        r4 = 6;
        r10.a(r9, r15, r1, r4);
        goto L_0x00bc;
    L_0x00bb:
        r4 = 6;
    L_0x00bc:
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r2 >= r6) goto L_0x00c4;
    L_0x00c1:
        r10.b(r9, r15, r2, r4);
    L_0x00c4:
        r6 = 6;
        goto L_0x00cb;
    L_0x00c6:
        r6 = 6;
        r7 = 0;
        r10.c(r9, r15, r4, r6);
    L_0x00cb:
        r7 = r49;
        r13 = r3;
        r4 = r5;
        r0 = r20;
        r28 = r24;
        r14 = 6;
        r19 = 4;
        r3 = r50;
        r20 = r8;
        r8 = 2;
        goto L_0x01d5;
    L_0x00dd:
        r6 = 6;
        r7 = 0;
        r2 = -2;
        r7 = r49;
        if (r7 != r2) goto L_0x00e8;
    L_0x00e4:
        r7 = r50;
        r6 = r4;
        goto L_0x00eb;
    L_0x00e8:
        r6 = r7;
        r7 = r50;
    L_0x00eb:
        if (r7 != r2) goto L_0x00ee;
    L_0x00ed:
        r7 = r4;
    L_0x00ee:
        if (r6 <= 0) goto L_0x00f9;
    L_0x00f0:
        r2 = 6;
        r10.a(r9, r15, r6, r2);
        r4 = java.lang.Math.max(r4, r6);
        goto L_0x00fa;
    L_0x00f9:
        r2 = 6;
    L_0x00fa:
        if (r7 <= 0) goto L_0x010b;
    L_0x00fc:
        if (r34 == 0) goto L_0x0104;
    L_0x00fe:
        r2 = 1;
        r10.b(r9, r15, r7, r2);
        r2 = 6;
        goto L_0x0107;
    L_0x0104:
        r10.b(r9, r15, r7, r2);
    L_0x0107:
        r4 = java.lang.Math.min(r4, r7);
    L_0x010b:
        r2 = r20;
        r20 = r3;
        r3 = 1;
        if (r2 != r3) goto L_0x0130;
    L_0x0112:
        if (r34 == 0) goto L_0x011e;
    L_0x0114:
        r3 = 6;
        r10.c(r9, r15, r4, r3);
        r0 = r2;
        r14 = r4;
        r42 = r5;
        goto L_0x01a7;
    L_0x011e:
        r3 = 6;
        if (r47 == 0) goto L_0x0128;
    L_0x0121:
        r42 = r5;
        r5 = 4;
        r10.c(r9, r15, r4, r5);
        goto L_0x01a5;
    L_0x0128:
        r42 = r5;
        r3 = 1;
        r5 = 4;
        r10.c(r9, r15, r4, r3);
        goto L_0x01a5;
    L_0x0130:
        r42 = r5;
        r5 = 2;
        if (r2 != r5) goto L_0x01a5;
    L_0x0135:
        r3 = r13.c;
        r5 = defpackage.bn.a.TOP;
        if (r3 == r5) goto L_0x0160;
    L_0x013b:
        r3 = r13.c;
        r5 = defpackage.bn.a.BOTTOM;
        if (r3 != r5) goto L_0x0142;
    L_0x0141:
        goto L_0x0160;
    L_0x0142:
        r3 = r0.A;
        r5 = defpackage.bn.a.LEFT;
        r3 = r3.a(r5);
        r3 = r10.a(r3);
        r5 = r0.A;
        r38 = r2;
        r2 = defpackage.bn.a.RIGHT;
        r2 = r5.a(r2);
        r2 = r10.a(r2);
        r5 = r2;
        r25 = r3;
        goto L_0x017d;
    L_0x0160:
        r38 = r2;
        r2 = r0.A;
        r3 = defpackage.bn.a.TOP;
        r2 = r2.a(r3);
        r2 = r10.a(r2);
        r3 = r0.A;
        r5 = defpackage.bn.a.BOTTOM;
        r3 = r3.a(r5);
        r3 = r10.a(r3);
        r25 = r2;
        r5 = r3;
    L_0x017d:
        r2 = r33.b();
        r3 = r38;
        r22 = 1;
        r23 = 6;
        r0 = r3;
        r13 = r20;
        r3 = r9;
        r14 = r4;
        r20 = r8;
        r8 = 2;
        r19 = 4;
        r4 = r15;
        r26 = r6;
        r6 = r25;
        r29 = r7;
        r28 = r24;
        r7 = r51;
        r2 = r2.a(r3, r4, r5, r6, r7);
        r10.a(r2);
        r4 = 0;
        goto L_0x01b6;
    L_0x01a5:
        r0 = r2;
        r14 = r4;
    L_0x01a7:
        r26 = r6;
        r29 = r7;
        r13 = r20;
        r28 = r24;
        r19 = 4;
        r20 = r8;
        r8 = 2;
        r4 = r42;
    L_0x01b6:
        if (r4 == 0) goto L_0x01d0;
    L_0x01b8:
        if (r13 == r8) goto L_0x01d0;
    L_0x01ba:
        if (r46 != 0) goto L_0x01d0;
    L_0x01bc:
        r7 = r26;
        r2 = java.lang.Math.max(r7, r14);
        r3 = r29;
        if (r3 <= 0) goto L_0x01ca;
    L_0x01c6:
        r2 = java.lang.Math.min(r3, r2);
    L_0x01ca:
        r14 = 6;
        r10.c(r9, r15, r2, r14);
        r4 = 0;
        goto L_0x01d5;
    L_0x01d0:
        r7 = r26;
        r3 = r29;
        r14 = 6;
    L_0x01d5:
        if (r52 == 0) goto L_0x02cc;
    L_0x01d7:
        if (r47 == 0) goto L_0x01db;
    L_0x01d9:
        goto L_0x02cc;
    L_0x01db:
        r2 = 5;
        if (r16 != 0) goto L_0x01e6;
    L_0x01de:
        if (r17 != 0) goto L_0x01e6;
    L_0x01e0:
        if (r18 != 0) goto L_0x01e6;
    L_0x01e2:
        if (r34 == 0) goto L_0x02c4;
    L_0x01e4:
        r13 = 0;
        goto L_0x01ed;
    L_0x01e6:
        r13 = 0;
        if (r16 == 0) goto L_0x01f2;
    L_0x01e9:
        if (r17 != 0) goto L_0x01f2;
    L_0x01eb:
        if (r34 == 0) goto L_0x02c4;
    L_0x01ed:
        r10.a(r12, r9, r13, r2);
        goto L_0x02c4;
    L_0x01f2:
        if (r16 != 0) goto L_0x0207;
    L_0x01f4:
        if (r17 == 0) goto L_0x0207;
    L_0x01f6:
        r0 = r40.b();
        r0 = -r0;
        r8 = r28;
        r10.c(r9, r8, r0, r14);
        if (r34 == 0) goto L_0x02c4;
    L_0x0202:
        r10.a(r15, r11, r13, r2);
        goto L_0x02c4;
    L_0x0207:
        r8 = r28;
        if (r16 == 0) goto L_0x02c4;
    L_0x020b:
        if (r17 == 0) goto L_0x02c4;
    L_0x020d:
        if (r4 == 0) goto L_0x0268;
    L_0x020f:
        if (r34 == 0) goto L_0x0216;
    L_0x0211:
        if (r1 != 0) goto L_0x0216;
    L_0x0213:
        r10.a(r9, r15, r13, r14);
    L_0x0216:
        if (r0 != 0) goto L_0x0243;
    L_0x0218:
        if (r3 > 0) goto L_0x0220;
    L_0x021a:
        if (r7 <= 0) goto L_0x021d;
    L_0x021c:
        goto L_0x0220;
    L_0x021d:
        r0 = 6;
        r6 = 0;
        goto L_0x0222;
    L_0x0220:
        r0 = 4;
        r6 = 1;
    L_0x0222:
        r1 = r39.b();
        r5 = r20;
        r10.c(r15, r5, r1, r0);
        r1 = r40.b();
        r1 = -r1;
        r10.c(r9, r8, r1, r0);
        if (r3 > 0) goto L_0x023b;
    L_0x0235:
        if (r7 <= 0) goto L_0x0238;
    L_0x0237:
        goto L_0x023b;
    L_0x0238:
        r27 = 0;
        goto L_0x023d;
    L_0x023b:
        r27 = 1;
    L_0x023d:
        r16 = r6;
        r1 = r27;
        r0 = 5;
        goto L_0x027f;
    L_0x0243:
        r5 = r20;
        r1 = 1;
        if (r0 != r1) goto L_0x024c;
    L_0x0248:
        r0 = 6;
    L_0x0249:
        r16 = 1;
        goto L_0x027f;
    L_0x024c:
        r3 = 3;
        if (r0 != r3) goto L_0x0265;
    L_0x024f:
        if (r46 != 0) goto L_0x0253;
    L_0x0251:
        r0 = 6;
        goto L_0x0254;
    L_0x0253:
        r0 = 4;
    L_0x0254:
        r3 = r39.b();
        r10.c(r15, r5, r3, r0);
        r3 = r40.b();
        r3 = -r3;
        r10.c(r9, r8, r3, r0);
        r0 = 5;
        goto L_0x0249;
    L_0x0265:
        r0 = 5;
        r1 = 0;
        goto L_0x027d;
    L_0x0268:
        r5 = r20;
        r1 = 1;
        if (r34 == 0) goto L_0x027c;
    L_0x026d:
        r0 = r39.b();
        r10.a(r15, r5, r0, r2);
        r0 = r40.b();
        r0 = -r0;
        r10.b(r9, r8, r0, r2);
    L_0x027c:
        r0 = 5;
    L_0x027d:
        r16 = 0;
    L_0x027f:
        if (r1 == 0) goto L_0x02a0;
    L_0x0281:
        r4 = r39.b();
        r17 = r40.b();
        r1 = r33;
        r2 = r15;
        r3 = r5;
        r18 = r5;
        r5 = r45;
        r6 = r8;
        r7 = r9;
        r30 = r8;
        r13 = r18;
        r8 = r17;
        r31 = r9;
        r9 = r0;
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x02a5;
    L_0x02a0:
        r13 = r5;
        r30 = r8;
        r31 = r9;
    L_0x02a5:
        if (r16 == 0) goto L_0x02bb;
    L_0x02a7:
        r0 = r39.b();
        r10.a(r15, r13, r0, r14);
        r0 = r40.b();
        r0 = -r0;
        r2 = r30;
        r1 = r31;
        r10.b(r1, r2, r0, r14);
        goto L_0x02bd;
    L_0x02bb:
        r1 = r31;
    L_0x02bd:
        if (r34 == 0) goto L_0x02c5;
    L_0x02bf:
        r0 = 0;
        r10.a(r15, r11, r0, r14);
        goto L_0x02c6;
    L_0x02c4:
        r1 = r9;
    L_0x02c5:
        r0 = 0;
    L_0x02c6:
        if (r34 == 0) goto L_0x02cb;
    L_0x02c8:
        r10.a(r12, r1, r0, r14);
    L_0x02cb:
        return;
    L_0x02cc:
        r1 = r9;
        r0 = 0;
        if (r13 >= r8) goto L_0x02d8;
    L_0x02d0:
        if (r34 == 0) goto L_0x02d8;
    L_0x02d2:
        r10.a(r15, r11, r0, r14);
        r10.a(r12, r1, r0, r14);
    L_0x02d8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.a(bi, boolean, bk, bk, int, boolean, bn, bn, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* JADX WARNING: Missing block: B:7:0x0033, code skipped:
            if (r2 < r0) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:12:0x003f, code skipped:
            if (r3 < r1) goto L_0x0043;
     */
    public void A() {
        /*
        r5 = this;
        r0 = r5.s;
        r0 = defpackage.bi.b(r0);
        r1 = r5.t;
        r1 = defpackage.bi.b(r1);
        r2 = r5.u;
        r2 = defpackage.bi.b(r2);
        r3 = r5.v;
        r3 = defpackage.bi.b(r3);
        r2 = r2 - r0;
        r3 = r3 - r1;
        r5.E = r0;
        r5.F = r1;
        r0 = r5.O;
        r1 = 0;
        r4 = 8;
        if (r0 != r4) goto L_0x002a;
    L_0x0025:
        r5.B = r1;
        r5.C = r1;
        return;
    L_0x002a:
        r0 = r5.z;
        r0 = r0[r1];
        r1 = 1;
        if (r0 != r1) goto L_0x0036;
    L_0x0031:
        r0 = r5.B;
        if (r2 >= r0) goto L_0x0036;
    L_0x0035:
        goto L_0x0037;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        r2 = r5.z;
        r2 = r2[r1];
        if (r2 != r1) goto L_0x0042;
    L_0x003d:
        r1 = r5.C;
        if (r3 >= r1) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        r1 = r3;
    L_0x0043:
        r5.B = r0;
        r5.C = r1;
        r0 = r5.C;
        r1 = r5.I;
        if (r0 >= r1) goto L_0x004f;
    L_0x004d:
        r5.C = r1;
    L_0x004f:
        r0 = r5.B;
        r1 = r5.H;
        if (r0 >= r1) goto L_0x0057;
    L_0x0055:
        r5.B = r1;
    L_0x0057:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.A():void");
    }

    public bn a(a aVar) {
        switch (aVar) {
            case LEFT:
                return this.s;
            case TOP:
                return this.t;
            case RIGHT:
                return this.u;
            case BOTTOM:
                return this.v;
            case BASELINE:
                return this.w;
            case CENTER:
                return this.X;
            case CENTER_X:
                return this.V;
            case CENTER_Y:
                return this.W;
            case NONE:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public void a(int i) {
        bs.a(i, this);
    }

    public final void a(int i, int i2) {
        this.E = i;
        this.F = i2;
    }

    public void a(bg bgVar) {
        this.s.a();
        this.t.a();
        this.u.a();
        this.v.a();
        this.w.a();
        this.X.a();
        this.V.a();
        this.W.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02d0 A:{RETURN} */
    public void a(defpackage.bi r38) {
        /*
        r37 = this;
        r15 = r37;
        r14 = r38;
        r0 = r15.s;
        r21 = r14.a(r0);
        r0 = r15.u;
        r10 = r14.a(r0);
        r0 = r15.t;
        r6 = r14.a(r0);
        r0 = r15.v;
        r4 = r14.a(r0);
        r0 = r15.w;
        r3 = r14.a(r0);
        r0 = r15.A;
        r1 = 8;
        r2 = 2;
        r13 = 1;
        r12 = 0;
        if (r0 == 0) goto L_0x00de;
    L_0x002b:
        if (r0 == 0) goto L_0x0035;
    L_0x002d:
        r0 = r0.z;
        r0 = r0[r12];
        if (r0 != r2) goto L_0x0035;
    L_0x0033:
        r0 = 1;
        goto L_0x0036;
    L_0x0035:
        r0 = 0;
    L_0x0036:
        r5 = r15.A;
        if (r5 == 0) goto L_0x0042;
    L_0x003a:
        r5 = r5.z;
        r5 = r5[r13];
        if (r5 != r2) goto L_0x0042;
    L_0x0040:
        r5 = 1;
        goto L_0x0043;
    L_0x0042:
        r5 = 0;
    L_0x0043:
        r7 = r15.s;
        r7 = r7.d;
        if (r7 == 0) goto L_0x0053;
    L_0x0049:
        r7 = r15.s;
        r7 = r7.d;
        r7 = r7.d;
        r8 = r15.s;
        if (r7 == r8) goto L_0x0063;
    L_0x0053:
        r7 = r15.u;
        r7 = r7.d;
        if (r7 == 0) goto L_0x006c;
    L_0x0059:
        r7 = r15.u;
        r7 = r7.d;
        r7 = r7.d;
        r8 = r15.u;
        if (r7 != r8) goto L_0x006c;
    L_0x0063:
        r7 = r15.A;
        r7 = (defpackage.bp) r7;
        r7.a(r15, r12);
        r7 = 1;
        goto L_0x006d;
    L_0x006c:
        r7 = 0;
    L_0x006d:
        r8 = r15.t;
        r8 = r8.d;
        if (r8 == 0) goto L_0x007d;
    L_0x0073:
        r8 = r15.t;
        r8 = r8.d;
        r8 = r8.d;
        r9 = r15.t;
        if (r8 == r9) goto L_0x008d;
    L_0x007d:
        r8 = r15.v;
        r8 = r8.d;
        if (r8 == 0) goto L_0x0096;
    L_0x0083:
        r8 = r15.v;
        r8 = r8.d;
        r8 = r8.d;
        r9 = r15.v;
        if (r8 != r9) goto L_0x0096;
    L_0x008d:
        r8 = r15.A;
        r8 = (defpackage.bp) r8;
        r8.a(r15, r13);
        r8 = 1;
        goto L_0x0097;
    L_0x0096:
        r8 = 0;
    L_0x0097:
        if (r0 == 0) goto L_0x00b4;
    L_0x0099:
        r9 = r15.O;
        if (r9 == r1) goto L_0x00b4;
    L_0x009d:
        r9 = r15.s;
        r9 = r9.d;
        if (r9 != 0) goto L_0x00b4;
    L_0x00a3:
        r9 = r15.u;
        r9 = r9.d;
        if (r9 != 0) goto L_0x00b4;
    L_0x00a9:
        r9 = r15.A;
        r9 = r9.u;
        r9 = r14.a(r9);
        r14.a(r9, r10, r12, r13);
    L_0x00b4:
        if (r5 == 0) goto L_0x00d5;
    L_0x00b6:
        r9 = r15.O;
        if (r9 == r1) goto L_0x00d5;
    L_0x00ba:
        r9 = r15.t;
        r9 = r9.d;
        if (r9 != 0) goto L_0x00d5;
    L_0x00c0:
        r9 = r15.v;
        r9 = r9.d;
        if (r9 != 0) goto L_0x00d5;
    L_0x00c6:
        r9 = r15.w;
        if (r9 != 0) goto L_0x00d5;
    L_0x00ca:
        r9 = r15.A;
        r9 = r9.v;
        r9 = r14.a(r9);
        r14.a(r9, r4, r12, r13);
    L_0x00d5:
        r20 = r0;
        r22 = r5;
        r23 = r7;
        r24 = r8;
        goto L_0x00e6;
    L_0x00de:
        r20 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
    L_0x00e6:
        r0 = r15.B;
        r5 = r15.H;
        if (r0 >= r5) goto L_0x00ed;
    L_0x00ec:
        r0 = r5;
    L_0x00ed:
        r5 = r15.C;
        r7 = r15.I;
        if (r5 >= r7) goto L_0x00f4;
    L_0x00f3:
        r5 = r7;
    L_0x00f4:
        r7 = r15.z;
        r7 = r7[r12];
        r8 = 3;
        if (r7 == r8) goto L_0x00fd;
    L_0x00fb:
        r7 = 1;
        goto L_0x00fe;
    L_0x00fd:
        r7 = 0;
    L_0x00fe:
        r9 = r15.z;
        r9 = r9[r13];
        if (r9 == r8) goto L_0x0106;
    L_0x0104:
        r9 = 1;
        goto L_0x0107;
    L_0x0106:
        r9 = 0;
    L_0x0107:
        r11 = r15.Y;
        r15.a = r11;
        r11 = r15.D;
        r15.b = r11;
        r16 = 0;
        r2 = -1;
        r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r11 <= 0) goto L_0x022b;
    L_0x0116:
        r11 = r15.O;
        if (r11 == r1) goto L_0x022b;
    L_0x011a:
        r1 = r15.z;
        r11 = r1[r12];
        r16 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r11 != r8) goto L_0x01f8;
    L_0x0122:
        r1 = r1[r13];
        if (r1 != r8) goto L_0x01f8;
    L_0x0126:
        r1 = r15.g;
        if (r1 != 0) goto L_0x012c;
    L_0x012a:
        r15.g = r8;
    L_0x012c:
        r1 = r15.h;
        if (r1 != 0) goto L_0x0132;
    L_0x0130:
        r15.h = r8;
    L_0x0132:
        r1 = r15.a;
        if (r1 != r2) goto L_0x014d;
    L_0x0136:
        if (r7 == 0) goto L_0x013d;
    L_0x0138:
        if (r9 != 0) goto L_0x013d;
    L_0x013a:
        r15.a = r12;
        goto L_0x014d;
    L_0x013d:
        if (r7 != 0) goto L_0x014d;
    L_0x013f:
        if (r9 == 0) goto L_0x014d;
    L_0x0141:
        r15.a = r13;
        r1 = r15.Y;
        if (r1 != r2) goto L_0x014d;
    L_0x0147:
        r1 = r15.b;
        r1 = r16 / r1;
        r15.b = r1;
    L_0x014d:
        r1 = r15.a;
        if (r1 != 0) goto L_0x0164;
    L_0x0151:
        r1 = r15.t;
        r1 = r1.d();
        if (r1 == 0) goto L_0x0161;
    L_0x0159:
        r1 = r15.v;
        r1 = r1.d();
        if (r1 != 0) goto L_0x0164;
    L_0x0161:
        r15.a = r13;
        goto L_0x017a;
    L_0x0164:
        r1 = r15.a;
        if (r1 != r13) goto L_0x017a;
    L_0x0168:
        r1 = r15.s;
        r1 = r1.d();
        if (r1 == 0) goto L_0x0178;
    L_0x0170:
        r1 = r15.u;
        r1 = r1.d();
        if (r1 != 0) goto L_0x017a;
    L_0x0178:
        r15.a = r12;
    L_0x017a:
        r1 = r15.a;
        if (r1 != r2) goto L_0x01c9;
    L_0x017e:
        r1 = r15.t;
        r1 = r1.d();
        if (r1 == 0) goto L_0x019e;
    L_0x0186:
        r1 = r15.v;
        r1 = r1.d();
        if (r1 == 0) goto L_0x019e;
    L_0x018e:
        r1 = r15.s;
        r1 = r1.d();
        if (r1 == 0) goto L_0x019e;
    L_0x0196:
        r1 = r15.u;
        r1 = r1.d();
        if (r1 != 0) goto L_0x01c9;
    L_0x019e:
        r1 = r15.t;
        r1 = r1.d();
        if (r1 == 0) goto L_0x01b1;
    L_0x01a6:
        r1 = r15.v;
        r1 = r1.d();
        if (r1 == 0) goto L_0x01b1;
    L_0x01ae:
        r15.a = r12;
        goto L_0x01c9;
    L_0x01b1:
        r1 = r15.s;
        r1 = r1.d();
        if (r1 == 0) goto L_0x01c9;
    L_0x01b9:
        r1 = r15.u;
        r1 = r1.d();
        if (r1 == 0) goto L_0x01c9;
    L_0x01c1:
        r1 = r15.b;
        r1 = r16 / r1;
        r15.b = r1;
        r15.a = r13;
    L_0x01c9:
        r1 = r15.a;
        if (r1 != r2) goto L_0x01e0;
    L_0x01cd:
        if (r20 == 0) goto L_0x01d4;
    L_0x01cf:
        if (r22 != 0) goto L_0x01d4;
    L_0x01d1:
        r15.a = r12;
        goto L_0x01e0;
    L_0x01d4:
        if (r20 != 0) goto L_0x01e0;
    L_0x01d6:
        if (r22 == 0) goto L_0x01e0;
    L_0x01d8:
        r1 = r15.b;
        r1 = r16 / r1;
        r15.b = r1;
        r15.a = r13;
    L_0x01e0:
        r1 = r15.a;
        if (r1 != r2) goto L_0x0224;
    L_0x01e4:
        r1 = r15.i;
        if (r1 <= 0) goto L_0x01ef;
    L_0x01e8:
        r1 = r15.l;
        if (r1 != 0) goto L_0x01ef;
    L_0x01ec:
        r15.a = r12;
        goto L_0x0224;
    L_0x01ef:
        r1 = r15.b;
        r1 = r16 / r1;
        r15.b = r1;
        r15.a = r13;
        goto L_0x0224;
    L_0x01f8:
        r1 = r15.z;
        r7 = r1[r12];
        if (r7 != r8) goto L_0x0208;
    L_0x01fe:
        r15.a = r12;
        r0 = r15.b;
        r1 = r15.C;
        r1 = (float) r1;
        r0 = r0 * r1;
        r0 = (int) r0;
        goto L_0x0224;
    L_0x0208:
        r1 = r1[r13];
        if (r1 != r8) goto L_0x0224;
    L_0x020c:
        r15.a = r13;
        r1 = r15.Y;
        if (r1 != r2) goto L_0x0218;
    L_0x0212:
        r1 = r15.b;
        r1 = r16 / r1;
        r15.b = r1;
    L_0x0218:
        r1 = r15.b;
        r5 = r15.B;
        r5 = (float) r5;
        r1 = r1 * r5;
        r1 = (int) r1;
        r27 = r0;
        r28 = r1;
        goto L_0x0228;
    L_0x0224:
        r27 = r0;
        r28 = r5;
    L_0x0228:
        r26 = 1;
        goto L_0x0231;
    L_0x022b:
        r27 = r0;
        r28 = r5;
        r26 = 0;
    L_0x0231:
        if (r26 == 0) goto L_0x023c;
    L_0x0233:
        r0 = r15.a;
        if (r0 == 0) goto L_0x0239;
    L_0x0237:
        if (r0 != r2) goto L_0x023c;
    L_0x0239:
        r29 = 1;
        goto L_0x023e;
    L_0x023c:
        r29 = 0;
    L_0x023e:
        r0 = r15.z;
        r0 = r0[r12];
        r1 = 2;
        if (r0 != r1) goto L_0x024c;
    L_0x0245:
        r0 = r15 instanceof defpackage.bp;
        if (r0 == 0) goto L_0x024c;
    L_0x0249:
        r30 = 1;
        goto L_0x024e;
    L_0x024c:
        r30 = 0;
    L_0x024e:
        r0 = r15.X;
        r0 = r0.d();
        r31 = r0 ^ 1;
        r0 = r15.c;
        r32 = 0;
        r1 = 2;
        if (r0 == r1) goto L_0x02c1;
    L_0x025d:
        r0 = r15.A;
        if (r0 == 0) goto L_0x026a;
    L_0x0261:
        r0 = r0.u;
        r0 = r14.a(r0);
        r25 = r0;
        goto L_0x026c;
    L_0x026a:
        r25 = r32;
    L_0x026c:
        r0 = r15.A;
        if (r0 == 0) goto L_0x0279;
    L_0x0270:
        r0 = r0.s;
        r0 = r14.a(r0);
        r33 = r0;
        goto L_0x027b;
    L_0x0279:
        r33 = r32;
    L_0x027b:
        r0 = r15.z;
        r5 = r0[r12];
        r7 = r15.s;
        r8 = r15.u;
        r9 = r15.E;
        r11 = r15.H;
        r0 = r15.q;
        r0 = r0[r12];
        r12 = r0;
        r0 = r15.L;
        r13 = r0;
        r0 = r15.g;
        r16 = r0;
        r0 = r15.i;
        r17 = r0;
        r0 = r15.j;
        r18 = r0;
        r0 = r15.k;
        r19 = r0;
        r0 = r37;
        r34 = 2;
        r1 = r38;
        r2 = r20;
        r35 = r3;
        r3 = r33;
        r33 = r4;
        r4 = r25;
        r36 = r6;
        r6 = r30;
        r25 = r10;
        r10 = r27;
        r14 = r29;
        r15 = r23;
        r20 = r31;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x02c9;
    L_0x02c1:
        r35 = r3;
        r33 = r4;
        r36 = r6;
        r25 = r10;
    L_0x02c9:
        r15 = r37;
        r0 = r15.d;
        r1 = 2;
        if (r0 != r1) goto L_0x02d1;
    L_0x02d0:
        return;
    L_0x02d1:
        r0 = r15.z;
        r14 = 1;
        r0 = r0[r14];
        if (r0 != r1) goto L_0x02de;
    L_0x02d8:
        r0 = r15 instanceof defpackage.bp;
        if (r0 == 0) goto L_0x02de;
    L_0x02dc:
        r6 = 1;
        goto L_0x02df;
    L_0x02de:
        r6 = 0;
    L_0x02df:
        if (r26 == 0) goto L_0x02eb;
    L_0x02e1:
        r0 = r15.a;
        if (r0 == r14) goto L_0x02e8;
    L_0x02e5:
        r1 = -1;
        if (r0 != r1) goto L_0x02eb;
    L_0x02e8:
        r20 = 1;
        goto L_0x02ed;
    L_0x02eb:
        r20 = 0;
    L_0x02ed:
        r0 = r15.G;
        if (r0 <= 0) goto L_0x0324;
    L_0x02f1:
        r0 = r15.w;
        r0 = r0.a;
        r0 = r0.f;
        if (r0 != r14) goto L_0x0303;
    L_0x02f9:
        r0 = r15.w;
        r0 = r0.a;
        r10 = r38;
        r0.a(r10);
        goto L_0x0326;
    L_0x0303:
        r10 = r38;
        r0 = r15.G;
        r1 = 6;
        r2 = r35;
        r4 = r36;
        r10.c(r2, r4, r0, r1);
        r0 = r15.w;
        r0 = r0.d;
        if (r0 == 0) goto L_0x0328;
    L_0x0315:
        r0 = r15.w;
        r0 = r0.d;
        r0 = r10.a(r0);
        r3 = 0;
        r10.c(r2, r0, r3, r1);
        r31 = 0;
        goto L_0x0328;
    L_0x0324:
        r10 = r38;
    L_0x0326:
        r4 = r36;
    L_0x0328:
        r0 = r15.A;
        if (r0 == 0) goto L_0x0335;
    L_0x032c:
        r0 = r0.v;
        r0 = r10.a(r0);
        r23 = r0;
        goto L_0x0337;
    L_0x0335:
        r23 = r32;
    L_0x0337:
        r0 = r15.A;
        if (r0 == 0) goto L_0x0343;
    L_0x033b:
        r0 = r0.t;
        r0 = r10.a(r0);
        r3 = r0;
        goto L_0x0345;
    L_0x0343:
        r3 = r32;
    L_0x0345:
        r0 = r15.z;
        r5 = r0[r14];
        r7 = r15.t;
        r8 = r15.v;
        r9 = r15.F;
        r11 = r15.I;
        r0 = r15.q;
        r12 = r0[r14];
        r13 = r15.M;
        r0 = r15.h;
        r16 = r0;
        r0 = r15.l;
        r17 = r0;
        r0 = r15.m;
        r18 = r0;
        r0 = r15.n;
        r19 = r0;
        r0 = r37;
        r1 = r38;
        r2 = r22;
        r22 = r4;
        r4 = r23;
        r10 = r28;
        r14 = r20;
        r15 = r24;
        r20 = r31;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        if (r26 == 0) goto L_0x03a2;
    L_0x037e:
        r6 = r37;
        r0 = r6.a;
        r1 = 1;
        if (r0 != r1) goto L_0x0392;
    L_0x0385:
        r5 = r6.b;
        r0 = r38;
        r1 = r33;
        r2 = r22;
        r3 = r25;
        r4 = r21;
        goto L_0x039e;
    L_0x0392:
        r5 = r6.b;
        r0 = r38;
        r1 = r25;
        r2 = r21;
        r3 = r33;
        r4 = r22;
    L_0x039e:
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x03a4;
    L_0x03a2:
        r6 = r37;
    L_0x03a4:
        r0 = r6.X;
        r0 = r0.d();
        if (r0 == 0) goto L_0x0446;
    L_0x03ac:
        r0 = r6.X;
        r0 = r0.d;
        r0 = r0.b;
        r1 = r6.r;
        r2 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r1 = r1 + r2;
        r1 = (double) r1;
        r1 = java.lang.Math.toRadians(r1);
        r1 = (float) r1;
        r2 = r6.X;
        r2 = r2.b();
        r3 = defpackage.bn.a.LEFT;
        r3 = r6.a(r3);
        r4 = r38;
        r8 = r4.a(r3);
        r3 = defpackage.bn.a.TOP;
        r3 = r6.a(r3);
        r10 = r4.a(r3);
        r3 = defpackage.bn.a.RIGHT;
        r3 = r6.a(r3);
        r3 = r4.a(r3);
        r5 = defpackage.bn.a.BOTTOM;
        r5 = r6.a(r5);
        r11 = r4.a(r5);
        r5 = defpackage.bn.a.LEFT;
        r5 = r0.a(r5);
        r5 = r4.a(r5);
        r7 = defpackage.bn.a.TOP;
        r7 = r0.a(r7);
        r12 = r4.a(r7);
        r7 = defpackage.bn.a.RIGHT;
        r7 = r0.a(r7);
        r15 = r4.a(r7);
        r7 = defpackage.bn.a.BOTTOM;
        r0 = r0.a(r7);
        r13 = r4.a(r0);
        r0 = r38.b();
        r6 = (double) r1;
        r16 = java.lang.Math.sin(r6);
        r1 = (double) r2;
        java.lang.Double.isNaN(r1);
        r18 = r15;
        r14 = r16 * r1;
        r14 = (float) r14;
        r9 = r0;
        r9.b(r10, r11, r12, r13, r14);
        r4.a(r0);
        r0 = r38.b();
        r6 = java.lang.Math.cos(r6);
        java.lang.Double.isNaN(r1);
        r6 = r6 * r1;
        r12 = (float) r6;
        r7 = r0;
        r9 = r3;
        r10 = r5;
        r11 = r18;
        r7.b(r8, r9, r10, r11, r12);
        r4.a(r0);
    L_0x0446:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.a(bi):void");
    }

    public final void a(a aVar, bo boVar, a aVar2, int i, int i2) {
        a(aVar).a(boVar.a(aVar2), i, i2, 2, 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    public final void a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x008e;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008e;
    L_0x000b:
        r1 = -1;
        r2 = r9.length();
        r3 = 44;
        r3 = r9.indexOf(r3);
        r4 = 0;
        r5 = 1;
        if (r3 <= 0) goto L_0x0037;
    L_0x001a:
        r6 = r2 + -1;
        if (r3 >= r6) goto L_0x0037;
    L_0x001e:
        r6 = r9.substring(r4, r3);
        r7 = "W";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r1 = 0;
        goto L_0x0035;
    L_0x002c:
        r4 = "H";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        r1 = 1;
    L_0x0035:
        r4 = r3 + 1;
    L_0x0037:
        r3 = 58;
        r3 = r9.indexOf(r3);
        if (r3 < 0) goto L_0x0075;
    L_0x003f:
        r2 = r2 - r5;
        if (r3 >= r2) goto L_0x0075;
    L_0x0042:
        r2 = r9.substring(r4, r3);
        r3 = r3 + r5;
        r9 = r9.substring(r3);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0051:
        r3 = r9.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0057:
        r2 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0084;
    L_0x0063:
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0084;
    L_0x0067:
        if (r1 != r5) goto L_0x006f;
    L_0x0069:
        r9 = r9 / r2;
        r9 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x006f:
        r2 = r2 / r9;
        r9 = java.lang.Math.abs(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0075:
        r9 = r9.substring(r4);
        r2 = r9.length();
        if (r2 <= 0) goto L_0x0084;
    L_0x007f:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0089:
        r8.D = r9;
        r8.Y = r1;
    L_0x008d:
        return;
    L_0x008e:
        r8.D = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.a(java.lang.String):void");
    }

    public boolean a() {
        return this.O != 8;
    }

    public void b() {
        for (int i = 0; i < 6; i++) {
            this.x[i].a.b();
        }
    }

    public final void b(int i) {
        this.E = i;
    }

    public void b(int i, int i2) {
        this.ad = i;
        this.ae = i2;
    }

    public void c() {
    }

    public final void c(int i) {
        this.F = i;
    }

    public final void c(int i, int i2) {
        this.E = i;
        this.B = i2 - i;
        i = this.B;
        i2 = this.H;
        if (i < i2) {
            this.B = i2;
        }
    }

    public final void d(int i) {
        this.B = i;
        i = this.B;
        int i2 = this.H;
        if (i < i2) {
            this.B = i2;
        }
    }

    public final void d(int i, int i2) {
        this.F = i;
        this.C = i2 - i;
        i = this.C;
        i2 = this.I;
        if (i < i2) {
            this.C = i2;
        }
    }

    public final boolean d() {
        return this.g == 0 && this.D == MapboxConstants.MINIMUM_ZOOM && this.i == 0 && this.j == 0 && this.z[0] == 3;
    }

    public final void e(int i) {
        this.C = i;
        i = this.C;
        int i2 = this.I;
        if (i < i2) {
            this.C = i2;
        }
    }

    public final boolean e() {
        return this.h == 0 && this.D == MapboxConstants.MINIMUM_ZOOM && this.l == 0 && this.m == 0 && this.z[1] == 3;
    }

    public void f() {
        this.s.c();
        this.t.c();
        this.u.c();
        this.v.c();
        this.w.c();
        this.V.c();
        this.W.c();
        this.X.c();
        this.A = null;
        this.r = MapboxConstants.MINIMUM_ZOOM;
        this.B = 0;
        this.C = 0;
        this.D = MapboxConstants.MINIMUM_ZOOM;
        this.Y = -1;
        this.E = 0;
        this.F = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        float f = af;
        this.L = f;
        this.M = f;
        int[] iArr = this.z;
        iArr[0] = 1;
        iArr[1] = 1;
        this.N = null;
        this.ag = 0;
        this.O = 0;
        this.ah = null;
        this.ai = false;
        this.aj = false;
        this.Q = 0;
        this.R = 0;
        this.ak = false;
        this.al = false;
        float[] fArr = this.S;
        fArr[0] = MapboxConstants.MINIMUM_ZOOM;
        fArr[1] = MapboxConstants.MINIMUM_ZOOM;
        this.c = -1;
        this.d = -1;
        int[] iArr2 = this.q;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.g = 0;
        this.h = 0;
        this.k = 1.0f;
        this.n = 1.0f;
        this.j = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.i = 0;
        this.l = 0;
        this.a = -1;
        this.b = 1.0f;
        bv bvVar = this.e;
        if (bvVar != null) {
            bvVar.b();
        }
        bvVar = this.f;
        if (bvVar != null) {
            bvVar.b();
        }
    }

    public final void f(int i) {
        if (i < 0) {
            this.H = 0;
        } else {
            this.H = i;
        }
    }

    public final void g() {
        for (int i = 0; i < 6; i++) {
            bu buVar = this.x[i].a;
            bn bnVar = buVar.a.d;
            if (bnVar != null) {
                if (bnVar.d == buVar.a) {
                    buVar.e = 4;
                    bnVar.a.e = 4;
                }
                int b = buVar.a.b();
                if (buVar.a.c == a.RIGHT || buVar.a.c == a.BOTTOM) {
                    b = -b;
                }
                buVar.b(bnVar.a, b);
            }
        }
    }

    public final void g(int i) {
        if (i < 0) {
            this.I = 0;
        } else {
            this.I = i;
        }
    }

    public final bv h() {
        if (this.e == null) {
            this.e = new bv();
        }
        return this.e;
    }

    public final void h(int i) {
        this.z[0] = i;
        if (i == 2) {
            d(this.J);
        }
    }

    public final bv i() {
        if (this.f == null) {
            this.f = new bv();
        }
        return this.f;
    }

    public final void i(int i) {
        this.z[1] = i;
        if (i == 2) {
            e(this.K);
        }
    }

    public final int j() {
        return this.E;
    }

    public final int k() {
        return this.F;
    }

    public final int l() {
        return this.O == 8 ? 0 : this.B;
    }

    public final int m() {
        return this.O == 8 ? 0 : this.C;
    }

    public final int n() {
        return this.Z + this.ad;
    }

    public final int o() {
        return this.aa + this.ae;
    }

    /* Access modifiers changed, original: protected|final */
    public final int p() {
        return this.E + this.ad;
    }

    /* Access modifiers changed, original: protected|final */
    public final int q() {
        return this.F + this.ae;
    }

    public final int r() {
        return this.E + this.B;
    }

    public final int s() {
        return this.F + this.C;
    }

    public final boolean t() {
        return this.G > 0;
    }

    public String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (this.P != null) {
            StringBuilder stringBuilder3 = new StringBuilder("id: ");
            stringBuilder3.append(this.P);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append("(");
        stringBuilder2.append(this.E);
        stringBuilder2.append(ppy.d);
        stringBuilder2.append(this.F);
        stringBuilder2.append(") - (");
        stringBuilder2.append(this.B);
        stringBuilder = " x ";
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(this.C);
        stringBuilder2.append(") wrap: (");
        stringBuilder2.append(this.J);
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(this.K);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }

    public ArrayList<bn> u() {
        return this.y;
    }

    public void v() {
        int i = this.E;
        int i2 = this.F;
        int i3 = this.B + i;
        int i4 = this.C + i2;
        this.Z = i;
        this.aa = i2;
        this.ab = i3 - i;
        this.ac = i4 - i2;
    }

    public final float w() {
        return this.D;
    }

    public final void x() {
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            ((bn) this.y.get(i)).c();
        }
    }

    public final int y() {
        return this.z[0];
    }

    public final int z() {
        return this.z[1];
    }
}
