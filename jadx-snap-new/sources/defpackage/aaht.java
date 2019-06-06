package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaht */
public final class aaht extends abhw {
    private aahu a;

    private aaht a() {
        aaht aaht = (aaht) super.clone();
        aahu aahu = this.a;
        if (aahu != null) {
            aaht.a = aahu;
        }
        return aaht;
    }

    public final void a(aahu aahu) {
        this.a = aahu;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahu aahu = this.a;
        if (aahu != null) {
            hashMap.put("data_saver_disable_reason", aahu.toString());
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
        return asDictionary().equals(((aaht) obj).asDictionary());
    }

    public final String getEventName() {
        return "DATA_SAVER_DISABLE_EVENT";
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
        aahu aahu = this.a;
        return hashCode + (aahu != null ? aahu.hashCode() : 0);
    }
}
