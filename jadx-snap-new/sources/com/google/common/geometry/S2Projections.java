package com.google.common.geometry;

import com.google.common.geometry.S2.Metric;

public final class S2Projections {
    public static final Metric AVG_ANGLE_SPAN = new Metric(1, 0.7853981633974483d);
    public static final Metric AVG_AREA = new Metric(2, 0.5235987755982988d);
    public static final Metric AVG_DIAG;
    public static final Metric AVG_EDGE;
    public static final Metric AVG_WIDTH;
    public static final Metric MAX_ANGLE_SPAN;
    public static final Metric MAX_AREA;
    public static final Metric MAX_DIAG;
    public static final double MAX_DIAG_ASPECT = Math.sqrt(3.0d);
    public static final Metric MAX_EDGE = new Metric(1, MAX_ANGLE_SPAN.deriv());
    public static final double MAX_EDGE_ASPECT;
    public static final Metric MAX_WIDTH = new Metric(1, MAX_ANGLE_SPAN.deriv());
    public static final Metric MIN_ANGLE_SPAN;
    public static final Metric MIN_AREA;
    public static final Metric MIN_DIAG;
    public static final Metric MIN_EDGE;
    public static final Metric MIN_WIDTH;
    private static final Projections S2_PROJECTION = Projections.S2_QUADRATIC_PROJECTION;

