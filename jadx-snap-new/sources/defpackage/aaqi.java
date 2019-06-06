package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqi */
public final class aaqi extends abhw {
    public Long a;
    public Long b;
    public String c;

    private aaqi a() {
        aaqi aaqi = (aaqi) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqi.a = l;
        }
        l = this.b;
        if (l != null) {
            aaqi.b = l;
        }
        String str = this.c;
        if (str != null) {
            aaqi.c = str;
        }
        return aaqi;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("status_available_count", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("announcement_id", str);
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
        return asDictionary().equals(((aaqi) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_EXPLORE_BUTTON_APPEAR";
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
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
