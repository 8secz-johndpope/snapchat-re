package com.snapchat.client.graphene;

import java.util.ArrayList;

public final class StartupConfiguration {
    final ApplicationInformation mAppInfo;
    final int mBufferSizeBytes;
    final ArrayList<ArrayList<String>> mMetricNames;
    final ArrayList<String> mPartitions;
    final int mReservoirSize;

    public StartupConfiguration(int i, int i2, ApplicationInformation applicationInformation, ArrayList<String> arrayList, ArrayList<ArrayList<String>> arrayList2) {
        this.mBufferSizeBytes = i;
        this.mReservoirSize = i2;
        this.mAppInfo = applicationInformation;
        this.mPartitions = arrayList;
        this.mMetricNames = arrayList2;
    }

    public final ApplicationInformation getAppInfo() {
        return this.mAppInfo;
    }

    public final int getBufferSizeBytes() {
        return this.mBufferSizeBytes;
    }

    public final ArrayList<ArrayList<String>> getMetricNames() {
        return this.mMetricNames;
    }

    public final ArrayList<String> getPartitions() {
        return this.mPartitions;
    }

    public final int getReservoirSize() {
        return this.mReservoirSize;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupConfiguration{mBufferSizeBytes=");
        stringBuilder.append(this.mBufferSizeBytes);
        stringBuilder.append(",mReservoirSize=");
        stringBuilder.append(this.mReservoirSize);
        stringBuilder.append(",mAppInfo=");
        stringBuilder.append(this.mAppInfo);
        stringBuilder.append(",mPartitions=");
        stringBuilder.append(this.mPartitions);
        stringBuilder.append(",mMetricNames=");
        stringBuilder.append(this.mMetricNames);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
