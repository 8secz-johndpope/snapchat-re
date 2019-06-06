package com.mapbox.mapboxsdk.style.light;

import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;

public class Light {
    private long nativePtr;

    public Light(long j) {
        this.nativePtr = j;
    }

    private native String nativeGetAnchor();

    private native String nativeGetColor();

    private native TransitionOptions nativeGetColorTransition();

    private native float nativeGetIntensity();

    private native TransitionOptions nativeGetIntensityTransition();

    private native Position nativeGetPosition();

    private native TransitionOptions nativeGetPositionTransition();

    private native void nativeSetAnchor(String str);

    private native void nativeSetColor(String str);

    private native void nativeSetColorTransition(long j, long j2);

    private native void nativeSetIntensity(float f);

    private native void nativeSetIntensityTransition(long j, long j2);

    private native void nativeSetPosition(Position position);

    private native void nativeSetPositionTransition(long j, long j2);

    public String getAnchor() {
        return nativeGetAnchor();
    }

    public String getColor() {
        return nativeGetColor();
    }

    public TransitionOptions getColorTransition() {
        return nativeGetColorTransition();
    }

    public float getIntensity() {
        return nativeGetIntensity();
    }

    public TransitionOptions getIntensityTransition() {
        return nativeGetIntensityTransition();
    }

    public Position getPosition() {
        return nativeGetPosition();
    }

    public TransitionOptions getPositionTransition() {
        return nativeGetPositionTransition();
    }

    public void setAnchor(String str) {
        nativeSetAnchor(str);
    }

    public void setColor(int i) {
        nativeSetColor(PropertyFactory.colorToRgbaString(i));
    }

    public void setColor(String str) {
        nativeSetColor(str);
    }

    public void setColorTransition(TransitionOptions transitionOptions) {
        nativeSetColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setIntensity(float f) {
        nativeSetIntensity(f);
    }

    public void setIntensityTransition(TransitionOptions transitionOptions) {
        nativeSetIntensityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setPosition(Position position) {
        nativeSetPosition(position);
    }

    public void setPositionTransition(TransitionOptions transitionOptions) {
        nativeSetPositionTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
