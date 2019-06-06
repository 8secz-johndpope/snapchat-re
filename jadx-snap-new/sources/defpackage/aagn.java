package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagn */
public final class aagn extends aaga {
    public aafz a;
    public aaxv b;
    public Boolean c;
    public Long d;
    public String e;
    public Long f;

    private aagn a() {
        aagn aagn = (aagn) super.clone();
        aafz aafz = this.a;
        if (aafz != null) {
            aagn.a = aafz;
        }
        aaxv aaxv = this.b;
        if (aaxv != null) {
            aagn.b = aaxv;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aagn.c = bool;
        }
        Long l = this.d;
        if (l != null) {
            aagn.d = l;
        }
        String str = this.e;
        if (str != null) {
            aagn.e = str;
        }
        l = this.f;
        if (l != null) {
            aagn.f = l;
        }
        return aagn;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafz aafz = this.a;
        if (aafz != null) {
            hashMap.put("endpoint", aafz.toString());
        }
        aaxv aaxv = this.b;
        if (aaxv != null) {
            hashMap.put("action", aaxv.toString());
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("request_result", bool);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("status_code", l);
        }
        String str = this.e;
        if (str != null) {
            hashMap.put("commerce_error_code", str);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("latency", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aagn) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_REST_ACTION_EVENT";
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
        aafz aafz = this.a;
        int i = 0;
        hashCode = (hashCode + (aafz != null ? aafz.hashCode() : 0)) * 31;
        aaxv aaxv = this.b;
        hashCode = (hashCode + (aaxv != null ? aaxv.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
