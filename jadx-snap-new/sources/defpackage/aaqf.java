package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqf */
public final class aaqf extends abhw {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;

    private aaqf a() {
        aaqf aaqf = (aaqf) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqf.a = l;
        }
        l = this.b;
        if (l != null) {
            aaqf.b = l;
        }
        l = this.c;
        if (l != null) {
            aaqf.c = l;
        }
        l = this.d;
        if (l != null) {
            aaqf.d = l;
        }
        l = this.e;
        if (l != null) {
            aaqf.e = l;
        }
        l = this.f;
        if (l != null) {
            aaqf.f = l;
        }
        l = this.g;
        if (l != null) {
            aaqf.g = l;
        }
        l = this.h;
        if (l != null) {
            aaqf.h = l;
        }
        return aaqf;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("number_of_taps", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("number_of_double_taps", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("number_of_pinches", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("number_of_pans", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("number_of_zoom_slider_uses", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("number_of_single_tap_zooms", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("number_of_two_finger_taps", l);
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
        return asDictionary().equals(((aaqf) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_BROWSE_ACTION";
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
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
