package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqq */
public final class aaqq extends abhw {
    private Long a;
    private String b;
    private String c;
    private aaqp d;
    private Long e;
    private Double f;
    private Boolean g;

    private aaqq a() {
        aaqq aaqq = (aaqq) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqq.a = l;
        }
        String str = this.b;
        if (str != null) {
            aaqq.b = str;
        }
        str = this.c;
        if (str != null) {
            aaqq.c = str;
        }
        aaqp aaqp = this.d;
        if (aaqp != null) {
            aaqq.d = aaqp;
        }
        l = this.e;
        if (l != null) {
            aaqq.e = l;
        }
        Double d = this.f;
        if (d != null) {
            aaqq.f = d;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aaqq.g = bool;
        }
        return aaqq;
    }

    public final void a(aaqp aaqp) {
        this.d = aaqp;
    }

    public final void a(Boolean bool) {
        this.g = bool;
    }

    public final void a(Double d) {
        this.f = d;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("game_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("marker_id", str);
        }
        aaqp aaqp = this.d;
        if (aaqp != null) {
            hashMap.put(MapboxEvent.KEY_RESOLUTION, aaqp.toString());
        }
        l = this.e;
        if (l != null) {
            hashMap.put("score", l);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("user_distance_from_marker", d);
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("user_in_ghost_mode", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaqq) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_GAME_MARKER_TAP_TO_UNLOCK";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaqp aaqp = this.d;
        hashCode = (hashCode + (aaqp != null ? aaqp.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
