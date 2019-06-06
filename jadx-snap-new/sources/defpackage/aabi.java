package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabi */
public final class aabi extends abhw {
    public String a;
    public Long b;
    public String c;
    public String d;
    private String e;
    private String f;
    private aabc g;

    private aabi a() {
        aabi aabi = (aabi) super.clone();
        String str = this.e;
        if (str != null) {
            aabi.e = str;
        }
        str = this.f;
        if (str != null) {
            aabi.f = str;
        }
        aabc aabc = this.g;
        if (aabc != null) {
            aabi.g = aabc;
        }
        str = this.a;
        if (str != null) {
            aabi.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aabi.b = l;
        }
        str = this.c;
        if (str != null) {
            aabi.c = str;
        }
        str = this.d;
        if (str != null) {
            aabi.d = str;
        }
        return aabi;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.e;
        if (str != null) {
            hashMap.put("battery_state", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("network_state", str);
        }
        aabc aabc = this.g;
        if (aabc != null) {
            hashMap.put("app_state", aabc.toString());
        }
        str = this.a;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("process_latency_ms", l);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("prefetch_result", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("prefetch_id", str);
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
        return asDictionary().equals(((aabi) obj).asDictionary());
    }

    public final String getEventName() {
        return "BACKGROUND_PREFETCH_FINISHED";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.e;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabc aabc = this.g;
        hashCode = (hashCode + (aabc != null ? aabc.hashCode() : 0)) * 31;
        str = this.a;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
