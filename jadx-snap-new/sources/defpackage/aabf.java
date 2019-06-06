package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabf */
public final class aabf extends abhw {
    private aabc a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private String k;
    private Boolean l;
    private String m;
    private aaal n;
    private aaam o;
    private String p;
    private String q;

    private aabf a() {
        aabf aabf = (aabf) super.clone();
        aabc aabc = this.a;
        if (aabc != null) {
            aabf.a = aabc;
        }
        String str = this.b;
        if (str != null) {
            aabf.b = str;
        }
        str = this.c;
        if (str != null) {
            aabf.c = str;
        }
        str = this.d;
        if (str != null) {
            aabf.d = str;
        }
        str = this.e;
        if (str != null) {
            aabf.e = str;
        }
        str = this.f;
        if (str != null) {
            aabf.f = str;
        }
        Long l = this.g;
        if (l != null) {
            aabf.g = l;
        }
        l = this.h;
        if (l != null) {
            aabf.h = l;
        }
        l = this.i;
        if (l != null) {
            aabf.i = l;
        }
        l = this.j;
        if (l != null) {
            aabf.j = l;
        }
        str = this.k;
        if (str != null) {
            aabf.k = str;
        }
        Boolean bool = this.l;
        if (bool != null) {
            aabf.l = bool;
        }
        str = this.m;
        if (str != null) {
            aabf.m = str;
        }
        aaal aaal = this.n;
        if (aaal != null) {
            aabf.n = aaal;
        }
        aaam aaam = this.o;
        if (aaam != null) {
            aabf.o = aaam;
        }
        str = this.p;
        if (str != null) {
            aabf.p = str;
        }
        str = this.q;
        if (str != null) {
            aabf.q = str;
        }
        return aabf;
    }

    public final void a(aaal aaal) {
        this.n = aaal;
    }

    public final void a(aaam aaam) {
        this.o = aaam;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aabc aabc = this.a;
        if (aabc != null) {
            hashMap.put("app_state", aabc.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("crash_class", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("reason", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("page", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("src_page", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("src_src_page", str);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("memory_class_m_b", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("memory_total_m_b", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("disk_free_m_b", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("disk_total_m_b", l);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("crash_app_version", str);
        }
        Boolean bool = this.l;
        if (bool != null) {
            hashMap.put("with_crash_loop", bool);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("last_events", str);
        }
        aaal aaal = this.n;
        if (aaal != null) {
            hashMap.put("app_crash_category", aaal.toString());
        }
        aaam aaam = this.o;
        if (aaam != null) {
            hashMap.put("app_crash_sub_category", aaam.toString());
        }
        str = this.p;
        if (str != null) {
            hashMap.put("crash_app_build_type", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("crash_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.k = str;
    }

    public final void d(String str) {
        this.p = str;
    }

    public final void e(String str) {
        this.q = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aabf) obj).asDictionary());
    }

    public final String getEventName() {
        return "APPLICATION_CRASH";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aabc aabc = this.a;
        int i = 0;
        hashCode = (hashCode + (aabc != null ? aabc.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaal aaal = this.n;
        hashCode = (hashCode + (aaal != null ? aaal.hashCode() : 0)) * 31;
        aaam aaam = this.o;
        hashCode = (hashCode + (aaam != null ? aaam.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
