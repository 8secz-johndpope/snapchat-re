package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalk */
public final class aalk extends abhw {
    public aall a;
    public String b;
    public String c;
    public String d;

    private aalk a() {
        aalk aalk = (aalk) super.clone();
        aall aall = this.a;
        if (aall != null) {
            aalk.a = aall;
        }
        String str = this.b;
        if (str != null) {
            aalk.b = str;
        }
        str = this.c;
        if (str != null) {
            aalk.c = str;
        }
        str = this.d;
        if (str != null) {
            aalk.d = str;
        }
        return aalk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aall aall = this.a;
        if (aall != null) {
            hashMap.put("event_type", aall.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("error_message", str);
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
        return asDictionary().equals(((aalk) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_SEK_CRYPTO_OPS";
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
        aall aall = this.a;
        int i = 0;
        hashCode = (hashCode + (aall != null ? aall.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
