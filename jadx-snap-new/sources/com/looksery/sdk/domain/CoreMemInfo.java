package com.looksery.sdk.domain;

public class CoreMemInfo {
    private final int mCpuMemoryCurrentBytes;
    private final int mCpuMemoryPeakBytes;
    private final int mGpuMemoryCurrentBytes;
    private final int mGpuMemoryPeakBytes;

    public CoreMemInfo(int i, int i2, int i3, int i4) {
        this.mCpuMemoryCurrentBytes = i;
        this.mCpuMemoryPeakBytes = i2;
        this.mGpuMemoryCurrentBytes = i3;
        this.mGpuMemoryPeakBytes = i4;
    }

    public int getCpuMemoryCurrentBytes() {
        return this.mCpuMemoryCurrentBytes;
    }

    public int getCpuMemoryPeakBytes() {
        return this.mCpuMemoryPeakBytes;
    }

    public int getGpuMemoryCurrentBytes() {
        return this.mGpuMemoryCurrentBytes;
    }

    public int getGpuMemoryPeakBytes() {
        return this.mGpuMemoryPeakBytes;
    }
}
