package com.looksery.sdk.domain;

public final class Size {
    private static final int ALIGN = 32;
    private static final int MIN_ENCODER_BUFFER_SIZE = 25600;
    private static final Size OPTIMAL_FOR_PROCESSING = new Size(600, 800);
    public final int height;
    public final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final Size adjustForVideoEncoding() {
        int i = this.width / 16;
        int i2 = this.height / 16;
        int i3 = ((i * i2) << 4) << 4;
        if (i3 < MIN_ENCODER_BUFFER_SIZE) {
            double d = (double) i3;
            Double.isNaN(d);
            double sqrt = Math.sqrt(25600.0d / d);
            double d2 = (double) i;
            Double.isNaN(d2);
            i = (int) Math.ceil(d2 * sqrt);
            d2 = (double) i2;
            Double.isNaN(d2);
            i2 = (int) Math.ceil(d2 * sqrt);
        }
        return new Size(i << 4, i2 << 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public final Size flipAxes() {
        return new Size(this.height, this.width);
    }

    public final float getAspectRatio() {
        return ((float) getHeight()) / ((float) getWidth());
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final Size optimizeForProcessing() {
        Size size = OPTIMAL_FOR_PROCESSING;
        double d = (double) size.width;
        double d2 = (double) size.height;
        Double.isNaN(d);
        Double.isNaN(d2);
        d *= d2;
        d2 = (double) this.width;
        double d3 = (double) this.height;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double sqrt = Math.sqrt(d / (d2 * d3));
        if (sqrt >= 1.0d) {
            return this;
        }
        int i = this.width;
        d2 = (double) i;
        Double.isNaN(d2);
        int i2 = (((int) (d2 * sqrt)) / 32) << 5;
        d2 = (double) i2;
        d = (double) i;
        Double.isNaN(d2);
        Double.isNaN(d);
        d2 /= d;
        d = (double) this.height;
        Double.isNaN(d);
        return new Size(i2, (((int) (d2 * d)) / 4) << 2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Size { ");
        stringBuilder.append(this.width);
        stringBuilder.append("x");
        stringBuilder.append(this.height);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
