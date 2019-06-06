package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.utils.ColorUtils;

public class BackgroundLayer extends Layer {
    public BackgroundLayer(long j) {
        super(j);
    }

    public BackgroundLayer(String str) {
        initialize(str);
    }

    private native Object nativeGetBackgroundColor();

    private native TransitionOptions nativeGetBackgroundColorTransition();

    private native Object nativeGetBackgroundOpacity();

    private native TransitionOptions nativeGetBackgroundOpacityTransition();

    private native Object nativeGetBackgroundPattern();

    private native TransitionOptions nativeGetBackgroundPatternTransition();

    private native void nativeSetBackgroundColorTransition(long j, long j2);

    private native void nativeSetBackgroundOpacityTransition(long j, long j2);

    private native void nativeSetBackgroundPatternTransition(long j, long j2);

    public native void finalize();

    public PropertyValue<String> getBackgroundColor() {
        return new PropertyValue("background-color", nativeGetBackgroundColor());
    }

    public int getBackgroundColorAsInt() {
        PropertyValue backgroundColor = getBackgroundColor();
        if (backgroundColor.isValue()) {
            return ColorUtils.rgbaToColor((String) backgroundColor.getValue());
        }
        throw new RuntimeException("background-color was set as a Function");
    }

    public TransitionOptions getBackgroundColorTransition() {
        return nativeGetBackgroundColorTransition();
    }

    public PropertyValue<Float> getBackgroundOpacity() {
        return new PropertyValue("background-opacity", nativeGetBackgroundOpacity());
    }

    public TransitionOptions getBackgroundOpacityTransition() {
        return nativeGetBackgroundOpacityTransition();
    }

    public PropertyValue<String> getBackgroundPattern() {
        return new PropertyValue("background-pattern", nativeGetBackgroundPattern());
    }

    public TransitionOptions getBackgroundPatternTransition() {
        return nativeGetBackgroundPatternTransition();
    }

    public native void initialize(String str);

    public void setBackgroundColorTransition(TransitionOptions transitionOptions) {
        nativeSetBackgroundColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setBackgroundOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetBackgroundOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setBackgroundPatternTransition(TransitionOptions transitionOptions) {
        nativeSetBackgroundPatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public BackgroundLayer withProperties(PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }
}
