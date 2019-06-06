package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.mapboxsdk.utils.ColorUtils;

public class SymbolLayer extends Layer {
    public SymbolLayer(long j) {
        super(j);
    }

    public SymbolLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetIconAllowOverlap();

    private native Object nativeGetIconColor();

    private native TransitionOptions nativeGetIconColorTransition();

    private native Object nativeGetIconHaloBlur();

    private native TransitionOptions nativeGetIconHaloBlurTransition();

    private native Object nativeGetIconHaloColor();

    private native TransitionOptions nativeGetIconHaloColorTransition();

    private native Object nativeGetIconHaloWidth();

    private native TransitionOptions nativeGetIconHaloWidthTransition();

    private native Object nativeGetIconIgnorePlacement();

    private native Object nativeGetIconImage();

    private native Object nativeGetIconKeepUpright();

    private native Object nativeGetIconOffset();

    private native Object nativeGetIconOpacity();

    private native TransitionOptions nativeGetIconOpacityTransition();

    private native Object nativeGetIconOptional();

    private native Object nativeGetIconPadding();

    private native Object nativeGetIconRotate();

    private native Object nativeGetIconRotationAlignment();

    private native Object nativeGetIconSize();

    private native Object nativeGetIconTextFit();

    private native Object nativeGetIconTextFitPadding();

    private native Object nativeGetIconTranslate();

    private native Object nativeGetIconTranslateAnchor();

    private native TransitionOptions nativeGetIconTranslateTransition();

    private native Object nativeGetSymbolAvoidEdges();

    private native Object nativeGetSymbolPlacement();

    private native Object nativeGetSymbolSpacing();

    private native Object nativeGetTextAllowOverlap();

    private native Object nativeGetTextAnchor();

    private native Object nativeGetTextColor();

    private native TransitionOptions nativeGetTextColorTransition();

    private native Object nativeGetTextField();

    private native Object nativeGetTextFont();

    private native Object nativeGetTextHaloBlur();

    private native TransitionOptions nativeGetTextHaloBlurTransition();

    private native Object nativeGetTextHaloColor();

    private native TransitionOptions nativeGetTextHaloColorTransition();

    private native Object nativeGetTextHaloWidth();

    private native TransitionOptions nativeGetTextHaloWidthTransition();

    private native Object nativeGetTextIgnorePlacement();

    private native Object nativeGetTextJustify();

    private native Object nativeGetTextKeepUpright();

    private native Object nativeGetTextLetterSpacing();

    private native Object nativeGetTextLineHeight();

    private native Object nativeGetTextMaxAngle();

    private native Object nativeGetTextMaxWidth();

    private native Object nativeGetTextOffset();

    private native Object nativeGetTextOpacity();

    private native TransitionOptions nativeGetTextOpacityTransition();

    private native Object nativeGetTextOptional();

    private native Object nativeGetTextPadding();

    private native Object nativeGetTextPitchAlignment();

    private native Object nativeGetTextRotate();

    private native Object nativeGetTextRotationAlignment();

    private native Object nativeGetTextSize();

    private native Object nativeGetTextTransform();

    private native Object nativeGetTextTranslate();

    private native Object nativeGetTextTranslateAnchor();

    private native TransitionOptions nativeGetTextTranslateTransition();

    private native void nativeSetIconColorTransition(long j, long j2);

    private native void nativeSetIconHaloBlurTransition(long j, long j2);

    private native void nativeSetIconHaloColorTransition(long j, long j2);

    private native void nativeSetIconHaloWidthTransition(long j, long j2);

    private native void nativeSetIconOpacityTransition(long j, long j2);

    private native void nativeSetIconTranslateTransition(long j, long j2);

    private native void nativeSetTextColorTransition(long j, long j2);

    private native void nativeSetTextHaloBlurTransition(long j, long j2);

    private native void nativeSetTextHaloColorTransition(long j, long j2);

    private native void nativeSetTextHaloWidthTransition(long j, long j2);

    private native void nativeSetTextOpacityTransition(long j, long j2);

    private native void nativeSetTextTranslateTransition(long j, long j2);

    public native void finalize();

    public PropertyValue<Boolean> getIconAllowOverlap() {
        return new PropertyValue("icon-allow-overlap", nativeGetIconAllowOverlap());
    }

    public PropertyValue<String> getIconColor() {
        return new PropertyValue("icon-color", nativeGetIconColor());
    }

    public int getIconColorAsInt() {
        PropertyValue iconColor = getIconColor();
        if (iconColor.isValue()) {
            return ColorUtils.rgbaToColor((String) iconColor.getValue());
        }
        throw new RuntimeException("icon-color was set as a Function");
    }

    public TransitionOptions getIconColorTransition() {
        return nativeGetIconColorTransition();
    }

    public PropertyValue<Float> getIconHaloBlur() {
        return new PropertyValue("icon-halo-blur", nativeGetIconHaloBlur());
    }

