package defpackage;

import java.util.Locale;

/* renamed from: aeku */
public enum aeku {
    GEOFILTER_TYPE("geofilter_type"),
    VISUAL_FILTER_TYPE("visual_filter_type"),
    INFO_FILTER_TYPE("info_filter_type"),
    MOTION_FILTER_TYPE("motion_filter_type"),
    BITMOJI_FILTER_TYPE("bitmoji_filter_type"),
    VENUE_FILTER_TYPE("venue_filter_type"),
    STREAK_FILTER_TYPE("streak_filter_type"),
    UNRECOGNIZED_VALUE(r9);
    
    private final String value;

    private aeku(String str) {
        this.value = str;
    }

    public static aeku a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeku.valueOf(str.toUpperCase(Locale.US));
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
