package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aayt */
public final class aayt extends abhw {
    private String a;
    private Long b;
    private String c;
    private String d;
    private String e;
    private Double f;
    private String g;
    private abbd h;
    private Boolean i;

    private aayt a() {
        aayt aayt = (aayt) super.clone();
        String str = this.a;
        if (str != null) {
            aayt.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aayt.b = l;
        }
        str = this.c;
        if (str != null) {
            aayt.c = str;
        }
        str = this.d;
        if (str != null) {
            aayt.d = str;
        }
        str = this.e;
        if (str != null) {
            aayt.e = str;
        }
        Double d = this.f;
        if (d != null) {
            aayt.f = d;
        }
        str = this.g;
        if (str != null) {
            aayt.g = str;
        }
        abbd abbd = this.h;
        if (abbd != null) {
            aayt.h = abbd;
        }
        Boolean bool = this.i;
        if (bool != null) {
            aayt.i = bool;
        }
        return aayt;
    }

    public final void a(abbd abbd) {
        this.h = abbd;
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
        str = this.c;
        if (str != null) {
            hashMap.put("search_query_text", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("search_results", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("result_cache_information", str);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("search_result_timestamp", d);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("search_experiment_ids", str);
        }
        abbd abbd = this.h;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        Boolean bool = this.i;
        if (bool != null) {
            hashMap.put("loaded_from_cache", bool);
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
        return asDictionary().equals(((aayt) obj).asDictionary());
    }

    public final String getEventName() {
        return "SEARCHRANKING_RESULTS";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.h;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        Boolean bool = this.i;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
