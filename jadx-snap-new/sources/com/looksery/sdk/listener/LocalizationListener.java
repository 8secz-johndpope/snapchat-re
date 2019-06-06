package com.looksery.sdk.listener;

public interface LocalizationListener {
    String getDayOfWeek(int i, int i2, int i3);

    String[] getDeviceLanguages();

    String[] getFallbackFonts(String[] strArr);

    String getFormattedDate(int i, int i2, int i3);

    String getFormattedDateAndTime(int i, int i2, int i3, int i4, int i5, int i6);

    String getFormattedDateShort(int i, int i2, int i3);

    String getFormattedDistanceFromMeters(double d);

    String getFormattedNumber(double d);

    String getFormattedSeconds(long j);

    String getFormattedTemperatureFromCelsius(double d);

    String getFormattedTime(int i, int i2, int i3);

    String getMonth(int i);
}
