package com.addlive.djinni;

import java.nio.ByteBuffer;

public final class VideoFrame {
    final PixelFormat mFormat;
    final int mHeight;
    final long mNativeBuffer;
    final ByteBuffer mPlane0;
    final ByteBuffer mPlane1;
    final ByteBuffer mPlane2;
    final long mPts;
    final int mStride0;
    final int mStride1;
    final int mStride2;
    final int mWidth;

    public VideoFrame(PixelFormat pixelFormat, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, long j2) {
        this.mFormat = pixelFormat;
        this.mWidth = i;
        this.mHeight = i2;
        this.mStride0 = i3;
        this.mStride1 = i4;
        this.mStride2 = i5;
        this.mPlane0 = byteBuffer;
        this.mPlane1 = byteBuffer2;
        this.mPlane2 = byteBuffer3;
        this.mPts = j;
        this.mNativeBuffer = j2;
    }

    public final PixelFormat getFormat() {
        return this.mFormat;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final long getNativeBuffer() {
        return this.mNativeBuffer;
    }

    public final ByteBuffer getPlane0() {
        return this.mPlane0;
    }

    public final ByteBuffer getPlane1() {
        return this.mPlane1;
    }

    public final ByteBuffer getPlane2() {
        return this.mPlane2;
    }

    public final long getPts() {
        return this.mPts;
    }

    public final int getStride0() {
        return this.mStride0;
    }

    public final int getStride1() {
        return this.mStride1;
    }

    public final int getStride2() {
        return this.mStride2;
    }

    public final int getWidth() {
        return this.mWidth;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VideoFrame{mFormat=");
        stringBuilder.append(this.mFormat);
        stringBuilder.append(",mWidth=");
        stringBuilder.append(this.mWidth);
        stringBuilder.append(",mHeight=");
        stringBuilder.append(this.mHeight);
        stringBuilder.append(",mStride0=");
        stringBuilder.append(this.mStride0);
        stringBuilder.append(",mStride1=");
        stringBuilder.append(this.mStride1);
        stringBuilder.append(",mStride2=");
        stringBuilder.append(this.mStride2);
        stringBuilder.append(",mPlane0=");
        stringBuilder.append(this.mPlane0);
        stringBuilder.append(",mPlane1=");
        stringBuilder.append(this.mPlane1);
        stringBuilder.append(",mPlane2=");
        stringBuilder.append(this.mPlane2);
        stringBuilder.append(",mPts=");
        stringBuilder.append(this.mPts);
        stringBuilder.append(",mNativeBuffer=");
        stringBuilder.append(this.mNativeBuffer);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
