package com.addlive.djinni;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class FrameData {
    final ArrayList<ByteBuffer> mFrameData;
    final int mHeight;
    final boolean mKeyFrame;
    final long mTimestamp;
    final int mWidth;

    public FrameData(ArrayList<ByteBuffer> arrayList, int i, int i2, long j, boolean z) {
        this.mFrameData = arrayList;
        this.mWidth = i;
        this.mHeight = i2;
        this.mTimestamp = j;
        this.mKeyFrame = z;
    }

    public final ArrayList<ByteBuffer> getFrameData() {
        return this.mFrameData;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final boolean getKeyFrame() {
        return this.mKeyFrame;
    }

    public final long getTimestamp() {
        return this.mTimestamp;
    }

    public final int getWidth() {
        return this.mWidth;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FrameData{mFrameData=");
        stringBuilder.append(this.mFrameData);
        stringBuilder.append(",mWidth=");
        stringBuilder.append(this.mWidth);
        stringBuilder.append(",mHeight=");
        stringBuilder.append(this.mHeight);
        stringBuilder.append(",mTimestamp=");
        stringBuilder.append(this.mTimestamp);
        stringBuilder.append(",mKeyFrame=");
        stringBuilder.append(this.mKeyFrame);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
