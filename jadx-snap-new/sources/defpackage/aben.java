package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aben */
public abstract class aben extends abhw {
    private Long a;
    private String b;
    private String c;
    private String d;
    private Boolean e;
    private aber f;
    private Long g;
    private String h;
    private String i;
    private String j;
    private Long k;
    private abes l;
    private abeq m;

    /* renamed from: a */
    public aben clone() {
        aben aben = (aben) super.clone();
        Long l = this.a;
        if (l != null) {
            aben.a = l;
        }
        String str = this.b;
        if (str != null) {
            aben.b = str;
        }
        str = this.c;
        if (str != null) {
            aben.c = str;
        }
        str = this.d;
        if (str != null) {
            aben.d = str;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aben.e = bool;
        }
        aber aber = this.f;
        if (aber != null) {
            aben.f = aber;
        }
        l = this.g;
        if (l != null) {
            aben.g = l;
        }
        str = this.h;
        if (str != null) {
            aben.h = str;
        }
        str = this.i;
        if (str != null) {
            aben.i = str;
        }
        str = this.j;
        if (str != null) {
            aben.j = str;
        }
        l = this.k;
        if (l != null) {
            aben.k = l;
        }
        abes abes = this.l;
        if (abes != null) {
            aben.l = abes;
        }
        abeq abeq = this.m;
        if (abeq != null) {
            aben.m = abeq;
        }
        return aben;
    }

    public final void a(abeq abeq) {
        this.m = abeq;
    }

    public final void a(aber aber) {
        this.f = aber;
    }

    public final void a(String str) {
        this.b = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("sticker_rank", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("sticker_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("sticker_id_full", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("sticker_pack_id", str);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("is_animated", bool);
        }
        aber aber = this.f;
        if (aber != null) {
            hashMap.put("section_name", aber.toString());
        }
        l = this.g;
        if (l != null) {
            hashMap.put("sticker_position", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("sticker_session_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("search_term", str);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("search_sequence_id", l);
        }
        abes abes = this.l;
        if (abes != null) {
            hashMap.put("sticker_source_tab", abes.toString());
        }
        abeq abeq = this.m;
        if (abeq != null) {
            hashMap.put("sticker_picker_type", abeq.toString());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aben) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aber aber = this.f;
        hashCode = (hashCode + (aber != null ? aber.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abes abes = this.l;
        hashCode = (hashCode + (abes != null ? abes.hashCode() : 0)) * 31;
        abeq abeq = this.m;
        if (abeq != null) {
            i = abeq.hashCode();
        }
        return hashCode + i;
    }
}
