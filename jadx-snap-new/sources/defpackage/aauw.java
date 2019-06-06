package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aauw */
public final class aauw extends abhw {
    private String a;
    private aasc b;
    private String c;
    private String d;
    private Long e;
    private aahr f;

    private aauw a() {
        aauw aauw = (aauw) super.clone();
        String str = this.a;
        if (str != null) {
            aauw.a = str;
        }
        aasc aasc = this.b;
        if (aasc != null) {
            aauw.b = aasc;
        }
        str = this.c;
        if (str != null) {
            aauw.c = str;
        }
        str = this.d;
        if (str != null) {
            aauw.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aauw.e = l;
        }
        aahr aahr = this.f;
        if (aahr != null) {
            aahr = aahr.clone();
            if (aahr == null) {
                aauw.f = null;
            } else {
                aauw.f = new aahr(aahr);
            }
        }
        return aauw;
    }

    public final void a(aasc aasc) {
        this.b = aasc;
    }

    public final void a(Long l) {
        this.e = l;
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
        aasc aasc = this.b;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("flavor", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("splits", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("total_latency_ms", l);
        }
        aahr aahr = this.f;
        if (aahr != null) {
            hashMap.putAll(aahr.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aauw) obj).asDictionary());
    }

    public final String getEventName() {
        return "PREVIEW_LOAD_LATENCY";
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
        aasc aasc = this.b;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahr aahr = this.f;
        if (aahr != null) {
            i = aahr.hashCode();
        }
        return hashCode + i;
    }
}
