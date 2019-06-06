package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazy */
public final class aazy extends abhw {
    public Long a;
    private aazs b;

    private aazy a() {
        aazy aazy = (aazy) super.clone();
        Long l = this.a;
        if (l != null) {
            aazy.a = l;
        }
        aazs aazs = this.b;
        if (aazs != null) {
            aazy.a(aazs.clone());
        }
        return aazy;
    }

    public final void a(aazs aazs) {
        if (aazs == null) {
            this.b = null;
        } else {
            this.b = new aazs(aazs);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("retry_count", l);
        }
        aazs aazs = this.b;
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
        return asDictionary().equals(((aazy) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_REPORT_SEND";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aazs aazs = this.b;
        if (aazs != null) {
            i = aazs.hashCode();
        }
        return hashCode + i;
    }
}
