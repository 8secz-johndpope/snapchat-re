package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aarn */
public final class aarn extends abhw {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    private Double j;

    private aarn a() {
        aarn aarn = (aarn) super.clone();
        Long l = this.a;
        if (l != null) {
            aarn.a = l;
        }
        Double d = this.j;
        if (d != null) {
            aarn.j = d;
        }
        l = this.b;
        if (l != null) {
            aarn.b = l;
        }
        l = this.c;
        if (l != null) {
            aarn.c = l;
        }
        l = this.d;
        if (l != null) {
            aarn.d = l;
        }
        l = this.e;
        if (l != null) {
            aarn.e = l;
        }
        l = this.f;
        if (l != null) {
            aarn.f = l;
        }
        l = this.g;
        if (l != null) {
            aarn.g = l;
        }
        l = this.h;
        if (l != null) {
            aarn.h = l;
        }
        l = this.i;
        if (l != null) {
            aarn.i = l;
        }
        return aarn;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        Double d = this.j;
        if (d != null) {
            hashMap.put(MapboxEvent.KEY_ZOOM, d);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("viewport_friend_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("viewport_friend_with_bitmojis", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("time_to_user_showing_on_map_ms", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("time_to_friend_bitmojis_loaded_ms", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("number_of_story_thumbnails", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("time_to_story_thumbnails_loaded_ms", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("number_of_heat_points", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("time_to_heat_loaded_ms", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aarn) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_VIEWPORT_LOADED";
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
        Double d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
