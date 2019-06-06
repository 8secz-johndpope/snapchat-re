package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbc */
public final class abbc extends abaz {
    private abay a;

    private abbc c() {
        abbc abbc = (abbc) super.clone();
        abay abay = this.a;
        if (abay != null) {
            abbc.a = abay;
        }
        return abbc;
    }

    public final /* synthetic */ aapi a() {
        return c();
    }

    public final void a(abay abay) {
        this.a = abay;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abay abay = this.a;
        if (abay != null) {
            hashMap.put("snappable_action_type", abay.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abaz b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbc) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAPPABLE_LENS_ACTION";
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
        abay abay = this.a;
        return hashCode + (abay != null ? abay.hashCode() : 0);
    }
}
