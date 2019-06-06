package com.mapbox.mapboxsdk.style.sources;

import java.net.URL;

public class RasterSource extends Source {
    public static final int DEFAULT_TILE_SIZE = 512;

    public RasterSource(long j) {
        super(j);
    }

    public RasterSource(String str, TileSet tileSet) {
        initialize(str, tileSet.toValueObject(), DEFAULT_TILE_SIZE);
    }

    public RasterSource(String str, TileSet tileSet, int i) {
        initialize(str, tileSet.toValueObject(), i);
    }

    public RasterSource(String str, String str2) {
        initialize(str, str2, DEFAULT_TILE_SIZE);
    }

    public RasterSource(String str, String str2, int i) {
        initialize(str, str2, i);
    }

    public RasterSource(String str, URL url) {
        this(str, url.toExternalForm());
    }

    public native void finalize();

    public String getUrl() {
        return nativeGetUrl();
    }

    public native void initialize(String str, Object obj, int i);

    public native String nativeGetUrl();
}
