package defpackage;

import android.graphics.Path;
import android.util.Log;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import org.opencv.imgproc.Imgproc;

/* renamed from: hk */
public final class hk {

    /* renamed from: hk$a */
    static class a {
        int a;
        boolean b;

        a() {
        }
    }

    /* renamed from: hk$b */
    public static class b {
        public char a;
        public float[] b;

        b(char c, float[] fArr) {
            this.a = c;
            this.b = fArr;
        }

        b(b bVar) {
            this.a = bVar.a;
            float[] fArr = bVar.b;
            this.b = hk.a(fArr, fArr.length);
        }

        private static void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            d11 *= sin;
            double d15 = d4 * cos;
            sin2 = (sin2 * d11) + (cos2 * d15);
            cos2 = (double) ceil;
            Double.isNaN(cos2);
            cos2 = d9 / cos2;
            double d16 = d5;
            double d17 = d6;
            double d18 = sin2;
            double d19 = d14;
            int i = 0;
            d14 = d8;
            while (i < ceil) {
                double d20 = d14 + cos2;
                double sin3 = Math.sin(d20);
                double cos3 = Math.cos(d20);
                double d21 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                d10 = (d2 + ((d10 * sin) * cos3)) + (d15 * sin3);
                double d22 = (d12 * sin3) - (d13 * cos3);
                sin3 = (sin3 * d11) + (cos3 * d15);
                d14 = d20 - d14;
                cos3 = Math.tan(d14 / 2.0d);
                d14 = (Math.sin(d14) * (Math.sqrt(((cos3 * 3.0d) * cos3) + 4.0d) - 1.0d)) / 3.0d;
                int i2 = ceil;
                double d23 = cos;
                double d24 = d16 + (d19 * d14);
                d7 = sin;
                double d25 = d17 + (d18 * d14);
                d4 = cos2;
                double d26 = d21 - (d14 * d22);
                int i3 = i2;
                d16 = d11;
                double d27 = d10 - (d14 * sin3);
                path.rLineTo(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
                path.cubicTo((float) d24, (float) d25, (float) d26, (float) d27, (float) d21, (float) d10);
                i++;
                cos2 = d4;
                ceil = i3;
                sin = d7;
                d17 = d10;
                d11 = d16;
                d14 = d20;
                d18 = sin3;
                d19 = d22;
                cos = d23;
                d10 = d3;
                d16 = d21;
                d21 = 4.0d;
            }
        }

        private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            float f8 = f;
            float f9 = f3;
            boolean z3 = z2;
            float f10 = f5;
            float f11 = f6;
            float f12 = f7;
            while (true) {
                double toRadians = Math.toRadians((double) f12);
                double cos = Math.cos(toRadians);
                double sin = Math.sin(toRadians);
                double d = (double) f8;
                Double.isNaN(d);
                double d2 = d * cos;
                double d3 = d;
                d = (double) f2;
                Double.isNaN(d);
                d2 += d * sin;
                double d4 = (double) f10;
                Double.isNaN(d4);
                double d5 = d2 / d4;
                d2 = (double) (-f8);
                Double.isNaN(d2);
                d2 *= sin;
                Double.isNaN(d);
                d2 += d * cos;
                double d6 = d;
                d = (double) f11;
                Double.isNaN(d);
                d2 /= d;
                float f13 = f10;
                float f14 = f11;
                double d7 = (double) f9;
                Double.isNaN(d7);
                d7 *= cos;
                double d8 = d2;
                d2 = (double) f4;
                Double.isNaN(d2);
                d7 += d2 * sin;
                Double.isNaN(d4);
                d7 /= d4;
                double d9 = (double) (-f9);
                Double.isNaN(d9);
                d9 *= sin;
                Double.isNaN(d2);
                d9 += d2 * cos;
                Double.isNaN(d);
                d9 /= d;
                d2 = d5 - d7;
                double d10 = d8 - d9;
                double d11 = (d5 + d7) / 2.0d;
                double d12 = (d8 + d9) / 2.0d;
                double d13 = (d2 * d2) + (d10 * d10);
                double d14 = d4;
                String str = "PathParser";
                if (d13 == 0.0d) {
                    Log.w(str, " Points are coincident");
                    return;
                }
                double d15 = (1.0d / d13) - 0.25d;
                if (d15 < 0.0d) {
                    Log.w(str, "Points are too far apart ".concat(String.valueOf(d13)));
                    f8 = (float) (Math.sqrt(d13) / 1.99999d);
                    f10 = f13 * f8;
                    f11 = f14 * f8;
                    f8 = f;
                    f9 = f3;
                    f12 = f7;
                    z3 = z2;
                } else {
                    d4 = Math.sqrt(d15);
                    d2 *= d4;
                    d4 *= d10;
                    double d16 = d3;
                    d10 = d14;
                    boolean z4 = z2;
                    if (z == z4) {
                        d11 -= d4;
                        d12 += d2;
                    } else {
                        d11 += d4;
                        d12 -= d2;
                    }
                    d8 = Math.atan2(d8 - d12, d5 - d11);
                    d9 = Math.atan2(d9 - d12, d7 - d11) - d8;
                    if (z4 != (d9 >= 0.0d)) {
                        d9 = d9 > 0.0d ? d9 - 6.283185307179586d : d9 + 6.283185307179586d;
                    }
                    Double.isNaN(d10);
                    d11 *= d10;
                    Double.isNaN(d);
                    d12 *= d;
                    b.a(path, (d11 * cos) - (d12 * sin), (d11 * sin) + (d12 * cos), d10, d, d16, d6, toRadians, d8, d9);
                    return;
                }
            }
        }

