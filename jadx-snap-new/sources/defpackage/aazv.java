package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazv */
public final class aazv extends abhw {
    public aazr a;
    private aazs b;

    private aazv a() {
        aazv aazv = (aazv) super.clone();
        aazr aazr = this.a;
        if (aazr != null) {
            aazv.a = aazr;
        }
        aazs aazs = this.b;
        if (aazs != null) {
            aazv.a(aazs.clone());
        }
        return aazv;
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
        aazr aazr = this.a;
        if (aazr != null) {
            hashMap.put("shake_cancel_source", aazr.toString());
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
        return asDictionary().equals(((aazv) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_REPORT_CANCEL";
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
        aazr aazr = this.a;
        int i = 0;
        hashCode = (hashCode + (aazr != null ? aazr.hashCode() : 0)) * 31;
        aazs aazs = this.b;
        if (aazs != null) {
            i = aazs.hashCode();
        }
        return hashCode + i;
    }
}
