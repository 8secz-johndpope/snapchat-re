package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aayr */
public final class aayr extends abhw {
    private String a;
    private Long b;
    private aayk c;
    private aayo d;
    private aayi e;
    private aayj f;
    private String g;
    private String h;
    private String i;
    private String j;
    private Boolean k;
    private Boolean l;
    private Double m;
    private abbd n;
    private Boolean o;
    private String p;
    private Long q;
    private String r;

    private aayr a() {
        aayr aayr = (aayr) super.clone();
        String str = this.a;
        if (str != null) {
            aayr.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aayr.b = l;
        }
        aayk aayk = this.c;
        if (aayk != null) {
            aayr.c = aayk;
        }
        aayo aayo = this.d;
        if (aayo != null) {
            aayr.d = aayo;
        }
        aayi aayi = this.e;
        if (aayi != null) {
            aayr.e = aayi;
        }
        aayj aayj = this.f;
        if (aayj != null) {
            aayr.f = aayj;
        }
        str = this.g;
        if (str != null) {
            aayr.g = str;
        }
        str = this.h;
        if (str != null) {
            aayr.h = str;
        }
        str = this.i;
        if (str != null) {
            aayr.i = str;
        }
        str = this.j;
        if (str != null) {
            aayr.j = str;
        }
        Boolean bool = this.k;
        if (bool != null) {
            aayr.k = bool;
        }
        bool = this.l;
        if (bool != null) {
            aayr.l = bool;
        }
        Double d = this.m;
        if (d != null) {
            aayr.m = d;
        }
        abbd abbd = this.n;
        if (abbd != null) {
            aayr.n = abbd;
        }
        bool = this.o;
        if (bool != null) {
            aayr.o = bool;
        }
        str = this.p;
        if (str != null) {
            aayr.p = str;
        }
        l = this.q;
        if (l != null) {
            aayr.q = l;
        }
        str = this.r;
        if (str != null) {
            aayr.r = str;
        }
        return aayr;
    }

    public final void a(aayi aayi) {
        this.e = aayi;
    }

    public final void a(aayk aayk) {
        this.c = aayk;
    }

    public final void a(abbd abbd) {
        this.n = abbd;
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
        aayk aayk = this.c;
        if (aayk != null) {
            hashMap.put("search_query_type", aayk.toString());
        }
        aayo aayo = this.d;
        if (aayo != null) {
            hashMap.put("search_results_type", aayo.toString());
        }
        aayi aayi = this.e;
        if (aayi != null) {
            hashMap.put("search_query_context", aayi.toString());
        }
        aayj aayj = this.f;
        if (aayj != null) {
            hashMap.put("search_query_source", aayj.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("search_query_entity_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("search_query_text", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("s2_cell_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("user_language_preferences", str);
        }
        Boolean bool = this.k;
        if (bool != null) {
            hashMap.put("query_is_url", bool);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("query_is_suggestion", bool);
        }
        Double d = this.m;
        if (d != null) {
            hashMap.put("client_timestamp", d);
        }
        abbd abbd = this.n;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("is_prefetch", bool);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("search_experiment_ids", str);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("has_search_activity_on_prev_dates", l);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("input_language", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aayr) obj).asDictionary());
    }

    public final String getEventName() {
        return "SEARCHRANKING_QUERY";
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
        aayk aayk = this.c;
        hashCode = (hashCode + (aayk != null ? aayk.hashCode() : 0)) * 31;
        aayo aayo = this.d;
        hashCode = (hashCode + (aayo != null ? aayo.hashCode() : 0)) * 31;
        aayi aayi = this.e;
        hashCode = (hashCode + (aayi != null ? aayi.hashCode() : 0)) * 31;
        aayj aayj = this.f;
        hashCode = (hashCode + (aayj != null ? aayj.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abbd abbd = this.n;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.r;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
