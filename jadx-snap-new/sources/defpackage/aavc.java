package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavc */
public abstract class aavc extends abhw {
    public String a;
    public abbd b;
    public aahb c;
    public String d;
    public String e;
    public Long f;
    public abgm g;
    private String h;
    private String i;
    private abgl j;
    private Long k;

    /* renamed from: a */
    public aavc clone() {
        aavc aavc = (aavc) super.clone();
        String str = this.a;
        if (str != null) {
            aavc.a = str;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aavc.b = abbd;
        }
        aahb aahb = this.c;
        if (aahb != null) {
            aavc.c = aahb;
        }
        str = this.d;
        if (str != null) {
            aavc.d = str;
        }
        str = this.e;
        if (str != null) {
            aavc.e = str;
        }
        str = this.h;
        if (str != null) {
            aavc.h = str;
        }
        Long l = this.f;
        if (l != null) {
            aavc.f = l;
        }
        abgm abgm = this.g;
        if (abgm != null) {
            aavc.g = abgm;
        }
        str = this.i;
        if (str != null) {
            aavc.i = str;
        }
        abgl abgl = this.j;
        if (abgl != null) {
            aavc.j = abgl;
        }
        l = this.k;
        if (l != null) {
            aavc.k = l;
        }
        return aavc;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("publisher_name", str);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source_type", abbd.toString());
        }
        aahb aahb = this.c;
        if (aahb != null) {
            hashMap.put("content_view_source", aahb.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("tile_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("edition_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("tracking_id", str);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("position", l);
        }
        abgm abgm = this.g;
        if (abgm != null) {
            hashMap.put("tile_size", abgm.toString());
        }
        str = this.i;
        if (str != null) {
            hashMap.put("collection_id", str);
        }
        abgl abgl = this.j;
        if (abgl != null) {
            hashMap.put("collection_type", abgl.toString());
        }
        l = this.k;
        if (l != null) {
            hashMap.put("collection_pos", l);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aavc) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.b;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        aahb aahb = this.c;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abgm abgm = this.g;
        hashCode = (hashCode + (abgm != null ? abgm.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgl abgl = this.j;
        hashCode = (hashCode + (abgl != null ? abgl.hashCode() : 0)) * 31;
        l = this.k;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
