package com.addlive.djinni;

import java.nio.ByteBuffer;

public final class DecodedImage {
    final int mHeight;
    final ByteBuffer mPlaneCb;
    final int mPlaneCbPixelStride;
    final int mPlaneCbRowStride;
    final ByteBuffer mPlaneCr;
    final int mPlaneCrPixelStride;
    final int mPlaneCrRowStride;
    final ByteBuffer mPlaneY;
    final int mPlaneYPixelStride;
    final int mPlaneYRowStride;
    final long mTimestamp;
    final int mWidth;

    public DecodedImage(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.mPlaneY = byteBuffer;
        this.mPlaneCb = byteBuffer2;
        this.mPlaneCr = byteBuffer3;
        this.mPlaneYPixelStride = i;
        this.mPlaneCbPixelStride = i2;
        this.mPlaneCrPixelStride = i3;
        this.mPlaneYRowStride = i4;
        this.mPlaneCbRowStride = i5;
        this.mPlaneCrRowStride = i6;
        this.mWidth = i7;
        this.mHeight = i8;
        this.mTimestamp = j;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final ByteBuffer getPlaneCb() {
        return this.mPlaneCb;
    }

    public final int getPlaneCbPixelStride() {
        return this.mPlaneCbPixelStride;
    }

    public final int getPlaneCbRowStride() {
        return this.mPlaneCbRowStride;
    }

    public final ByteBuffer getPlaneCr() {
        return this.mPlaneCr;
    }

    public final int getPlaneCrPixelStride() {
        return this.mPlaneCrPixelStride;
    }

    public final int getPlaneCrRowStride() {
        return this.mPlaneCrRowStride;
    }

    public final ByteBuffer getPlaneY() {
        return this.mPlaneY;
    }

    public final int getPlaneYPixelStride() {
        return this.mPlaneYPixelStride;
    }

    public final int getPlaneYRowStride() {
        return this.mPlaneYRowStride;
    }

    public final long getTimestamp() {
        return this.mTimestamp;
    }

    public final int getWidth() {
        return this.mWidth;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DecodedImage{mPlaneY=");
        stringBuilder.append(this.mPlaneY);
        stringBuilder.append(",mPlaneCb=");
        stringBuilder.append(this.mPlaneCb);
        stringBuilder.append(",mPlaneCr=");
        stringBuilder.append(this.mPlaneCr);
        stringBuilder.append(",mPlaneYPixelStride=");
        stringBuilder.append(this.mPlaneYPixelStride);
        stringBuilder.append(",mPlaneCbPixelStride=");
        stringBuilder.append(this.mPlaneCbPixelStride);
        stringBuilder.append(",mPlaneCrPixelStride=");
        stringBuilder.append(this.mPlaneCrPixelStride);
        stringBuilder.append(",mPlaneYRowStride=");
        stringBuilder.append(this.mPlaneYRowStride);
        stringBuilder.append(",mPlaneCbRowStride=");
        stringBuilder.append(this.mPlaneCbRowStride);
        stringBuilder.append(",mPlaneCrRowStride=");
        stringBuilder.append(this.mPlaneCrRowStride);
        stringBuilder.append(",mWidth=");
        stringBuilder.append(this.mWidth);
        stringBuilder.append(",mHeight=");
        stringBuilder.append(this.mHeight);
        stringBuilder.append(",mTimestamp=");
        stringBuilder.append(this.mTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
