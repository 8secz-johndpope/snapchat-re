package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.regex.Pattern;

public final class Doubles {
    static final Pattern FLOATING_POINT_PATTERN = fpPattern();

    private static Pattern fpPattern() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)");
        stringBuilder.append("(?:[eE][+-]?\\d+#)?[fFdD]?");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder("0[xX]");
        stringBuilder3.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        stringBuilder3.append("[pP][+-]?\\d+#[fFdD]?");
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder("[+-]?(?:NaN|Infinity|");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append("|");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")");
        return Pattern.compile(stringBuilder5.toString().replace("#", "+"));
    }

    public static boolean isFinite(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }

    public static double max(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.max(d, dArr[i]);
        }
        return d;
    }

    public static double min(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.min(d, dArr[i]);
        }
        return d;
    }
}
