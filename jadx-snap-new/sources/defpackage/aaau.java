package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaau */
public final class aaau extends abhw {
    private String a;
    private String b;
    private abbd c;
    private Long d;
    private aatr e;
    private Boolean f;

    private aaau a() {
        aaau aaau = (aaau) super.clone();
        String str = this.a;
        if (str != null) {
            aaau.a = str;
        }
        str = this.b;
        if (str != null) {
            aaau.b = str;
        }
        abbd abbd = this.c;
        if (abbd != null) {
            aaau.c = abbd;
        }
        Long l = this.d;
        if (l != null) {
            aaau.d = l;
        }
        aatr aatr = this.e;
        if (aatr != null) {
            aaau.e = aatr;
        }
        Boolean bool = this.f;
        if (bool != null) {
            aaau.f = bool;
        }
        return aaau;
    }

    public final void a(abbd abbd) {
        this.c = abbd;
    }

    public final void a(Boolean bool) {
        this.f = bool;
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
            hashMap.put("attribution", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("project_name", str);
        }
        abbd abbd = this.c;
        if (abbd != null) {
            hashMap.put("source_type", abbd.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("latency_ms", l);
        }
        aatr aatr = this.e;
        if (aatr != null) {
            hashMap.put("content_type", aatr.toString());
        }
        Boolean bool = this.f;
        if (bool != null) {
            hashMap.put("is_first_load", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaau) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_PAGE_LOAD";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.c;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aatr aatr = this.e;
        hashCode = (hashCode + (aatr != null ? aatr.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
