package defpackage;

import java.util.Locale;

/* renamed from: afgk */
public enum afgk {
    CURRENT_WEATHER("Current_Weather"),
    HOURLY_FORECAST("Hourly_Forecast"),
    DAILY_FORECAST("Daily_Forecast"),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private afgk(String str) {
        this.value = str;
    }

    public static afgk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afgk.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
