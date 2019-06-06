package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaki */
public final class aaki extends abhw {
    private aakh a;
    private aakg b;
    private Long c;
    private Long d;
    private Long e;

    private aaki a() {
        aaki aaki = (aaki) super.clone();
        aakh aakh = this.a;
        if (aakh != null) {
            aaki.a = aakh;
        }
        aakg aakg = this.b;
        if (aakg != null) {
            aaki.b = aakg;
        }
        Long l = this.c;
        if (l != null) {
            aaki.c = l;
        }
        l = this.d;
        if (l != null) {
            aaki.d = l;
        }
        l = this.e;
        if (l != null) {
            aaki.e = l;
        }
        return aaki;
    }

    public final void a(aakg aakg) {
        this.b = aakg;
    }

    public final void a(aakh aakh) {
        this.a = aakh;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakh aakh = this.a;
        if (aakh != null) {
            hashMap.put("prompt_type", aakh.toString());
        }
        aakg aakg = this.b;
        if (aakg != null) {
            hashMap.put("prompt_action", aakg.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("prompt_max_cap", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("prompt_cooldown_in_days", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("display_duration_in_days", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.d = l;
    }

    public final void c(Long l) {
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaki) obj).asDictionary());
    }

    public final String getEventName() {
        return "FEED_PROMPT_VIEW";
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
        aakh aakh = this.a;
        int i = 0;
        hashCode = (hashCode + (aakh != null ? aakh.hashCode() : 0)) * 31;
        aakg aakg = this.b;
        hashCode = (hashCode + (aakg != null ? aakg.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
