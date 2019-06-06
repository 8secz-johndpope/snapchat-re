package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakx */
public final class aakx extends abhw {
    public Boolean a;
    private String b;
    private String c;

    private aakx a() {
        aakx aakx = (aakx) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aakx.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aakx.b = str;
        }
        str = this.c;
        if (str != null) {
            aakx.c = str;
        }
        return aakx;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("source", str);
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
        return asDictionary().equals(((aakx) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_GRAPH_READ";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
