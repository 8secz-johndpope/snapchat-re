package com.snap.ranking.ast.model;

import android.util.LongSparseArray;

/* renamed from: com.snap.ranking.ast.model.$AutoValue_RankingFeatureMap */
abstract class C$AutoValue_RankingFeatureMap extends RankingFeatureMap {
    private final LongSparseArray<RankingFeature> clientSideFeatures;
    private final LongSparseArray<RankingFeature> serverSideFeatures;

    C$AutoValue_RankingFeatureMap(LongSparseArray<RankingFeature> longSparseArray, LongSparseArray<RankingFeature> longSparseArray2) {
        if (longSparseArray != null) {
            this.clientSideFeatures = longSparseArray;
            if (longSparseArray2 != null) {
                this.serverSideFeatures = longSparseArray2;
                return;
            }
            throw new NullPointerException("Null serverSideFeatures");
        }
        throw new NullPointerException("Null clientSideFeatures");
    }

    public LongSparseArray<RankingFeature> clientSideFeatures() {
        return this.clientSideFeatures;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RankingFeatureMap) {
            RankingFeatureMap rankingFeatureMap = (RankingFeatureMap) obj;
            return this.clientSideFeatures.equals(rankingFeatureMap.clientSideFeatures()) && this.serverSideFeatures.equals(rankingFeatureMap.serverSideFeatures());
        }
    }

    public int hashCode() {
        return ((this.clientSideFeatures.hashCode() ^ 1000003) * 1000003) ^ this.serverSideFeatures.hashCode();
    }

    public LongSparseArray<RankingFeature> serverSideFeatures() {
        return this.serverSideFeatures;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RankingFeatureMap{clientSideFeatures=");
        stringBuilder.append(this.clientSideFeatures);
        stringBuilder.append(", serverSideFeatures=");
        stringBuilder.append(this.serverSideFeatures);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
