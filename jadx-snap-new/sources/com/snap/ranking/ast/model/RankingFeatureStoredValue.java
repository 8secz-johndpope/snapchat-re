package com.snap.ranking.ast.model;

import java.util.List;

public class RankingFeatureStoredValue {
    public final List<RankingFeature> features;

    public RankingFeatureStoredValue(List<RankingFeature> list) {
        this.features = list;
    }
}
