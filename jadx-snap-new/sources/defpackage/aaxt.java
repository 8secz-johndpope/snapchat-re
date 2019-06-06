package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxt */
public final class aaxt extends abhw {
    private String a;

    private aaxt a() {
        aaxt aaxt = (aaxt) super.clone();
        String str = this.a;
        if (str != null) {
            aaxt.a = str;
        }
        return aaxt;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("request_ids", str);
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
        return asDictionary().equals(((aaxt) obj).asDictionary());
    }

    public final String getEventName() {
        return "REQUEST_CONSUMED";
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
