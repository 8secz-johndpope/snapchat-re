package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakt */
public final class aakt extends abhw {
    public String a;

    private aakt a() {
        aakt aakt = (aakt) super.clone();
        String str = this.a;
        if (str != null) {
            aakt.a = str;
        }
        return aakt;
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
        return asDictionary().equals(((aakt) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_FETCH_CONVERSATION";
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
