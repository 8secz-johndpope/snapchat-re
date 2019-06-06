package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.Locale;

/* renamed from: ahsx */
public enum ahsx {
    WWAN("wwan"),
    WIFI(MapboxEvent.KEY_WIFI),
    NOT_REACHABLE("not_reachable"),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahsx(String str) {
        this.value = str;
    }

    public static ahsx a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahsx.valueOf(str.toUpperCase(Locale.US));
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
