package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamt */
public final class aamt extends abhw {
    private Boolean a;

    private aamt a() {
        aamt aamt = (aamt) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aamt.a = bool;
        }
        return aamt;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_new_install", bool);
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
        return asDictionary().equals(((aamt) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_DB_INIT";
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
