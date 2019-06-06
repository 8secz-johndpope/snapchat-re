package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazz */
public final class aazz extends abhw {
    private aazs a;

    private aazz a() {
        aazz aazz = (aazz) super.clone();
        aazs aazs = this.a;
        if (aazs != null) {
            aazz.a(aazs.clone());
        }
        return aazz;
    }

    public final void a(aazs aazs) {
        if (aazs == null) {
            this.a = null;
        } else {
            this.a = new aazs(aazs);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aazs aazs = this.a;
        if (aazs != null) {
            hashMap.putAll(aazs.a());
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
        return asDictionary().equals(((aazz) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_REPORT_START";
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
        aazs aazs = this.a;
        return hashCode + (aazs != null ? aazs.hashCode() : 0);
    }
}
