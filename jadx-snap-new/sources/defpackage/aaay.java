package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaay */
public final class aaay extends abhw {
    public String a;
    public Long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    private String i;
    private String j;
    private aacs k;
    private aaby l;

    private aaay a() {
        aaay aaay = (aaay) super.clone();
        String str = this.a;
        if (str != null) {
            aaay.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aaay.b = l;
        }
        str = this.c;
        if (str != null) {
            aaay.c = str;
        }
        str = this.d;
        if (str != null) {
            aaay.d = str;
        }
        str = this.i;
        if (str != null) {
            aaay.i = str;
        }
        str = this.e;
        if (str != null) {
            aaay.e = str;
        }
        str = this.f;
        if (str != null) {
            aaay.f = str;
        }
        str = this.j;
        if (str != null) {
            aaay.j = str;
        }
        aacs aacs = this.k;
        if (aacs != null) {
            aaay.k = aacs;
        }
        aaby aaby = this.l;
        if (aaby != null) {
            aaay.l = aaby;
        }
        str = this.g;
        if (str != null) {
            aaay.g = str;
        }
        str = this.h;
        if (str != null) {
            aaay.h = str;
        }
        return aaay;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("power_mode", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("latency_millis", l);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("splits", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("start_type", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("start_sub_type", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("user_action", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("mem_info", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("cpu_info", str);
        }
        aacs aacs = this.k;
        if (aacs != null) {
            hashMap.put("camera_start_type", aacs.toString());
        }
        aaby aaby = this.l;
        if (aaby != null) {
            hashMap.put("camera_direction", aaby.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("analytics_version", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("channel_id", str);
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
        return asDictionary().equals(((aaay) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_STARTUP_COMPLETE";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aacs aacs = this.k;
        hashCode = (hashCode + (aacs != null ? aacs.hashCode() : 0)) * 31;
        aaby aaby = this.l;
        hashCode = (hashCode + (aaby != null ? aaby.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
