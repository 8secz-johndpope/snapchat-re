package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abep */
public final class abep extends abhw {
    private Long a;
    private Long b;
    private String c;
    private String d;
    private Double e;
    private Double f;
    private Double g;
    private String h;
    private String i;
    private Boolean j;
    private Boolean k;
    private String l;
    private Long m;
    private Boolean n;
    private Long o;
    private abes p;
    private abeq q;
    private String r;

    private abep a() {
        abep abep = (abep) super.clone();
        Long l = this.a;
        if (l != null) {
            abep.a = l;
        }
        l = this.b;
        if (l != null) {
            abep.b = l;
        }
        String str = this.c;
        if (str != null) {
            abep.c = str;
        }
        str = this.d;
        if (str != null) {
            abep.d = str;
        }
        Double d = this.e;
        if (d != null) {
            abep.e = d;
        }
        d = this.f;
        if (d != null) {
            abep.f = d;
        }
        d = this.g;
        if (d != null) {
            abep.g = d;
        }
        str = this.h;
        if (str != null) {
            abep.h = str;
        }
        str = this.i;
        if (str != null) {
            abep.i = str;
        }
        Boolean bool = this.j;
        if (bool != null) {
            abep.j = bool;
        }
        bool = this.k;
        if (bool != null) {
            abep.k = bool;
        }
        str = this.l;
        if (str != null) {
            abep.l = str;
        }
        l = this.m;
        if (l != null) {
            abep.m = l;
        }
        bool = this.n;
        if (bool != null) {
            abep.n = bool;
        }
        l = this.o;
        if (l != null) {
            abep.o = l;
        }
        abes abes = this.p;
        if (abes != null) {
            abep.p = abes;
        }
        abeq abeq = this.q;
        if (abeq != null) {
            abep.q = abeq;
        }
        str = this.r;
        if (str != null) {
            abep.r = str;
        }
        return abep;
    }

    public final void a(abeq abeq) {
        this.q = abeq;
    }

    public final void a(abes abes) {
        this.p = abes;
    }

    public final void a(Boolean bool) {
        this.j = bool;
    }

    public final void a(Double d) {
        this.e = d;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("sticker_subsection_view_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("sticker_sections_view_count", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("sticker_sections_viewed", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("sticker_sections_entry_events", str);
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("session_start_time", d);
        }
        d = this.f;
        if (d != null) {
            hashMap.put("session_end_time", d);
        }
        d = this.g;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("sticker_session_id", str);
        }
        Boolean bool = this.j;
        if (bool != null) {
            hashMap.put("with_sticker_pick", bool);
        }
        bool = this.k;
        if (bool != null) {
            hashMap.put("with_search", bool);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("search_term", str);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("search_sequence_id", l);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("with_bitmoji_tab_visible", bool);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("contextual_sticker_load_time", l);
        }
        abes abes = this.p;
        if (abes != null) {
            hashMap.put("sticker_source_tab", abes.toString());
        }
        abeq abeq = this.q;
        if (abeq != null) {
            hashMap.put("sticker_picker_type", abeq.toString());
        }
        str = this.r;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Double d) {
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abep) obj).asDictionary());
    }

    public final String getEventName() {
        return "STICKER_PICKER_SESSION";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abes abes = this.p;
        hashCode = (hashCode + (abes != null ? abes.hashCode() : 0)) * 31;
        abeq abeq = this.q;
        hashCode = (hashCode + (abeq != null ? abeq.hashCode() : 0)) * 31;
        str = this.r;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
