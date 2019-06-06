package com.mapbox.mapboxsdk.style.layers;

public class CustomLayer extends Layer {
    public CustomLayer(long j) {
        super(j);
    }

    public CustomLayer(String str, long j, long j2, long j3, long j4) {
        initialize(str, j2, j3, j4, j);
    }

    public native void finalize();

    public native void initialize(String str, long j, long j2, long j3, long j4);

    public native void nativeUpdate();

    public void update() {
        nativeUpdate();
    }
}
