package com.snap.ranking.ast.model;

import android.util.LongSparseArray;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class AutoValue_RankingFeatureMap extends C$AutoValue_RankingFeatureMap {

    public static final class GsonTypeAdapter extends TypeAdapter<RankingFeatureMap> {
        private final TypeAdapter<LongSparseArray<RankingFeature>> clientSideFeaturesAdapter;
        private LongSparseArray<RankingFeature> defaultClientSideFeatures = null;
        private LongSparseArray<RankingFeature> defaultServerSideFeatures = null;
        private final TypeAdapter<LongSparseArray<RankingFeature>> serverSideFeaturesAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.clientSideFeaturesAdapter = gson.getAdapter(TypeToken.getParameterized(LongSparseArray.class, RankingFeature.class));
            this.serverSideFeaturesAdapter = gson.getAdapter(TypeToken.getParameterized(LongSparseArray.class, RankingFeature.class));
        }

        public final RankingFeatureMap read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LongSparseArray longSparseArray = this.defaultClientSideFeatures;
            LongSparseArray longSparseArray2 = this.defaultServerSideFeatures;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    int i = -1;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1816015329) {
                        if (hashCode == -1071934057 && nextName.equals("serverSideFeatures")) {
                            i = 1;
                        }
                    } else if (nextName.equals("clientSideFeatures")) {
                        i = 0;
                    }
                    if (i == 0) {
                        longSparseArray = (LongSparseArray) this.clientSideFeaturesAdapter.read(jsonReader);
                    } else if (i != 1) {
                        jsonReader.skipValue();
                    } else {
                        longSparseArray2 = (LongSparseArray) this.serverSideFeaturesAdapter.read(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RankingFeatureMap(longSparseArray, longSparseArray2);
        }

        public final GsonTypeAdapter setDefaultClientSideFeatures(LongSparseArray<RankingFeature> longSparseArray) {
            this.defaultClientSideFeatures = longSparseArray;
            return this;
        }

        public final GsonTypeAdapter setDefaultServerSideFeatures(LongSparseArray<RankingFeature> longSparseArray) {
            this.defaultServerSideFeatures = longSparseArray;
            return this;
        }

        public final void write(JsonWriter jsonWriter, RankingFeatureMap rankingFeatureMap) {
            if (rankingFeatureMap == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("clientSideFeatures");
            this.clientSideFeaturesAdapter.write(jsonWriter, rankingFeatureMap.clientSideFeatures());
            jsonWriter.name("serverSideFeatures");
            this.serverSideFeaturesAdapter.write(jsonWriter, rankingFeatureMap.serverSideFeatures());
            jsonWriter.endObject();
        }
    }

    AutoValue_RankingFeatureMap(LongSparseArray<RankingFeature> longSparseArray, LongSparseArray<RankingFeature> longSparseArray2) {
        super(longSparseArray, longSparseArray2);
    }
}