        private static void a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f;
            Path path2 = path;
            char c3 = c2;
            float[] fArr3 = fArr2;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case Imgproc.COLOR_YUV2BGRA_YVYU /*122*/:
                    path.close();
                    path2.moveTo(f6, f7);
                    f2 = f6;
                    f4 = f2;
                    f3 = f7;
                    f5 = f3;
                    break;
            }
            i = 2;
            float f8 = f2;
            float f9 = f3;
            float f10 = f6;
            float f11 = f7;
            int i2 = 0;
            char c4 = c;
            while (i2 < fArr3.length) {
                int i3;
                int i4;
                int i5;
                if (c3 != 'A') {
                    int i6;
                    int i7;
                    int i8;
                    if (c3 == 'C') {
                        i3 = i2;
                        i2 = i3 + 2;
                        i6 = i3 + 3;
                        i7 = i3 + 4;
                        int i9 = i3 + 5;
                        path.cubicTo(fArr3[i3], fArr3[i3 + 1], fArr3[i2], fArr3[i6], fArr3[i7], fArr3[i9]);
                        f8 = fArr3[i7];
                        f2 = fArr3[i9];
                        f3 = fArr3[i2];
                        f4 = fArr3[i6];
                        f9 = f2;
                        f5 = f4;
                        f4 = f3;
                    } else if (c3 == 'H') {
                        i3 = i2;
                        path2.lineTo(fArr3[i3], f9);
                        f8 = fArr3[i3];
                    } else if (c3 == 'Q') {
                        i3 = i2;
                        i2 = i3 + 1;
                        i8 = i3 + 2;
                        int i10 = i3 + 3;
                        path2.quadTo(fArr3[i3], fArr3[i2], fArr3[i8], fArr3[i10]);
                        f2 = fArr3[i3];
                        f3 = fArr3[i2];
                        f8 = fArr3[i8];
                        f9 = fArr3[i10];
                        f4 = f2;
                        f5 = f3;
                    } else if (c3 == 'V') {
                        i3 = i2;
                        path2.lineTo(f8, fArr3[i3]);
                        f9 = fArr3[i3];
                    } else if (c3 != 'a') {
                        int i11;
                        if (c3 == 'c') {
                            i4 = i2 + 2;
                            i5 = i2 + 3;
                            i11 = i2 + 4;
                            i3 = i2 + 5;
                            path.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i4], fArr3[i5], fArr3[i11], fArr3[i3]);
                            f2 = fArr3[i4] + f8;
                            f3 = fArr3[i5] + f9;
                            f8 += fArr3[i11];
                            f4 = fArr3[i3];
                            f9 += f4;
                            f4 = f2;
                            f5 = f3;
                        } else if (c3 != 'h') {
                            int i12;
                            if (c3 != 'q') {
                                if (c3 == 'v') {
                                    path2.rLineTo(MapboxConstants.MINIMUM_ZOOM, fArr3[i2]);
                                    f2 = fArr3[i2];
                                } else if (c3 != 'L') {
                                    int i13;
                                    if (c3 == 'M') {
                                        f8 = fArr3[i2];
                                        i13 = i2 + 1;
                                        f9 = fArr3[i13];
                                        if (i2 > 0) {
                                            path2.lineTo(fArr3[i2], fArr3[i13]);
                                        } else {
                                            path2.moveTo(fArr3[i2], fArr3[i13]);
                                        }
                                    } else if (c3 == 'S') {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            f8 = (f8 * 2.0f) - f4;
                                            f9 = (f9 * 2.0f) - f5;
                                        }
                                        f3 = f8;
                                        i6 = i2 + 1;
                                        i7 = i2 + 2;
                                        i4 = i2 + 3;
                                        path.cubicTo(f3, f9, fArr3[i2], fArr3[i6], fArr3[i7], fArr3[i4]);
                                        f2 = fArr3[i2];
                                        f3 = fArr3[i6];
                                        f8 = fArr3[i7];
                                        f9 = fArr3[i4];
                                        f4 = f2;
                                        f5 = f3;
                                    } else if (c3 == 'T') {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f8 = (f8 * 2.0f) - f4;
                                            f9 = (f9 * 2.0f) - f5;
                                        }
                                        i12 = i2 + 1;
                                        path2.quadTo(f8, f9, fArr3[i2], fArr3[i12]);
                                        f5 = f9;
                                        f4 = f8;
                                        i3 = i2;
                                        f8 = fArr3[i2];
                                        f9 = fArr3[i12];
                                    } else if (c3 == 'l') {
                                        i12 = i2 + 1;
                                        path2.rLineTo(fArr3[i2], fArr3[i12]);
                                        f8 += fArr3[i2];
                                        f2 = fArr3[i12];
                                    } else if (c3 == 'm') {
                                        f8 += fArr3[i2];
                                        i13 = i2 + 1;
                                        f9 += fArr3[i13];
                                        if (i2 > 0) {
                                            path2.rLineTo(fArr3[i2], fArr3[i13]);
                                        } else {
                                            path2.rMoveTo(fArr3[i2], fArr3[i13]);
                                        }
                                    } else if (c3 == 's') {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            f2 = f8 - f4;
                                            f4 = f9 - f5;
                                            f3 = f2;
                                        } else {
                                            f3 = MapboxConstants.MINIMUM_ZOOM;
                                            f4 = MapboxConstants.MINIMUM_ZOOM;
                                        }
                                        i4 = i2 + 1;
                                        i5 = i2 + 2;
                                        i11 = i2 + 3;
                                        path.rCubicTo(f3, f4, fArr3[i2], fArr3[i4], fArr3[i5], fArr3[i11]);
                                        f2 = fArr3[i2] + f8;
                                        f3 = fArr3[i4] + f9;
                                        f8 += fArr3[i5];
                                        f4 = fArr3[i11];
                                    } else if (c3 == 't') {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f6 = f8 - f4;
                                            f2 = f9 - f5;
                                        } else {
                                            f2 = MapboxConstants.MINIMUM_ZOOM;
                                            f6 = MapboxConstants.MINIMUM_ZOOM;
                                        }
                                        i8 = i2 + 1;
                                        path2.rQuadTo(f6, f2, fArr3[i2], fArr3[i8]);
                                        f6 += f8;
                                        f2 += f9;
                                        f8 += fArr3[i2];
                                        f9 += fArr3[i8];
                                        f5 = f2;
                                        f4 = f6;
                                    }
                                    f11 = f9;
                                    f10 = f8;
                                } else {
                                    i12 = i2 + 1;
                                    path2.lineTo(fArr3[i2], fArr3[i12]);
                                    f8 = fArr3[i2];
                                    f9 = fArr3[i12];
                                }
                                f9 += f2;
                            } else {
                                i12 = i2 + 1;
                                int i14 = i2 + 2;
                                int i15 = i2 + 3;
                                path2.rQuadTo(fArr3[i2], fArr3[i12], fArr3[i14], fArr3[i15]);
                                f2 = fArr3[i2] + f8;
                                f3 = fArr3[i12] + f9;
                                f8 += fArr3[i14];
                                f4 = fArr3[i15];
                            }
                            f9 += f4;
                            f4 = f2;
                            f5 = f3;
                        } else {
                            path2.rLineTo(fArr3[i2], MapboxConstants.MINIMUM_ZOOM);
                            f8 += fArr3[i2];
                        }
                        i3 = i2;
                    } else {
                        i4 = i2 + 5;
                        f5 = fArr3[i4] + f8;
                        i5 = i2 + 6;
                        f6 = fArr3[i5] + f9;
                        f7 = fArr3[i2];
                        float f12 = fArr3[i2 + 1];
                        f = f9;
                        float f13 = f8;
                        i3 = i2;
                        b.a(path, f8, f9, f5, f6, f7, f12, fArr3[i2 + 2], fArr3[i2 + 3] != MapboxConstants.MINIMUM_ZOOM, fArr3[i2 + 4] != MapboxConstants.MINIMUM_ZOOM);
                        f8 = f13 + fArr3[i4];
                        f9 = f + fArr3[i5];
                    }
                    i2 = i3 + i;
                    c4 = c2;
                    c3 = c4;
                } else {
                    i3 = i2;
                    i4 = i3 + 5;
                    i5 = i3 + 6;
                    b.a(path, f8, f9, fArr3[i4], fArr3[i5], fArr3[i3], fArr3[i3 + 1], fArr3[i3 + 2], fArr3[i3 + 3] != MapboxConstants.MINIMUM_ZOOM, fArr3[i3 + 4] != MapboxConstants.MINIMUM_ZOOM);
                    f8 = fArr3[i4];
                    f9 = fArr3[i5];
                }
                f5 = f9;
                f4 = f8;
                i2 = i3 + i;
                c4 = c2;
                c3 = c4;
            }
            f = f9;
            fArr[0] = f8;
            fArr[1] = f;
            fArr[2] = f4;
            fArr[3] = f5;
            fArr[4] = f10;
            fArr[5] = f11;
        }

        public static void a(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                b.a(path, fArr, c, bVarArr[i].a, bVarArr[i].b);
                c = bVarArr[i].a;
            }
        }

        public final void a(b bVar, b bVar2, float f) {
            int i = 0;
            while (true) {
                float[] fArr = bVar.b;
                if (i < fArr.length) {
                    this.b[i] = (fArr[i] * (1.0f - f)) + (bVar2.b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static Path a(String str) {
        Path path = new Path();
        b[] b = hk.b(str);
        if (b == null) {
            return null;
        }
        try {
            b.a(b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    private static void a(ArrayList<b> arrayList, char c, float[] fArr) {
        arrayList.add(new b(c, fArr));
    }

    /* JADX WARNING: Missing block: B:17:0x002c, code skipped:
            return false;
     */
    public static boolean a(defpackage.hk.b[] r4, defpackage.hk.b[] r5) {
        /*
        r0 = 0;
        if (r4 == 0) goto L_0x002c;
    L_0x0003:
        if (r5 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x002c;
    L_0x0006:
        r1 = r4.length;
        r2 = r5.length;
        if (r1 == r2) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r1 = 0;
    L_0x000c:
        r2 = r4.length;
        if (r1 >= r2) goto L_0x002a;
    L_0x000f:
        r2 = r4[r1];
        r2 = r2.a;
        r3 = r5[r1];
        r3 = r3.a;
        if (r2 != r3) goto L_0x0029;
    L_0x0019:
        r2 = r4[r1];
        r2 = r2.b;
        r2 = r2.length;
        r3 = r5[r1];
        r3 = r3.b;
        r3 = r3.length;
        if (r2 == r3) goto L_0x0026;
    L_0x0025:
        goto L_0x0029;
    L_0x0026:
        r1 = r1 + 1;
        goto L_0x000c;
    L_0x0029:
        return r0;
    L_0x002a:
        r4 = 1;
        return r4;
    L_0x002c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk.a(hk$b[], hk$b[]):boolean");
    }

    static float[] a(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                length = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, length);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] a(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    public static b[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            i = hk.a(str, i);
            String trim = str.substring(i2, i).trim();
            if (trim.length() > 0) {
                hk.a(arrayList, trim.charAt(0), hk.c(trim));
            }
            i2 = i;
            i++;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            hk.a(arrayList, str.charAt(i2), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x005f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A:{LOOP_END, Catch:{ NumberFormatException -> 0x0080 }, LOOP:1: B:8:0x002d->B:28:0x005c} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A:{Catch:{ NumberFormatException -> 0x0080 }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A:{Catch:{ NumberFormatException -> 0x0080 }} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A:{Catch:{ NumberFormatException -> 0x0080 }} */
    /* JADX WARNING: Missing block: B:20:0x004c, code skipped:
            r2.b = true;
     */
    /* JADX WARNING: Missing block: B:24:0x0054, code skipped:
            r8 = null;
     */
    private static float[] c(java.lang.String r13) {
        /*
        r0 = 0;
        r1 = r13.charAt(r0);
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r1 == r2) goto L_0x009a;
    L_0x0009:
        r1 = r13.charAt(r0);
        r2 = 90;
        if (r1 != r2) goto L_0x0013;
    L_0x0011:
        goto L_0x009a;
    L_0x0013:
        r1 = r13.length();	 Catch:{ NumberFormatException -> 0x0080 }
        r1 = new float[r1];	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = new hk$a;	 Catch:{ NumberFormatException -> 0x0080 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = r13.length();	 Catch:{ NumberFormatException -> 0x0080 }
        r4 = 1;
        r5 = 1;
        r6 = 0;
    L_0x0025:
        if (r5 >= r3) goto L_0x007b;
    L_0x0027:
        r2.b = r0;	 Catch:{ NumberFormatException -> 0x0080 }
        r7 = r5;
        r8 = 0;
        r9 = 0;
        r10 = 0;
    L_0x002d:
        r11 = r13.length();	 Catch:{ NumberFormatException -> 0x0080 }
        if (r7 >= r11) goto L_0x005f;
    L_0x0033:
        r11 = r13.charAt(r7);	 Catch:{ NumberFormatException -> 0x0080 }
        r12 = 32;
        if (r11 == r12) goto L_0x0058;
    L_0x003b:
        r12 = 69;
        if (r11 == r12) goto L_0x0056;
    L_0x003f:
        r12 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r11 == r12) goto L_0x0056;
    L_0x0043:
        switch(r11) {
            case 44: goto L_0x0058;
            case 45: goto L_0x004f;
            case 46: goto L_0x0047;
            default: goto L_0x0046;
        };	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x0046:
        goto L_0x0054;
    L_0x0047:
        if (r9 != 0) goto L_0x004c;
    L_0x0049:
        r8 = 0;
        r9 = 1;
        goto L_0x005a;
    L_0x004c:
        r2.b = r4;	 Catch:{ NumberFormatException -> 0x0080 }
        goto L_0x0058;
    L_0x004f:
        if (r7 == r5) goto L_0x0054;
    L_0x0051:
        if (r8 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x004c;
    L_0x0054:
        r8 = 0;
        goto L_0x005a;
    L_0x0056:
        r8 = 1;
        goto L_0x005a;
    L_0x0058:
        r8 = 0;
        r10 = 1;
    L_0x005a:
        if (r10 != 0) goto L_0x005f;
    L_0x005c:
        r7 = r7 + 1;
        goto L_0x002d;
    L_0x005f:
        r2.a = r7;	 Catch:{ NumberFormatException -> 0x0080 }
        r7 = r2.a;	 Catch:{ NumberFormatException -> 0x0080 }
        if (r5 >= r7) goto L_0x0072;
    L_0x0065:
        r8 = r6 + 1;
        r5 = r13.substring(r5, r7);	 Catch:{ NumberFormatException -> 0x0080 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x0080 }
        r1[r6] = r5;	 Catch:{ NumberFormatException -> 0x0080 }
        r6 = r8;
    L_0x0072:
        r5 = r2.b;	 Catch:{ NumberFormatException -> 0x0080 }
        if (r5 == 0) goto L_0x0078;
    L_0x0076:
        r5 = r7;
        goto L_0x0025;
    L_0x0078:
        r5 = r7 + 1;
        goto L_0x0025;
    L_0x007b:
        r13 = defpackage.hk.a(r1, r6);	 Catch:{ NumberFormatException -> 0x0080 }
        return r13;
    L_0x0080:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "error in parsing \"";
        r2.<init>(r3);
        r2.append(r13);
        r13 = "\"";
        r2.append(r13);
        r13 = r2.toString();
        r1.<init>(r13, r0);
        throw r1;
    L_0x009a:
        r13 = new float[r0];
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk.c(java.lang.String):float[]");
    }
}
