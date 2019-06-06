package com.looksery.sdk.domain;

public final class ImuData {
    public final float[] acceleration;
    public final float[] rotationRate;
    public final double timestamp;

    public ImuData(double d, float[] fArr, float[] fArr2) {
        this.timestamp = d;
        this.acceleration = fArr2;
        this.rotationRate = fArr;
    }
}
