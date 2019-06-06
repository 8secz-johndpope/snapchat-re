package com.google.common.math;

import com.google.common.base.Preconditions;

final class DoubleUtils {
    static double ensureNonNegative(double d) {
        Preconditions.checkArgument(Double.isNaN(d) ^ 1);
        return d > 0.0d ? d : 0.0d;
    }
}
