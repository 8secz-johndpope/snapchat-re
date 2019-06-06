package com.mapbox.mapboxsdk.customlayer;

import com.mapbox.mapboxsdk.MapboxNatives;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.style.layers.CustomLayer;
import defpackage.cgh;
import defpackage.cgh.b;

public class WrappedCustomLayer implements cgh {
    public static long DeinitializeFunction = 0;
    public static long InitializeFunction = 0;
    private static final long MIN_REQUIRED_FRAME = 10;
    public static long RenderFunction;
    private final String mBeforeLayerId;
    private final b mImpl;
    private final String mLayerId;

    static {
        MapboxNatives.loadWrapperLayer();
    }

    public WrappedCustomLayer(String str, String str2, b bVar) {
        this.mLayerId = str;
        this.mBeforeLayerId = str2;
        this.mImpl = bVar;
    }

    private static native long createContext(WrappedCustomLayer wrappedCustomLayer);

    private void mbRenderComplete() {
        this.mImpl.b();
    }

    private void mbRenderPrepare() {
    }

    private void mbRenderUpdate() {
        this.mImpl.a();
    }

    public void addIfNeeded(MapboxMap mapboxMap, long j) {
        if (j < MIN_REQUIRED_FRAME && mapboxMap.getLayer(this.mLayerId) == null) {
            String str = this.mBeforeLayerId;
            if (str == null || mapboxMap.getLayer(str) == null) {
                mapboxMap.addLayer(new CustomLayer(this.mLayerId, createContext(this), InitializeFunction, RenderFunction, DeinitializeFunction));
            } else {
                mapboxMap.addLayerAbove(new CustomLayer(this.mLayerId, createContext(this), InitializeFunction, RenderFunction, DeinitializeFunction), this.mBeforeLayerId);
            }
        }
    }

    public String layerId() {
        return this.mLayerId;
    }

    public void updateLayer(MapboxMap mapboxMap) {
        if (this.mImpl != null) {
            CustomLayer customLayer = (CustomLayer) mapboxMap.getLayerAs(this.mLayerId);
            if (customLayer != null) {
                customLayer.update();
            }
        }
    }
}
