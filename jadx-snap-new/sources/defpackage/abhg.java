package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhg */
public final class abhg extends abgz {
    private Double a;

    private abhg b() {
        abhg abhg = (abhg) super.clone();
        Double d = this.a;
        if (d != null) {
            abhg.a = d;
        }
        return abhg;
    }

    public final /* synthetic */ abgz a() {
        return b();
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("view_time_secs", d);
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
        return asDictionary().equals(((abhg) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_PAGE_EXIT";
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
        Double d = this.a;
        return hashCode + (d != null ? d.hashCode() : 0);
    }
}
