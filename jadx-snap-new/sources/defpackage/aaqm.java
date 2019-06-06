package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqm */
public final class aaqm extends abhw {
    public Long a;
    public Long b;
    public String c;
    public String d;

    private aaqm a() {
        aaqm aaqm = (aaqm) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqm.a = l;
        }
        l = this.b;
        if (l != null) {
            aaqm.b = l;
        }
        String str = this.c;
        if (str != null) {
            aaqm.c = str;
        }
        str = this.d;
        if (str != null) {
            aaqm.d = str;
        }
        return aaqm;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("status_type_enum", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("status_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("friend_user_id", str);
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
        return asDictionary().equals(((aaqm) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_EXPLORE_STATUS_VIEW";
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
