package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aash */
public final class aash extends abhw {
    private Boolean a;
    private aasi b;

    private aash a() {
        aash aash = (aash) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aash.a = bool;
        }
        aasi aasi = this.b;
        if (aasi != null) {
            aash.b = aasi;
        }
        return aash;
    }

    public final void a(aasi aasi) {
        this.b = aasi;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_mushroom_opt_in", bool);
        }
        aasi aasi = this.b;
        if (aasi != null) {
            hashMap.put("toggle_source", aasi.toString());
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
        return asDictionary().equals(((aash) obj).asDictionary());
    }

    public final String getEventName() {
        return "MUSHROOM_ACTIVATION_TOGGLE";
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
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasi aasi = this.b;
        if (aasi != null) {
            i = aasi.hashCode();
        }
        return hashCode + i;
    }
}
