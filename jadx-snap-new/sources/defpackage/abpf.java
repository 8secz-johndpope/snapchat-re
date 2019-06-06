package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;
import java.util.Random;

/* renamed from: abpf */
public final class abpf {
    private static final Random a = new Random();

    public static double a(List<Integer> list) {
        double d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (Integer intValue : list) {
            int intValue2 = intValue.intValue();
            double d4 = (double) intValue2;
            Double.isNaN(d4);
            d2 += d4;
            d = (double) (intValue2 * intValue2);
            Double.isNaN(d);
            d3 += d;
        }
        d = (double) list.size();
        Double.isNaN(d);
        d2 /= d;
        d = (double) list.size();
        Double.isNaN(d);
        return Math.sqrt((d3 / d) - (d2 * d2));
    }

    public static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static int a(int... iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < 2; i2++) {
            i = Math.min(iArr[1], i);
        }
        return i;
    }

    public static long a(long... jArr) {
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            j = Math.max(jArr[i], j);
        }
        return j;
    }

    public static Random a() {
        return a;
    }

    public static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-6f;
    }

    public static float b(float f, float f2, float f3) {
        f2 = MapboxConstants.MINIMUM_ZOOM - f2;
        f3 = f - f3;
        double d = (double) ((MapboxConstants.MINIMUM_ZOOM * f2) + (f * f3));
        double sqrt = Math.sqrt((Math.pow(0.0d, 2.0d) + Math.pow((double) f, 2.0d)) * (Math.pow((double) f2, 2.0d) + Math.pow((double) f3, 2.0d)));
        Double.isNaN(d);
        return (float) Math.toDegrees(Math.acos(d / sqrt));
    }
}
