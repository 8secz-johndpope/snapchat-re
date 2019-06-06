package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.mapboxsdk.utils.ColorUtils;

public class CircleLayer extends Layer {
    public CircleLayer(long j) {
        super(j);
    }

    public CircleLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetCircleBlur();

    private native TransitionOptions nativeGetCircleBlurTransition();

    private native Object nativeGetCircleColor();

    private native TransitionOptions nativeGetCircleColorTransition();

    private native Object nativeGetCircleOpacity();

    private native TransitionOptions nativeGetCircleOpacityTransition();

    private native Object nativeGetCirclePitchScale();

    private native Object nativeGetCircleRadius();

    private native TransitionOptions nativeGetCircleRadiusTransition();

    private native Object nativeGetCircleStrokeColor();

    private native TransitionOptions nativeGetCircleStrokeColorTransition();

    private native Object nativeGetCircleStrokeOpacity();

    private native TransitionOptions nativeGetCircleStrokeOpacityTransition();

    private native Object nativeGetCircleStrokeWidth();

    private native TransitionOptions nativeGetCircleStrokeWidthTransition();

    private native Object nativeGetCircleTranslate();

    private native Object nativeGetCircleTranslateAnchor();

    private native TransitionOptions nativeGetCircleTranslateTransition();

    private native void nativeSetCircleBlurTransition(long j, long j2);

    private native void nativeSetCircleColorTransition(long j, long j2);

    private native void nativeSetCircleOpacityTransition(long j, long j2);

    private native void nativeSetCircleRadiusTransition(long j, long j2);

    private native void nativeSetCircleStrokeColorTransition(long j, long j2);

    private native void nativeSetCircleStrokeOpacityTransition(long j, long j2);

    private native void nativeSetCircleStrokeWidthTransition(long j, long j2);

    private native void nativeSetCircleTranslateTransition(long j, long j2);

    public native void finalize();

    public PropertyValue<Float> getCircleBlur() {
        return new PropertyValue("circle-blur", nativeGetCircleBlur());
    }

    public TransitionOptions getCircleBlurTransition() {
        return nativeGetCircleBlurTransition();
    }

    public PropertyValue<String> getCircleColor() {
        return new PropertyValue("circle-color", nativeGetCircleColor());
    }

    public int getCircleColorAsInt() {
        PropertyValue circleColor = getCircleColor();
        if (circleColor.isValue()) {
            return ColorUtils.rgbaToColor((String) circleColor.getValue());
        }
        throw new RuntimeException("circle-color was set as a Function");
    }

    public TransitionOptions getCircleColorTransition() {
        return nativeGetCircleColorTransition();
    }

    public PropertyValue<Float> getCircleOpacity() {
        return new PropertyValue("circle-opacity", nativeGetCircleOpacity());
    }

    public TransitionOptions getCircleOpacityTransition() {
        return nativeGetCircleOpacityTransition();
    }

    public PropertyValue<String> getCirclePitchScale() {
        return new PropertyValue("circle-pitch-scale", nativeGetCirclePitchScale());
    }

    public PropertyValue<Float> getCircleRadius() {
        return new PropertyValue("circle-radius", nativeGetCircleRadius());
    }

    public TransitionOptions getCircleRadiusTransition() {
        return nativeGetCircleRadiusTransition();
    }

    public PropertyValue<String> getCircleStrokeColor() {
        return new PropertyValue("circle-stroke-color", nativeGetCircleStrokeColor());
    }

    public int getCircleStrokeColorAsInt() {
        PropertyValue circleStrokeColor = getCircleStrokeColor();
        if (circleStrokeColor.isValue()) {
            return ColorUtils.rgbaToColor((String) circleStrokeColor.getValue());
        }
        throw new RuntimeException("circle-stroke-color was set as a Function");
    }

    public TransitionOptions getCircleStrokeColorTransition() {
        return nativeGetCircleStrokeColorTransition();
    }

    public PropertyValue<Float> getCircleStrokeOpacity() {
        return new PropertyValue("circle-stroke-opacity", nativeGetCircleStrokeOpacity());
    }

    public TransitionOptions getCircleStrokeOpacityTransition() {
        return nativeGetCircleStrokeOpacityTransition();
    }

    public PropertyValue<Float> getCircleStrokeWidth() {
        return new PropertyValue("circle-stroke-width", nativeGetCircleStrokeWidth());
    }

    public TransitionOptions getCircleStrokeWidthTransition() {
        return nativeGetCircleStrokeWidthTransition();
    }

    public PropertyValue<Float[]> getCircleTranslate() {
        return new PropertyValue("circle-translate", nativeGetCircleTranslate());
    }

    public PropertyValue<String> getCircleTranslateAnchor() {
        return new PropertyValue("circle-translate-anchor", nativeGetCircleTranslateAnchor());
    }

    public TransitionOptions getCircleTranslateTransition() {
        return nativeGetCircleTranslateTransition();
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public native void initialize(String str, String str2);

    public void setCircleBlurTransition(TransitionOptions transitionOptions) {
        nativeSetCircleBlurTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleColorTransition(TransitionOptions transitionOptions) {
        nativeSetCircleColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetCircleOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleRadiusTransition(TransitionOptions transitionOptions) {
        nativeSetCircleRadiusTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleStrokeColorTransition(TransitionOptions transitionOptions) {
        nativeSetCircleStrokeColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleStrokeOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetCircleStrokeOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleStrokeWidthTransition(TransitionOptions transitionOptions) {
        nativeSetCircleStrokeWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setCircleTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetCircleTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setFilter(Statement statement) {
        nativeSetFilter(statement.toArray());
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public CircleLayer withFilter(Statement statement) {
        setFilter(statement);
        return this;
    }

    public CircleLayer withProperties(PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public CircleLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
