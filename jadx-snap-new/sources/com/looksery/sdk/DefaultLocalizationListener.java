package com.looksery.sdk;

import android.annotation.TargetApi;
import android.icu.text.MeasureFormat;
import android.icu.text.MeasureFormat.FormatWidth;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.format.DateUtils;
import com.looksery.sdk.listener.LocalizationListener;
import defpackage.ukq;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

final class DefaultLocalizationListener implements LocalizationListener {
    private static final DateFormat DATE_FORMAT = DateFormat.getDateInstance(2);
    private static final DateFormat DATE_TIME_FORMAT = DateFormat.getDateTimeInstance(2, 3);
    private static final DateFormat DAY_FORMAT = new SimpleDateFormat("EEEE");
    private static final int MAXIMUM_ALLOWED_FONTS = 400;
    private static final int MAXIMUM_METERS = 100;
    private static final double METERS_IN_A_FOOT = 0.3048d;
    private static final double METERS_IN_A_MILE = 1609.0d;
    private static final DateFormat MONTH_FORMAT = new SimpleDateFormat("LLLL");
    private static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
    private static final DateFormat SHORT_DATE_FORMAT = DateFormat.getDateInstance(3);
    private static final DateFormat TIME_FORMAT = DateFormat.getTimeInstance(3);
    private final FallbackFontParser mFallbackFontParser = FallbackFontParser.newInstance(true);

    DefaultLocalizationListener() {
    }

    private static double convertCelciusToFahrenheit(double d) {
        return ((d * 9.0d) / 5.0d) + 32.0d;
    }

    private static double convertMetersToFeet(double d) {
        return d / METERS_IN_A_FOOT;
    }

    private static double convertMetersToMiles(double d) {
        return d / METERS_IN_A_MILE;
    }

    private static String getCoreFormattedLanguageCode(Locale locale) {
        String locale2 = locale.toString();
        String str = "zh-Hant";
        if (locale2.startsWith("zh_TW")) {
            return str;
        }
        if (locale2.startsWith(ukq.c)) {
            return locale2.contains("Hant") ? str : "zh-Hans";
        } else {
            if (locale2.startsWith("pt_PT")) {
                return "pt-PT";
            }
            if (locale2.startsWith("en_GB")) {
                return "en-GB";
            }
            int indexOf = locale2.indexOf(95);
            if (indexOf > 0) {
                locale2 = locale2.substring(0, indexOf);
            }
            return locale2;
        }
    }

    @TargetApi(24)
    private static MeasureFormat getMeasureFormatter() {
        return MeasureFormat.getInstance(Locale.getDefault(), FormatWidth.SHORT);
    }

    private static boolean shouldUseFahrenheit() {
        return Locale.getDefault().equals(Locale.US);
    }

    private static boolean shouldUseImperialUnits() {
        Locale locale = Locale.getDefault();
        return locale.equals(Locale.US) || locale.equals(Locale.UK);
    }

    private static boolean useKilometersOrMiles(double d) {
        return d > 100.0d;
    }

    public final String getDayOfWeek(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        return DAY_FORMAT.format(instance.getTime());
    }

    public final String[] getDeviceLanguages() {
        String[] strArr;
        int i = 0;
        if (VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            strArr = new String[(localeList.size() + 1)];
            while (i < localeList.size()) {
                strArr[i] = getCoreFormattedLanguageCode(localeList.get(i));
                i++;
            }
        } else {
            strArr = new String[2];
            strArr[0] = getCoreFormattedLanguageCode(Locale.getDefault());
        }
        strArr[strArr.length - 1] = "en";
        return strArr;
    }

    public final String[] getFallbackFonts(String[] strArr) {
        String str = (strArr == null || strArr.length <= 0) ? "en" : strArr[0];
        strArr = this.mFallbackFontParser.getFallbackFontsForLanguage(FallbackFontParser.findFontsXmlFile(), str);
        return strArr.length > MAXIMUM_ALLOWED_FONTS ? (String[]) Arrays.copyOf(strArr, MAXIMUM_ALLOWED_FONTS) : strArr;
    }

    public final String getFormattedDate(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        return DATE_FORMAT.format(instance.getTime());
    }

    public final String getFormattedDateAndTime(int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3, i4, i5, i6);
        return DATE_TIME_FORMAT.format(instance.getTime());
    }

    public final String getFormattedDateShort(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        return SHORT_DATE_FORMAT.format(instance.getTime());
    }

    public final String getFormattedDistanceFromMeters(double d) {
        StringBuilder stringBuilder;
        if (useKilometersOrMiles(d)) {
            if (shouldUseImperialUnits()) {
                d = convertMetersToMiles(d);
                if (VERSION.SDK_INT >= 24) {
                    return getMeasureFormatter().format(new Measure(Double.valueOf(d), MeasureUnit.MILE));
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(getFormattedNumber(d));
                stringBuilder.append(" mi");
                return stringBuilder.toString();
            }
            d /= 1000.0d;
            if (VERSION.SDK_INT >= 24) {
                return getMeasureFormatter().format(new Measure(Double.valueOf(d), MeasureUnit.KILOMETER));
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(getFormattedNumber(d));
            stringBuilder.append(" km");
            return stringBuilder.toString();
        } else if (shouldUseImperialUnits()) {
            d = convertMetersToFeet(d);
            if (VERSION.SDK_INT >= 24) {
                return getMeasureFormatter().format(new Measure(Double.valueOf(d), MeasureUnit.FOOT));
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(getFormattedNumber(d));
            stringBuilder.append(" ft");
            return stringBuilder.toString();
        } else if (VERSION.SDK_INT >= 24) {
            return getMeasureFormatter().format(new Measure(Double.valueOf(d), MeasureUnit.METER));
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getFormattedNumber(d));
            stringBuilder.append(" m");
            return stringBuilder.toString();
        }
    }

    public final String getFormattedNumber(double d) {
        return NUMBER_FORMAT.format(d);
    }

    public final String getFormattedSeconds(long j) {
        return DateUtils.formatElapsedTime(j);
    }

    public final String getFormattedTemperatureFromCelsius(double d) {
        StringBuilder stringBuilder;
        if (shouldUseFahrenheit()) {
            d = convertCelciusToFahrenheit(d);
            if (VERSION.SDK_INT >= 24) {
                return getMeasureFormatter().format(new Measure(Double.valueOf(d), MeasureUnit.FAHRENHEIT));
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(getFormattedNumber(d));
            stringBuilder.append(" °F");
            return stringBuilder.toString();
        } else if (VERSION.SDK_INT >= 24) {
            return getMeasureFormatter().format(new Measure(Double.valueOf(d), MeasureUnit.CELSIUS));
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getFormattedNumber(d));
            stringBuilder.append(" °C");
            return stringBuilder.toString();
        }
    }

    public final String getFormattedTime(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(0, 0, 0, i, i2, i3);
        return TIME_FORMAT.format(instance.getTime());
    }

    public final String getMonth(int i) {
        Calendar instance = Calendar.getInstance();
        instance.set(1970, i, 1);
        return MONTH_FORMAT.format(instance.getTime());
    }
}
