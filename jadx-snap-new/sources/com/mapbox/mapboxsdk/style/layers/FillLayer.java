package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.mapboxsdk.utils.ColorUtils;

public class FillLayer extends Layer {
    public FillLayer(long j) {
        super(j);
    }

    public FillLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetFillAntialias();

    private native Object nativeGetFillColor();

    private native TransitionOptions nativeGetFillColorTransition();

    private native Object nativeGetFillOpacity();

    private native TransitionOptions nativeGetFillOpacityTransition();

    private native Object nativeGetFillOutlineColor();

    private native TransitionOptions nativeGetFillOutlineColorTransition();

    private native Object nativeGetFillPattern();

    private native TransitionOptions nativeGetFillPatternTransition();

    private native Object nativeGetFillTranslate();

    private native Object nativeGetFillTranslateAnchor();

    private native TransitionOptions nativeGetFillTranslateTransition();

    private native void nativeSetFillColorTransition(long j, long j2);

    private native void nativeSetFillOpacityTransition(long j, long j2);

    private native void nativeSetFillOutlineColorTransition(long j, long j2);

    private native void nativeSetFillPatternTransition(long j, long j2);

    private native void nativeSetFillTranslateTransition(long j, long j2);

    public native void finalize();

    public PropertyValue<Boolean> getFillAntialias() {
        return new PropertyValue("fill-antialias", nativeGetFillAntialias());
    }

    public PropertyValue<String> getFillColor() {
        return new PropertyValue("fill-color", nativeGetFillColor());
    }

    public int getFillColorAsInt() {
        PropertyValue fillColor = getFillColor();
        if (fillColor.isValue()) {
            return ColorUtils.rgbaToColor((String) fillColor.getValue());
        }
        throw new RuntimeException("fill-color was set as a Function");
    }

    public TransitionOptions getFillColorTransition() {
        return nativeGetFillColorTransition();
    }

    public PropertyValue<Float> getFillOpacity() {
        return new PropertyValue("fill-opacity", nativeGetFillOpacity());
    }

    public TransitionOptions getFillOpacityTransition() {
        return nativeGetFillOpacityTransition();
    }

    public PropertyValue<String> getFillOutlineColor() {
        return new PropertyValue("fill-outline-color", nativeGetFillOutlineColor());
    }

    public int getFillOutlineColorAsInt() {
        PropertyValue fillOutlineColor = getFillOutlineColor();
        if (fillOutlineColor.isValue()) {
            return ColorUtils.rgbaToColor((String) fillOutlineColor.getValue());
        }
        throw new RuntimeException("fill-outline-color was set as a Function");
    }

    public TransitionOptions getFillOutlineColorTransition() {
        return nativeGetFillOutlineColorTransition();
    }

    public PropertyValue<String> getFillPattern() {
        return new PropertyValue("fill-pattern", nativeGetFillPattern());
    }

    public TransitionOptions getFillPatternTransition() {
        return nativeGetFillPatternTransition();
    }

    public PropertyValue<Float[]> getFillTranslate() {
        return new PropertyValue("fill-translate", nativeGetFillTranslate());
    }

    public PropertyValue<String> getFillTranslateAnchor() {
        return new PropertyValue("fill-translate-anchor", nativeGetFillTranslateAnchor());
    }

    public TransitionOptions getFillTranslateTransition() {
        return nativeGetFillTranslateTransition();
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public native void initialize(String str, String str2);

    public void setFillColorTransition(TransitionOptions transitionOptions) {
        nativeSetFillColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setFillOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetFillOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setFillOutlineColorTransition(TransitionOptions transitionOptions) {
        nativeSetFillOutlineColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setFillPatternTransition(TransitionOptions transitionOptions) {
        nativeSetFillPatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setFillTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetFillTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setFilter(Statement statement) {
        nativeSetFilter(statement.toArray());
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public FillLayer withFilter(Statement statement) {
        setFilter(statement);
        return this;
    }

    public FillLayer withProperties(PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public FillLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
