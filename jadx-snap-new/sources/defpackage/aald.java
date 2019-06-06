package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aald */
public final class aald extends abhw {
    public aale a;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    private Boolean f;
    private Long g;

    private aald a() {
        aald aald = (aald) super.clone();
        aale aale = this.a;
        if (aale != null) {
            aald.a = aale;
        }
        Boolean bool = this.f;
        if (bool != null) {
            aald.f = bool;
        }
        String str = this.b;
        if (str != null) {
            aald.b = str;
        }
        Long l = this.c;
        if (l != null) {
            aald.c = l;
        }
        l = this.d;
        if (l != null) {
            aald.d = l;
        }
        l = this.e;
        if (l != null) {
            aald.e = l;
        }
        l = this.g;
        if (l != null) {
            aald.g = l;
        }
        return aald;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aale aale = this.a;
        if (aale != null) {
            hashMap.put("event_type", aale.toString());
        }
        Boolean bool = this.f;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("source", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("key_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("friend_with_keys_requested_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("friend_with_keys_received_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("response_status_code", l);
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
        return asDictionary().equals(((aald) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_KEY_PROPAGATION";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aale aale = this.a;
        int i = 0;
        hashCode = (hashCode + (aale != null ? aale.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
