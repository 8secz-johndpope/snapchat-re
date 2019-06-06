package com.snapchat.client.graphene;

public final class DiagnosticInfo {
    final int mCompactionOps;
    final int mCountersSize;
    final int mEnqueueIntervalMs;
    final int mEnqueueOps;
    final int mFlushIntervalMs;
    final int mHistogramsSize;
    final int mTimersSize;

    public DiagnosticInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mEnqueueOps = i;
        this.mCompactionOps = i2;
        this.mCountersSize = i3;
        this.mTimersSize = i4;
        this.mHistogramsSize = i5;
        this.mEnqueueIntervalMs = i6;
        this.mFlushIntervalMs = i7;
    }

    public final int getCompactionOps() {
        return this.mCompactionOps;
    }

    public final int getCountersSize() {
        return this.mCountersSize;
    }

    public final int getEnqueueIntervalMs() {
        return this.mEnqueueIntervalMs;
    }

    public final int getEnqueueOps() {
        return this.mEnqueueOps;
    }

    public final int getFlushIntervalMs() {
        return this.mFlushIntervalMs;
    }

    public final int getHistogramsSize() {
        return this.mHistogramsSize;
    }

    public final int getTimersSize() {
        return this.mTimersSize;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DiagnosticInfo{mEnqueueOps=");
        stringBuilder.append(this.mEnqueueOps);
        stringBuilder.append(",mCompactionOps=");
        stringBuilder.append(this.mCompactionOps);
        stringBuilder.append(",mCountersSize=");
        stringBuilder.append(this.mCountersSize);
        stringBuilder.append(",mTimersSize=");
        stringBuilder.append(this.mTimersSize);
        stringBuilder.append(",mHistogramsSize=");
        stringBuilder.append(this.mHistogramsSize);
        stringBuilder.append(",mEnqueueIntervalMs=");
        stringBuilder.append(this.mEnqueueIntervalMs);
        stringBuilder.append(",mFlushIntervalMs=");
        stringBuilder.append(this.mFlushIntervalMs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
