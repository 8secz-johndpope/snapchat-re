package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aark */
public final class aark extends abhw {
    public Long a;
    public Double b;
    public Double c;
    public Double d;
    public aarj e;
    public String f;
    public Double g;
    public Double h;

    private aark a() {
        aark aark = (aark) super.clone();
        Long l = this.a;
        if (l != null) {
            aark.a = l;
        }
        Double d = this.b;
        if (d != null) {
            aark.b = d;
        }
        d = this.c;
        if (d != null) {
            aark.c = d;
        }
        d = this.d;
        if (d != null) {
            aark.d = d;
        }
        aarj aarj = this.e;
        if (aarj != null) {
            aark.e = aarj;
        }
        String str = this.f;
        if (str != null) {
            aark.f = str;
        }
        d = this.g;
        if (d != null) {
            aark.g = d;
        }
        d = this.h;
        if (d != null) {
            aark.h = d;
        }
        return aark;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("lat", d);
        }
        d = this.c;
        if (d != null) {
            hashMap.put("lng", d);
        }
        d = this.d;
        if (d != null) {
            hashMap.put(MapboxEvent.KEY_ZOOM, d);
        }
        aarj aarj = this.e;
        if (aarj != null) {
            hashMap.put("map_tap_to_play_result", aarj.toString());
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("map_poi_id", str);
        }
        d = this.g;
        if (d != null) {
            hashMap.put("distance_from_user_meter", d);
        }
        d = this.h;
        if (d != null) {
            hashMap.put("distance_from_friend_min_meter", d);
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
        return asDictionary().equals(((aark) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_TTP_ACTION";
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
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aarj aarj = this.e;
        hashCode = (hashCode + (aarj != null ? aarj.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.h;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
