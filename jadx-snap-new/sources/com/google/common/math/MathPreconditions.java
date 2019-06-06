package com.google.common.math;

import defpackage.ppy;

final class MathPreconditions {
    static void checkNoOverflow(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder("overflow: ");
            stringBuilder.append(str);
            stringBuilder.append("(");
            stringBuilder.append(i);
            stringBuilder.append(ppy.d);
            stringBuilder.append(i2);
            stringBuilder.append(")");
            throw new ArithmeticException(stringBuilder.toString());
        }
    }

    static void checkNoOverflow(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder("overflow: ");
            stringBuilder.append(str);
            stringBuilder.append("(");
            stringBuilder.append(j);
            stringBuilder.append(ppy.d);
            stringBuilder.append(j2);
            stringBuilder.append(")");
            throw new ArithmeticException(stringBuilder.toString());
        }
    }

    static int checkPositive(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(i);
        stringBuilder.append(") must be > 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static void checkRoundingUnnecessary(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
