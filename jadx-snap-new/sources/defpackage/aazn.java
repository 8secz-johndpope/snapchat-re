package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazn */
public final class aazn extends abhw {
    private aaua a;
    private Long b;
    private String c;
    private aabr d;

    private aazn a() {
        aazn aazn = (aazn) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazn.a = aaua;
        }
        Long l = this.b;
        if (l != null) {
            aazn.b = l;
        }
        String str = this.c;
        if (str != null) {
            aazn.c = str;
        }
        aabr aabr = this.d;
        if (aabr != null) {
            aazn.d = aabr;
        }
        return aazn;
    }

    public final void a(aabr aabr) {
        this.d = aabr;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("bitmoji_selfie_id", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("bitmoji_session_id", str);
        }
        aabr aabr = this.d;
        if (aabr != null) {
            hashMap.put("action", aabr.toString());
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
        return asDictionary().equals(((aazn) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_SELFIE_ACTION";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabr aabr = this.d;
        if (aabr != null) {
            i = aabr.hashCode();
        }
        return hashCode + i;
    }
}
