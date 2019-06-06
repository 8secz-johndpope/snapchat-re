package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaaw */
public final class aaaw extends abhw {
    public Long a;
    public Long b;
    public String c;
    public aahz d;
    private String e;
    private aabh f;

    private aaaw a() {
        aaaw aaaw = (aaaw) super.clone();
        Long l = this.a;
        if (l != null) {
            aaaw.a = l;
        }
        l = this.b;
        if (l != null) {
            aaaw.b = l;
        }
        String str = this.c;
        if (str != null) {
            aaaw.c = str;
        }
        aahz aahz = this.d;
        if (aahz != null) {
            aaaw.d = aahz;
        }
        str = this.e;
        if (str != null) {
            aaaw.e = str;
        }
        aabh aabh = this.f;
        if (aabh != null) {
            aaaw.f = aabh;
        }
        return aaaw;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("session_seq_num", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("since_last_session_sec", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("platform_services_version", str);
        }
        aahz aahz = this.d;
        if (aahz != null) {
            hashMap.put("deep_link_source", aahz.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        aabh aabh = this.f;
        if (aabh != null) {
            hashMap.put("application_state", aabh.toString());
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
        return asDictionary().equals(((aaaw) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_SESSION_START";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
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
        aahz aahz = this.d;
        hashCode = (hashCode + (aahz != null ? aahz.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabh aabh = this.f;
        if (aabh != null) {
            i = aabh.hashCode();
        }
        return hashCode + i;
    }
}
