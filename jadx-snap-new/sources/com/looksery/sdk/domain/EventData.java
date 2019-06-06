package com.looksery.sdk.domain;

public class EventData {
    private int mCount;
    private String mInteractionName;
    private String mInteractionValue;
    private boolean mIsFrontFacedCamera;
    private double mMaxTime;
    private int mMaxTimeCount;
    private int mSequence;
    private double mTotalTime;

    public EventData(String str, int i, int i2, double d, double d2, String str2, int i3, boolean z) {
        this.mInteractionName = str;
        this.mCount = i;
        this.mMaxTimeCount = i2;
        this.mTotalTime = d;
        this.mMaxTime = d2;
        this.mInteractionValue = str2;
        this.mSequence = i3;
        this.mIsFrontFacedCamera = z;
    }

    public int getCount() {
        return this.mCount;
    }

    public String getInteractionName() {
        return this.mInteractionName;
    }

    public String getInteractionValue() {
        return this.mInteractionValue;
    }

    public double getMaxTime() {
        return this.mMaxTime;
    }

    public int getMaxTimeCount() {
        return this.mMaxTimeCount;
    }

    public int getSequence() {
        return this.mSequence;
    }

    public double getTotalTime() {
        return this.mTotalTime;
    }

    public boolean isFrontFacedCamera() {
        return this.mIsFrontFacedCamera;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EventData{interactionName='");
        stringBuilder.append(this.mInteractionName);
        stringBuilder.append('\'');
        stringBuilder.append(", count=");
        stringBuilder.append(this.mCount);
        stringBuilder.append(", maxTimeCount=");
        stringBuilder.append(this.mMaxTimeCount);
        stringBuilder.append(", totalTime=");
        stringBuilder.append(this.mTotalTime);
        stringBuilder.append(", maxTime=");
        stringBuilder.append(this.mMaxTime);
        stringBuilder.append(", interactionValue='");
        stringBuilder.append(this.mInteractionValue);
        stringBuilder.append('\'');
        stringBuilder.append(", sequence=");
        stringBuilder.append(this.mSequence);
        stringBuilder.append(", isFrontFacedCamera=");
        stringBuilder.append(this.mIsFrontFacedCamera);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