    public TransitionOptions getIconHaloBlurTransition() {
        return nativeGetIconHaloBlurTransition();
    }

    public PropertyValue<String> getIconHaloColor() {
        return new PropertyValue("icon-halo-color", nativeGetIconHaloColor());
    }

    public int getIconHaloColorAsInt() {
        PropertyValue iconHaloColor = getIconHaloColor();
        if (iconHaloColor.isValue()) {
            return ColorUtils.rgbaToColor((String) iconHaloColor.getValue());
        }
        throw new RuntimeException("icon-halo-color was set as a Function");
    }

    public TransitionOptions getIconHaloColorTransition() {
        return nativeGetIconHaloColorTransition();
    }

    public PropertyValue<Float> getIconHaloWidth() {
        return new PropertyValue("icon-halo-width", nativeGetIconHaloWidth());
    }

    public TransitionOptions getIconHaloWidthTransition() {
        return nativeGetIconHaloWidthTransition();
    }

    public PropertyValue<Boolean> getIconIgnorePlacement() {
        return new PropertyValue("icon-ignore-placement", nativeGetIconIgnorePlacement());
    }

    public PropertyValue<String> getIconImage() {
        return new PropertyValue("icon-image", nativeGetIconImage());
    }

    public PropertyValue<Boolean> getIconKeepUpright() {
        return new PropertyValue("icon-keep-upright", nativeGetIconKeepUpright());
    }

    public PropertyValue<Float[]> getIconOffset() {
        return new PropertyValue("icon-offset", nativeGetIconOffset());
    }

    public PropertyValue<Float> getIconOpacity() {
        return new PropertyValue("icon-opacity", nativeGetIconOpacity());
    }

    public TransitionOptions getIconOpacityTransition() {
        return nativeGetIconOpacityTransition();
    }

    public PropertyValue<Boolean> getIconOptional() {
        return new PropertyValue("icon-optional", nativeGetIconOptional());
    }

    public PropertyValue<Float> getIconPadding() {
        return new PropertyValue("icon-padding", nativeGetIconPadding());
    }

    public PropertyValue<Float> getIconRotate() {
        return new PropertyValue("icon-rotate", nativeGetIconRotate());
    }

    public PropertyValue<String> getIconRotationAlignment() {
        return new PropertyValue("icon-rotation-alignment", nativeGetIconRotationAlignment());
    }

    public PropertyValue<Float> getIconSize() {
        return new PropertyValue("icon-size", nativeGetIconSize());
    }

    public PropertyValue<String> getIconTextFit() {
        return new PropertyValue("icon-text-fit", nativeGetIconTextFit());
    }

    public PropertyValue<Float[]> getIconTextFitPadding() {
        return new PropertyValue("icon-text-fit-padding", nativeGetIconTextFitPadding());
    }

    public PropertyValue<Float[]> getIconTranslate() {
        return new PropertyValue("icon-translate", nativeGetIconTranslate());
    }

    public PropertyValue<String> getIconTranslateAnchor() {
        return new PropertyValue("icon-translate-anchor", nativeGetIconTranslateAnchor());
    }

