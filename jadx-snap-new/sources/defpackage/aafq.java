package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafq */
public final class aafq extends aafl {
    public aafp d;

    private aafq c() {
        aafq aafq = (aafq) super.clone();
        aafp aafp = this.d;
        if (aafp != null) {
            aafq.d = aafp;
        }
        return aafq;
    }

    public final /* synthetic */ aafl a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafp aafp = this.d;
        if (aafp != null) {
            hashMap.put("target", aafp.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aafq) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_BUTTON_ACTION_EVENT";
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
        aafp aafp = this.d;
        return hashCode + (aafp != null ? aafp.hashCode() : 0);
    }
}
