package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.exceptions.ConversionException;
import defpackage.hr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorUtils {
    public static int getAccentColor(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    public static int getPrimaryColor(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    public static int getPrimaryDarkColor(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimaryDark, typedValue, true);
        return typedValue.data;
    }

    public static ColorStateList getSelector(int i) {
        r2 = new int[2][];
        r2[0] = new int[]{16842919};
        r2[1] = new int[0];
        return new ColorStateList(r2, new int[]{i, i});
    }

    static int normalizeColorComponent(String str) {
        return (int) (Float.parseFloat(str) * 255.0f);
    }

    public static int rgbaToColor(String str) {
        Matcher matcher = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(str);
        if (matcher.matches() && matcher.groupCount() == 3) {
            return Color.rgb(normalizeColorComponent(matcher.group(1)), normalizeColorComponent(matcher.group(2)), normalizeColorComponent(matcher.group(3)));
        }
        if (matcher.matches() && matcher.groupCount() == 4) {
            return Color.argb(normalizeColorComponent(matcher.group(4)), normalizeColorComponent(matcher.group(1)), normalizeColorComponent(matcher.group(2)), normalizeColorComponent(matcher.group(3)));
        }
        throw new ConversionException("Not a valid rgb/rgba value");
    }

    public static void setTintList(ImageView imageView, int i) {
        hr.a(hr.d(imageView.getDrawable()), getSelector(i));
    }
}
