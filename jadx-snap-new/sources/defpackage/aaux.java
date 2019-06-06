package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaux */
public final class aaux extends abhw {
    private String a;
    private aaxz b;
    private String c;
    private Long d;
    private Double e;
    private aasc f;
    private aahr g;

    private aaux a() {
        aaux aaux = (aaux) super.clone();
        String str = this.a;
        if (str != null) {
            aaux.a = str;
        }
        aaxz aaxz = this.b;
        if (aaxz != null) {
            aaux.b = aaxz;
        }
        str = this.c;
        if (str != null) {
            aaux.c = str;
        }
        Long l = this.d;
        if (l != null) {
            aaux.d = l;
        }
        Double d = this.e;
        if (d != null) {
            aaux.e = d;
        }
        aasc aasc = this.f;
        if (aasc != null) {
            aaux.f = aasc;
        }
        aahr aahr = this.g;
        if (aahr != null) {
            aaux.a(aahr.clone());
        }
        return aaux;
    }

    public final void a(aahr aahr) {
        if (aahr == null) {
            this.g = null;
        } else {
            this.g = new aahr(aahr);
        }
    }

    public final void a(aasc aasc) {
        this.f = aasc;
    }

    public final void a(Double d) {
        this.e = d;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("analytics_version", str);
        }
        aaxz aaxz = this.b;
        if (aaxz != null) {
            hashMap.put("save_type", aaxz.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("splits", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("total_latency_ms", l);
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("content_duration_sec", d);
        }
        aasc aasc = this.f;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        aahr aahr = this.g;
        if (aahr != null) {
            hashMap.putAll(aahr.a());
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
        return asDictionary().equals(((aaux) obj).asDictionary());
    }

    public final String getEventName() {
        return "PREVIEW_VISIBLE_SAVE_LATENCY";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaxz aaxz = this.b;
        hashCode = (hashCode + (aaxz != null ? aaxz.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aasc aasc = this.f;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        aahr aahr = this.g;
        if (aahr != null) {
            i = aahr.hashCode();
        }
        return hashCode + i;
    }
}
