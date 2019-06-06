package com.mapbox.services.commons.geojson;

import java.util.Arrays;
import java.util.List;

public class FeatureCollection extends BaseFeatureCollection {
    private final List<Feature> features;

    protected FeatureCollection(List<Feature> list) {
        this.features = list;
    }

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new FeatureCollection(list);
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new FeatureCollection(Arrays.asList(featureArr));
    }

    public List<Feature> getFeatures() {
        return this.features;
    }
}
