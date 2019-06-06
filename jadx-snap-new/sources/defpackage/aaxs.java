package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxs */
public final class aaxs extends abhw {
    private String a;

    private aaxs a() {
        aaxs aaxs = (aaxs) super.clone();
        String str = this.a;
        if (str != null) {
            aaxs.a = str;
        }
        return aaxs;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("url_path", str);
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
        return asDictionary().equals(((aaxs) obj).asDictionary());
    }

    public final String getEventName() {
        return "REQUEST_AUTH_FLAG_MISSING";
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
