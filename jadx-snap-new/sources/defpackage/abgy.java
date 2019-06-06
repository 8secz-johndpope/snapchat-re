package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgy */
public class abgy extends abgz {
    private Long a;

    public final void a(Long l) {
        this.a = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("charm_id", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: b */
    public abgy clone() {
        abgy abgy = (abgy) super.clone();
        Long l = this.a;
        if (l != null) {
            abgy.a = l;
        }
        return abgy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abgy) obj).asDictionary());
    }

    public String getEventName() {
        return "UNIFIED_PROFILE_BASE_CHARM_EVENT";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
