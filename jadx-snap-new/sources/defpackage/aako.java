package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aako */
public final class aako extends abhw {
    public String a;

    private aako a() {
        aako aako = (aako) super.clone();
        String str = this.a;
        if (str != null) {
            aako.a = str;
        }
        return aako;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
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
        return asDictionary().equals(((aako) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_CLIENT_RETRY_INIT";
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
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
