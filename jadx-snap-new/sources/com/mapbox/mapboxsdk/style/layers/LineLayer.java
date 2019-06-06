package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.mapboxsdk.utils.ColorUtils;

public class LineLayer extends Layer {
    public LineLayer(long j) {
        super(j);
    }

    public LineLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetLineBlur();

    private native TransitionOptions nativeGetLineBlurTransition();

    private native Object nativeGetLineCap();

    private native Object nativeGetLineColor();

    private native TransitionOptions nativeGetLineColorTransition();

    private native Object nativeGetLineDasharray();

    private native TransitionOptions nativeGetLineDasharrayTransition();

    private native Object nativeGetLineGapWidth();

    private native TransitionOptions nativeGetLineGapWidthTransition();

    private native Object nativeGetLineJoin();

    private native Object nativeGetLineMiterLimit();

    private native Object nativeGetLineOffset();

    private native TransitionOptions nativeGetLineOffsetTransition();

    private native Object nativeGetLineOpacity();

    private native TransitionOptions nativeGetLineOpacityTransition();

    private native Object nativeGetLinePattern();

    private native TransitionOptions nativeGetLinePatternTransition();

    private native Object nativeGetLineRoundLimit();

    private native Object nativeGetLineTranslate();

    private native Object nativeGetLineTranslateAnchor();

    private native TransitionOptions nativeGetLineTranslateTransition();

    private native Object nativeGetLineWidth();

    private native TransitionOptions nativeGetLineWidthTransition();

    private native void nativeSetLineBlurTransition(long j, long j2);

    private native void nativeSetLineColorTransition(long j, long j2);

    private native void nativeSetLineDasharrayTransition(long j, long j2);

    private native void nativeSetLineGapWidthTransition(long j, long j2);

    private native void nativeSetLineOffsetTransition(long j, long j2);

    private native void nativeSetLineOpacityTransition(long j, long j2);

    private native void nativeSetLinePatternTransition(long j, long j2);

    private native void nativeSetLineTranslateTransition(long j, long j2);

    private native void nativeSetLineWidthTransition(long j, long j2);

    public native void finalize();

    public PropertyValue<Float> getLineBlur() {
        return new PropertyValue("line-blur", nativeGetLineBlur());
    }

    public TransitionOptions getLineBlurTransition() {
        return nativeGetLineBlurTransition();
    }

    public PropertyValue<String> getLineCap() {
        return new PropertyValue("line-cap", nativeGetLineCap());
    }

    public PropertyValue<String> getLineColor() {
        return new PropertyValue("line-color", nativeGetLineColor());
    }

    public int getLineColorAsInt() {
        PropertyValue lineColor = getLineColor();
        if (lineColor.isValue()) {
            return ColorUtils.rgbaToColor((String) lineColor.getValue());
        }
        throw new RuntimeException("line-color was set as a Function");
    }

    public TransitionOptions getLineColorTransition() {
        return nativeGetLineColorTransition();
    }

    public PropertyValue<Float[]> getLineDasharray() {
        return new PropertyValue("line-dasharray", nativeGetLineDasharray());
    }

    public TransitionOptions getLineDasharrayTransition() {
        return nativeGetLineDasharrayTransition();
    }

    public PropertyValue<Float> getLineGapWidth() {
        return new PropertyValue("line-gap-width", nativeGetLineGapWidth());
    }

    public TransitionOptions getLineGapWidthTransition() {
        return nativeGetLineGapWidthTransition();
    }

    public PropertyValue<String> getLineJoin() {
        return new PropertyValue("line-join", nativeGetLineJoin());
    }

    public PropertyValue<Float> getLineMiterLimit() {
        return new PropertyValue("line-miter-limit", nativeGetLineMiterLimit());
    }

    public PropertyValue<Float> getLineOffset() {
        return new PropertyValue("line-offset", nativeGetLineOffset());
    }

    public TransitionOptions getLineOffsetTransition() {
        return nativeGetLineOffsetTransition();
    }

    public PropertyValue<Float> getLineOpacity() {
        return new PropertyValue("line-opacity", nativeGetLineOpacity());
    }

    public TransitionOptions getLineOpacityTransition() {
        return nativeGetLineOpacityTransition();
    }

    public PropertyValue<String> getLinePattern() {
        return new PropertyValue("line-pattern", nativeGetLinePattern());
    }

    public TransitionOptions getLinePatternTransition() {
        return nativeGetLinePatternTransition();
    }

    public PropertyValue<Float> getLineRoundLimit() {
        return new PropertyValue("line-round-limit", nativeGetLineRoundLimit());
    }

    public PropertyValue<Float[]> getLineTranslate() {
        return new PropertyValue("line-translate", nativeGetLineTranslate());
    }

    public PropertyValue<String> getLineTranslateAnchor() {
        return new PropertyValue("line-translate-anchor", nativeGetLineTranslateAnchor());
    }

    public TransitionOptions getLineTranslateTransition() {
        return nativeGetLineTranslateTransition();
    }

    public PropertyValue<Float> getLineWidth() {
        return new PropertyValue("line-width", nativeGetLineWidth());
    }

    public TransitionOptions getLineWidthTransition() {
        return nativeGetLineWidthTransition();
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public native void initialize(String str, String str2);

    public void setFilter(Statement statement) {
        nativeSetFilter(statement.toArray());
    }

    public void setLineBlurTransition(TransitionOptions transitionOptions) {
        nativeSetLineBlurTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineColorTransition(TransitionOptions transitionOptions) {
        nativeSetLineColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineDasharrayTransition(TransitionOptions transitionOptions) {
        nativeSetLineDasharrayTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineGapWidthTransition(TransitionOptions transitionOptions) {
        nativeSetLineGapWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineOffsetTransition(TransitionOptions transitionOptions) {
        nativeSetLineOffsetTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetLineOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLinePatternTransition(TransitionOptions transitionOptions) {
        nativeSetLinePatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetLineTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setLineWidthTransition(TransitionOptions transitionOptions) {
        nativeSetLineWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public LineLayer withFilter(Statement statement) {
        setFilter(statement);
        return this;
    }

    public LineLayer withProperties(PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public LineLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
