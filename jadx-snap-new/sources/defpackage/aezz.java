package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.Locale;

/* renamed from: aezz */
public enum aezz {
    MISS_ETIKATE("miss_etikate"),
    INSTA_SNAP("insta_snap"),
    SMOOTH("smooth"),
    PROMPT("prompt"),
    SPEED("speed"),
    TIMESTAMP("timestamp"),
    BATTERY("battery"),
    WEATHER("weather"),
    ALTITUDE(MapboxEvent.KEY_ALTITUDE),
    SLOW("slow"),
    FAST("fast"),
    SUPER_FAST("super_fast"),
    REVERSE("reverse"),
    GRAYSCALE("grayscale"),
    STREAK("streak"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aezz(String str) {
        this.value = str;
    }

    public static aezz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aezz.valueOf(str.toUpperCase(Locale.US));
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
