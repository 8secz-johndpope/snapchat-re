package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.az;
import defpackage.ba;
import defpackage.bc;
import defpackage.bo;
import defpackage.bp;
import defpackage.bq;
import defpackage.ppy;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> a = new SparseArray();
    public ba b = null;
    public HashMap<String, Integer> c = new HashMap();
    private ArrayList<az> d = new ArrayList(4);
    private final ArrayList<bo> e = new ArrayList(100);
    private bp f = new bp();
    private int g = 0;
    private int h = 0;
    private int i = Integer.MAX_VALUE;
    private int j = Integer.MAX_VALUE;
    private boolean k = true;
    private int l = 3;
    private int m = -1;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = 0;
    private int s = 0;

    public static class a extends MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public float C = MapboxConstants.MINIMUM_ZOOM;
        public float D = MapboxConstants.MINIMUM_ZOOM;
        public int E = 0;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public float M = 1.0f;
        public float N = 1.0f;
        public int O = -1;
        public int P = -1;
        public int Q = -1;
        public boolean R = false;
        public boolean S = false;
        boolean T = true;
        boolean U = true;
        boolean V = false;
        boolean W = false;
        boolean X = false;
        boolean Y = false;
        int Z = -1;
        public int a = -1;
        int aa = -1;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        float af = 0.5f;
        int ag;
        int ah;
        float ai;
        public bo aj = new bo();
        private float ak = MapboxConstants.MINIMUM_ZOOM;
        private int al = 1;
        private boolean am = false;
        public int b = -1;
        public float c = -1.0f;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public int g = -1;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = 0;
        public float o = MapboxConstants.MINIMUM_ZOOM;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(34, 8);
                a.append(35, 9);
                a.append(37, 10);
                a.append(38, 11);
                a.append(43, 12);
                a.append(42, 13);
                a.append(16, 14);
                a.append(15, 15);
                a.append(13, 16);
                a.append(17, 2);
                a.append(19, 3);
                a.append(18, 4);
                a.append(51, 49);
                a.append(52, 50);
                a.append(23, 5);
                a.append(24, 6);
                a.append(25, 7);
                a.append(0, 1);
                a.append(39, 17);
                a.append(40, 18);
                a.append(22, 19);
                a.append(21, 20);
                a.append(55, 21);
                a.append(58, 22);
                a.append(56, 23);
                a.append(53, 24);
                a.append(57, 25);
                a.append(54, 26);
                a.append(30, 29);
                a.append(44, 30);
                a.append(20, 44);
                a.append(32, 45);
                a.append(46, 46);
                a.append(31, 47);
                a.append(45, 48);
                a.append(11, 27);
                a.append(10, 28);
                a.append(47, 31);
                a.append(26, 32);
                a.append(49, 33);
                a.append(48, 34);
                a.append(50, 35);
                a.append(28, 36);
                a.append(27, 37);
                a.append(29, 38);
                a.append(33, 39);
                a.append(41, 40);
                a.append(36, 41);
                a.append(14, 42);
                a.append(12, 43);
            }
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Missing block: B:79:0x020f, code skipped:
            android.util.Log.e(r7, r5);
     */
        public a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
            r9 = this;
            r9.<init>(r10, r11);
            r0 = -1;
            r9.a = r0;
            r9.b = r0;
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r9.c = r1;
            r9.d = r0;
            r9.e = r0;
            r9.f = r0;
            r9.g = r0;
            r9.h = r0;
            r9.i = r0;
            r9.j = r0;
            r9.k = r0;
            r9.l = r0;
            r9.m = r0;
            r1 = 0;
            r9.n = r1;
            r2 = 0;
            r9.o = r2;
            r9.p = r0;
            r9.q = r0;
            r9.r = r0;
            r9.s = r0;
            r9.t = r0;
            r9.u = r0;
            r9.v = r0;
            r9.w = r0;
            r9.x = r0;
            r9.y = r0;
            r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r9.z = r3;
            r9.A = r3;
            r4 = 0;
            r9.B = r4;
            r9.ak = r2;
            r4 = 1;
            r9.al = r4;
            r9.C = r2;
            r9.D = r2;
            r9.E = r1;
            r9.F = r1;
            r9.G = r1;
            r9.H = r1;
            r9.I = r1;
            r9.J = r1;
            r9.K = r1;
            r9.L = r1;
            r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r9.M = r5;
            r9.N = r5;
            r9.O = r0;
            r9.P = r0;
            r9.Q = r0;
            r9.R = r1;
            r9.S = r1;
            r9.T = r4;
            r9.U = r4;
            r9.V = r1;
            r9.W = r1;
            r9.X = r1;
            r9.Y = r1;
            r9.Z = r0;
            r9.aa = r0;
            r9.ab = r0;
            r9.ac = r0;
            r9.ad = r0;
            r9.ae = r0;
            r9.af = r3;
            r3 = new bo;
            r3.<init>();
            r9.aj = r3;
            r9.am = r1;
            r3 = defpackage.bd.b.a;
            r10 = r10.obtainStyledAttributes(r11, r3);
            r11 = r10.getIndexCount();
            r3 = 0;
        L_0x009a:
            if (r3 >= r11) goto L_0x03d3;
        L_0x009c:
            r5 = r10.getIndex(r3);
            r6 = android.support.constraint.ConstraintLayout.a.a.a;
            r6 = r6.get(r5);
            r7 = "ConstraintLayout";
            r8 = -2;
            switch(r6) {
                case 0: goto L_0x03cf;
                case 1: goto L_0x03c7;
                case 2: goto L_0x03b4;
                case 3: goto L_0x03ab;
                case 4: goto L_0x0394;
                case 5: goto L_0x038b;
                case 6: goto L_0x0382;
                case 7: goto L_0x0379;
                case 8: goto L_0x0366;
                case 9: goto L_0x0353;
                case 10: goto L_0x0340;
                case 11: goto L_0x032c;
                case 12: goto L_0x0318;
                case 13: goto L_0x0304;
                case 14: goto L_0x02f0;
                case 15: goto L_0x02dc;
                case 16: goto L_0x02c8;
                case 17: goto L_0x02b4;
                case 18: goto L_0x02a0;
                case 19: goto L_0x028c;
                case 20: goto L_0x0278;
                case 21: goto L_0x026e;
                case 22: goto L_0x0264;
                case 23: goto L_0x025a;
                case 24: goto L_0x0250;
                case 25: goto L_0x0246;
                case 26: goto L_0x023c;
                case 27: goto L_0x0232;
                case 28: goto L_0x0228;
                case 29: goto L_0x021e;
                case 30: goto L_0x0214;
                case 31: goto L_0x0203;
                case 32: goto L_0x01f6;
                case 33: goto L_0x01e0;
                case 34: goto L_0x01ca;
                case 35: goto L_0x01bc;
                case 36: goto L_0x01a6;
                case 37: goto L_0x0190;
                case 38: goto L_0x0182;
                default: goto L_0x00ac;
            };
        L_0x00ac:
            switch(r6) {
                case 44: goto L_0x00e5;
                case 45: goto L_0x00dd;
                case 46: goto L_0x00d5;
                case 47: goto L_0x00cd;
                case 48: goto L_0x00c5;
                case 49: goto L_0x00bb;
                case 50: goto L_0x00b1;
                default: goto L_0x00af;
            };
        L_0x00af:
            goto L_0x03cf;
        L_0x00b1:
            r6 = r9.P;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.P = r5;
            goto L_0x03cf;
        L_0x00bb:
            r6 = r9.O;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.O = r5;
            goto L_0x03cf;
        L_0x00c5:
            r5 = r10.getInt(r5, r1);
            r9.F = r5;
            goto L_0x03cf;
        L_0x00cd:
            r5 = r10.getInt(r5, r1);
            r9.E = r5;
            goto L_0x03cf;
        L_0x00d5:
            r5 = r10.getFloat(r5, r2);
            r9.D = r5;
            goto L_0x03cf;
        L_0x00dd:
            r5 = r10.getFloat(r5, r2);
            r9.C = r5;
            goto L_0x03cf;
        L_0x00e5:
            r5 = r10.getString(r5);
            r9.B = r5;
            r5 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
            r9.ak = r5;
            r9.al = r0;
            r5 = r9.B;
            if (r5 == 0) goto L_0x03cf;
        L_0x00f5:
            r5 = r5.length();
            r6 = r9.B;
            r7 = 44;
            r6 = r6.indexOf(r7);
            if (r6 <= 0) goto L_0x0125;
        L_0x0103:
            r7 = r5 + -1;
            if (r6 >= r7) goto L_0x0125;
        L_0x0107:
            r7 = r9.B;
            r7 = r7.substring(r1, r6);
            r8 = "W";
            r8 = r7.equalsIgnoreCase(r8);
            if (r8 == 0) goto L_0x0118;
        L_0x0115:
            r9.al = r1;
            goto L_0x0122;
        L_0x0118:
            r8 = "H";
            r7 = r7.equalsIgnoreCase(r8);
            if (r7 == 0) goto L_0x0122;
        L_0x0120:
            r9.al = r4;
        L_0x0122:
            r6 = r6 + 1;
            goto L_0x0126;
        L_0x0125:
            r6 = 0;
        L_0x0126:
            r7 = r9.B;
            r8 = 58;
            r7 = r7.indexOf(r8);
            if (r7 < 0) goto L_0x0171;
        L_0x0130:
            r5 = r5 + -1;
            if (r7 >= r5) goto L_0x0171;
        L_0x0134:
            r5 = r9.B;
            r5 = r5.substring(r6, r7);
            r6 = r9.B;
            r7 = r7 + 1;
            r6 = r6.substring(r7);
            r7 = r5.length();
            if (r7 <= 0) goto L_0x03cf;
        L_0x0148:
            r7 = r6.length();
            if (r7 <= 0) goto L_0x03cf;
        L_0x014e:
            r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x03cf }
            r6 = java.lang.Float.parseFloat(r6);	 Catch:{ NumberFormatException -> 0x03cf }
            r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
            if (r7 <= 0) goto L_0x03cf;
        L_0x015a:
            r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r7 <= 0) goto L_0x03cf;
        L_0x015e:
            r7 = r9.al;	 Catch:{ NumberFormatException -> 0x03cf }
            if (r7 != r4) goto L_0x016b;
        L_0x0162:
            r6 = r6 / r5;
            r5 = java.lang.Math.abs(r6);	 Catch:{ NumberFormatException -> 0x03cf }
        L_0x0167:
            r9.ak = r5;	 Catch:{ NumberFormatException -> 0x03cf }
            goto L_0x03cf;
        L_0x016b:
            r5 = r5 / r6;
            r5 = java.lang.Math.abs(r5);	 Catch:{ NumberFormatException -> 0x03cf }
            goto L_0x0167;
        L_0x0171:
            r5 = r9.B;
            r5 = r5.substring(r6);
            r6 = r5.length();
            if (r6 <= 0) goto L_0x03cf;
        L_0x017d:
            r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x03cf }
            goto L_0x0167;
        L_0x0182:
            r6 = r9.N;
            r5 = r10.getFloat(r5, r6);
            r5 = java.lang.Math.max(r2, r5);
            r9.N = r5;
            goto L_0x03cf;
        L_0x0190:
            r6 = r9.L;	 Catch:{ Exception -> 0x019a }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x019a }
            r9.L = r6;	 Catch:{ Exception -> 0x019a }
            goto L_0x03cf;
        L_0x019a:
            r6 = r9.L;
            r5 = r10.getInt(r5, r6);
            if (r5 != r8) goto L_0x03cf;
        L_0x01a2:
            r9.L = r8;
            goto L_0x03cf;
        L_0x01a6:
            r6 = r9.J;	 Catch:{ Exception -> 0x01b0 }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x01b0 }
            r9.J = r6;	 Catch:{ Exception -> 0x01b0 }
            goto L_0x03cf;
        L_0x01b0:
            r6 = r9.J;
            r5 = r10.getInt(r5, r6);
            if (r5 != r8) goto L_0x03cf;
        L_0x01b8:
            r9.J = r8;
            goto L_0x03cf;
        L_0x01bc:
            r6 = r9.M;
            r5 = r10.getFloat(r5, r6);
            r5 = java.lang.Math.max(r2, r5);
            r9.M = r5;
            goto L_0x03cf;
        L_0x01ca:
            r6 = r9.K;	 Catch:{ Exception -> 0x01d4 }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x01d4 }
            r9.K = r6;	 Catch:{ Exception -> 0x01d4 }
            goto L_0x03cf;
        L_0x01d4:
            r6 = r9.K;
            r5 = r10.getInt(r5, r6);
            if (r5 != r8) goto L_0x03cf;
        L_0x01dc:
            r9.K = r8;
            goto L_0x03cf;
        L_0x01e0:
            r6 = r9.I;	 Catch:{ Exception -> 0x01ea }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x01ea }
            r9.I = r6;	 Catch:{ Exception -> 0x01ea }
            goto L_0x03cf;
        L_0x01ea:
            r6 = r9.I;
            r5 = r10.getInt(r5, r6);
            if (r5 != r8) goto L_0x03cf;
        L_0x01f2:
            r9.I = r8;
            goto L_0x03cf;
        L_0x01f6:
            r5 = r10.getInt(r5, r1);
            r9.H = r5;
            r5 = r9.H;
            if (r5 != r4) goto L_0x03cf;
        L_0x0200:
            r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
            goto L_0x020f;
        L_0x0203:
            r5 = r10.getInt(r5, r1);
            r9.G = r5;
            r5 = r9.G;
            if (r5 != r4) goto L_0x03cf;
        L_0x020d:
            r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
        L_0x020f:
            android.util.Log.e(r7, r5);
            goto L_0x03cf;
        L_0x0214:
            r6 = r9.A;
            r5 = r10.getFloat(r5, r6);
            r9.A = r5;
            goto L_0x03cf;
        L_0x021e:
            r6 = r9.z;
            r5 = r10.getFloat(r5, r6);
            r9.z = r5;
            goto L_0x03cf;
        L_0x0228:
            r6 = r9.S;
            r5 = r10.getBoolean(r5, r6);
            r9.S = r5;
            goto L_0x03cf;
        L_0x0232:
            r6 = r9.R;
            r5 = r10.getBoolean(r5, r6);
            r9.R = r5;
            goto L_0x03cf;
        L_0x023c:
            r6 = r9.y;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.y = r5;
            goto L_0x03cf;
        L_0x0246:
            r6 = r9.x;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.x = r5;
            goto L_0x03cf;
        L_0x0250:
            r6 = r9.w;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.w = r5;
            goto L_0x03cf;
        L_0x025a:
            r6 = r9.v;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.v = r5;
            goto L_0x03cf;
        L_0x0264:
            r6 = r9.u;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.u = r5;
            goto L_0x03cf;
        L_0x026e:
            r6 = r9.t;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.t = r5;
            goto L_0x03cf;
        L_0x0278:
            r6 = r9.s;
            r6 = r10.getResourceId(r5, r6);
            r9.s = r6;
            r6 = r9.s;
            if (r6 != r0) goto L_0x03cf;
        L_0x0284:
            r5 = r10.getInt(r5, r0);
            r9.s = r5;
            goto L_0x03cf;
        L_0x028c:
            r6 = r9.r;
            r6 = r10.getResourceId(r5, r6);
            r9.r = r6;
            r6 = r9.r;
            if (r6 != r0) goto L_0x03cf;
        L_0x0298:
            r5 = r10.getInt(r5, r0);
            r9.r = r5;
            goto L_0x03cf;
        L_0x02a0:
            r6 = r9.q;
            r6 = r10.getResourceId(r5, r6);
            r9.q = r6;
            r6 = r9.q;
            if (r6 != r0) goto L_0x03cf;
        L_0x02ac:
            r5 = r10.getInt(r5, r0);
            r9.q = r5;
            goto L_0x03cf;
        L_0x02b4:
            r6 = r9.p;
            r6 = r10.getResourceId(r5, r6);
            r9.p = r6;
            r6 = r9.p;
            if (r6 != r0) goto L_0x03cf;
        L_0x02c0:
            r5 = r10.getInt(r5, r0);
            r9.p = r5;
            goto L_0x03cf;
        L_0x02c8:
            r6 = r9.l;
            r6 = r10.getResourceId(r5, r6);
            r9.l = r6;
            r6 = r9.l;
            if (r6 != r0) goto L_0x03cf;
        L_0x02d4:
            r5 = r10.getInt(r5, r0);
            r9.l = r5;
            goto L_0x03cf;
        L_0x02dc:
            r6 = r9.k;
            r6 = r10.getResourceId(r5, r6);
            r9.k = r6;
            r6 = r9.k;
            if (r6 != r0) goto L_0x03cf;
        L_0x02e8:
            r5 = r10.getInt(r5, r0);
            r9.k = r5;
            goto L_0x03cf;
        L_0x02f0:
            r6 = r9.j;
            r6 = r10.getResourceId(r5, r6);
            r9.j = r6;
            r6 = r9.j;
            if (r6 != r0) goto L_0x03cf;
        L_0x02fc:
            r5 = r10.getInt(r5, r0);
            r9.j = r5;
            goto L_0x03cf;
        L_0x0304:
            r6 = r9.i;
            r6 = r10.getResourceId(r5, r6);
            r9.i = r6;
            r6 = r9.i;
            if (r6 != r0) goto L_0x03cf;
        L_0x0310:
            r5 = r10.getInt(r5, r0);
            r9.i = r5;
            goto L_0x03cf;
        L_0x0318:
            r6 = r9.h;
            r6 = r10.getResourceId(r5, r6);
            r9.h = r6;
            r6 = r9.h;
            if (r6 != r0) goto L_0x03cf;
        L_0x0324:
            r5 = r10.getInt(r5, r0);
            r9.h = r5;
            goto L_0x03cf;
        L_0x032c:
            r6 = r9.g;
            r6 = r10.getResourceId(r5, r6);
            r9.g = r6;
            r6 = r9.g;
            if (r6 != r0) goto L_0x03cf;
        L_0x0338:
            r5 = r10.getInt(r5, r0);
            r9.g = r5;
            goto L_0x03cf;
        L_0x0340:
            r6 = r9.f;
            r6 = r10.getResourceId(r5, r6);
            r9.f = r6;
            r6 = r9.f;
            if (r6 != r0) goto L_0x03cf;
        L_0x034c:
            r5 = r10.getInt(r5, r0);
            r9.f = r5;
            goto L_0x03cf;
        L_0x0353:
            r6 = r9.e;
            r6 = r10.getResourceId(r5, r6);
            r9.e = r6;
            r6 = r9.e;
            if (r6 != r0) goto L_0x03cf;
        L_0x035f:
            r5 = r10.getInt(r5, r0);
            r9.e = r5;
            goto L_0x03cf;
        L_0x0366:
            r6 = r9.d;
            r6 = r10.getResourceId(r5, r6);
            r9.d = r6;
            r6 = r9.d;
            if (r6 != r0) goto L_0x03cf;
        L_0x0372:
            r5 = r10.getInt(r5, r0);
            r9.d = r5;
            goto L_0x03cf;
        L_0x0379:
            r6 = r9.c;
            r5 = r10.getFloat(r5, r6);
            r9.c = r5;
            goto L_0x03cf;
        L_0x0382:
            r6 = r9.b;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.b = r5;
            goto L_0x03cf;
        L_0x038b:
            r6 = r9.a;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.a = r5;
            goto L_0x03cf;
        L_0x0394:
            r6 = r9.o;
            r5 = r10.getFloat(r5, r6);
            r6 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
            r5 = r5 % r6;
            r9.o = r5;
            r5 = r9.o;
            r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
            if (r7 >= 0) goto L_0x03cf;
        L_0x03a5:
            r5 = r6 - r5;
            r5 = r5 % r6;
            r9.o = r5;
            goto L_0x03cf;
        L_0x03ab:
            r6 = r9.n;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.n = r5;
            goto L_0x03cf;
        L_0x03b4:
            r6 = r9.m;
            r6 = r10.getResourceId(r5, r6);
            r9.m = r6;
            r6 = r9.m;
            if (r6 != r0) goto L_0x03cf;
        L_0x03c0:
            r5 = r10.getInt(r5, r0);
            r9.m = r5;
            goto L_0x03cf;
        L_0x03c7:
            r6 = r9.Q;
            r5 = r10.getInt(r5, r6);
            r9.Q = r5;
        L_0x03cf:
            r3 = r3 + 1;
            goto L_0x009a;
        L_0x03d3:
            r10.recycle();
            r9.a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout$a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a() {
            this.W = false;
            this.T = true;
            this.U = true;
            if (this.width == -2 && this.R) {
                this.T = false;
                this.G = 1;
            }
            if (this.height == -2 && this.S) {
                this.U = false;
                this.H = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.T = false;
                if (this.width == 0 && this.G == 1) {
                    this.width = -2;
                    this.R = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.U = false;
                if (this.height == 0 && this.H == 1) {
                    this.height = -2;
                    this.S = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.W = true;
                this.T = true;
                this.U = true;
                if (!(this.aj instanceof bq)) {
                    this.aj = new bq();
                }
                ((bq) this.aj).j(this.Q);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7  */
        /* JADX WARNING: Missing block: B:71:0x00d6, code skipped:
            if (r1 > 0) goto L_0x00d8;
     */
        /* JADX WARNING: Missing block: B:77:0x00e5, code skipped:
            if (r1 > 0) goto L_0x00d8;
     */
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r7) {
            /*
            r6 = this;
            r0 = r6.leftMargin;
            r1 = r6.rightMargin;
            super.resolveLayoutDirection(r7);
            r7 = -1;
            r6.ab = r7;
            r6.ac = r7;
            r6.Z = r7;
            r6.aa = r7;
            r6.ad = r7;
            r6.ae = r7;
            r2 = r6.t;
            r6.ad = r2;
            r2 = r6.v;
            r6.ae = r2;
            r2 = r6.z;
            r6.af = r2;
            r2 = r6.a;
            r6.ag = r2;
            r2 = r6.b;
            r6.ah = r2;
            r2 = r6.c;
            r6.ai = r2;
            r2 = r6.getLayoutDirection();
            r3 = 0;
            r4 = 1;
            if (r4 != r2) goto L_0x0036;
        L_0x0034:
            r2 = 1;
            goto L_0x0037;
        L_0x0036:
            r2 = 0;
        L_0x0037:
            if (r2 == 0) goto L_0x0098;
        L_0x0039:
            r2 = r6.p;
            if (r2 == r7) goto L_0x0041;
        L_0x003d:
            r6.ab = r2;
        L_0x003f:
            r3 = 1;
            goto L_0x0048;
        L_0x0041:
            r2 = r6.q;
            if (r2 == r7) goto L_0x0048;
        L_0x0045:
            r6.ac = r2;
            goto L_0x003f;
        L_0x0048:
            r2 = r6.r;
            if (r2 == r7) goto L_0x004f;
        L_0x004c:
            r6.aa = r2;
            r3 = 1;
        L_0x004f:
            r2 = r6.s;
            if (r2 == r7) goto L_0x0056;
        L_0x0053:
            r6.Z = r2;
            r3 = 1;
        L_0x0056:
            r2 = r6.x;
            if (r2 == r7) goto L_0x005c;
        L_0x005a:
            r6.ae = r2;
        L_0x005c:
            r2 = r6.y;
            if (r2 == r7) goto L_0x0062;
        L_0x0060:
            r6.ad = r2;
        L_0x0062:
            r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            if (r3 == 0) goto L_0x006c;
        L_0x0066:
            r3 = r6.z;
            r3 = r2 - r3;
            r6.af = r3;
        L_0x006c:
            r3 = r6.W;
            if (r3 == 0) goto L_0x00bc;
        L_0x0070:
            r3 = r6.Q;
            if (r3 != r4) goto L_0x00bc;
        L_0x0074:
            r3 = r6.c;
            r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
            if (r5 == 0) goto L_0x0084;
        L_0x007c:
            r2 = r2 - r3;
            r6.ai = r2;
            r6.ag = r7;
            r6.ah = r7;
            goto L_0x00bc;
        L_0x0084:
            r2 = r6.a;
            if (r2 == r7) goto L_0x008f;
        L_0x0088:
            r6.ah = r2;
            r6.ag = r7;
        L_0x008c:
            r6.ai = r4;
            goto L_0x00bc;
        L_0x008f:
            r2 = r6.b;
            if (r2 == r7) goto L_0x00bc;
        L_0x0093:
            r6.ag = r2;
            r6.ah = r7;
            goto L_0x008c;
        L_0x0098:
            r2 = r6.p;
            if (r2 == r7) goto L_0x009e;
        L_0x009c:
            r6.aa = r2;
        L_0x009e:
            r2 = r6.q;
            if (r2 == r7) goto L_0x00a4;
        L_0x00a2:
            r6.Z = r2;
        L_0x00a4:
            r2 = r6.r;
            if (r2 == r7) goto L_0x00aa;
        L_0x00a8:
            r6.ab = r2;
        L_0x00aa:
            r2 = r6.s;
            if (r2 == r7) goto L_0x00b0;
        L_0x00ae:
            r6.ac = r2;
        L_0x00b0:
            r2 = r6.x;
            if (r2 == r7) goto L_0x00b6;
        L_0x00b4:
            r6.ad = r2;
        L_0x00b6:
            r2 = r6.y;
            if (r2 == r7) goto L_0x00bc;
        L_0x00ba:
            r6.ae = r2;
        L_0x00bc:
            r2 = r6.r;
            if (r2 != r7) goto L_0x0105;
        L_0x00c0:
            r2 = r6.s;
            if (r2 != r7) goto L_0x0105;
        L_0x00c4:
            r2 = r6.q;
            if (r2 != r7) goto L_0x0105;
        L_0x00c8:
            r2 = r6.p;
            if (r2 != r7) goto L_0x0105;
        L_0x00cc:
            r2 = r6.f;
            if (r2 == r7) goto L_0x00db;
        L_0x00d0:
            r6.ab = r2;
            r2 = r6.rightMargin;
            if (r2 > 0) goto L_0x00e8;
        L_0x00d6:
            if (r1 <= 0) goto L_0x00e8;
        L_0x00d8:
            r6.rightMargin = r1;
            goto L_0x00e8;
        L_0x00db:
            r2 = r6.g;
            if (r2 == r7) goto L_0x00e8;
        L_0x00df:
            r6.ac = r2;
            r2 = r6.rightMargin;
            if (r2 > 0) goto L_0x00e8;
        L_0x00e5:
            if (r1 <= 0) goto L_0x00e8;
        L_0x00e7:
            goto L_0x00d8;
        L_0x00e8:
            r1 = r6.d;
            if (r1 == r7) goto L_0x00f7;
        L_0x00ec:
            r6.Z = r1;
            r7 = r6.leftMargin;
            if (r7 > 0) goto L_0x0105;
        L_0x00f2:
            if (r0 <= 0) goto L_0x0105;
        L_0x00f4:
            r6.leftMargin = r0;
            return;
        L_0x00f7:
            r1 = r6.e;
            if (r1 == r7) goto L_0x0105;
        L_0x00fb:
            r6.aa = r1;
            r7 = r6.leftMargin;
            if (r7 > 0) goto L_0x0105;
        L_0x0101:
            if (r0 <= 0) goto L_0x0105;
        L_0x0103:
            r6.leftMargin = r0;
        L_0x0105:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout$a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        a(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        a(attributeSet);
    }

    public static a a() {
        return new a(-2, -2);
    }

    private final bo a(int i) {
        if (i == 0) {
            return this.f;
        }
        View view = (View) this.a.get(i);
        return view == this ? this.f : view == null ? null : ((a) view.getLayoutParams()).aj;
    }

    private void a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                bo boVar = aVar.aj;
                if (!(aVar.W || aVar.X)) {
                    int childMeasureSpec;
                    Object obj;
                    Object obj2;
                    boVar.O = childAt.getVisibility();
                    int i6 = aVar.width;
                    int i7 = aVar.height;
                    Object obj3 = (aVar.T || aVar.U || ((!aVar.T && aVar.G == 1) || aVar.width == -1 || (!aVar.U && (aVar.H == 1 || aVar.height == -1)))) ? 1 : null;
                    if (obj3 != null) {
                        int childMeasureSpec2;
                        if (i6 == 0) {
                            childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                            obj = 1;
                        } else if (i6 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                            obj = null;
                        } else {
                            obj = i6 == -2 ? 1 : null;
                            childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                        }
                        if (i7 == 0) {
                            childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                            obj2 = 1;
                        } else if (i7 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                            obj2 = null;
                        } else {
                            obj2 = i7 == -2 ? 1 : null;
                            childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        boVar.o = i6 == -2;
                        boVar.p = i7 == -2;
                        i6 = childAt.getMeasuredWidth();
                        i7 = childAt.getMeasuredHeight();
                    } else {
                        obj = null;
                        obj2 = null;
                    }
                    boVar.d(i6);
                    boVar.e(i7);
                    if (obj != null) {
                        boVar.J = i6;
                    }
                    if (obj2 != null) {
                        boVar.K = i7;
                    }
                    if (aVar.V) {
                        childMeasureSpec = childAt.getBaseline();
                        if (childMeasureSpec != -1) {
                            boVar.G = childMeasureSpec;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:41:0x00e9, code skipped:
            android.util.Log.w(r4, r2);
     */
    private void a(android.util.AttributeSet r19) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r1.f;
        r2.N = r1;
        r2 = r1.a;
        r3 = r18.getId();
        r2.put(r3, r1);
        r2 = 0;
        r1.b = r2;
        if (r0 == 0) goto L_0x048f;
    L_0x0016:
        r3 = r18.getContext();
        r4 = defpackage.bd.b.a;
        r3 = r3.obtainStyledAttributes(r0, r4);
        r4 = r3.getIndexCount();
        r5 = 0;
        r6 = 0;
    L_0x0026:
        if (r6 >= r4) goto L_0x048c;
    L_0x0028:
        r0 = r3.getIndex(r6);
        r7 = 3;
        if (r0 != r7) goto L_0x003b;
    L_0x002f:
        r7 = r1.g;
        r0 = r3.getDimensionPixelOffset(r0, r7);
        r1.g = r0;
    L_0x0037:
        r16 = r4;
        goto L_0x0485;
    L_0x003b:
        r7 = 4;
        if (r0 != r7) goto L_0x0047;
    L_0x003e:
        r7 = r1.h;
        r0 = r3.getDimensionPixelOffset(r0, r7);
        r1.h = r0;
        goto L_0x0037;
    L_0x0047:
        r7 = 1;
        if (r0 != r7) goto L_0x0053;
    L_0x004a:
        r7 = r1.i;
        r0 = r3.getDimensionPixelOffset(r0, r7);
        r1.i = r0;
        goto L_0x0037;
    L_0x0053:
        r8 = 2;
        if (r0 != r8) goto L_0x005f;
    L_0x0056:
        r7 = r1.j;
        r0 = r3.getDimensionPixelOffset(r0, r7);
        r1.j = r0;
        goto L_0x0037;
    L_0x005f:
        r9 = 59;
        if (r0 != r9) goto L_0x006c;
    L_0x0063:
        r7 = r1.l;
        r0 = r3.getInt(r0, r7);
        r1.l = r0;
        goto L_0x0037;
    L_0x006c:
        r9 = 8;
        if (r0 != r9) goto L_0x0037;
    L_0x0070:
        r9 = r3.getResourceId(r0, r5);
        r0 = new ba;	 Catch:{ NotFoundException -> 0x047f }
        r0.<init>();	 Catch:{ NotFoundException -> 0x047f }
        r1.b = r0;	 Catch:{ NotFoundException -> 0x047f }
        r0 = r1.b;	 Catch:{ NotFoundException -> 0x047f }
        r10 = r18.getContext();	 Catch:{ NotFoundException -> 0x047f }
        r11 = r10.getResources();	 Catch:{ NotFoundException -> 0x047f }
        r11 = r11.getXml(r9);	 Catch:{ NotFoundException -> 0x047f }
        r12 = r11.getEventType();	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
    L_0x008d:
        if (r12 == r7) goto L_0x046b;
    L_0x008f:
        if (r12 == 0) goto L_0x0451;
    L_0x0091:
        if (r12 == r8) goto L_0x009a;
    L_0x0093:
        r16 = r4;
        r17 = r10;
        r2 = 1;
        goto L_0x0459;
    L_0x009a:
        r12 = r11.getName();	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r13 = android.util.Xml.asAttributeSet(r11);	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r14 = new ba$a;	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r14.<init>(r5);	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r15 = defpackage.bd.b.b;	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r13 = r10.obtainStyledAttributes(r13, r15);	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r15 = r13.getIndexCount();	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
    L_0x00b1:
        if (r5 >= r15) goto L_0x0431;
    L_0x00b3:
        r8 = r13.getIndex(r5);	 Catch:{ XmlPullParserException -> 0x0475, IOException -> 0x046e }
        r2 = defpackage.ba.c;	 Catch:{ NotFoundException -> 0x042e }
        r2 = r2.get(r8);	 Catch:{ NotFoundException -> 0x042e }
        switch(r2) {
            case 1: goto L_0x0417;
            case 2: goto L_0x040a;
            case 3: goto L_0x03fd;
            case 4: goto L_0x03f0;
            case 5: goto L_0x03e5;
            case 6: goto L_0x03d8;
            case 7: goto L_0x03cb;
            case 8: goto L_0x03be;
            case 9: goto L_0x03b1;
            case 10: goto L_0x03a4;
            case 11: goto L_0x0396;
            case 12: goto L_0x0388;
            case 13: goto L_0x037a;
            case 14: goto L_0x036c;
            case 15: goto L_0x035e;
            case 16: goto L_0x0350;
            case 17: goto L_0x0342;
            case 18: goto L_0x0334;
            case 19: goto L_0x0326;
            case 20: goto L_0x0318;
            case 21: goto L_0x030a;
            case 22: goto L_0x02f4;
            case 23: goto L_0x02e6;
            case 24: goto L_0x02d8;
            case 25: goto L_0x02ca;
            case 26: goto L_0x02bc;
            case 27: goto L_0x02ae;
            case 28: goto L_0x02a0;
            case 29: goto L_0x0292;
            case 30: goto L_0x0284;
            case 31: goto L_0x0276;
            case 32: goto L_0x0268;
            case 33: goto L_0x025a;
            case 34: goto L_0x024c;
            case 35: goto L_0x023e;
            case 36: goto L_0x0230;
            case 37: goto L_0x0222;
            case 38: goto L_0x0214;
            case 39: goto L_0x0206;
            case 40: goto L_0x01f8;
            case 41: goto L_0x01ea;
            case 42: goto L_0x01dc;
            case 43: goto L_0x01ce;
            case 44: goto L_0x01bd;
            case 45: goto L_0x01af;
            case 46: goto L_0x01a1;
            case 47: goto L_0x0193;
            case 48: goto L_0x0185;
            case 49: goto L_0x0177;
            case 50: goto L_0x0169;
            case 51: goto L_0x015b;
            case 52: goto L_0x014d;
            case 53: goto L_0x013f;
            default: goto L_0x00c0;
        };
    L_0x00c0:
        r7 = "   ";
        r16 = r4;
        r4 = "ConstraintSet";
        switch(r2) {
            case 60: goto L_0x0133;
            case 61: goto L_0x0127;
            case 62: goto L_0x011b;
            case 63: goto L_0x010f;
            case 64: goto L_0x00ee;
            default: goto L_0x00c9;
        };
    L_0x00c9:
        r2 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r17 = r10;
        r10 = "Unknown attribute 0x";
        r2.<init>(r10);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r10 = java.lang.Integer.toHexString(r8);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2.append(r10);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2.append(r7);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r7 = defpackage.ba.c;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r7 = r7.get(r8);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2.append(r7);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r2.toString();	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
    L_0x00e9:
        android.util.Log.w(r4, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x00ee:
        r17 = r10;
        r2 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r10 = "unused attribute 0x";
        r2.<init>(r10);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r10 = java.lang.Integer.toHexString(r8);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2.append(r10);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2.append(r7);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r7 = defpackage.ba.c;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r7 = r7.get(r8);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2.append(r7);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r2.toString();	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x00e9;
    L_0x010f:
        r17 = r10;
        r2 = r14.z;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.z = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x011b:
        r17 = r10;
        r2 = r14.y;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.y = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0127:
        r17 = r10;
        r2 = r14.x;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.x = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0133:
        r17 = r10;
        r2 = r14.X;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.X = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x013f:
        r16 = r4;
        r17 = r10;
        r2 = r14.ag;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimension(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.ag = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x014d:
        r16 = r4;
        r17 = r10;
        r2 = r14.af;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimension(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.af = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x015b:
        r16 = r4;
        r17 = r10;
        r2 = r14.ae;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimension(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.ae = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0169:
        r16 = r4;
        r17 = r10;
        r2 = r14.ad;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.ad = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0177:
        r16 = r4;
        r17 = r10;
        r2 = r14.ac;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.ac = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0185:
        r16 = r4;
        r17 = r10;
        r2 = r14.ab;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.ab = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0193:
        r16 = r4;
        r17 = r10;
        r2 = r14.aa;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.aa = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01a1:
        r16 = r4;
        r17 = r10;
        r2 = r14.Z;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.Z = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01af:
        r16 = r4;
        r17 = r10;
        r2 = r14.Y;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.Y = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01bd:
        r16 = r4;
        r17 = r10;
        r2 = 1;
        r14.V = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r14.W;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimension(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.W = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01ce:
        r16 = r4;
        r17 = r10;
        r2 = r14.U;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.U = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01dc:
        r16 = r4;
        r17 = r10;
        r2 = r14.T;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getInt(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.T = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01ea:
        r16 = r4;
        r17 = r10;
        r2 = r14.S;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getInt(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.S = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x01f8:
        r16 = r4;
        r17 = r10;
        r2 = r14.Q;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.Q = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0206:
        r16 = r4;
        r17 = r10;
        r2 = r14.R;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.R = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0214:
        r16 = r4;
        r17 = r10;
        r2 = r14.d;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getResourceId(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.d = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0222:
        r16 = r4;
        r17 = r10;
        r2 = r14.v;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.v = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0230:
        r16 = r4;
        r17 = r10;
        r2 = r14.l;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.l = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x023e:
        r16 = r4;
        r17 = r10;
        r2 = r14.m;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.m = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x024c:
        r16 = r4;
        r17 = r10;
        r2 = r14.F;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.F = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x025a:
        r16 = r4;
        r17 = r10;
        r2 = r14.r;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.r = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0268:
        r16 = r4;
        r17 = r10;
        r2 = r14.q;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.q = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0276:
        r16 = r4;
        r17 = r10;
        r2 = r14.I;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.I = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0284:
        r16 = r4;
        r17 = r10;
        r2 = r14.k;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.k = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0292:
        r16 = r4;
        r17 = r10;
        r2 = r14.j;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.j = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02a0:
        r16 = r4;
        r17 = r10;
        r2 = r14.E;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.E = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02ae:
        r16 = r4;
        r17 = r10;
        r2 = r14.C;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getInt(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.C = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02bc:
        r16 = r4;
        r17 = r10;
        r2 = r14.i;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.i = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02ca:
        r16 = r4;
        r17 = r10;
        r2 = r14.h;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.h = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02d8:
        r16 = r4;
        r17 = r10;
        r2 = r14.D;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.D = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02e6:
        r16 = r4;
        r17 = r10;
        r2 = r14.b;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getLayoutDimension(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.b = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x02f4:
        r16 = r4;
        r17 = r10;
        r2 = r14.J;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getInt(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.J = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r4 = r14.J;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r2[r4];	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.J = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x030a:
        r16 = r4;
        r17 = r10;
        r2 = r14.c;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getLayoutDimension(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.c = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0318:
        r16 = r4;
        r17 = r10;
        r2 = r14.u;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.u = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0326:
        r16 = r4;
        r17 = r10;
        r2 = r14.g;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getFloat(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.g = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0334:
        r16 = r4;
        r17 = r10;
        r2 = r14.f;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelOffset(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.f = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0342:
        r16 = r4;
        r17 = r10;
        r2 = r14.e;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelOffset(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.e = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0350:
        r16 = r4;
        r17 = r10;
        r2 = r14.L;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.L = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x035e:
        r16 = r4;
        r17 = r10;
        r2 = r14.P;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.P = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x036c:
        r16 = r4;
        r17 = r10;
        r2 = r14.M;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.M = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x037a:
        r16 = r4;
        r17 = r10;
        r2 = r14.K;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.K = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0388:
        r16 = r4;
        r17 = r10;
        r2 = r14.O;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.O = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0396:
        r16 = r4;
        r17 = r10;
        r2 = r14.N;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.N = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03a4:
        r16 = r4;
        r17 = r10;
        r2 = r14.s;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.s = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03b1:
        r16 = r4;
        r17 = r10;
        r2 = r14.t;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.t = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03be:
        r16 = r4;
        r17 = r10;
        r2 = r14.H;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.H = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03cb:
        r16 = r4;
        r17 = r10;
        r2 = r14.B;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelOffset(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.B = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03d8:
        r16 = r4;
        r17 = r10;
        r2 = r14.A;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelOffset(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.A = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03e5:
        r16 = r4;
        r17 = r10;
        r2 = r13.getString(r8);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.w = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03f0:
        r16 = r4;
        r17 = r10;
        r2 = r14.n;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.n = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x03fd:
        r16 = r4;
        r17 = r10;
        r2 = r14.o;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.o = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x040a:
        r16 = r4;
        r17 = r10;
        r2 = r14.G;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = r13.getDimensionPixelSize(r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.G = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0423;
    L_0x0417:
        r16 = r4;
        r17 = r10;
        r2 = r14.p;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = defpackage.ba.a(r13, r8, r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r14.p = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
    L_0x0423:
        r5 = r5 + 1;
        r4 = r16;
        r10 = r17;
        r2 = 0;
        r7 = 1;
        r8 = 2;
        goto L_0x00b1;
    L_0x042e:
        r16 = r4;
        goto L_0x047d;
    L_0x0431:
        r16 = r4;
        r17 = r10;
        r13.recycle();	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r2 = "Guideline";
        r2 = r12.equalsIgnoreCase(r2);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        if (r2 == 0) goto L_0x0444;
    L_0x0440:
        r2 = 1;
        r14.a = r2;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0445;
    L_0x0444:
        r2 = 1;
    L_0x0445:
        r4 = r0.b;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r5 = r14.d;	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r4.put(r5, r14);	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        goto L_0x0459;
    L_0x0451:
        r16 = r4;
        r17 = r10;
        r2 = 1;
        r11.getName();	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
    L_0x0459:
        r12 = r11.next();	 Catch:{ XmlPullParserException -> 0x0469, IOException -> 0x0467 }
        r4 = r16;
        r10 = r17;
        r2 = 0;
        r5 = 0;
        r7 = 1;
        r8 = 2;
        goto L_0x008d;
    L_0x0467:
        r0 = move-exception;
        goto L_0x0471;
    L_0x0469:
        r0 = move-exception;
        goto L_0x0478;
    L_0x046b:
        r16 = r4;
        goto L_0x0483;
    L_0x046e:
        r0 = move-exception;
        r16 = r4;
    L_0x0471:
        r0.printStackTrace();	 Catch:{ NotFoundException -> 0x047d }
        goto L_0x047b;
    L_0x0475:
        r0 = move-exception;
        r16 = r4;
    L_0x0478:
        r0.printStackTrace();	 Catch:{ NotFoundException -> 0x047d }
    L_0x047b:
        r2 = 0;
        goto L_0x0483;
    L_0x047d:
        r2 = 0;
        goto L_0x0481;
    L_0x047f:
        r16 = r4;
    L_0x0481:
        r1.b = r2;
    L_0x0483:
        r1.m = r9;
    L_0x0485:
        r6 = r6 + 1;
        r4 = r16;
        r5 = 0;
        goto L_0x0026;
    L_0x048c:
        r3.recycle();
    L_0x048f:
        r0 = r1.f;
        r2 = r1.l;
        r0.Y = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a(android.util.AttributeSet):void");
    }

    private void a(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.c == null) {
                this.c = new HashMap();
            }
            obj = (String) obj;
            int indexOf = obj.indexOf("/");
            if (indexOf != -1) {
                obj = obj.substring(indexOf + 1);
            }
            this.c.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    private void b() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof bc) {
                bc bcVar = (bc) childAt;
                if (bcVar.a != null) {
                    a aVar = (a) bcVar.getLayoutParams();
                    a aVar2 = (a) bcVar.a.getLayoutParams();
                    aVar2.aj.O = 0;
                    aVar.aj.d(aVar2.aj.l());
                    aVar.aj.e(aVar2.aj.m());
                    aVar2.aj.O = 8;
                }
            }
        }
        childCount = this.d.size();
        if (childCount > 0) {
            while (i < childCount) {
                this.d.get(i);
                i++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0261  */
    private void b(int r25, int r26) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r25;
        r2 = r26;
        r3 = r24.getPaddingTop();
        r4 = r24.getPaddingBottom();
        r3 = r3 + r4;
        r4 = r24.getPaddingLeft();
        r5 = r24.getPaddingRight();
        r4 = r4 + r5;
        r5 = r24.getChildCount();
        r7 = 0;
    L_0x001d:
        r8 = 8;
        r9 = -1;
        r10 = -2;
        if (r7 >= r5) goto L_0x00be;
    L_0x0023:
        r12 = r0.getChildAt(r7);
        r13 = r12.getVisibility();
        if (r13 == r8) goto L_0x00ba;
    L_0x002d:
        r8 = r12.getLayoutParams();
        r8 = (android.support.constraint.ConstraintLayout.a) r8;
        r13 = r8.aj;
        r14 = r8.W;
        if (r14 != 0) goto L_0x00ba;
    L_0x0039:
        r14 = r8.X;
        if (r14 != 0) goto L_0x00ba;
    L_0x003d:
        r14 = r12.getVisibility();
        r13.O = r14;
        r14 = r8.width;
        r15 = r8.height;
        if (r14 == 0) goto L_0x00ac;
    L_0x0049:
        if (r15 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x00ac;
    L_0x004c:
        if (r14 != r10) goto L_0x0051;
    L_0x004e:
        r16 = 1;
        goto L_0x0053;
    L_0x0051:
        r16 = 0;
    L_0x0053:
        r6 = getChildMeasureSpec(r1, r4, r14);
        if (r15 != r10) goto L_0x005c;
    L_0x0059:
        r17 = 1;
        goto L_0x005e;
    L_0x005c:
        r17 = 0;
    L_0x005e:
        r11 = getChildMeasureSpec(r2, r3, r15);
        r12.measure(r6, r11);
        if (r14 != r10) goto L_0x0069;
    L_0x0067:
        r6 = 1;
        goto L_0x006a;
    L_0x0069:
        r6 = 0;
    L_0x006a:
        r13.o = r6;
        if (r15 != r10) goto L_0x0070;
    L_0x006e:
        r6 = 1;
        goto L_0x0071;
    L_0x0070:
        r6 = 0;
    L_0x0071:
        r13.p = r6;
        r6 = r12.getMeasuredWidth();
        r10 = r12.getMeasuredHeight();
        r13.d(r6);
        r13.e(r10);
        if (r16 == 0) goto L_0x0085;
    L_0x0083:
        r13.J = r6;
    L_0x0085:
        if (r17 == 0) goto L_0x0089;
    L_0x0087:
        r13.K = r10;
    L_0x0089:
        r11 = r8.V;
        if (r11 == 0) goto L_0x0095;
    L_0x008d:
        r11 = r12.getBaseline();
        if (r11 == r9) goto L_0x0095;
    L_0x0093:
        r13.G = r11;
    L_0x0095:
        r9 = r8.T;
        if (r9 == 0) goto L_0x00ba;
    L_0x0099:
        r8 = r8.U;
        if (r8 == 0) goto L_0x00ba;
    L_0x009d:
        r8 = r13.h();
        r8.a(r6);
        r6 = r13.i();
        r6.a(r10);
        goto L_0x00ba;
    L_0x00ac:
        r6 = r13.h();
        r6.c();
        r6 = r13.i();
        r6.c();
    L_0x00ba:
        r7 = r7 + 1;
        goto L_0x001d;
    L_0x00be:
        r6 = r0.f;
        r6.C();
        r6 = 0;
    L_0x00c4:
        if (r6 >= r5) goto L_0x027e;
    L_0x00c6:
        r7 = r0.getChildAt(r6);
        r11 = r7.getVisibility();
        if (r11 == r8) goto L_0x026b;
    L_0x00d0:
        r11 = r7.getLayoutParams();
        r11 = (android.support.constraint.ConstraintLayout.a) r11;
        r12 = r11.aj;
        r13 = r11.W;
        if (r13 != 0) goto L_0x026b;
    L_0x00dc:
        r13 = r11.X;
        if (r13 != 0) goto L_0x026b;
    L_0x00e0:
        r13 = r7.getVisibility();
        r12.O = r13;
        r13 = r11.width;
        r14 = r11.height;
        if (r13 == 0) goto L_0x00ee;
    L_0x00ec:
        if (r14 != 0) goto L_0x026b;
    L_0x00ee:
        r15 = defpackage.bn.a.LEFT;
        r15 = r12.a(r15);
        r15 = r15.a;
        r8 = defpackage.bn.a.RIGHT;
        r8 = r12.a(r8);
        r8 = r8.a;
        r9 = defpackage.bn.a.LEFT;
        r9 = r12.a(r9);
        r9 = r9.d;
        if (r9 == 0) goto L_0x0114;
    L_0x0108:
        r9 = defpackage.bn.a.RIGHT;
        r9 = r12.a(r9);
        r9 = r9.d;
        if (r9 == 0) goto L_0x0114;
    L_0x0112:
        r9 = 1;
        goto L_0x0115;
    L_0x0114:
        r9 = 0;
    L_0x0115:
        r10 = defpackage.bn.a.TOP;
        r10 = r12.a(r10);
        r10 = r10.a;
        r19 = r5;
        r5 = defpackage.bn.a.BOTTOM;
        r5 = r12.a(r5);
        r5 = r5.a;
        r20 = r6;
        r6 = defpackage.bn.a.TOP;
        r6 = r12.a(r6);
        r6 = r6.d;
        if (r6 == 0) goto L_0x013f;
    L_0x0133:
        r6 = defpackage.bn.a.BOTTOM;
        r6 = r12.a(r6);
        r6 = r6.d;
        if (r6 == 0) goto L_0x013f;
    L_0x013d:
        r6 = 1;
        goto L_0x0140;
    L_0x013f:
        r6 = 0;
    L_0x0140:
        if (r13 != 0) goto L_0x014e;
    L_0x0142:
        if (r14 != 0) goto L_0x014e;
    L_0x0144:
        if (r9 == 0) goto L_0x014e;
    L_0x0146:
        if (r6 != 0) goto L_0x0149;
    L_0x0148:
        goto L_0x014e;
    L_0x0149:
        r5 = r2;
        r6 = -2;
    L_0x014b:
        r7 = -1;
        goto L_0x0272;
    L_0x014e:
        r21 = r11;
        r11 = r0.f;
        r11 = r11.y();
        r22 = r7;
        r7 = 2;
        if (r11 == r7) goto L_0x015d;
    L_0x015b:
        r11 = 1;
        goto L_0x015e;
    L_0x015d:
        r11 = 0;
    L_0x015e:
        r2 = r0.f;
        r2 = r2.z();
        if (r2 == r7) goto L_0x0168;
    L_0x0166:
        r2 = 1;
        goto L_0x0169;
    L_0x0168:
        r2 = 0;
    L_0x0169:
        if (r11 != 0) goto L_0x0172;
    L_0x016b:
        r23 = r12.h();
        r23.c();
    L_0x0172:
        if (r2 != 0) goto L_0x017b;
    L_0x0174:
        r23 = r12.i();
        r23.c();
    L_0x017b:
        if (r13 != 0) goto L_0x01aa;
    L_0x017d:
        if (r11 == 0) goto L_0x01a2;
    L_0x017f:
        r23 = r12.d();
        if (r23 == 0) goto L_0x01a2;
    L_0x0185:
        if (r9 == 0) goto L_0x01a2;
    L_0x0187:
        r9 = r15.e();
        if (r9 == 0) goto L_0x01a2;
    L_0x018d:
        r9 = r8.e();
        if (r9 == 0) goto L_0x01a2;
    L_0x0193:
        r8 = r8.d;
        r9 = r15.d;
        r8 = r8 - r9;
        r8 = (int) r8;
        r9 = r12.h();
        r9.a(r8);
        r13 = r8;
        goto L_0x01b9;
    L_0x01a2:
        r8 = -2;
        r9 = getChildMeasureSpec(r1, r4, r8);
        r8 = 1;
        r11 = 0;
        goto L_0x01be;
    L_0x01aa:
        r8 = -2;
        r9 = -1;
        if (r13 != r9) goto L_0x01b5;
    L_0x01ae:
        r15 = getChildMeasureSpec(r1, r4, r9);
        r9 = r15;
        r8 = 0;
        goto L_0x01be;
    L_0x01b5:
        if (r13 != r8) goto L_0x01b9;
    L_0x01b7:
        r8 = 1;
        goto L_0x01ba;
    L_0x01b9:
        r8 = 0;
    L_0x01ba:
        r9 = getChildMeasureSpec(r1, r4, r13);
    L_0x01be:
        if (r14 != 0) goto L_0x01f7;
    L_0x01c0:
        if (r2 == 0) goto L_0x01e9;
    L_0x01c2:
        r15 = r12.e();
        if (r15 == 0) goto L_0x01e9;
    L_0x01c8:
        if (r6 == 0) goto L_0x01e9;
    L_0x01ca:
        r6 = r10.e();
        if (r6 == 0) goto L_0x01e9;
    L_0x01d0:
        r6 = r5.e();
        if (r6 == 0) goto L_0x01e9;
    L_0x01d6:
        r5 = r5.d;
        r6 = r10.d;
        r5 = r5 - r6;
        r5 = (int) r5;
        r6 = r12.i();
        r6.a(r5);
        r14 = r5;
        r6 = -2;
        r10 = 0;
        r5 = r26;
        goto L_0x020c;
    L_0x01e9:
        r5 = r26;
        r6 = -2;
        r2 = getChildMeasureSpec(r5, r3, r6);
        r15 = r2;
        r2 = r22;
        r10 = 1;
        r18 = 0;
        goto L_0x0214;
    L_0x01f7:
        r5 = r26;
        r6 = -2;
        r10 = -1;
        if (r14 != r10) goto L_0x0207;
    L_0x01fd:
        r15 = getChildMeasureSpec(r5, r3, r10);
        r18 = r2;
        r2 = r22;
        r10 = 0;
        goto L_0x0214;
    L_0x0207:
        if (r14 != r6) goto L_0x020b;
    L_0x0209:
        r10 = 1;
        goto L_0x020c;
    L_0x020b:
        r10 = 0;
    L_0x020c:
        r15 = getChildMeasureSpec(r5, r3, r14);
        r18 = r2;
        r2 = r22;
    L_0x0214:
        r2.measure(r9, r15);
        if (r13 != r6) goto L_0x021b;
    L_0x0219:
        r9 = 1;
        goto L_0x021c;
    L_0x021b:
        r9 = 0;
    L_0x021c:
        r12.o = r9;
        if (r14 != r6) goto L_0x0222;
    L_0x0220:
        r9 = 1;
        goto L_0x0223;
    L_0x0222:
        r9 = 0;
    L_0x0223:
        r12.p = r9;
        r9 = r2.getMeasuredWidth();
        r13 = r2.getMeasuredHeight();
        r12.d(r9);
        r12.e(r13);
        if (r8 == 0) goto L_0x0237;
    L_0x0235:
        r12.J = r9;
    L_0x0237:
        if (r10 == 0) goto L_0x023b;
    L_0x0239:
        r12.K = r13;
    L_0x023b:
        if (r11 == 0) goto L_0x0245;
    L_0x023d:
        r8 = r12.h();
        r8.a(r9);
        goto L_0x024b;
    L_0x0245:
        r8 = r12.h();
        r8.f = r7;
    L_0x024b:
        if (r18 == 0) goto L_0x0255;
    L_0x024d:
        r7 = r12.i();
        r7.a(r13);
        goto L_0x025b;
    L_0x0255:
        r8 = r12.i();
        r8.f = r7;
    L_0x025b:
        r11 = r21;
        r7 = r11.V;
        if (r7 == 0) goto L_0x014b;
    L_0x0261:
        r2 = r2.getBaseline();
        r7 = -1;
        if (r2 == r7) goto L_0x0272;
    L_0x0268:
        r12.G = r2;
        goto L_0x0272;
    L_0x026b:
        r19 = r5;
        r20 = r6;
        r6 = -2;
        r7 = -1;
        r5 = r2;
    L_0x0272:
        r2 = r20 + 1;
        r6 = r2;
        r2 = r5;
        r5 = r19;
        r8 = 8;
        r9 = -1;
        r10 = -2;
        goto L_0x00c4;
    L_0x027e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.b(int, int):void");
    }

    public final bo a(View view) {
        return view == this ? this.f : view == null ? null : ((a) view.getLayoutParams()).aj;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(ppy.b);
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            parseInt2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) parseInt;
                            float f2 = (float) parseInt2;
                            float f3 = (float) (parseInt + parseInt3);
                            Canvas canvas2 = canvas;
                            float f4 = f2;
                            float f5 = f2;
                            f2 = f3;
                            float f6 = f;
                            Paint paint2 = paint;
                            canvas2.drawLine(f, f4, f2, f5, paint);
                            float f7 = (float) (parseInt2 + parseInt4);
                            float f8 = f3;
                            f = f7;
                            canvas2.drawLine(f8, f5, f2, f, paint);
                            f4 = f7;
                            f2 = f6;
                            canvas2.drawLine(f8, f4, f2, f, paint);
                            f8 = f6;
                            canvas2.drawLine(f8, f4, f2, f5, paint);
                            paint.setColor(-16711936);
                            f2 = f3;
                            Paint paint3 = paint;
                            canvas2.drawLine(f8, f5, f2, f7, paint);
                            canvas2.drawLine(f8, f7, f2, f5, paint);
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        i2 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            bo boVar = aVar.aj;
            if ((childAt.getVisibility() != 8 || aVar.W || aVar.X || isInEditMode) && !aVar.Y) {
                int n = boVar.n();
                int o = boVar.o();
                int l = boVar.l() + n;
                int m = boVar.m() + o;
                childAt.layout(n, o, l, m);
                if (childAt instanceof bc) {
                    childAt = ((bc) childAt).a;
                    if (childAt != null) {
                        childAt.setVisibility(0);
                        childAt.layout(n, o, l, m);
                    }
                }
            }
        }
        childCount = this.d.size();
        if (childCount > 0) {
            while (i2 < childCount) {
                ((az) this.d.get(i2)).c();
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0843  */
    public void onMeasure(int r31, int r32) {
        /*
        r30 = this;
        r0 = r30;
        r1 = r31;
        r2 = r32;
        java.lang.System.currentTimeMillis();
        r3 = android.view.View.MeasureSpec.getMode(r31);
        r4 = android.view.View.MeasureSpec.getSize(r31);
        r5 = android.view.View.MeasureSpec.getMode(r32);
        r6 = android.view.View.MeasureSpec.getSize(r32);
        r0.r = r3;
        r0.s = r5;
        r0.p = r4;
        r0.q = r6;
        r3 = r30.getPaddingLeft();
        r4 = r30.getPaddingTop();
        r5 = r0.f;
        r5.b(r3);
        r5 = r0.f;
        r5.c(r4);
        r5 = r0.f;
        r6 = r0.i;
        r5 = r5.q;
        r7 = 0;
        r5[r7] = r6;
        r5 = r0.f;
        r6 = r0.j;
        r5 = r5.q;
        r8 = 1;
        r5[r8] = r6;
        r5 = android.os.Build.VERSION.SDK_INT;
        r6 = 17;
        if (r5 < r6) goto L_0x0058;
    L_0x004b:
        r5 = r0.f;
        r9 = r30.getLayoutDirection();
        if (r9 != r8) goto L_0x0055;
    L_0x0053:
        r9 = 1;
        goto L_0x0056;
    L_0x0055:
        r9 = 0;
    L_0x0056:
        r5.a = r9;
    L_0x0058:
        r5 = android.view.View.MeasureSpec.getMode(r31);
        r9 = android.view.View.MeasureSpec.getSize(r31);
        r10 = android.view.View.MeasureSpec.getMode(r32);
        r11 = android.view.View.MeasureSpec.getSize(r32);
        r12 = r30.getPaddingTop();
        r13 = r30.getPaddingBottom();
        r12 = r12 + r13;
        r13 = r30.getPaddingLeft();
        r14 = r30.getPaddingRight();
        r13 = r13 + r14;
        r30.getLayoutParams();
        r14 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r5 == r14) goto L_0x0096;
    L_0x0083:
        if (r5 == 0) goto L_0x0094;
    L_0x0085:
        if (r5 == r15) goto L_0x008a;
    L_0x0087:
        r5 = 1;
    L_0x0088:
        r9 = 0;
        goto L_0x0097;
    L_0x008a:
        r5 = r0.i;
        r5 = java.lang.Math.min(r5, r9);
        r5 = r5 - r13;
        r9 = r5;
        r5 = 1;
        goto L_0x0097;
    L_0x0094:
        r5 = 2;
        goto L_0x0088;
    L_0x0096:
        r5 = 2;
    L_0x0097:
        if (r10 == r14) goto L_0x00ac;
    L_0x0099:
        if (r10 == 0) goto L_0x00aa;
    L_0x009b:
        if (r10 == r15) goto L_0x00a0;
    L_0x009d:
        r10 = 1;
    L_0x009e:
        r11 = 0;
        goto L_0x00ad;
    L_0x00a0:
        r10 = r0.j;
        r10 = java.lang.Math.min(r10, r11);
        r10 = r10 - r12;
        r11 = r10;
        r10 = 1;
        goto L_0x00ad;
    L_0x00aa:
        r10 = 2;
        goto L_0x009e;
    L_0x00ac:
        r10 = 2;
    L_0x00ad:
        r12 = r0.f;
        r12.f(r7);
        r12 = r0.f;
        r12.g(r7);
        r12 = r0.f;
        r12.h(r5);
        r5 = r0.f;
        r5.d(r9);
        r5 = r0.f;
        r5.i(r10);
        r5 = r0.f;
        r5.e(r11);
        r5 = r0.f;
        r9 = r0.g;
        r10 = r30.getPaddingLeft();
        r9 = r9 - r10;
        r10 = r30.getPaddingRight();
        r9 = r9 - r10;
        r5.f(r9);
        r5 = r0.f;
        r9 = r0.h;
        r10 = r30.getPaddingTop();
        r9 = r9 - r10;
        r10 = r30.getPaddingBottom();
        r9 = r9 - r10;
        r5.g(r9);
        r5 = r0.f;
        r5 = r5.l();
        r9 = r0.f;
        r9 = r9.m();
        r10 = r0.k;
        r12 = -1;
        if (r10 == 0) goto L_0x05f5;
    L_0x00fe:
        r0.k = r7;
        r10 = r30.getChildCount();
        r13 = 0;
    L_0x0105:
        if (r13 >= r10) goto L_0x0116;
    L_0x0107:
        r14 = r0.getChildAt(r13);
        r14 = r14.isLayoutRequested();
        if (r14 == 0) goto L_0x0113;
    L_0x0111:
        r10 = 1;
        goto L_0x0117;
    L_0x0113:
        r13 = r13 + 1;
        goto L_0x0105;
    L_0x0116:
        r10 = 0;
    L_0x0117:
        if (r10 == 0) goto L_0x05f5;
    L_0x0119:
        r10 = r0.e;
        r10.clear();
        r10 = r30.isInEditMode();
        r13 = r30.getChildCount();
        if (r10 == 0) goto L_0x0163;
    L_0x0128:
        r14 = 0;
    L_0x0129:
        if (r14 >= r13) goto L_0x0163;
    L_0x012b:
        r16 = r0.getChildAt(r14);
        r15 = r30.getResources();	 Catch:{ NotFoundException -> 0x015e }
        r6 = r16.getId();	 Catch:{ NotFoundException -> 0x015e }
        r6 = r15.getResourceName(r6);	 Catch:{ NotFoundException -> 0x015e }
        r15 = r16.getId();	 Catch:{ NotFoundException -> 0x015e }
        r15 = java.lang.Integer.valueOf(r15);	 Catch:{ NotFoundException -> 0x015e }
        r0.a(r6, r15);	 Catch:{ NotFoundException -> 0x015e }
        r15 = 47;
        r15 = r6.indexOf(r15);	 Catch:{ NotFoundException -> 0x015e }
        if (r15 == r12) goto L_0x0154;
    L_0x014e:
        r15 = r15 + 1;
        r6 = r6.substring(r15);	 Catch:{ NotFoundException -> 0x015e }
    L_0x0154:
        r15 = r16.getId();	 Catch:{ NotFoundException -> 0x015e }
        r15 = r0.a(r15);	 Catch:{ NotFoundException -> 0x015e }
        r15.P = r6;	 Catch:{ NotFoundException -> 0x015e }
    L_0x015e:
        r14 = r14 + 1;
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0129;
    L_0x0163:
        r6 = 0;
    L_0x0164:
        if (r6 >= r13) goto L_0x0176;
    L_0x0166:
        r14 = r0.getChildAt(r6);
        r14 = r0.a(r14);
        if (r14 == 0) goto L_0x0173;
    L_0x0170:
        r14.f();
    L_0x0173:
        r6 = r6 + 1;
        goto L_0x0164;
    L_0x0176:
        r6 = r0.m;
        if (r6 == r12) goto L_0x023e;
    L_0x017a:
        r6 = 0;
    L_0x017b:
        if (r6 >= r13) goto L_0x023e;
    L_0x017d:
        r14 = r0.getChildAt(r6);
        r15 = r14.getId();
        r11 = r0.m;
        if (r15 != r11) goto L_0x022b;
    L_0x0189:
        r11 = r14 instanceof defpackage.bb;
        if (r11 == 0) goto L_0x022b;
    L_0x018d:
        r14 = (defpackage.bb) r14;
        r11 = r14.a;
        if (r11 != 0) goto L_0x019a;
    L_0x0193:
        r11 = new ba;
        r11.<init>();
        r14.a = r11;
    L_0x019a:
        r11 = r14.a;
        r15 = r14.getChildCount();
        r8 = r11.b;
        r8.clear();
        r8 = 0;
    L_0x01a6:
        if (r8 >= r15) goto L_0x0222;
    L_0x01a8:
        r7 = r14.getChildAt(r8);
        r19 = r7.getLayoutParams();
        r20 = r15;
        r15 = r19;
        r15 = (defpackage.bb.a) r15;
        r2 = r7.getId();
        if (r2 == r12) goto L_0x021a;
    L_0x01bc:
        r12 = r11.b;
        r1 = java.lang.Integer.valueOf(r2);
        r1 = r12.containsKey(r1);
        if (r1 != 0) goto L_0x01dc;
    L_0x01c8:
        r1 = r11.b;
        r12 = java.lang.Integer.valueOf(r2);
        r21 = r3;
        r3 = new ba$a;
        r22 = r4;
        r4 = 0;
        r3.<init>(r4);
        r1.put(r12, r3);
        goto L_0x01e0;
    L_0x01dc:
        r21 = r3;
        r22 = r4;
    L_0x01e0:
        r1 = r11.b;
        r3 = java.lang.Integer.valueOf(r2);
        r1 = r1.get(r3);
        r1 = (defpackage.ba.a) r1;
        r3 = r7 instanceof defpackage.az;
        if (r3 == 0) goto L_0x0208;
    L_0x01f0:
        r7 = (defpackage.az) r7;
        r1.a(r2, r15);
        r3 = r7 instanceof android.support.constraint.Barrier;
        if (r3 == 0) goto L_0x0208;
    L_0x01f9:
        r3 = 1;
        r1.ai = r3;
        r7 = (android.support.constraint.Barrier) r7;
        r3 = r7.a;
        r1.ah = r3;
        r3 = r7.a();
        r1.aj = r3;
    L_0x0208:
        r1.a(r2, r15);
        r8 = r8 + 1;
        r1 = r31;
        r2 = r32;
        r15 = r20;
        r3 = r21;
        r4 = r22;
        r7 = 0;
        r12 = -1;
        goto L_0x01a6;
    L_0x021a:
        r1 = new java.lang.RuntimeException;
        r2 = "All children of ConstraintLayout must have ids to use ConstraintSet";
        r1.<init>(r2);
        throw r1;
    L_0x0222:
        r21 = r3;
        r22 = r4;
        r1 = r14.a;
        r0.b = r1;
        goto L_0x022f;
    L_0x022b:
        r21 = r3;
        r22 = r4;
    L_0x022f:
        r6 = r6 + 1;
        r1 = r31;
        r2 = r32;
        r3 = r21;
        r4 = r22;
        r7 = 0;
        r8 = 1;
        r12 = -1;
        goto L_0x017b;
    L_0x023e:
        r21 = r3;
        r22 = r4;
        r1 = r0.b;
        if (r1 == 0) goto L_0x0249;
    L_0x0246:
        r1.c(r0);
    L_0x0249:
        r1 = r0.f;
        r1.E();
        r1 = r0.d;
        r1 = r1.size();
        if (r1 <= 0) goto L_0x0267;
    L_0x0256:
        r2 = 0;
    L_0x0257:
        if (r2 >= r1) goto L_0x0267;
    L_0x0259:
        r3 = r0.d;
        r3 = r3.get(r2);
        r3 = (defpackage.az) r3;
        r3.a(r0);
        r2 = r2 + 1;
        goto L_0x0257;
    L_0x0267:
        r1 = 0;
    L_0x0268:
        if (r1 >= r13) goto L_0x0295;
    L_0x026a:
        r2 = r0.getChildAt(r1);
        r3 = r2 instanceof defpackage.bc;
        if (r3 == 0) goto L_0x0292;
    L_0x0272:
        r2 = (defpackage.bc) r2;
        r3 = 0;
        r4 = r0.findViewById(r3);
        r2.a = r4;
        r4 = r2.a;
        if (r4 == 0) goto L_0x0292;
    L_0x027f:
        r4 = r2.a;
        r4 = r4.getLayoutParams();
        r4 = (android.support.constraint.ConstraintLayout.a) r4;
        r6 = 1;
        r4.Y = r6;
        r4 = r2.a;
        r4.setVisibility(r3);
        r2.setVisibility(r3);
    L_0x0292:
        r1 = r1 + 1;
        goto L_0x0268;
    L_0x0295:
        r1 = 0;
    L_0x0296:
        if (r1 >= r13) goto L_0x05f3;
    L_0x0298:
        r2 = r0.getChildAt(r1);
        r3 = r0.a(r2);
        if (r3 == 0) goto L_0x05ec;
    L_0x02a2:
        r4 = r2.getLayoutParams();
        r4 = (android.support.constraint.ConstraintLayout.a) r4;
        r4.a();
        r6 = 3;
        if (r10 == 0) goto L_0x02da;
    L_0x02ae:
        r7 = r30.getResources();	 Catch:{ NotFoundException -> 0x02da }
        r8 = r2.getId();	 Catch:{ NotFoundException -> 0x02da }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x02da }
        r8 = r2.getId();	 Catch:{ NotFoundException -> 0x02da }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x02da }
        r0.a(r7, r8);	 Catch:{ NotFoundException -> 0x02da }
        r8 = "id/";
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x02da }
        r8 = r8 + r6;
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x02da }
        r8 = r2.getId();	 Catch:{ NotFoundException -> 0x02da }
        r8 = r0.a(r8);	 Catch:{ NotFoundException -> 0x02da }
        r8.P = r7;	 Catch:{ NotFoundException -> 0x02da }
    L_0x02da:
        r7 = r2.getVisibility();
        r3.O = r7;
        r7 = r4.Y;
        if (r7 == 0) goto L_0x02e8;
    L_0x02e4:
        r7 = 8;
        r3.O = r7;
    L_0x02e8:
        r3.N = r2;
        r2 = r0.f;
        r2.a(r3);
        r2 = r4.U;
        if (r2 == 0) goto L_0x02f7;
    L_0x02f3:
        r2 = r4.T;
        if (r2 != 0) goto L_0x02fc;
    L_0x02f7:
        r2 = r0.e;
        r2.add(r3);
    L_0x02fc:
        r2 = r4.W;
        if (r2 == 0) goto L_0x0340;
    L_0x0300:
        r3 = (defpackage.bq) r3;
        r2 = r4.ag;
        r6 = r4.ah;
        r7 = r4.ai;
        r8 = android.os.Build.VERSION.SDK_INT;
        r11 = 17;
        if (r8 >= r11) goto L_0x0314;
    L_0x030e:
        r2 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
    L_0x0314:
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r8 == 0) goto L_0x032a;
    L_0x031a:
        r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0327;
    L_0x031e:
        r3.a = r7;
        r7 = -1;
        r3.b = r7;
    L_0x0323:
        r3.V = r7;
        goto L_0x05ec;
    L_0x0327:
        r7 = -1;
        goto L_0x05ec;
    L_0x032a:
        r7 = -1;
        if (r2 == r7) goto L_0x0334;
    L_0x032d:
        if (r2 < 0) goto L_0x05ec;
    L_0x032f:
        r3.a = r4;
        r3.b = r2;
        goto L_0x0323;
    L_0x0334:
        if (r6 == r7) goto L_0x05ec;
    L_0x0336:
        if (r6 < 0) goto L_0x05ec;
    L_0x0338:
        r3.a = r4;
        r3.b = r7;
        r3.V = r6;
        goto L_0x05ec;
    L_0x0340:
        r7 = -1;
        r2 = r4.d;
        if (r2 != r7) goto L_0x0389;
    L_0x0345:
        r2 = r4.e;
        if (r2 != r7) goto L_0x0389;
    L_0x0349:
        r2 = r4.f;
        if (r2 != r7) goto L_0x0389;
    L_0x034d:
        r2 = r4.g;
        if (r2 != r7) goto L_0x0389;
    L_0x0351:
        r2 = r4.q;
        if (r2 != r7) goto L_0x0389;
    L_0x0355:
        r2 = r4.p;
        if (r2 != r7) goto L_0x0389;
    L_0x0359:
        r2 = r4.r;
        if (r2 != r7) goto L_0x0389;
    L_0x035d:
        r2 = r4.s;
        if (r2 != r7) goto L_0x0389;
    L_0x0361:
        r2 = r4.h;
        if (r2 != r7) goto L_0x0389;
    L_0x0365:
        r2 = r4.i;
        if (r2 != r7) goto L_0x0389;
    L_0x0369:
        r2 = r4.j;
        if (r2 != r7) goto L_0x0389;
    L_0x036d:
        r2 = r4.k;
        if (r2 != r7) goto L_0x0389;
    L_0x0371:
        r2 = r4.l;
        if (r2 != r7) goto L_0x0389;
    L_0x0375:
        r2 = r4.O;
        if (r2 != r7) goto L_0x0389;
    L_0x0379:
        r2 = r4.P;
        if (r2 != r7) goto L_0x0389;
    L_0x037d:
        r2 = r4.m;
        if (r2 != r7) goto L_0x0389;
    L_0x0381:
        r2 = r4.width;
        if (r2 == r7) goto L_0x0389;
    L_0x0385:
        r2 = r4.height;
        if (r2 != r7) goto L_0x05ec;
    L_0x0389:
        r2 = r4.Z;
        r7 = r4.aa;
        r8 = r4.ab;
        r11 = r4.ac;
        r12 = r4.ad;
        r14 = r4.ae;
        r15 = r4.af;
        r6 = android.os.Build.VERSION.SDK_INT;
        r23 = r2;
        r2 = 17;
        if (r6 >= r2) goto L_0x03da;
    L_0x039f:
        r6 = r4.d;
        r7 = r4.e;
        r8 = r4.f;
        r11 = r4.g;
        r12 = r4.t;
        r14 = r4.v;
        r15 = r4.z;
        r2 = -1;
        if (r6 != r2) goto L_0x03ba;
    L_0x03b0:
        if (r7 != r2) goto L_0x03ba;
    L_0x03b2:
        r19 = r6;
        r6 = r4.q;
        if (r6 == r2) goto L_0x03bd;
    L_0x03b8:
        r6 = r4.q;
    L_0x03ba:
        r19 = r6;
        goto L_0x03c4;
    L_0x03bd:
        r6 = r4.p;
        if (r6 == r2) goto L_0x03c4;
    L_0x03c1:
        r6 = r4.p;
        r7 = r6;
    L_0x03c4:
        if (r8 != r2) goto L_0x03d5;
    L_0x03c6:
        if (r11 != r2) goto L_0x03d5;
    L_0x03c8:
        r6 = r4.r;
        if (r6 == r2) goto L_0x03cf;
    L_0x03cc:
        r8 = r4.r;
        goto L_0x03d5;
    L_0x03cf:
        r6 = r4.s;
        if (r6 == r2) goto L_0x03d5;
    L_0x03d3:
        r11 = r4.s;
    L_0x03d5:
        r28 = r12;
        r6 = r19;
        goto L_0x03df;
    L_0x03da:
        r2 = -1;
        r28 = r12;
        r6 = r23;
    L_0x03df:
        r12 = r4.m;
        if (r12 == r2) goto L_0x0400;
    L_0x03e3:
        r2 = r4.m;
        r25 = r0.a(r2);
        if (r25 == 0) goto L_0x051e;
    L_0x03eb:
        r2 = r4.o;
        r6 = r4.n;
        r24 = defpackage.bn.a.CENTER;
        r26 = defpackage.bn.a.CENTER;
        r28 = 0;
        r23 = r3;
        r27 = r6;
        r23.a(r24, r25, r26, r27, r28);
        r3.r = r2;
        goto L_0x051e;
    L_0x0400:
        if (r6 == r2) goto L_0x040d;
    L_0x0402:
        r25 = r0.a(r6);
        if (r25 == 0) goto L_0x0422;
    L_0x0408:
        r24 = defpackage.bn.a.LEFT;
        r26 = defpackage.bn.a.LEFT;
        goto L_0x0419;
    L_0x040d:
        if (r7 == r2) goto L_0x0423;
    L_0x040f:
        r25 = r0.a(r7);
        if (r25 == 0) goto L_0x0422;
    L_0x0415:
        r24 = defpackage.bn.a.LEFT;
        r26 = defpackage.bn.a.RIGHT;
    L_0x0419:
        r2 = r4.leftMargin;
        r23 = r3;
        r27 = r2;
        r23.a(r24, r25, r26, r27, r28);
    L_0x0422:
        r2 = -1;
    L_0x0423:
        if (r8 == r2) goto L_0x0430;
    L_0x0425:
        r25 = r0.a(r8);
        if (r25 == 0) goto L_0x0447;
    L_0x042b:
        r24 = defpackage.bn.a.RIGHT;
        r26 = defpackage.bn.a.LEFT;
        goto L_0x043c;
    L_0x0430:
        if (r11 == r2) goto L_0x0447;
    L_0x0432:
        r25 = r0.a(r11);
        if (r25 == 0) goto L_0x0447;
    L_0x0438:
        r24 = defpackage.bn.a.RIGHT;
        r26 = defpackage.bn.a.RIGHT;
    L_0x043c:
        r2 = r4.rightMargin;
        r23 = r3;
        r27 = r2;
        r28 = r14;
        r23.a(r24, r25, r26, r27, r28);
    L_0x0447:
        r2 = r4.h;
        r6 = -1;
        if (r2 == r6) goto L_0x0459;
    L_0x044c:
        r2 = r4.h;
        r25 = r0.a(r2);
        if (r25 == 0) goto L_0x0477;
    L_0x0454:
        r24 = defpackage.bn.a.TOP;
        r26 = defpackage.bn.a.TOP;
        goto L_0x046a;
    L_0x0459:
        r2 = r4.i;
        r6 = -1;
        if (r2 == r6) goto L_0x0477;
    L_0x045e:
        r2 = r4.i;
        r25 = r0.a(r2);
        if (r25 == 0) goto L_0x0477;
    L_0x0466:
        r24 = defpackage.bn.a.TOP;
        r26 = defpackage.bn.a.BOTTOM;
    L_0x046a:
        r2 = r4.topMargin;
        r6 = r4.u;
        r23 = r3;
        r27 = r2;
        r28 = r6;
        r23.a(r24, r25, r26, r27, r28);
    L_0x0477:
        r2 = r4.j;
        r6 = -1;
        if (r2 == r6) goto L_0x0489;
    L_0x047c:
        r2 = r4.j;
        r25 = r0.a(r2);
        if (r25 == 0) goto L_0x04a7;
    L_0x0484:
        r24 = defpackage.bn.a.BOTTOM;
        r26 = defpackage.bn.a.TOP;
        goto L_0x049a;
    L_0x0489:
        r2 = r4.k;
        r6 = -1;
        if (r2 == r6) goto L_0x04a7;
    L_0x048e:
        r2 = r4.k;
        r25 = r0.a(r2);
        if (r25 == 0) goto L_0x04a7;
    L_0x0496:
        r24 = defpackage.bn.a.BOTTOM;
        r26 = defpackage.bn.a.BOTTOM;
    L_0x049a:
        r2 = r4.bottomMargin;
        r6 = r4.w;
        r23 = r3;
        r27 = r2;
        r28 = r6;
        r23.a(r24, r25, r26, r27, r28);
    L_0x04a7:
        r2 = r4.l;
        r6 = -1;
        if (r2 == r6) goto L_0x04fe;
    L_0x04ac:
        r2 = r0.a;
        r6 = r4.l;
        r2 = r2.get(r6);
        r2 = (android.view.View) r2;
        r6 = r4.l;
        r6 = r0.a(r6);
        if (r6 == 0) goto L_0x04fe;
    L_0x04be:
        if (r2 == 0) goto L_0x04fe;
    L_0x04c0:
        r7 = r2.getLayoutParams();
        r7 = r7 instanceof android.support.constraint.ConstraintLayout.a;
        if (r7 == 0) goto L_0x04fe;
    L_0x04c8:
        r2 = r2.getLayoutParams();
        r2 = (android.support.constraint.ConstraintLayout.a) r2;
        r7 = 1;
        r4.V = r7;
        r2.V = r7;
        r2 = defpackage.bn.a.BASELINE;
        r23 = r3.a(r2);
        r2 = defpackage.bn.a.BASELINE;
        r24 = r6.a(r2);
        r25 = 0;
        r26 = -1;
        r27 = 2;
        r28 = 0;
        r29 = 1;
        r23.a(r24, r25, r26, r27, r28, r29);
        r2 = defpackage.bn.a.TOP;
        r2 = r3.a(r2);
        r2.c();
        r2 = defpackage.bn.a.BOTTOM;
        r2 = r3.a(r2);
        r2.c();
    L_0x04fe:
        r2 = 0;
        r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x050b;
    L_0x0503:
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x050b;
    L_0x0509:
        r3.L = r15;
    L_0x050b:
        r2 = r4.A;
        r6 = 0;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x051e;
    L_0x0512:
        r2 = r4.A;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 == 0) goto L_0x051e;
    L_0x051a:
        r2 = r4.A;
        r3.M = r2;
    L_0x051e:
        if (r10 == 0) goto L_0x0530;
    L_0x0520:
        r2 = r4.O;
        r6 = -1;
        if (r2 != r6) goto L_0x0529;
    L_0x0525:
        r2 = r4.P;
        if (r2 == r6) goto L_0x0530;
    L_0x0529:
        r2 = r4.O;
        r6 = r4.P;
        r3.a(r2, r6);
    L_0x0530:
        r2 = r4.T;
        r6 = 4;
        if (r2 != 0) goto L_0x0558;
    L_0x0535:
        r2 = r4.width;
        r7 = -1;
        if (r2 != r7) goto L_0x0552;
    L_0x053a:
        r3.h(r6);
        r2 = defpackage.bn.a.LEFT;
        r2 = r3.a(r2);
        r7 = r4.leftMargin;
        r2.e = r7;
        r2 = defpackage.bn.a.RIGHT;
        r2 = r3.a(r2);
        r7 = r4.rightMargin;
        r2.e = r7;
        goto L_0x0561;
    L_0x0552:
        r2 = 3;
        r3.h(r2);
        r2 = 0;
        goto L_0x055e;
    L_0x0558:
        r2 = 1;
        r3.h(r2);
        r2 = r4.width;
    L_0x055e:
        r3.d(r2);
    L_0x0561:
        r2 = r4.U;
        if (r2 != 0) goto L_0x0588;
    L_0x0565:
        r2 = r4.height;
        r7 = -1;
        if (r2 != r7) goto L_0x0582;
    L_0x056a:
        r3.i(r6);
        r2 = defpackage.bn.a.TOP;
        r2 = r3.a(r2);
        r6 = r4.topMargin;
        r2.e = r6;
        r2 = defpackage.bn.a.BOTTOM;
        r2 = r3.a(r2);
        r6 = r4.bottomMargin;
        r2.e = r6;
        goto L_0x0591;
    L_0x0582:
        r2 = 3;
        r3.i(r2);
        r2 = 0;
        goto L_0x058e;
    L_0x0588:
        r2 = 1;
        r3.i(r2);
        r2 = r4.height;
    L_0x058e:
        r3.e(r2);
    L_0x0591:
        r2 = r4.B;
        if (r2 == 0) goto L_0x059a;
    L_0x0595:
        r2 = r4.B;
        r3.a(r2);
    L_0x059a:
        r2 = r4.C;
        r6 = r3.S;
        r7 = 0;
        r6[r7] = r2;
        r2 = r4.D;
        r6 = r3.S;
        r18 = 1;
        r6[r18] = r2;
        r2 = r4.E;
        r3.Q = r2;
        r2 = r4.F;
        r3.R = r2;
        r2 = r4.G;
        r6 = r4.I;
        r8 = r4.K;
        r11 = r4.M;
        r3.g = r2;
        r3.i = r6;
        r3.j = r8;
        r3.k = r11;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x05ce;
    L_0x05c7:
        r2 = r3.g;
        if (r2 != 0) goto L_0x05ce;
    L_0x05cb:
        r2 = 2;
        r3.g = r2;
    L_0x05ce:
        r2 = r4.H;
        r6 = r4.J;
        r8 = r4.L;
        r4 = r4.N;
        r3.h = r2;
        r3.l = r6;
        r3.m = r8;
        r3.n = r4;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x05ef;
    L_0x05e4:
        r2 = r3.h;
        if (r2 != 0) goto L_0x05ef;
    L_0x05e8:
        r2 = 2;
        r3.h = r2;
        goto L_0x05ef;
    L_0x05ec:
        r7 = 0;
        r18 = 1;
    L_0x05ef:
        r1 = r1 + 1;
        goto L_0x0296;
    L_0x05f3:
        r7 = 0;
        goto L_0x05f9;
    L_0x05f5:
        r21 = r3;
        r22 = r4;
    L_0x05f9:
        r18 = 1;
        r1 = r0.l;
        r2 = 8;
        r1 = r1 & r2;
        if (r1 != r2) goto L_0x0604;
    L_0x0602:
        r1 = 1;
        goto L_0x0605;
    L_0x0604:
        r1 = 0;
    L_0x0605:
        if (r1 == 0) goto L_0x061a;
    L_0x0607:
        r2 = r0.f;
        r2.D();
        r3 = r2.Y;
        r2.a(r3);
        r2 = r0.f;
        r2.e(r5, r9);
        r30.b(r31, r32);
        goto L_0x061d;
    L_0x061a:
        r30.a(r31, r32);
    L_0x061d:
        r30.b();
        r2 = r30.getChildCount();
        if (r2 <= 0) goto L_0x062b;
    L_0x0626:
        r2 = r0.f;
        r2.B();
    L_0x062b:
        r2 = r0.e;
        r2 = r2.size();
        r3 = r30.getPaddingBottom();
        r4 = r22 + r3;
        r3 = r30.getPaddingRight();
        r3 = r21 + r3;
        if (r2 <= 0) goto L_0x082b;
    L_0x063f:
        r8 = r0.f;
        r8 = r8.y();
        r10 = 2;
        if (r8 != r10) goto L_0x064a;
    L_0x0648:
        r8 = 1;
        goto L_0x064b;
    L_0x064a:
        r8 = 0;
    L_0x064b:
        r11 = r0.f;
        r11 = r11.z();
        if (r11 != r10) goto L_0x0655;
    L_0x0653:
        r10 = 1;
        goto L_0x0656;
    L_0x0655:
        r10 = 0;
    L_0x0656:
        r11 = r0.f;
        r11 = r11.l();
        r12 = r0.g;
        r11 = java.lang.Math.max(r11, r12);
        r12 = r0.f;
        r12 = r12.m();
        r13 = r0.h;
        r12 = java.lang.Math.max(r12, r13);
        r13 = r11;
        r14 = r12;
        r11 = 0;
        r12 = 0;
        r15 = 0;
    L_0x0673:
        if (r11 >= r2) goto L_0x079e;
    L_0x0675:
        r7 = r0.e;
        r7 = r7.get(r11);
        r7 = (defpackage.bo) r7;
        r6 = r7.N;
        r6 = (android.view.View) r6;
        if (r6 == 0) goto L_0x0788;
    L_0x0683:
        r17 = r6.getLayoutParams();
        r20 = r2;
        r2 = r17;
        r2 = (android.support.constraint.ConstraintLayout.a) r2;
        r17 = r9;
        r9 = r2.X;
        if (r9 != 0) goto L_0x0783;
    L_0x0693:
        r9 = r2.W;
        if (r9 != 0) goto L_0x0783;
    L_0x0697:
        r9 = r6.getVisibility();
        r21 = r5;
        r5 = 8;
        if (r9 == r5) goto L_0x0780;
    L_0x06a1:
        if (r1 == 0) goto L_0x06b7;
    L_0x06a3:
        r9 = r7.h();
        r9 = r9.e();
        if (r9 == 0) goto L_0x06b7;
    L_0x06ad:
        r9 = r7.i();
        r9 = r9.e();
        if (r9 != 0) goto L_0x0780;
    L_0x06b7:
        r9 = r2.width;
        r5 = -2;
        if (r9 != r5) goto L_0x06c9;
    L_0x06bc:
        r9 = r2.T;
        if (r9 == 0) goto L_0x06c9;
    L_0x06c0:
        r9 = r2.width;
        r5 = r31;
        r9 = getChildMeasureSpec(r5, r3, r9);
        goto L_0x06d5;
    L_0x06c9:
        r5 = r31;
        r9 = r7.l();
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5);
    L_0x06d5:
        r5 = r2.height;
        r23 = r3;
        r3 = -2;
        if (r5 != r3) goto L_0x06e9;
    L_0x06dc:
        r3 = r2.U;
        if (r3 == 0) goto L_0x06e9;
    L_0x06e0:
        r3 = r2.height;
        r5 = r32;
        r3 = getChildMeasureSpec(r5, r4, r3);
        goto L_0x06f5;
    L_0x06e9:
        r5 = r32;
        r3 = r7.m();
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5);
    L_0x06f5:
        r6.measure(r9, r3);
        r3 = r6.getMeasuredWidth();
        r5 = r6.getMeasuredHeight();
        r9 = r7.l();
        if (r3 == r9) goto L_0x072e;
    L_0x0706:
        r7.d(r3);
        if (r1 == 0) goto L_0x0712;
    L_0x070b:
        r9 = r7.h();
        r9.a(r3);
    L_0x0712:
        if (r8 == 0) goto L_0x072d;
    L_0x0714:
        r3 = r7.r();
        if (r3 <= r13) goto L_0x072d;
    L_0x071a:
        r3 = r7.r();
        r9 = defpackage.bn.a.RIGHT;
        r9 = r7.a(r9);
        r9 = r9.b();
        r3 = r3 + r9;
        r13 = java.lang.Math.max(r13, r3);
    L_0x072d:
        r12 = 1;
    L_0x072e:
        r3 = r7.m();
        if (r5 == r3) goto L_0x075d;
    L_0x0734:
        r7.e(r5);
        if (r1 == 0) goto L_0x0740;
    L_0x0739:
        r3 = r7.i();
        r3.a(r5);
    L_0x0740:
        if (r10 == 0) goto L_0x075c;
    L_0x0742:
        r3 = r7.s();
        if (r3 <= r14) goto L_0x075c;
    L_0x0748:
        r3 = r7.s();
        r5 = defpackage.bn.a.BOTTOM;
        r5 = r7.a(r5);
        r5 = r5.b();
        r3 = r3 + r5;
        r3 = java.lang.Math.max(r14, r3);
        r14 = r3;
    L_0x075c:
        r12 = 1;
    L_0x075d:
        r2 = r2.V;
        if (r2 == 0) goto L_0x0770;
    L_0x0761:
        r2 = r6.getBaseline();
        r3 = -1;
        if (r2 == r3) goto L_0x0771;
    L_0x0768:
        r5 = r7.G;
        if (r2 == r5) goto L_0x0771;
    L_0x076c:
        r7.G = r2;
        r12 = 1;
        goto L_0x0771;
    L_0x0770:
        r3 = -1;
    L_0x0771:
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 11;
        if (r2 < r5) goto L_0x0791;
    L_0x0777:
        r2 = r6.getMeasuredState();
        r15 = combineMeasuredStates(r15, r2);
        goto L_0x0791;
    L_0x0780:
        r23 = r3;
        goto L_0x0790;
    L_0x0783:
        r23 = r3;
        r21 = r5;
        goto L_0x0790;
    L_0x0788:
        r20 = r2;
        r23 = r3;
        r21 = r5;
        r17 = r9;
    L_0x0790:
        r3 = -1;
    L_0x0791:
        r11 = r11 + 1;
        r9 = r17;
        r2 = r20;
        r5 = r21;
        r3 = r23;
        r7 = 0;
        goto L_0x0673;
    L_0x079e:
        r20 = r2;
        r23 = r3;
        r21 = r5;
        r17 = r9;
        if (r12 == 0) goto L_0x07e9;
    L_0x07a8:
        r2 = r0.f;
        r3 = r21;
        r2.d(r3);
        r2 = r0.f;
        r3 = r17;
        r2.e(r3);
        if (r1 == 0) goto L_0x07bd;
    L_0x07b8:
        r1 = r0.f;
        r1.C();
    L_0x07bd:
        r1 = r0.f;
        r1.B();
        r1 = r0.f;
        r1 = r1.l();
        if (r1 >= r13) goto L_0x07d1;
    L_0x07ca:
        r1 = r0.f;
        r1.d(r13);
        r8 = 1;
        goto L_0x07d2;
    L_0x07d1:
        r8 = 0;
    L_0x07d2:
        r1 = r0.f;
        r1 = r1.m();
        if (r1 >= r14) goto L_0x07e0;
    L_0x07da:
        r1 = r0.f;
        r1.e(r14);
        goto L_0x07e2;
    L_0x07e0:
        r18 = r8;
    L_0x07e2:
        if (r18 == 0) goto L_0x07e9;
    L_0x07e4:
        r1 = r0.f;
        r1.B();
    L_0x07e9:
        r1 = r20;
        r2 = 0;
    L_0x07ec:
        if (r2 >= r1) goto L_0x082e;
    L_0x07ee:
        r3 = r0.e;
        r3 = r3.get(r2);
        r3 = (defpackage.bo) r3;
        r5 = r3.N;
        r5 = (android.view.View) r5;
        if (r5 == 0) goto L_0x0826;
    L_0x07fc:
        r6 = r5.getMeasuredWidth();
        r7 = r3.l();
        if (r6 != r7) goto L_0x0810;
    L_0x0806:
        r6 = r5.getMeasuredHeight();
        r7 = r3.m();
        if (r6 == r7) goto L_0x0826;
    L_0x0810:
        r6 = r3.l();
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7);
        r3 = r3.m();
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7);
        r5.measure(r6, r3);
        goto L_0x0828;
    L_0x0826:
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0828:
        r2 = r2 + 1;
        goto L_0x07ec;
    L_0x082b:
        r23 = r3;
        r15 = 0;
    L_0x082e:
        r1 = r0.f;
        r1 = r1.l();
        r1 = r1 + r23;
        r2 = r0.f;
        r2 = r2.m();
        r2 = r2 + r4;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 11;
        if (r3 < r4) goto L_0x0872;
    L_0x0843:
        r3 = r31;
        r1 = resolveSizeAndState(r1, r3, r15);
        r3 = r15 << 16;
        r4 = r32;
        r2 = resolveSizeAndState(r2, r4, r3);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r1 = r1 & r3;
        r2 = r2 & r3;
        r3 = r0.i;
        r1 = java.lang.Math.min(r3, r1);
        r3 = r0.j;
        r2 = java.lang.Math.min(r3, r2);
        r3 = r0.f;
        r3 = r3.Z;
        r4 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        if (r3 == 0) goto L_0x086b;
    L_0x086a:
        r1 = r1 | r4;
    L_0x086b:
        r3 = r0.f;
        r3 = r3.aa;
        if (r3 == 0) goto L_0x0872;
    L_0x0871:
        r2 = r2 | r4;
    L_0x0872:
        r0.setMeasuredDimension(r1, r2);
        r0.n = r1;
        r0.o = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        bo a = a(view);
        if ((view instanceof Guideline) && !(a instanceof bq)) {
            a aVar = (a) view.getLayoutParams();
            aVar.aj = new bq();
            aVar.W = true;
            ((bq) aVar.aj).j(aVar.Q);
        }
        if (view instanceof az) {
            az azVar = (az) view;
            azVar.b();
            ((a) view.getLayoutParams()).X = true;
            if (!this.d.contains(azVar)) {
                this.d.add(azVar);
            }
        }
        this.a.put(view.getId(), view);
        this.k = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.a.remove(view.getId());
        bo a = a(view);
        this.f.b(a);
        this.d.remove(view);
        this.e.remove(a);
        this.k = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.k = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
