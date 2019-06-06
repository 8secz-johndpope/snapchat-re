package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagw */
public final class aagw extends aaga {
    public aagv a;

    private aagw a() {
        aagw aagw = (aagw) super.clone();
        aagv aagv = this.a;
        if (aagv != null) {
            aagw.a = aagv;
        }
        return aagw;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagv aagv = this.a;
        if (aagv != null) {
            hashMap.put("validation_failure", aagv.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aagw) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_VALIDATION_FAILURE_EVENT";
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
        aagv aagv = this.a;
        return hashCode + (aagv != null ? aagv.hashCode() : 0);
    }
}
