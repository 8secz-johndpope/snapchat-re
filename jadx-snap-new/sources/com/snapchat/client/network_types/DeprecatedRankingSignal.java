package com.snapchat.client.network_types;

public final class DeprecatedRankingSignal {
    final long mConcurrencyControlPriority;
    final boolean mIsUserInitiated;
    final long mPriority;
    final double mRequestTimestamp;
    final boolean mWifiOnly;

    public DeprecatedRankingSignal(boolean z, boolean z2, long j, double d, long j2) {
        this.mWifiOnly = z;
        this.mIsUserInitiated = z2;
        this.mPriority = j;
        this.mRequestTimestamp = d;
        this.mConcurrencyControlPriority = j2;
    }

    public final long getConcurrencyControlPriority() {
        return this.mConcurrencyControlPriority;
    }

    public final boolean getIsUserInitiated() {
        return this.mIsUserInitiated;
    }

    public final long getPriority() {
        return this.mPriority;
    }

    public final double getRequestTimestamp() {
        return this.mRequestTimestamp;
    }

    public final boolean getWifiOnly() {
        return this.mWifiOnly;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeprecatedRankingSignal{mWifiOnly=");
        stringBuilder.append(this.mWifiOnly);
        stringBuilder.append(",mIsUserInitiated=");
        stringBuilder.append(this.mIsUserInitiated);
        stringBuilder.append(",mPriority=");
        stringBuilder.append(this.mPriority);
        stringBuilder.append(",mRequestTimestamp=");
        stringBuilder.append(this.mRequestTimestamp);
        stringBuilder.append(",mConcurrencyControlPriority=");
        stringBuilder.append(this.mConcurrencyControlPriority);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
