package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabk */
public final class aabk extends abhw {
    public String a;
    public String b;
    private Long c;
    private String d;

    private aabk a() {
        aabk aabk = (aabk) super.clone();
        Long l = this.c;
        if (l != null) {
            aabk.c = l;
        }
        String str = this.d;
        if (str != null) {
            aabk.d = str;
        }
        str = this.a;
        if (str != null) {
            aabk.a = str;
        }
        str = this.b;
        if (str != null) {
            aabk.b = str;
        }
        return aabk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.c;
        if (l != null) {
            hashMap.put("prefetch_interval_in_seconds", l);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("constraints", str);
        }
        str = this.a;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        str = this.b;
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
        return asDictionary().equals(((aabk) obj).asDictionary());
    }

    public final String getEventName() {
        return "BACKGROUND_PREFETCH_SCHEDULED";
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
        Long l = this.c;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.a;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
