package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqk */
public final class aaqk extends abhw {
    public Long a;
    public String b;
    public String c;
    public Long d;
    public Boolean e;
    private Long f;

    private aaqk a() {
        aaqk aaqk = (aaqk) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqk.a = l;
        }
        String str = this.b;
        if (str != null) {
            aaqk.b = str;
        }
        l = this.f;
        if (l != null) {
            aaqk.f = l;
        }
        str = this.c;
        if (str != null) {
            aaqk.c = str;
        }
        l = this.d;
        if (l != null) {
            aaqk.d = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aaqk.e = bool;
        }
        return aaqk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("status_type", str);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("status_type_enum", l);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("status_id", str);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("view_count", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("with_my_status_tap", bool);
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
        return asDictionary().equals(((aaqk) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_EXPLORE_MY_STATUS_VIEW";
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
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
