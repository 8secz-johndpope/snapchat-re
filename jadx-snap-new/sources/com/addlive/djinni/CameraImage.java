package com.addlive.djinni;

import java.nio.ByteBuffer;

public final class CameraImage {
    final int mDeviceOrientation;
    final int mFormat;
    final int mHeight;
    final int mOrientation;
    final ByteBuffer mPlaneCb;
    final int mPlaneCbStride;
    final ByteBuffer mPlaneCr;
    final int mPlaneCrStride;
    final ByteBuffer mPlaneY;
    final int mPlaneYStride;
    final long mTimestamp;
    final int mWidth;

    public CameraImage(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.mPlaneY = byteBuffer;
        this.mPlaneCb = byteBuffer2;
        this.mPlaneCr = byteBuffer3;
        this.mPlaneYStride = i;
        this.mPlaneCbStride = i2;
        this.mPlaneCrStride = i3;
        this.mWidth = i4;
        this.mHeight = i5;
        this.mFormat = i6;
        this.mOrientation = i7;
        this.mDeviceOrientation = i8;
        this.mTimestamp = j;
    }

    public final int getDeviceOrientation() {
        return this.mDeviceOrientation;
    }

    public final int getFormat() {
        return this.mFormat;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final int getOrientation() {
        return this.mOrientation;
    }

    public final ByteBuffer getPlaneCb() {
        return this.mPlaneCb;
    }

    public final int getPlaneCbStride() {
        return this.mPlaneCbStride;
    }

    public final ByteBuffer getPlaneCr() {
        return this.mPlaneCr;
    }

    public final int getPlaneCrStride() {
        return this.mPlaneCrStride;
    }

    public final ByteBuffer getPlaneY() {
        return this.mPlaneY;
    }

    public final int getPlaneYStride() {
        return this.mPlaneYStride;
    }

    public final long getTimestamp() {
        return this.mTimestamp;
    }

    public final int getWidth() {
        return this.mWidth;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraImage{mPlaneY=");
        stringBuilder.append(this.mPlaneY);
        stringBuilder.append(",mPlaneCb=");
        stringBuilder.append(this.mPlaneCb);
        stringBuilder.append(",mPlaneCr=");
        stringBuilder.append(this.mPlaneCr);
        stringBuilder.append(",mPlaneYStride=");
        stringBuilder.append(this.mPlaneYStride);
        stringBuilder.append(",mPlaneCbStride=");
        stringBuilder.append(this.mPlaneCbStride);
        stringBuilder.append(",mPlaneCrStride=");
        stringBuilder.append(this.mPlaneCrStride);
        stringBuilder.append(",mWidth=");
        stringBuilder.append(this.mWidth);
        stringBuilder.append(",mHeight=");
        stringBuilder.append(this.mHeight);
        stringBuilder.append(",mFormat=");
        stringBuilder.append(this.mFormat);
        stringBuilder.append(",mOrientation=");
        stringBuilder.append(this.mOrientation);
        stringBuilder.append(",mDeviceOrientation=");
        stringBuilder.append(this.mDeviceOrientation);
        stringBuilder.append(",mTimestamp=");
        stringBuilder.append(this.mTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
