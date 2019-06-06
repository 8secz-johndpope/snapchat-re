package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazu */
public final class aazu extends abhw {
    public aazt a;

    private aazu a() {
        aazu aazu = (aazu) super.clone();
        aazt aazt = this.a;
        if (aazt != null) {
            aazu.a = aazt;
        }
        return aazu;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aazt aazt = this.a;
        if (aazt != null) {
            hashMap.put("shake_prompt_cell", aazt.toString());
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
        return asDictionary().equals(((aazu) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_PROMPT_CLICK";
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
        aazt aazt = this.a;
        return hashCode + (aazt != null ? aazt.hashCode() : 0);
    }
}
