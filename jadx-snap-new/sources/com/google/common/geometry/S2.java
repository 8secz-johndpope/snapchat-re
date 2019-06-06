package com.google.common.geometry;

import com.google.common.base.Preconditions;

public final class S2 {
    private static final int[][] IJ_TO_POS = new int[][]{new int[]{0, 1, 3, 2}, new int[]{0, 3, 1, 2}, new int[]{2, 3, 1, 0}, new int[]{2, 1, 3, 0}};
    public static final double M_SQRT2 = Math.sqrt(2.0d);
    private static final int[][] POS_TO_IJ = new int[][]{new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
    private static final int[] POS_TO_ORIENTATION = new int[]{1, 0, 0, 3};

    public static class Metric {
        private final double deriv;
        private final int dim;

        public Metric(int i, double d) {
            this.deriv = d;
            this.dim = i;
        }

        public double deriv() {
            return this.deriv;
        }

        public double getValue(int i) {
            return StrictMath.scalb(this.deriv, this.dim * (1 - i));
        }
    }

    public static int posToIJ(int i, int i2) {
        boolean z = true;
        boolean z2 = i >= 0 && i < 4;
        Preconditions.checkArgument(z2);
        if (i2 < 0 || i2 >= 4) {
            z = false;
        }
        Preconditions.checkArgument(z);
        return POS_TO_IJ[i][i2];
    }

    public static int posToOrientation(int i) {
        boolean z = i >= 0 && i < 4;
        Preconditions.checkArgument(z);
        return POS_TO_ORIENTATION[i];
    }
}
