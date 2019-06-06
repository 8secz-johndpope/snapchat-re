package com.mapbox.mapboxsdk.style.layers;

import android.annotation.SuppressLint;
import com.mapbox.mapboxsdk.style.functions.CameraFunction;
import com.mapbox.mapboxsdk.style.functions.Function;

public class PropertyFactory {
    public static PropertyValue<String> backgroundColor(int i) {
        return new PaintPropertyValue("background-color", colorToRgbaString(i));
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> backgroundColor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("background-color", cameraFunction);
    }

    public static PropertyValue<String> backgroundColor(String str) {
        return new PaintPropertyValue("background-color", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> backgroundOpacity(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("background-opacity", cameraFunction);
    }

    public static PropertyValue<Float> backgroundOpacity(Float f) {
        return new PaintPropertyValue("background-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> backgroundPattern(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("background-pattern", cameraFunction);
    }

    public static PropertyValue<String> backgroundPattern(String str) {
        return new PaintPropertyValue("background-pattern", str);
    }

    public static <T> PropertyValue<Function<T, Float>> circleBlur(Function<T, Float> function) {
        return new PaintPropertyValue("circle-blur", function);
    }

    public static PropertyValue<Float> circleBlur(Float f) {
        return new PaintPropertyValue("circle-blur", f);
    }

    public static PropertyValue<String> circleColor(int i) {
        return new PaintPropertyValue("circle-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> circleColor(Function<T, String> function) {
        return new PaintPropertyValue("circle-color", function);
    }

    public static PropertyValue<String> circleColor(String str) {
        return new PaintPropertyValue("circle-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> circleOpacity(Function<T, Float> function) {
        return new PaintPropertyValue("circle-opacity", function);
    }

    public static PropertyValue<Float> circleOpacity(Float f) {
        return new PaintPropertyValue("circle-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> circlePitchScale(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("circle-pitch-scale", cameraFunction);
    }

    public static PropertyValue<String> circlePitchScale(String str) {
        return new PaintPropertyValue("circle-pitch-scale", str);
    }

    public static <T> PropertyValue<Function<T, Float>> circleRadius(Function<T, Float> function) {
        return new PaintPropertyValue("circle-radius", function);
    }

    public static PropertyValue<Float> circleRadius(Float f) {
        return new PaintPropertyValue("circle-radius", f);
    }

    public static PropertyValue<String> circleStrokeColor(int i) {
        return new PaintPropertyValue("circle-stroke-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> circleStrokeColor(Function<T, String> function) {
        return new PaintPropertyValue("circle-stroke-color", function);
    }

    public static PropertyValue<String> circleStrokeColor(String str) {
        return new PaintPropertyValue("circle-stroke-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> circleStrokeOpacity(Function<T, Float> function) {
        return new PaintPropertyValue("circle-stroke-opacity", function);
    }

    public static PropertyValue<Float> circleStrokeOpacity(Float f) {
        return new PaintPropertyValue("circle-stroke-opacity", f);
    }

    public static <T> PropertyValue<Function<T, Float>> circleStrokeWidth(Function<T, Float> function) {
        return new PaintPropertyValue("circle-stroke-width", function);
    }

    public static PropertyValue<Float> circleStrokeWidth(Float f) {
        return new PaintPropertyValue("circle-stroke-width", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> circleTranslate(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("circle-translate", cameraFunction);
    }

    public static PropertyValue<Float[]> circleTranslate(Float[] fArr) {
        return new PaintPropertyValue("circle-translate", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> circleTranslateAnchor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("circle-translate-anchor", cameraFunction);
    }

    public static PropertyValue<String> circleTranslateAnchor(String str) {
        return new PaintPropertyValue("circle-translate-anchor", str);
    }

    @SuppressLint({"DefaultLocale"})
    public static String colorToRgbaString(int i) {
        return String.format("rgba(%d, %d, %d, %d)", new Object[]{Integer.valueOf((i >> 16) & 255), Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255), Integer.valueOf(i >>> 24)});
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> fillAntialias(CameraFunction<Z, Boolean> cameraFunction) {
        return new PaintPropertyValue("fill-antialias", cameraFunction);
    }

    public static PropertyValue<Boolean> fillAntialias(Boolean bool) {
        return new PaintPropertyValue("fill-antialias", bool);
    }

    public static PropertyValue<String> fillColor(int i) {
        return new PaintPropertyValue("fill-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> fillColor(Function<T, String> function) {
        return new PaintPropertyValue("fill-color", function);
    }

    public static PropertyValue<String> fillColor(String str) {
        return new PaintPropertyValue("fill-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> fillExtrusionBase(Function<T, Float> function) {
        return new PaintPropertyValue("fill-extrusion-base", function);
    }

    public static PropertyValue<Float> fillExtrusionBase(Float f) {
        return new PaintPropertyValue("fill-extrusion-base", f);
    }

    public static PropertyValue<String> fillExtrusionColor(int i) {
        return new PaintPropertyValue("fill-extrusion-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> fillExtrusionColor(Function<T, String> function) {
        return new PaintPropertyValue("fill-extrusion-color", function);
    }

    public static PropertyValue<String> fillExtrusionColor(String str) {
        return new PaintPropertyValue("fill-extrusion-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> fillExtrusionHeight(Function<T, Float> function) {
        return new PaintPropertyValue("fill-extrusion-height", function);
    }

    public static PropertyValue<Float> fillExtrusionHeight(Float f) {
        return new PaintPropertyValue("fill-extrusion-height", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> fillExtrusionOpacity(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("fill-extrusion-opacity", cameraFunction);
    }

    public static PropertyValue<Float> fillExtrusionOpacity(Float f) {
        return new PaintPropertyValue("fill-extrusion-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> fillExtrusionPattern(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("fill-extrusion-pattern", cameraFunction);
    }

    public static PropertyValue<String> fillExtrusionPattern(String str) {
        return new PaintPropertyValue("fill-extrusion-pattern", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> fillExtrusionTranslate(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("fill-extrusion-translate", cameraFunction);
    }

    public static PropertyValue<Float[]> fillExtrusionTranslate(Float[] fArr) {
        return new PaintPropertyValue("fill-extrusion-translate", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> fillExtrusionTranslateAnchor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("fill-extrusion-translate-anchor", cameraFunction);
    }

    public static PropertyValue<String> fillExtrusionTranslateAnchor(String str) {
        return new PaintPropertyValue("fill-extrusion-translate-anchor", str);
    }

    public static <T> PropertyValue<Function<T, Float>> fillOpacity(Function<T, Float> function) {
        return new PaintPropertyValue("fill-opacity", function);
    }

    public static PropertyValue<Float> fillOpacity(Float f) {
        return new PaintPropertyValue("fill-opacity", f);
    }

    public static PropertyValue<String> fillOutlineColor(int i) {
        return new PaintPropertyValue("fill-outline-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> fillOutlineColor(Function<T, String> function) {
        return new PaintPropertyValue("fill-outline-color", function);
    }

    public static PropertyValue<String> fillOutlineColor(String str) {
        return new PaintPropertyValue("fill-outline-color", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> fillPattern(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("fill-pattern", cameraFunction);
    }

    public static PropertyValue<String> fillPattern(String str) {
        return new PaintPropertyValue("fill-pattern", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> fillTranslate(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("fill-translate", cameraFunction);
    }

    public static PropertyValue<Float[]> fillTranslate(Float[] fArr) {
        return new PaintPropertyValue("fill-translate", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> fillTranslateAnchor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("fill-translate-anchor", cameraFunction);
    }

    public static PropertyValue<String> fillTranslateAnchor(String str) {
        return new PaintPropertyValue("fill-translate-anchor", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> iconAllowOverlap(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("icon-allow-overlap", cameraFunction);
    }

    public static PropertyValue<Boolean> iconAllowOverlap(Boolean bool) {
        return new LayoutPropertyValue("icon-allow-overlap", bool);
    }

    public static PropertyValue<String> iconColor(int i) {
        return new PaintPropertyValue("icon-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> iconColor(Function<T, String> function) {
        return new PaintPropertyValue("icon-color", function);
    }

    public static PropertyValue<String> iconColor(String str) {
        return new PaintPropertyValue("icon-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> iconHaloBlur(Function<T, Float> function) {
        return new PaintPropertyValue("icon-halo-blur", function);
    }

    public static PropertyValue<Float> iconHaloBlur(Float f) {
        return new PaintPropertyValue("icon-halo-blur", f);
    }

    public static PropertyValue<String> iconHaloColor(int i) {
        return new PaintPropertyValue("icon-halo-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> iconHaloColor(Function<T, String> function) {
        return new PaintPropertyValue("icon-halo-color", function);
    }

    public static PropertyValue<String> iconHaloColor(String str) {
        return new PaintPropertyValue("icon-halo-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> iconHaloWidth(Function<T, Float> function) {
        return new PaintPropertyValue("icon-halo-width", function);
    }

    public static PropertyValue<Float> iconHaloWidth(Float f) {
        return new PaintPropertyValue("icon-halo-width", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> iconIgnorePlacement(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("icon-ignore-placement", cameraFunction);
    }

    public static PropertyValue<Boolean> iconIgnorePlacement(Boolean bool) {
        return new LayoutPropertyValue("icon-ignore-placement", bool);
    }

    public static <T> PropertyValue<Function<T, String>> iconImage(Function<T, String> function) {
        return new LayoutPropertyValue("icon-image", function);
    }

    public static PropertyValue<String> iconImage(String str) {
        return new LayoutPropertyValue("icon-image", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> iconKeepUpright(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("icon-keep-upright", cameraFunction);
    }

    public static PropertyValue<Boolean> iconKeepUpright(Boolean bool) {
        return new LayoutPropertyValue("icon-keep-upright", bool);
    }

    public static <T> PropertyValue<Function<T, Float[]>> iconOffset(Function<T, Float[]> function) {
        return new LayoutPropertyValue("icon-offset", function);
    }

    public static PropertyValue<Float[]> iconOffset(Float[] fArr) {
        return new LayoutPropertyValue("icon-offset", fArr);
    }

    public static <T> PropertyValue<Function<T, Float>> iconOpacity(Function<T, Float> function) {
        return new PaintPropertyValue("icon-opacity", function);
    }

    public static PropertyValue<Float> iconOpacity(Float f) {
        return new PaintPropertyValue("icon-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> iconOptional(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("icon-optional", cameraFunction);
    }

    public static PropertyValue<Boolean> iconOptional(Boolean bool) {
        return new LayoutPropertyValue("icon-optional", bool);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> iconPadding(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("icon-padding", cameraFunction);
    }

    public static PropertyValue<Float> iconPadding(Float f) {
        return new LayoutPropertyValue("icon-padding", f);
    }

    public static <T> PropertyValue<Function<T, Float>> iconRotate(Function<T, Float> function) {
        return new LayoutPropertyValue("icon-rotate", function);
    }

    public static PropertyValue<Float> iconRotate(Float f) {
        return new LayoutPropertyValue("icon-rotate", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> iconRotationAlignment(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("icon-rotation-alignment", cameraFunction);
    }

    public static PropertyValue<String> iconRotationAlignment(String str) {
        return new LayoutPropertyValue("icon-rotation-alignment", str);
    }

    public static <T> PropertyValue<Function<T, Float>> iconSize(Function<T, Float> function) {
        return new LayoutPropertyValue("icon-size", function);
    }

    public static PropertyValue<Float> iconSize(Float f) {
        return new LayoutPropertyValue("icon-size", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> iconTextFit(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("icon-text-fit", cameraFunction);
    }

    public static PropertyValue<String> iconTextFit(String str) {
        return new LayoutPropertyValue("icon-text-fit", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> iconTextFitPadding(CameraFunction<Z, Float[]> cameraFunction) {
        return new LayoutPropertyValue("icon-text-fit-padding", cameraFunction);
    }

    public static PropertyValue<Float[]> iconTextFitPadding(Float[] fArr) {
        return new LayoutPropertyValue("icon-text-fit-padding", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> iconTranslate(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("icon-translate", cameraFunction);
    }

    public static PropertyValue<Float[]> iconTranslate(Float[] fArr) {
        return new PaintPropertyValue("icon-translate", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> iconTranslateAnchor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("icon-translate-anchor", cameraFunction);
    }

    public static PropertyValue<String> iconTranslateAnchor(String str) {
        return new PaintPropertyValue("icon-translate-anchor", str);
    }

    public static <T> PropertyValue<Function<T, Float>> lineBlur(Function<T, Float> function) {
        return new PaintPropertyValue("line-blur", function);
    }

    public static PropertyValue<Float> lineBlur(Float f) {
        return new PaintPropertyValue("line-blur", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> lineCap(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("line-cap", cameraFunction);
    }

    public static PropertyValue<String> lineCap(String str) {
        return new LayoutPropertyValue("line-cap", str);
    }

    public static PropertyValue<String> lineColor(int i) {
        return new PaintPropertyValue("line-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> lineColor(Function<T, String> function) {
        return new PaintPropertyValue("line-color", function);
    }

    public static PropertyValue<String> lineColor(String str) {
        return new PaintPropertyValue("line-color", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> lineDasharray(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("line-dasharray", cameraFunction);
    }

    public static PropertyValue<Float[]> lineDasharray(Float[] fArr) {
        return new PaintPropertyValue("line-dasharray", fArr);
    }

    public static <T> PropertyValue<Function<T, Float>> lineGapWidth(Function<T, Float> function) {
        return new PaintPropertyValue("line-gap-width", function);
    }

    public static PropertyValue<Float> lineGapWidth(Float f) {
        return new PaintPropertyValue("line-gap-width", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> lineJoin(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("line-join", cameraFunction);
    }

    public static PropertyValue<String> lineJoin(String str) {
        return new LayoutPropertyValue("line-join", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> lineMiterLimit(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("line-miter-limit", cameraFunction);
    }

    public static PropertyValue<Float> lineMiterLimit(Float f) {
        return new LayoutPropertyValue("line-miter-limit", f);
    }

    public static <T> PropertyValue<Function<T, Float>> lineOffset(Function<T, Float> function) {
        return new PaintPropertyValue("line-offset", function);
    }

    public static PropertyValue<Float> lineOffset(Float f) {
        return new PaintPropertyValue("line-offset", f);
    }

    public static <T> PropertyValue<Function<T, Float>> lineOpacity(Function<T, Float> function) {
        return new PaintPropertyValue("line-opacity", function);
    }

    public static PropertyValue<Float> lineOpacity(Float f) {
        return new PaintPropertyValue("line-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> linePattern(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("line-pattern", cameraFunction);
    }

    public static PropertyValue<String> linePattern(String str) {
        return new PaintPropertyValue("line-pattern", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> lineRoundLimit(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("line-round-limit", cameraFunction);
    }

    public static PropertyValue<Float> lineRoundLimit(Float f) {
        return new LayoutPropertyValue("line-round-limit", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> lineTranslate(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("line-translate", cameraFunction);
    }

    public static PropertyValue<Float[]> lineTranslate(Float[] fArr) {
        return new PaintPropertyValue("line-translate", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> lineTranslateAnchor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("line-translate-anchor", cameraFunction);
    }

    public static PropertyValue<String> lineTranslateAnchor(String str) {
        return new PaintPropertyValue("line-translate-anchor", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> lineWidth(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("line-width", cameraFunction);
    }

    public static PropertyValue<Float> lineWidth(Float f) {
        return new PaintPropertyValue("line-width", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterBrightnessMax(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-brightness-max", cameraFunction);
    }

    public static PropertyValue<Float> rasterBrightnessMax(Float f) {
        return new PaintPropertyValue("raster-brightness-max", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterBrightnessMin(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-brightness-min", cameraFunction);
    }

    public static PropertyValue<Float> rasterBrightnessMin(Float f) {
        return new PaintPropertyValue("raster-brightness-min", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterContrast(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-contrast", cameraFunction);
    }

    public static PropertyValue<Float> rasterContrast(Float f) {
        return new PaintPropertyValue("raster-contrast", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterFadeDuration(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-fade-duration", cameraFunction);
    }

    public static PropertyValue<Float> rasterFadeDuration(Float f) {
        return new PaintPropertyValue("raster-fade-duration", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterHueRotate(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-hue-rotate", cameraFunction);
    }

    public static PropertyValue<Float> rasterHueRotate(Float f) {
        return new PaintPropertyValue("raster-hue-rotate", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterOpacity(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-opacity", cameraFunction);
    }

    public static PropertyValue<Float> rasterOpacity(Float f) {
        return new PaintPropertyValue("raster-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> rasterSaturation(CameraFunction<Z, Float> cameraFunction) {
        return new PaintPropertyValue("raster-saturation", cameraFunction);
    }

    public static PropertyValue<Float> rasterSaturation(Float f) {
        return new PaintPropertyValue("raster-saturation", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> symbolAvoidEdges(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("symbol-avoid-edges", cameraFunction);
    }

    public static PropertyValue<Boolean> symbolAvoidEdges(Boolean bool) {
        return new LayoutPropertyValue("symbol-avoid-edges", bool);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> symbolPlacement(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("symbol-placement", cameraFunction);
    }

    public static PropertyValue<String> symbolPlacement(String str) {
        return new LayoutPropertyValue("symbol-placement", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> symbolSpacing(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("symbol-spacing", cameraFunction);
    }

    public static PropertyValue<Float> symbolSpacing(Float f) {
        return new LayoutPropertyValue("symbol-spacing", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> textAllowOverlap(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("text-allow-overlap", cameraFunction);
    }

    public static PropertyValue<Boolean> textAllowOverlap(Boolean bool) {
        return new LayoutPropertyValue("text-allow-overlap", bool);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> textAnchor(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("text-anchor", cameraFunction);
    }

    public static PropertyValue<String> textAnchor(String str) {
        return new LayoutPropertyValue("text-anchor", str);
    }

    public static PropertyValue<String> textColor(int i) {
        return new PaintPropertyValue("text-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> textColor(Function<T, String> function) {
        return new PaintPropertyValue("text-color", function);
    }

    public static PropertyValue<String> textColor(String str) {
        return new PaintPropertyValue("text-color", str);
    }

    public static <T> PropertyValue<Function<T, String>> textField(Function<T, String> function) {
        return new LayoutPropertyValue("text-field", function);
    }

    public static PropertyValue<String> textField(String str) {
        return new LayoutPropertyValue("text-field", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String[]>> textFont(CameraFunction<Z, String[]> cameraFunction) {
        return new LayoutPropertyValue("text-font", cameraFunction);
    }

    public static PropertyValue<String[]> textFont(String[] strArr) {
        return new LayoutPropertyValue("text-font", strArr);
    }

    public static <T> PropertyValue<Function<T, Float>> textHaloBlur(Function<T, Float> function) {
        return new PaintPropertyValue("text-halo-blur", function);
    }

    public static PropertyValue<Float> textHaloBlur(Float f) {
        return new PaintPropertyValue("text-halo-blur", f);
    }

    public static PropertyValue<String> textHaloColor(int i) {
        return new PaintPropertyValue("text-halo-color", colorToRgbaString(i));
    }

    public static <T> PropertyValue<Function<T, String>> textHaloColor(Function<T, String> function) {
        return new PaintPropertyValue("text-halo-color", function);
    }

    public static PropertyValue<String> textHaloColor(String str) {
        return new PaintPropertyValue("text-halo-color", str);
    }

    public static <T> PropertyValue<Function<T, Float>> textHaloWidth(Function<T, Float> function) {
        return new PaintPropertyValue("text-halo-width", function);
    }

    public static PropertyValue<Float> textHaloWidth(Float f) {
        return new PaintPropertyValue("text-halo-width", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> textIgnorePlacement(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("text-ignore-placement", cameraFunction);
    }

    public static PropertyValue<Boolean> textIgnorePlacement(Boolean bool) {
        return new LayoutPropertyValue("text-ignore-placement", bool);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> textJustify(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("text-justify", cameraFunction);
    }

    public static PropertyValue<String> textJustify(String str) {
        return new LayoutPropertyValue("text-justify", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> textKeepUpright(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("text-keep-upright", cameraFunction);
    }

    public static PropertyValue<Boolean> textKeepUpright(Boolean bool) {
        return new LayoutPropertyValue("text-keep-upright", bool);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> textLetterSpacing(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("text-letter-spacing", cameraFunction);
    }

    public static PropertyValue<Float> textLetterSpacing(Float f) {
        return new LayoutPropertyValue("text-letter-spacing", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> textLineHeight(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("text-line-height", cameraFunction);
    }

    public static PropertyValue<Float> textLineHeight(Float f) {
        return new LayoutPropertyValue("text-line-height", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> textMaxAngle(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("text-max-angle", cameraFunction);
    }

    public static PropertyValue<Float> textMaxAngle(Float f) {
        return new LayoutPropertyValue("text-max-angle", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> textMaxWidth(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("text-max-width", cameraFunction);
    }

    public static PropertyValue<Float> textMaxWidth(Float f) {
        return new LayoutPropertyValue("text-max-width", f);
    }

    public static <T> PropertyValue<Function<T, Float[]>> textOffset(Function<T, Float[]> function) {
        return new LayoutPropertyValue("text-offset", function);
    }

    public static PropertyValue<Float[]> textOffset(Float[] fArr) {
        return new LayoutPropertyValue("text-offset", fArr);
    }

    public static <T> PropertyValue<Function<T, Float>> textOpacity(Function<T, Float> function) {
        return new PaintPropertyValue("text-opacity", function);
    }

    public static PropertyValue<Float> textOpacity(Float f) {
        return new PaintPropertyValue("text-opacity", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Boolean>> textOptional(CameraFunction<Z, Boolean> cameraFunction) {
        return new LayoutPropertyValue("text-optional", cameraFunction);
    }

    public static PropertyValue<Boolean> textOptional(Boolean bool) {
        return new LayoutPropertyValue("text-optional", bool);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float>> textPadding(CameraFunction<Z, Float> cameraFunction) {
        return new LayoutPropertyValue("text-padding", cameraFunction);
    }

    public static PropertyValue<Float> textPadding(Float f) {
        return new LayoutPropertyValue("text-padding", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> textPitchAlignment(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("text-pitch-alignment", cameraFunction);
    }

    public static PropertyValue<String> textPitchAlignment(String str) {
        return new LayoutPropertyValue("text-pitch-alignment", str);
    }

    public static <T> PropertyValue<Function<T, Float>> textRotate(Function<T, Float> function) {
        return new LayoutPropertyValue("text-rotate", function);
    }

    public static PropertyValue<Float> textRotate(Float f) {
        return new LayoutPropertyValue("text-rotate", f);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> textRotationAlignment(CameraFunction<Z, String> cameraFunction) {
        return new LayoutPropertyValue("text-rotation-alignment", cameraFunction);
    }

    public static PropertyValue<String> textRotationAlignment(String str) {
        return new LayoutPropertyValue("text-rotation-alignment", str);
    }

    public static <T> PropertyValue<Function<T, Float>> textSize(Function<T, Float> function) {
        return new LayoutPropertyValue("text-size", function);
    }

    public static PropertyValue<Float> textSize(Float f) {
        return new LayoutPropertyValue("text-size", f);
    }

    public static <T> PropertyValue<Function<T, String>> textTransform(Function<T, String> function) {
        return new LayoutPropertyValue("text-transform", function);
    }

    public static PropertyValue<String> textTransform(String str) {
        return new LayoutPropertyValue("text-transform", str);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, Float[]>> textTranslate(CameraFunction<Z, Float[]> cameraFunction) {
        return new PaintPropertyValue("text-translate", cameraFunction);
    }

    public static PropertyValue<Float[]> textTranslate(Float[] fArr) {
        return new PaintPropertyValue("text-translate", fArr);
    }

    public static <Z extends Number> PropertyValue<CameraFunction<Z, String>> textTranslateAnchor(CameraFunction<Z, String> cameraFunction) {
        return new PaintPropertyValue("text-translate-anchor", cameraFunction);
    }

    public static PropertyValue<String> textTranslateAnchor(String str) {
        return new PaintPropertyValue("text-translate-anchor", str);
    }

    public static <T> PropertyValue<Function<T, String>> visibility(Function<T, String> function) {
        return new LayoutPropertyValue("visibility", function);
    }

    public static PropertyValue<String> visibility(String str) {
        return new LayoutPropertyValue("visibility", str);
    }
}
