package com.snapcv.fastdnn;

public final class Options {
    private float[] mean;
    private boolean meanSubtractionEnabled = false;
    private float scale = 1.0f;
    private boolean scaleEnabled = false;

    public final float[] getMean() {
        return this.mean;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean isMeanSubtractionEnabled() {
        return this.meanSubtractionEnabled;
    }

    public final boolean isScaleEnabled() {
        return this.scaleEnabled;
    }

    public final void setMean(float[] fArr) {
        this.mean = fArr;
        this.meanSubtractionEnabled = true;
    }

    public final void setScale(float f) {
        this.scale = f;
        this.scaleEnabled = true;
    }
}
