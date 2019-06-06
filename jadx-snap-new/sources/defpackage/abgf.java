package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgf */
public abstract class abgf extends abhw {
    private String a;
    private Boolean b;
    private String c;
    public Long d;
    public String e;
    public Double f;
    public Long g;
    public Boolean h;
    public abgh i;
    public Boolean j;
    public Long k;
    public String l;
    public abbd m;
    private String n;
    private String o;
    private aamk p;
    private aahj q;
    private String r;

    /* renamed from: a */
    public abgf clone() {
        abgf abgf = (abgf) super.clone();
        String str = this.a;
        if (str != null) {
            abgf.a = str;
        }
        Long l = this.d;
        if (l != null) {
            abgf.d = l;
        }
        str = this.e;
        if (str != null) {
            abgf.e = str;
        }
        Double d = this.f;
        if (d != null) {
            abgf.f = d;
        }
        l = this.g;
        if (l != null) {
            abgf.g = l;
        }
        Boolean bool = this.h;
        if (bool != null) {
            abgf.h = bool;
        }
        bool = this.b;
        if (bool != null) {
            abgf.b = bool;
        }
        abgh abgh = this.i;
        if (abgh != null) {
            abgf.i = abgh;
        }
        bool = this.j;
        if (bool != null) {
            abgf.j = bool;
        }
        l = this.k;
        if (l != null) {
            abgf.k = l;
        }
        str = this.l;
        if (str != null) {
            abgf.l = str;
        }
        abbd abbd = this.m;
        if (abbd != null) {
            abgf.m = abbd;
        }
        str = this.c;
        if (str != null) {
            abgf.c = str;
        }
        str = this.n;
        if (str != null) {
            abgf.n = str;
        }
        str = this.o;
        if (str != null) {
            abgf.o = str;
        }
        aamk aamk = this.p;
        if (aamk != null) {
            abgf.p = aamk;
        }
        aahj aahj = this.q;
        if (aahj != null) {
            abgf.q = aahj;
        }
        str = this.r;
        if (str != null) {
            abgf.r = str;
        }
        return abgf;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("group_participant_count", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("call_uuid", str);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("duration_sec", d);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("media_toggle_count", l);
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("with_call_kit", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("with_call_kit_disable_due_to_not_location_authorisation", bool);
        }
        abgh abgh = this.i;
        if (abgh != null) {
            hashMap.put("media_type", abgh.toString());
        }
        bool = this.j;
        if (bool != null) {
            hashMap.put("with_group", bool);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("cell_view_position", l);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        abbd abbd = this.m;
        if (abbd != null) {
            hashMap.put("chat_source", abbd.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aamk aamk = this.p;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.q;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
        }
        str = this.r;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
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
        return asDictionary().equals(((abgf) obj).asDictionary());
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
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abgh abgh = this.i;
        hashCode = (hashCode + (abgh != null ? abgh.hashCode() : 0)) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.m;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamk aamk = this.p;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.q;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        str = this.r;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
