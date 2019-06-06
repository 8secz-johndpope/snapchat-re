package com.snapcv.fastdnn;

public final class TensorShape {
    private int batches;
    private int channels;
    private int height;
    private int width;

    public TensorShape() {
        this.width = 0;
        this.height = 0;
        this.channels = 0;
        this.batches = 0;
    }

    public TensorShape(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.channels = i3;
        this.batches = i4;
    }

    public final int getBatches() {
        return this.batches;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getTotalElementCount() {
        return ((this.batches * this.height) * this.width) * this.channels;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setBatches(int i) {
        this.batches = i;
    }

    public final void setChannels(int i) {
        this.channels = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
