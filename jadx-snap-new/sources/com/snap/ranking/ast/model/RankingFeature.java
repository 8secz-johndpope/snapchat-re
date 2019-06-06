package com.snap.ranking.ast.model;

import java.util.Objects;

public class RankingFeature {
    public final String featureName;
    public final SignalIdentifierType identifierType;
    public final int key;
    public final float value;

    public enum SignalIdentifierType {
        CLIENT_SIDE_SIGNAL,
        SERVER_SIDE_SIGNAL
    }

    private RankingFeature(int i, SignalIdentifierType signalIdentifierType, float f, String str) {
        this.key = i;
        this.identifierType = signalIdentifierType;
        this.value = f;
        this.featureName = str;
    }

    public static RankingFeature createClientFeature(int i, float f, String str) {
        return new RankingFeature(i, SignalIdentifierType.CLIENT_SIDE_SIGNAL, f, str);
    }

    public static RankingFeature createServerFeature(int i, float f, String str) {
        return new RankingFeature(i, SignalIdentifierType.SERVER_SIDE_SIGNAL, f, str);
    }

    private boolean isEqualTo(RankingFeature rankingFeature) {
        return this.key == rankingFeature.key && this.identifierType == rankingFeature.identifierType && this.value == rankingFeature.value && this.featureName.equals(rankingFeature.featureName);
    }

    public boolean equals(Object obj) {
        return (obj instanceof RankingFeature) && isEqualTo((RankingFeature) obj);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.key), this.identifierType, Float.valueOf(this.value), this.featureName});
    }

    public String toString() {
        SignalIdentifierType signalIdentifierType = this.identifierType;
        String name = signalIdentifierType == null ? "null" : signalIdentifierType.name();
        StringBuilder stringBuilder = new StringBuilder("RankingFeature { ");
        stringBuilder.append(this.featureName);
        stringBuilder.append("/");
        stringBuilder.append(name);
        stringBuilder.append(" : ");
        stringBuilder.append(this.value);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