    public TransitionOptions getIconTranslateTransition() {
        return nativeGetIconTranslateTransition();
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public PropertyValue<Boolean> getSymbolAvoidEdges() {
        return new PropertyValue("symbol-avoid-edges", nativeGetSymbolAvoidEdges());
    }

    public PropertyValue<String> getSymbolPlacement() {
        return new PropertyValue("symbol-placement", nativeGetSymbolPlacement());
    }

    public PropertyValue<Float> getSymbolSpacing() {
        return new PropertyValue("symbol-spacing", nativeGetSymbolSpacing());
    }

    public PropertyValue<Boolean> getTextAllowOverlap() {
        return new PropertyValue("text-allow-overlap", nativeGetTextAllowOverlap());
    }

    public PropertyValue<String> getTextAnchor() {
        return new PropertyValue("text-anchor", nativeGetTextAnchor());
    }

    public PropertyValue<String> getTextColor() {
        return new PropertyValue("text-color", nativeGetTextColor());
    }

    public int getTextColorAsInt() {
        PropertyValue textColor = getTextColor();
        if (textColor.isValue()) {
            return ColorUtils.rgbaToColor((String) textColor.getValue());
        }
        throw new RuntimeException("text-color was set as a Function");
    }

    public TransitionOptions getTextColorTransition() {
        return nativeGetTextColorTransition();
    }

    public PropertyValue<String> getTextField() {
        return new PropertyValue("text-field", nativeGetTextField());
    }

    public PropertyValue<String[]> getTextFont() {
        return new PropertyValue("text-font", nativeGetTextFont());
    }

    public PropertyValue<Float> getTextHaloBlur() {
        return new PropertyValue("text-halo-blur", nativeGetTextHaloBlur());
    }

    public TransitionOptions getTextHaloBlurTransition() {
        return nativeGetTextHaloBlurTransition();
    }

    public PropertyValue<String> getTextHaloColor() {
        return new PropertyValue("text-halo-color", nativeGetTextHaloColor());
    }

    public int getTextHaloColorAsInt() {
        PropertyValue textHaloColor = getTextHaloColor();
        if (textHaloColor.isValue()) {
            return ColorUtils.rgbaToColor((String) textHaloColor.getValue());
        }
        throw new RuntimeException("text-halo-color was set as a Function");
    }

    public TransitionOptions getTextHaloColorTransition() {
        return nativeGetTextHaloColorTransition();
    }

    public PropertyValue<Float> getTextHaloWidth() {
        return new PropertyValue("text-halo-width", nativeGetTextHaloWidth());
    }

    public TransitionOptions getTextHaloWidthTransition() {
        return nativeGetTextHaloWidthTransition();
    }

    public PropertyValue<Boolean> getTextIgnorePlacement() {
        return new PropertyValue("text-ignore-placement", nativeGetTextIgnorePlacement());
    }

    public PropertyValue<String> getTextJustify() {
        return new PropertyValue("text-justify", nativeGetTextJustify());
    }

    public PropertyValue<Boolean> getTextKeepUpright() {
        return new PropertyValue("text-keep-upright", nativeGetTextKeepUpright());
    }

    public PropertyValue<Float> getTextLetterSpacing() {
        return new PropertyValue("text-letter-spacing", nativeGetTextLetterSpacing());
    }

    public PropertyValue<Float> getTextLineHeight() {
        return new PropertyValue("text-line-height", nativeGetTextLineHeight());
    }

    public PropertyValue<Float> getTextMaxAngle() {
        return new PropertyValue("text-max-angle", nativeGetTextMaxAngle());
    }

    public PropertyValue<Float> getTextMaxWidth() {
        return new PropertyValue("text-max-width", nativeGetTextMaxWidth());
    }

    public PropertyValue<Float[]> getTextOffset() {
        return new PropertyValue("text-offset", nativeGetTextOffset());
    }

    public PropertyValue<Float> getTextOpacity() {
        return new PropertyValue("text-opacity", nativeGetTextOpacity());
    }

    public TransitionOptions getTextOpacityTransition() {
        return nativeGetTextOpacityTransition();
    }

    public PropertyValue<Boolean> getTextOptional() {
        return new PropertyValue("text-optional", nativeGetTextOptional());
    }

    public PropertyValue<Float> getTextPadding() {
        return new PropertyValue("text-padding", nativeGetTextPadding());
    }

    public PropertyValue<String> getTextPitchAlignment() {
        return new PropertyValue("text-pitch-alignment", nativeGetTextPitchAlignment());
    }

    public PropertyValue<Float> getTextRotate() {
        return new PropertyValue("text-rotate", nativeGetTextRotate());
    }

    public PropertyValue<String> getTextRotationAlignment() {
        return new PropertyValue("text-rotation-alignment", nativeGetTextRotationAlignment());
    }

    public PropertyValue<Float> getTextSize() {
        return new PropertyValue("text-size", nativeGetTextSize());
    }

    public PropertyValue<String> getTextTransform() {
        return new PropertyValue("text-transform", nativeGetTextTransform());
    }

    public PropertyValue<Float[]> getTextTranslate() {
        return new PropertyValue("text-translate", nativeGetTextTranslate());
    }

    public PropertyValue<String> getTextTranslateAnchor() {
        return new PropertyValue("text-translate-anchor", nativeGetTextTranslateAnchor());
    }

    public TransitionOptions getTextTranslateTransition() {
        return nativeGetTextTranslateTransition();
    }

    public native void initialize(String str, String str2);

    public void setFilter(Statement statement) {
        nativeSetFilter(statement.toArray());
    }

    public void setIconColorTransition(TransitionOptions transitionOptions) {
        nativeSetIconColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setIconHaloBlurTransition(TransitionOptions transitionOptions) {
        nativeSetIconHaloBlurTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setIconHaloColorTransition(TransitionOptions transitionOptions) {
        nativeSetIconHaloColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setIconHaloWidthTransition(TransitionOptions transitionOptions) {
        nativeSetIconHaloWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setIconOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetIconOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setIconTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetIconTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public void setTextColorTransition(TransitionOptions transitionOptions) {
        nativeSetTextColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setTextHaloBlurTransition(TransitionOptions transitionOptions) {
        nativeSetTextHaloBlurTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setTextHaloColorTransition(TransitionOptions transitionOptions) {
        nativeSetTextHaloColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setTextHaloWidthTransition(TransitionOptions transitionOptions) {
        nativeSetTextHaloWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setTextOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetTextOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public void setTextTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetTextTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public SymbolLayer withFilter(Statement statement) {
        setFilter(statement);
        return this;
    }

    public SymbolLayer withProperties(PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public SymbolLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
