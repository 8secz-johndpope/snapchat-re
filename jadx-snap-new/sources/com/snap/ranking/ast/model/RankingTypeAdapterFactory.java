package com.snap.ranking.ast.model;

import com.google.gson.TypeAdapterFactory;

public abstract class RankingTypeAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_RankingTypeAdapterFactory();
    }
}
