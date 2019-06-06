package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: iex */
public enum iex {
    WWAN("wwan"),
    WIFI(MapboxEvent.KEY_WIFI),
    NOT_REACHABLE("not_reachable"),
    UNRECOGNIZED_VALUE("unrecognized_value");
    
    private final String value;

    private iex(String str) {
        akcr.b(str, "value");
        this.value = str;
    }
}
