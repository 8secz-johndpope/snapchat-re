package com.mapbox.mapboxsdk.style.sources;

public abstract class Source {
    private long nativePtr;

    public Source(long j) {
        this.nativePtr = j;
    }

    public String getAttribution() {
        return nativeGetAttribution();
    }

    public String getId() {
        return nativeGetId();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public native String nativeGetAttribution();

    public native String nativeGetId();
}
