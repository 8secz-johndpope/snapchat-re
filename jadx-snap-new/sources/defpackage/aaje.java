package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaje */
public final class aaje extends abhw {
    public aajd a;
    public aaiz b;
    public Long c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Long g;
    private aaua h;

    private aaje a() {
        aaje aaje = (aaje) super.clone();
        aaua aaua = this.h;
        if (aaua != null) {
            aaje.h = aaua;
        }
        aajd aajd = this.a;
        if (aajd != null) {
            aaje.a = aajd;
        }
        aaiz aaiz = this.b;
        if (aaiz != null) {
            aaje.b = aaiz;
        }
        Long l = this.c;
        if (l != null) {
            aaje.c = l;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaje.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aaje.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aaje.f = bool;
        }
        l = this.g;
        if (l != null) {
            aaje.g = l;
        }
        return aaje;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.h;
        if (aaua != null) {
            hashMap.put("source_page", aaua.toString());
        }
        aajd aajd = this.a;
        if (aajd != null) {
            hashMap.put("event_type", aajd.toString());
        }
        aaiz aaiz = this.b;
        if (aaiz != null) {
            hashMap.put("content_ready_type", aaiz.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("app_uptime_ms", l);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("with_cold_start", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_cache_loaded", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_deck", bool);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("ready_latency_ms", l);
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
        return asDictionary().equals(((aaje) obj).asDictionary());
    }

    public final String getEventName() {
        return "DISCOVER_FEED_VIEW_READY_LATENCY";
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
        aaua aaua = this.h;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        aajd aajd = this.a;
        hashCode = (hashCode + (aajd != null ? aajd.hashCode() : 0)) * 31;
        aaiz aaiz = this.b;
        hashCode = (hashCode + (aaiz != null ? aaiz.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
