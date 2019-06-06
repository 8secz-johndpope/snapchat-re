package com.addlive.impl.video;

public class FrameRateFilter {
    private final long mFrameTimeGapThresholdNs;
    private long mLastFrameTimeNs = (-this.mFrameTimeGapThresholdNs);

    public FrameRateFilter(int i) {
        this.mFrameTimeGapThresholdNs = (long) (1000000000 / i);
    }

    public boolean canAcceptNewFrame(long j) {
        long j2 = j - this.mLastFrameTimeNs;
        long j3 = this.mFrameTimeGapThresholdNs;
        this.mLastFrameTimeNs = j - (j2 % j3);
        return j2 >= j3;
    }
}
