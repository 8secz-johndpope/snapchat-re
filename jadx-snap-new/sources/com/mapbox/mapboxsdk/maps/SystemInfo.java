package com.mapbox.mapboxsdk.maps;

public class SystemInfo {
    public final int availableProcessors;
    public final String fileSourceCachePath;
    public final float pixelRatio;
    public final String programCacheDir;
    public final long totalMemory;

    public SystemInfo(float f, int i, long j, String str, String str2) {
        this.pixelRatio = f;
        this.availableProcessors = i;
        this.totalMemory = j;
        this.programCacheDir = str;
        this.fileSourceCachePath = str2;
    }
}
