package com.google.common.math;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.math.RoundingMode;
import org.opencv.imgproc.Imgproc;

public final class IntMath {
    static int[] biggestBinomials = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Imgproc.FLOODFILL_FIXED_RANGE, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    private static final int[] factorials = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static final int[] halfPowersOf10 = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    static final byte[] maxLog10ForLeadingZeros = new byte[]{(byte) 9, (byte) 9, (byte) 9, (byte) 8, (byte) 8, (byte) 8, (byte) 7, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 4, (byte) 4, (byte) 4, (byte) 3, (byte) 3, (byte) 3, (byte) 3, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    static final int[] powersOf10 = new int[]{1, 10, 100, MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: com.google.common.math.IntMath$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = new int[RoundingMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        static {
            /*
            r0 = java.math.RoundingMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$java$math$RoundingMode = r0;
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = java.math.RoundingMode.UNNECESSARY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = java.math.RoundingMode.DOWN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = java.math.RoundingMode.FLOOR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = java.math.RoundingMode.UP;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = java.math.RoundingMode.CEILING;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = java.math.RoundingMode.HALF_DOWN;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = java.math.RoundingMode.HALF_UP;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = $SwitchMap$java$math$RoundingMode;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = java.math.RoundingMode.HALF_EVEN;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath$AnonymousClass1.<clinit>():void");
        }
    }

    public static int checkedAdd(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        MathPreconditions.checkNoOverflow(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    /* JADX WARNING: Missing block: B:22:0x0044, code skipped:
            if (((r7 == java.math.RoundingMode.HALF_EVEN ? 1 : 0) & ((r0 & 1) != 0 ? 1 : 0)) != 0) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:23:0x0047, code skipped:
            if (r1 > 0) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:24:0x004a, code skipped:
            if (r5 > 0) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:25:0x004d, code skipped:
            if (r5 < 0) goto L_0x0058;
     */
    public static int divide(int r5, int r6, java.math.RoundingMode r7) {
        /*
        com.google.common.base.Preconditions.checkNotNull(r7);
        if (r6 == 0) goto L_0x005c;
    L_0x0005:
        r0 = r5 / r6;
        r1 = r6 * r0;
        r1 = r5 - r1;
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        return r0;
    L_0x000e:
        r5 = r5 ^ r6;
        r5 = r5 >> 31;
        r2 = 1;
        r5 = r5 | r2;
        r3 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        r4 = r7.ordinal();
        r3 = r3[r4];
        r4 = 0;
        switch(r3) {
            case 1: goto L_0x0050;
            case 2: goto L_0x0057;
            case 3: goto L_0x004d;
            case 4: goto L_0x0058;
            case 5: goto L_0x004a;
            case 6: goto L_0x0025;
            case 7: goto L_0x0025;
            case 8: goto L_0x0025;
            default: goto L_0x001f;
        };
    L_0x001f:
        r5 = new java.lang.AssertionError;
        r5.<init>();
        throw r5;
    L_0x0025:
        r1 = java.lang.Math.abs(r1);
        r6 = java.lang.Math.abs(r6);
        r6 = r6 - r1;
        r1 = r1 - r6;
        if (r1 != 0) goto L_0x0047;
    L_0x0031:
        r6 = java.math.RoundingMode.HALF_UP;
        if (r7 == r6) goto L_0x0058;
    L_0x0035:
        r6 = java.math.RoundingMode.HALF_EVEN;
        if (r7 != r6) goto L_0x003b;
    L_0x0039:
        r6 = 1;
        goto L_0x003c;
    L_0x003b:
        r6 = 0;
    L_0x003c:
        r7 = r0 & 1;
        if (r7 == 0) goto L_0x0042;
    L_0x0040:
        r7 = 1;
        goto L_0x0043;
    L_0x0042:
        r7 = 0;
    L_0x0043:
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0057;
    L_0x0046:
        goto L_0x0058;
    L_0x0047:
        if (r1 <= 0) goto L_0x0057;
    L_0x0049:
        goto L_0x0058;
    L_0x004a:
        if (r5 <= 0) goto L_0x0057;
    L_0x004c:
        goto L_0x0058;
    L_0x004d:
        if (r5 >= 0) goto L_0x0057;
    L_0x004f:
        goto L_0x0058;
    L_0x0050:
        if (r1 != 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0054;
    L_0x0053:
        r2 = 0;
    L_0x0054:
        com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r2);
    L_0x0057:
        r2 = 0;
    L_0x0058:
        if (r2 == 0) goto L_0x005b;
    L_0x005a:
        r0 = r0 + r5;
    L_0x005b:
        return r0;
    L_0x005c:
        r5 = new java.lang.ArithmeticException;
        r6 = "/ by zero";
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath.divide(int, int, java.math.RoundingMode):int");
    }

    public static boolean isPowerOfTwo(int i) {
        int i2 = 0;
        int i3 = i > 0 ? 1 : 0;
        if ((i & (i - 1)) == 0) {
            i2 = 1;
        }
        return i3 & i2;
    }

    static int lessThanBranchFree(int i, int i2) {
        return (((i - i2) ^ -1) ^ -1) >>> 31;
    }

    public static int log2(int i, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + lessThanBranchFree(-1257966797 >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
