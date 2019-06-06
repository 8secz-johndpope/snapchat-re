package com.snap.ranking.ast.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class AutoValueGson_RankingTypeAdapterFactory extends RankingTypeAdapterFactory {
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return RankingFeatureMap.class.isAssignableFrom(typeToken.getRawType()) ? RankingFeatureMap.typeAdapter(gson) : null;
    }
}