    /* renamed from: com.google.common.geometry.S2Projections$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$geometry$S2Projections$Projections = new int[Projections.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.google.common.geometry.S2Projections.Projections.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$google$common$geometry$S2Projections$Projections = r0;
            r0 = $SwitchMap$com$google$common$geometry$S2Projections$Projections;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$google$common$geometry$S2Projections$Projections;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$google$common$geometry$S2Projections$Projections;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.geometry.S2Projections$AnonymousClass1.<clinit>():void");
        }
    }

    public enum Projections {
        S2_LINEAR_PROJECTION,
        S2_TAN_PROJECTION,
        S2_QUADRATIC_PROJECTION
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x022d  */
    static {
        /*
        r0 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        S2_PROJECTION = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        r3 = 4621256167635550208; // 0x4022000000000000 float:0.0 double:9.0;
        r5 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r7 = 4613937818241073152; // 0x4008000000000000 float:0.0 double:3.0;
        r9 = 0;
        if (r1 != r2) goto L_0x001c;
    L_0x0014:
        r1 = java.lang.Math.sqrt(r7);
        r1 = r1 * r7;
        r1 = r5 / r1;
        goto L_0x003d;
    L_0x001c:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x002e;
    L_0x0022:
        r1 = 4621745711392638430; // 0x4023bd3cc9be45de float:-1558715.8 double:9.869604401089358;
        r11 = 4625196817309499392; // 0x4030000000000000 float:0.0 double:16.0;
        r13 = com.google.common.geometry.S2.M_SQRT2;
        r13 = r13 * r11;
        r1 = r1 / r13;
        goto L_0x003d;
    L_0x002e:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x003c;
    L_0x0034:
        r1 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r11 = com.google.common.geometry.S2.M_SQRT2;
        r11 = r11 * r1;
        r1 = r11 / r3;
        goto L_0x003d;
    L_0x003c:
        r1 = r9;
    L_0x003d:
        r11 = 2;
        r0.<init>(r11, r1);
        MIN_AREA = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x004d;
    L_0x004b:
        r1 = r5;
        goto L_0x0066;
    L_0x004d:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x0059;
    L_0x0053:
        r1 = 4603731312883156446; // 0x3fe3bd3cc9be45de float:-1558715.8 double:0.6168502750680849;
        goto L_0x0066;
    L_0x0059:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x0065;
    L_0x005f:
        r1 = 4604110511821017778; // 0x3fe5161debbbd2b2 float:-4.541282E26 double:0.6589498142407904;
        goto L_0x0066;
    L_0x0065:
        r1 = r9;
    L_0x0066:
        r0.<init>(r11, r1);
        MAX_AREA = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = 4602891378046628709; // 0x3fe0c152382d7365 float:4.1353884E-5 double:0.5235987755982988;
        r0.<init>(r11, r1);
        AVG_AREA = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        r11 = 4605249457297304856; // 0x3fe921fb54442d18 float:3.37028055E12 double:0.7853981633974483;
        if (r1 != r2) goto L_0x0087;
    L_0x0084:
        r1 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        goto L_0x009c;
    L_0x0087:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x008f;
    L_0x008d:
        r1 = r11;
        goto L_0x009c;
    L_0x008f:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x009b;
    L_0x0095:
        r1 = 4604180019048437077; // 0x3fe5555555555555 float:1.46601547E13 double:0.6666666666666666;
        goto L_0x009c;
    L_0x009b:
        r1 = r9;
    L_0x009c:
        r13 = 1;
        r0.<init>(r13, r1);
        MIN_ANGLE_SPAN = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x00ac;
    L_0x00aa:
        r1 = r5;
        goto L_0x00c1;
    L_0x00ac:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x00b4;
    L_0x00b2:
        r1 = r11;
        goto L_0x00c1;
    L_0x00b4:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x00c0;
    L_0x00ba:
        r1 = 4605853393846223026; // 0x3feb474243bb40b2 float:374.50543 double:0.8524485895996092;
        goto L_0x00c1;
    L_0x00c0:
        r1 = r9;
    L_0x00c1:
        r0.<init>(r13, r1);
        MAX_ANGLE_SPAN = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r0.<init>(r13, r11);
        AVG_ANGLE_SPAN = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        r11 = 4618441417868443648; // 0x4018000000000000 float:0.0 double:6.0;
        r14 = 4616189618054758400; // 0x4010000000000000 float:0.0 double:4.0;
        r16 = 4614256656552045848; // 0x400921fb54442d18 float:3.37028055E12 double:3.141592653589793;
        if (r1 != r2) goto L_0x00e5;
    L_0x00de:
        r1 = java.lang.Math.sqrt(r11);
        r1 = r5 / r1;
        goto L_0x00fc;
    L_0x00e5:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x00f1;
    L_0x00eb:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 * r14;
        r1 = r16 / r1;
        goto L_0x00fc;
    L_0x00f1:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x00fb;
    L_0x00f7:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 / r7;
        goto L_0x00fc;
    L_0x00fb:
        r1 = r9;
    L_0x00fc:
        r0.<init>(r13, r1);
        MIN_WIDTH = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = MAX_ANGLE_SPAN;
        r1 = r1.deriv();
        r0.<init>(r13, r1);
        MAX_WIDTH = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x011c;
    L_0x0116:
        r1 = 4604531867329270116; // 0x3fe6955665209164 float:4.739129E22 double:0.7057296729222284;
        goto L_0x0135;
    L_0x011c:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x0128;
    L_0x0122:
        r1 = 4604648327231952439; // 0x3fe6ff41d441d637 float:-3.33009047E12 double:0.7186593194625804;
        goto L_0x0135;
    L_0x0128:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x0134;
    L_0x012e:
        r1 = 4604635739823940408; // 0x3fe6f3cf18462338 float:2.5608681E-24 double:0.7172618364430496;
        goto L_0x0135;
    L_0x0134:
        r1 = r9;
    L_0x0135:
        r0.<init>(r13, r1);
        AVG_WIDTH = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x0146;
    L_0x0142:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 / r7;
        goto L_0x015a;
    L_0x0146:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x0152;
    L_0x014c:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 * r14;
        r1 = r16 / r1;
        goto L_0x015a;
    L_0x0152:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x0159;
    L_0x0158:
        goto L_0x0142;
    L_0x0159:
        r1 = r9;
    L_0x015a:
        r0.<init>(r13, r1);
        MIN_EDGE = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = MAX_ANGLE_SPAN;
        r1 = r1.deriv();
        r0.<init>(r13, r1);
        MAX_EDGE = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x017a;
    L_0x0174:
        r1 = 4604660557000072045; // 0x3fe70a614b3ddb6d float:1.2442477E7 double:0.7200170964778018;
        goto L_0x0193;
    L_0x017a:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x0186;
    L_0x0180:
        r1 = 4604757982648393650; // 0x3fe762fcf866dfb2 float:-1.8730709E34 double:0.7308335162733697;
        goto L_0x0193;
    L_0x0186:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x0192;
    L_0x018c:
        r1 = 4604746934029754789; // 0x3fe758f08369a1a5 float:-6.8658105E-37 double:0.7296068731930531;
        goto L_0x0193;
    L_0x0192:
        r1 = r9;
    L_0x0193:
        r0.<init>(r13, r1);
        AVG_EDGE = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x01a4;
    L_0x01a0:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 / r7;
        goto L_0x01bc;
    L_0x01a4:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x01b0;
    L_0x01aa:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 * r7;
        r1 = r16 / r1;
        goto L_0x01bc;
    L_0x01b0:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x01bb;
    L_0x01b6:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        r1 = r1 * r14;
        r1 = r1 / r3;
        goto L_0x01bc;
    L_0x01bb:
        r1 = r9;
    L_0x01bc:
        r0.<init>(r13, r1);
        MIN_DIAG = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x01cc;
    L_0x01c9:
        r1 = com.google.common.geometry.S2.M_SQRT2;
        goto L_0x01e6;
    L_0x01cc:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x01d9;
    L_0x01d2:
        r1 = java.lang.Math.sqrt(r11);
        r1 = r16 / r1;
        goto L_0x01e6;
    L_0x01d9:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x01e5;
    L_0x01df:
        r1 = 4608170181134036115; // 0x3ff3825d570aac93 float:1.52473805E14 double:1.2193272972170106;
        goto L_0x01e6;
    L_0x01e5:
        r1 = r9;
    L_0x01e6:
        r0.<init>(r13, r1);
        MAX_DIAG = r0;
        r0 = new com.google.common.geometry.S2$Metric;
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r1 != r2) goto L_0x01f9;
    L_0x01f3:
        r1 = 4607254066265691152; // 0x3ff04129b9bd9410 float:-3.6159204E-4 double:1.0159089332094062;
        goto L_0x0212;
    L_0x01f9:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r1 != r2) goto L_0x0205;
    L_0x01ff:
        r1 = 4607325685503608600; // 0x3ff0824ce0f9c718 float:-1.4398705E20 double:1.0318115985978178;
        goto L_0x0212;
    L_0x0205:
        r1 = S2_PROJECTION;
        r2 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r1 != r2) goto L_0x0211;
    L_0x020b:
        r1 = 4607318478712436519; // 0x3ff07bbeeabf7727 float:-1.1573376E26 double:1.0302113694992359;
        goto L_0x0212;
    L_0x0211:
        r1 = r9;
    L_0x0212:
        r0.<init>(r13, r1);
        AVG_DIAG = r0;
        r0 = S2_PROJECTION;
        r1 = com.google.common.geometry.S2Projections.Projections.S2_LINEAR_PROJECTION;
        if (r0 != r1) goto L_0x0220;
    L_0x021d:
        r9 = com.google.common.geometry.S2.M_SQRT2;
        goto L_0x0232;
    L_0x0220:
        r0 = S2_PROJECTION;
        r1 = com.google.common.geometry.S2Projections.Projections.S2_TAN_PROJECTION;
        if (r0 != r1) goto L_0x0227;
    L_0x0226:
        goto L_0x021d;
    L_0x0227:
        r0 = S2_PROJECTION;
        r1 = com.google.common.geometry.S2Projections.Projections.S2_QUADRATIC_PROJECTION;
        if (r0 != r1) goto L_0x0232;
    L_0x022d:
        r9 = 4609175780785111001; // 0x3ff714f3c107bfd9 float:-8.484338 double:1.442615274452683;
    L_0x0232:
        MAX_EDGE_ASPECT = r9;
        r0 = java.lang.Math.sqrt(r7);
        MAX_DIAG_ASPECT = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.geometry.S2Projections.<clinit>():void");
    }

    public static double uvToST(double d) {
        int i = AnonymousClass1.$SwitchMap$com$google$common$geometry$S2Projections$Projections[S2_PROJECTION.ordinal()];
        if (i != 1) {
            if (i == 2) {
                d = Math.atan(d) * 1.2732395447351628d;
            } else if (i == 3) {
                return d >= 0.0d ? Math.sqrt((d * 3.0d) + 1.0d) - 1.0d : 1.0d - Math.sqrt(1.0d - (d * 3.0d));
            } else {
                throw new IllegalStateException("Invalid value for S2_PROJECTION");
            }
        }
        return d;
    }

    public static R2Vector validFaceXyzToUv(int i, S2Point s2Point) {
        double d;
        double d2;
        double d3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    d = (-s2Point.x) / s2Point.z;
                    d2 = s2Point.y;
                } else if (i == 3) {
                    d = s2Point.z / s2Point.x;
                    d2 = s2Point.y;
                    d3 = s2Point.x;
                } else if (i != 4) {
                    d = (-s2Point.y) / s2Point.z;
                    d2 = s2Point.x;
                } else {
                    d = s2Point.z / s2Point.y;
                    d2 = -s2Point.x;
                }
                d2 = -d2;
                d3 = s2Point.z;
            } else {
                d = (-s2Point.x) / s2Point.y;
                d2 = s2Point.z;
            }
            d3 = s2Point.y;
        } else {
            d = s2Point.y / s2Point.x;
            d2 = s2Point.z;
            d3 = s2Point.x;
        }
        return new R2Vector(d, d2 / d3);
    }

    public static int xyzToFace(S2Point s2Point) {
        int largestAbsComponent = s2Point.largestAbsComponent();
        return s2Point.get(largestAbsComponent) < 0.0d ? largestAbsComponent + 3 : largestAbsComponent;
    }
}
