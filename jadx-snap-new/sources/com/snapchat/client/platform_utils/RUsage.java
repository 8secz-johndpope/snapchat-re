package com.snapchat.client.platform_utils;

public final class RUsage {
    final long mHardPageFault;
    final long mInvoluntaryContextSwitch;
    final long mSoftPageFault;
    final long mSystemCpuTime;
    final long mUpTime;
    final long mUserCpuTime;
    final long mVoluntaryContextSwitch;

    public RUsage(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.mUserCpuTime = j;
        this.mSystemCpuTime = j2;
        this.mSoftPageFault = j3;
        this.mHardPageFault = j4;
        this.mVoluntaryContextSwitch = j5;
        this.mInvoluntaryContextSwitch = j6;
        this.mUpTime = j7;
    }

    public final long getHardPageFault() {
        return this.mHardPageFault;
    }

    public final long getInvoluntaryContextSwitch() {
        return this.mInvoluntaryContextSwitch;
    }

    public final long getSoftPageFault() {
        return this.mSoftPageFault;
    }

    public final long getSystemCpuTime() {
        return this.mSystemCpuTime;
    }

    public final long getUpTime() {
        return this.mUpTime;
    }

    public final long getUserCpuTime() {
        return this.mUserCpuTime;
    }

    public final long getVoluntaryContextSwitch() {
        return this.mVoluntaryContextSwitch;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RUsage{mUserCpuTime=");
        stringBuilder.append(this.mUserCpuTime);
        stringBuilder.append(",mSystemCpuTime=");
        stringBuilder.append(this.mSystemCpuTime);
        stringBuilder.append(",mSoftPageFault=");
        stringBuilder.append(this.mSoftPageFault);
        stringBuilder.append(",mHardPageFault=");
        stringBuilder.append(this.mHardPageFault);
        stringBuilder.append(",mVoluntaryContextSwitch=");
        stringBuilder.append(this.mVoluntaryContextSwitch);
        stringBuilder.append(",mInvoluntaryContextSwitch=");
        stringBuilder.append(this.mInvoluntaryContextSwitch);
        stringBuilder.append(",mUpTime=");
        stringBuilder.append(this.mUpTime);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
