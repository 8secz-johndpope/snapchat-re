package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aays */
public final class aays extends abhw {
    private String a;
    private Long b;
    private aaym c;
    private String d;
    private String e;
    private String f;
    private aayn g;
    private Double h;
    private abbd i;

    private aays a() {
        aays aays = (aays) super.clone();
        String str = this.a;
        if (str != null) {
            aays.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aays.b = l;
        }
        aaym aaym = this.c;
        if (aaym != null) {
            aays.c = aaym;
        }
        str = this.d;
        if (str != null) {
            aays.d = str;
        }
        str = this.e;
        if (str != null) {
            aays.e = str;
        }
        str = this.f;
        if (str != null) {
            aays.f = str;
        }
        aayn aayn = this.g;
        if (aayn != null) {
            aays.g = aayn;
        }
        Double d = this.h;
        if (d != null) {
            aays.h = d;
        }
        abbd abbd = this.i;
        if (abbd != null) {
            aays.i = abbd;
        }
        return aays;
    }

    public final void a(aaym aaym) {
        this.c = aaym;
    }

    public final void a(aayn aayn) {
        this.g = aayn;
    }

    public final void a(abbd abbd) {
        this.i = abbd;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("search_query_id", l);
        }
        aaym aaym = this.c;
        if (aaym != null) {
            hashMap.put("search_result_section", aaym.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("search_result_section_title", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("search_result_ranking_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("search_result_identifier", str);
        }
        aayn aayn = this.g;
        if (aayn != null) {
            hashMap.put("search_result_showing_reason", aayn.toString());
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("client_timestamp", d);
        }
        abbd abbd = this.i;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aays) obj).asDictionary());
    }

    public final String getEventName() {
        return "SEARCHRANKING_RESULT_ON_SCREEN";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaym aaym = this.c;
        hashCode = (hashCode + (aaym != null ? aaym.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aayn aayn = this.g;
        hashCode = (hashCode + (aayn != null ? aayn.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abbd abbd = this.i;
        if (abbd != null) {
            i = abbd.hashCode();
        }
        return hashCode + i;
    }
}
