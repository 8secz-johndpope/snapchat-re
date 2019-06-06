package com.snapchat.client.network_types;

import java.util.ArrayList;

public final class RankingSignals {
    final DeprecatedRankingSignal mDeprecatedRankingSignal;
    final ArrayList<RankingSignal> mRankingSignals;

    public RankingSignals(ArrayList<RankingSignal> arrayList, DeprecatedRankingSignal deprecatedRankingSignal) {
        this.mRankingSignals = arrayList;
        this.mDeprecatedRankingSignal = deprecatedRankingSignal;
    }

    public final DeprecatedRankingSignal getDeprecatedRankingSignal() {
        return this.mDeprecatedRankingSignal;
    }

    public final ArrayList<RankingSignal> getRankingSignals() {
        return this.mRankingSignals;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RankingSignals{mRankingSignals=");
        stringBuilder.append(this.mRankingSignals);
        stringBuilder.append(",mDeprecatedRankingSignal=");
        stringBuilder.append(this.mDeprecatedRankingSignal);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
