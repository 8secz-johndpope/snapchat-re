package com.mapbox.mapboxsdk.net;

import com.mapbox.mapboxsdk.MapboxNatives;

public class NativeConnectivityListener implements ConnectivityListener {
    private boolean invalidated;
    private long nativePtr;

    static {
        MapboxNatives.load();
    }

    public NativeConnectivityListener() {
        initialize();
    }

    NativeConnectivityListener(long j) {
        this.nativePtr = j;
    }

    public native void finalize();

    public native void initialize();

    public native void nativeOnConnectivityStateChanged(boolean z);

    public void onNetworkStateChanged(boolean z) {
        nativeOnConnectivityStateChanged(z);
    }
}
