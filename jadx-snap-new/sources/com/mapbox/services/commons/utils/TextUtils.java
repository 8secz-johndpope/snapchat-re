package com.mapbox.services.commons.utils;

import defpackage.cgp;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TextUtils {
    public static String formatCoordinate(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.######", new DecimalFormatSymbols(Locale.US));
        return String.format(cgp.a, "%s", new Object[]{decimalFormat.format(d)});
    }

    public static String formatCoordinate(double d, int i) {
        StringBuilder stringBuilder = new StringBuilder("0.");
        stringBuilder.append(new String(new char[i]).replace("\u0000", "0"));
        String stringBuilder2 = stringBuilder.toString();
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
        decimalFormat.applyPattern(stringBuilder2);
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        return decimalFormat.format(d);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String join(CharSequence charSequence, Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (Object obj2 : objArr) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(charSequence);
            }
            stringBuilder.append(obj2);
        }
        return stringBuilder.toString();
    }
}
