package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbq */
public final class abbq extends abeb {
    public String a;
    public abbw b;
    public abbx c;
    private String d;
    private String e;
    private String f;

    private abbq a() {
        abbq abbq = (abbq) super.clone();
        String str = this.a;
        if (str != null) {
            abbq.a = str;
        }
        abbw abbw = this.b;
        if (abbw != null) {
            abbq.b = abbw;
        }
        abbx abbx = this.c;
        if (abbx != null) {
            abbq.c = abbx;
        }
        str = this.d;
        if (str != null) {
            abbq.d = str;
        }
        str = this.e;
        if (str != null) {
            abbq.e = str;
        }
        str = this.f;
        if (str != null) {
            abbq.f = str;
        }
        return abbq;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("crash_grouping_identifier", str);
        }
        abbw abbw = this.b;
        if (abbw != null) {
            hashMap.put("crash_type", abbw.toString());
        }
        abbx abbx = this.c;
        if (abbx != null) {
            hashMap.put("error_type", abbx.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("transfer_session_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("pairing_session_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("update_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbq) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_DEBUG_REPORT";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbw abbw = this.b;
        hashCode = (hashCode + (abbw != null ? abbw.hashCode() : 0)) * 31;
        abbx abbx = this.c;
        hashCode = (hashCode + (abbx != null ? abbx.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
