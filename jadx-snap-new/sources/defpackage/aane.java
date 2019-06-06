package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aane */
public final class aane extends aang {
    private Boolean e;
    private aana f;

    private aane b() {
        aane aane = (aane) super.clone();
        Boolean bool = this.e;
        if (bool != null) {
            aane.e = bool;
        }
        aana aana = this.f;
        if (aana != null) {
            aane.f = aana;
        }
        return aane;
    }

    public final /* synthetic */ aang a() {
        return b();
    }

    public final void a(aana aana) {
        this.f = aana;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("with_new_media", bool);
        }
        aana aana = this.f;
        if (aana != null) {
            hashMap.put("operation_type", aana.toString());
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
        return asDictionary().equals(((aane) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_SNAP_SAVE";
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
        Boolean bool = this.e;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aana aana = this.f;
        if (aana != null) {
            i = aana.hashCode();
        }
        return hashCode + i;
    }
}
