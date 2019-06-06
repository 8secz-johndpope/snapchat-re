package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaja */
public final class aaja extends abhw {
    public Long a;
    public aajb b;
    public aajc c;
    public Boolean d;
    public aake e;

    private aaja a() {
        aaja aaja = (aaja) super.clone();
        Long l = this.a;
        if (l != null) {
            aaja.a = l;
        }
        aajb aajb = this.b;
        if (aajb != null) {
            aaja.b = aajb;
        }
        aajc aajc = this.c;
        if (aajc != null) {
            aaja.c = aajc;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaja.d = bool;
        }
        aake aake = this.e;
        if (aake != null) {
            aaja.e = aake;
        }
        return aaja;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("network_latency_ms", l);
        }
        aajb aajb = this.b;
        if (aajb != null) {
            hashMap.put("network_latency_type", aajb.toString());
        }
        aajc aajc = this.c;
        if (aajc != null) {
            hashMap.put("source_type", aajc.toString());
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("success", bool);
        }
        aake aake = this.e;
        if (aake != null) {
            hashMap.put("section_type", aake.toString());
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
        return asDictionary().equals(((aaja) obj).asDictionary());
    }

    public final String getEventName() {
        return "DISCOVER_FEED_NETWORK_LATENCY";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aajb aajb = this.b;
        hashCode = (hashCode + (aajb != null ? aajb.hashCode() : 0)) * 31;
        aajc aajc = this.c;
        hashCode = (hashCode + (aajc != null ? aajc.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aake aake = this.e;
        if (aake != null) {
            i = aake.hashCode();
        }
        return hashCode + i;
    }
}
