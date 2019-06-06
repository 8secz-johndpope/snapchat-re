package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.style.functions.Function;

public abstract class Layer {
    private boolean invalidated;
    private long nativePtr;

    public Layer(long j) {
        this.nativePtr = j;
    }

    private Object convertValue(Object obj) {
        return (obj == null || !(obj instanceof Function)) ? obj : ((Function) obj).toValueObject();
    }

    public native void finalize();

    public String getId() {
        return nativeGetId();
    }

    public float getMaxZoom() {
        return nativeGetMaxZoom();
    }

    public float getMinZoom() {
        return nativeGetMinZoom();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public PropertyValue<String> getVisibility() {
        return new PaintPropertyValue("visibility", (String) nativeGetVisibility());
    }

    public native String nativeGetId();

    public native float nativeGetMaxZoom();

    public native float nativeGetMinZoom();

    public native String nativeGetSourceLayer();

    public native Object nativeGetVisibility();

    public native void nativeSetFilter(Object[] objArr);

    public native void nativeSetLayoutProperty(String str, Object obj);

    public native void nativeSetMaxZoom(float f);

    public native void nativeSetMinZoom(float f);

    public native void nativeSetPaintProperty(String str, Object obj);

    public native void nativeSetSourceLayer(String str);

    public void setMaxZoom(float f) {
        nativeSetMaxZoom(f);
    }

    public void setMinZoom(float f) {
        nativeSetMinZoom(f);
    }

    public void setProperties(PropertyValue<?>... propertyValueArr) {
        if (propertyValueArr.length != 0) {
            for (PropertyValue propertyValue : propertyValueArr) {
                Object convertValue = convertValue(propertyValue.value);
                if (propertyValue instanceof PaintPropertyValue) {
                    nativeSetPaintProperty(propertyValue.name, convertValue);
                } else {
                    nativeSetLayoutProperty(propertyValue.name, convertValue);
                }
            }
        }
    }
}
