package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaov */
public final class aaov extends abhw {
    public abga a;

    private aaov a() {
        aaov aaov = (aaov) super.clone();
        abga abga = this.a;
        if (abga != null) {
            aaov.a = abga;
        }
        return aaov;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abga abga = this.a;
        if (abga != null) {
            hashMap.put("support_setting_item", abga.toString());
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
        return asDictionary().equals(((aaov) obj).asDictionary());
    }

    public final String getEventName() {
        return "IN_SETTING_SUPPORT_ITEM_CLICK";
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
        abga abga = this.a;
        return hashCode + (abga != null ? abga.hashCode() : 0);
    }
}
