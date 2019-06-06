package com.mapbox.mapboxsdk.style.sources;

import com.brightcove.player.media.MediaService;
import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.services.commons.geojson.Feature;
import com.mapbox.services.commons.geojson.FeatureCollection;
import com.mapbox.services.commons.geojson.Geometry;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeoJsonSource extends Source {
    public GeoJsonSource(long j) {
        super(j);
    }

    public GeoJsonSource(String str) {
        initialize(str, null);
        setGeoJson(FeatureCollection.fromFeatures(new ArrayList()));
    }

    public GeoJsonSource(String str, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(FeatureCollection.fromFeatures(new ArrayList()));
    }

    public GeoJsonSource(String str, Feature feature) {
        initialize(str, null);
        setGeoJson(feature);
    }

    public GeoJsonSource(String str, Feature feature, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(feature);
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection) {
        initialize(str, null);
        setGeoJson(featureCollection);
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(featureCollection);
    }

    public GeoJsonSource(String str, Geometry geometry) {
        initialize(str, null);
        setGeoJson(geometry);
    }

    public GeoJsonSource(String str, Geometry geometry, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(geometry);
    }

    public GeoJsonSource(String str, String str2) {
        if (str2 == null || str2.startsWith(MediaService.DEFAULT_MEDIA_DELIVERY)) {
            throw new IllegalArgumentException("Expected a raw json body");
        }
        initialize(str, null);
        setGeoJson(str2);
    }

    public GeoJsonSource(String str, String str2, GeoJsonOptions geoJsonOptions) {
        if (str2 == null || str2.startsWith(MediaService.DEFAULT_MEDIA_DELIVERY)) {
            throw new IllegalArgumentException("Expected a raw json body");
        }
        initialize(str, geoJsonOptions);
        setGeoJson(str2);
    }

    public GeoJsonSource(String str, URL url) {
        initialize(str, null);
        nativeSetUrl(url.toExternalForm());
    }

    public GeoJsonSource(String str, URL url, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        nativeSetUrl(url.toExternalForm());
    }

    private native void nativeSetFeature(Feature feature);

    private native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    private native void nativeSetGeoJsonString(String str);

    private native void nativeSetGeometry(Geometry<?> geometry);

    private native Feature[] querySourceFeatures(Object[] objArr);

    public native void finalize();

    public String getUrl() {
        return nativeGetUrl();
    }

    public native void initialize(String str, Object obj);

    public native String nativeGetUrl();

    public native void nativeSetUrl(String str);

    public List<Feature> querySourceFeatures(Statement statement) {
        Feature[] querySourceFeatures = querySourceFeatures(statement != null ? statement.toArray() : null);
        return querySourceFeatures != null ? Arrays.asList(querySourceFeatures) : new ArrayList();
    }

    public void setGeoJson(Feature feature) {
        nativeSetFeature(feature);
    }

    public void setGeoJson(FeatureCollection featureCollection) {
        nativeSetFeatureCollection(featureCollection);
    }

    public void setGeoJson(Geometry<?> geometry) {
        nativeSetGeometry(geometry);
    }

    public void setGeoJson(String str) {
        nativeSetGeoJsonString(str);
    }

    public void setUrl(String str) {
        nativeSetUrl(str);
    }

    public void setUrl(URL url) {
        setUrl(url.toExternalForm());
    }
}
