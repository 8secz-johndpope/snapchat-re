package com.mapbox.mapboxsdk.style.sources;

import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.services.commons.geojson.Feature;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VectorSource extends Source {
    public VectorSource(long j) {
        super(j);
    }

    public VectorSource(String str, TileSet tileSet) {
        initialize(str, tileSet.toValueObject());
    }

    public VectorSource(String str, String str2) {
        initialize(str, str2);
    }

    public VectorSource(String str, URL url) {
        this(str, url.toExternalForm());
    }

    private native Feature[] querySourceFeatures(String[] strArr, Object[] objArr);

    public native void finalize();

    public String getUrl() {
        return nativeGetUrl();
    }

    public native void initialize(String str, Object obj);

    public native String nativeGetUrl();

    public List<Feature> querySourceFeatures(String[] strArr, Statement statement) {
        Feature[] querySourceFeatures = querySourceFeatures(strArr, statement != null ? statement.toArray() : null);
        return querySourceFeatures != null ? Arrays.asList(querySourceFeatures) : new ArrayList();
    }
}
