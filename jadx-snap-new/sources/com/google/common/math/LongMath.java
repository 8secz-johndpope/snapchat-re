package com.google.common.math;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import org.opencv.imgproc.Imgproc;

public final class LongMath {
    static final int[] biggestBinomials = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    static final int[] biggestSimpleBinomials = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, Imgproc.COLOR_COLORCVT_MAX, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    static final long[] factorials = new long[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final long[] halfPowersOf10 = new long[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final byte[] maxLog10ForLeadingZeros = new byte[]{(byte) 19, (byte) 18, (byte) 18, (byte) 18, (byte) 18, (byte) 17, (byte) 17, (byte) 17, (byte) 16, (byte) 16, (byte) 16, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 14, (byte) 14, (byte) 14, (byte) 13, (byte) 13, (byte) 13, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 11, (byte) 11, (byte) 11, (byte) 10, (byte) 10, (byte) 10, (byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 8, (byte) 8, (byte) 8, (byte) 7, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 4, (byte) 4, (byte) 4, (byte) 3, (byte) 3, (byte) 3, (byte) 3, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0};
    private static final long[][] millerRabinBaseSets = new long[][]{new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};
    static final long[] powersOf10 = new long[]{1, 10, 100, 1000, TelemetryConstants.FLUSH_DELAY_MS, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    public static long checkedAdd(long j, long j2) {
        long j3 = j + j2;
        int i = 1;
        int i2 = (j ^ j2) < 0 ? 1 : 0;
        if ((j ^ j3) < 0) {
            i = 0;
        }
        MathPreconditions.checkNoOverflow(i2 | i, "checkedAdd", j, j2);
        return j3;
    }
}
