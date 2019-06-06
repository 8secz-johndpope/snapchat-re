package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abap */
public final class abap extends aban {
    private Boolean a;

    private abap b() {
        abap abap = (abap) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abap.a = bool;
        }
        return abap;
    }

    public final /* synthetic */ aban a() {
        return b();
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_success", bool);
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
        return asDictionary().equals(((abap) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_KIT_USER_CONNECT";
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
        Boolean bool = this.a;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }
}
