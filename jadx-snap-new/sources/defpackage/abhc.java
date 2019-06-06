package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhc */
public final class abhc extends abgy {
    private aauy a;

    public final void a(aauy aauy) {
        this.a = aauy;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aauy aauy = this.a;
        if (aauy != null) {
            hashMap.put("action", aauy.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: d */
    public final abhc clone() {
        abhc abhc = (abhc) super.clone();
        aauy aauy = this.a;
        if (aauy != null) {
            abhc.a = aauy;
        }
        return abhc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhc) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_CHARM_HIDE";
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
        aauy aauy = this.a;
        return hashCode + (aauy != null ? aauy.hashCode() : 0);
    }
}
