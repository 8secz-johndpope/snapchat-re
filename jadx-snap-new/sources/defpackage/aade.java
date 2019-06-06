package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aade */
public final class aade extends abhw {
    private String a;
    private abbd b;
    private String c;
    private Boolean d;
    private aasc e;
    private String f;
    private Long g;
    private String h;
    private String i;
    private String j;
    private String k;
    private aamk l;
    private aahj m;
    private String n;

    private aade a() {
        aade aade = (aade) super.clone();
        String str = this.a;
        if (str != null) {
            aade.a = str;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aade.b = abbd;
        }
        str = this.c;
        if (str != null) {
            aade.c = str;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aade.d = bool;
        }
        aasc aasc = this.e;
        if (aasc != null) {
            aade.e = aasc;
        }
        str = this.f;
        if (str != null) {
            aade.f = str;
        }
        Long l = this.g;
        if (l != null) {
            aade.g = l;
        }
        str = this.h;
        if (str != null) {
            aade.h = str;
        }
        str = this.i;
        if (str != null) {
            aade.i = str;
        }
        str = this.j;
        if (str != null) {
            aade.j = str;
        }
        str = this.k;
        if (str != null) {
            aade.k = str;
        }
        aamk aamk = this.l;
        if (aamk != null) {
            aade.l = aamk;
        }
        aahj aahj = this.m;
        if (aahj != null) {
            aade.m = aahj;
        }
        str = this.n;
        if (str != null) {
            aade.n = str;
        }
        return aade;
    }

    public final void a(aamk aamk) {
        this.l = aamk;
    }

    public final void a(aasc aasc) {
        this.e = aasc;
    }

    public final void a(abbd abbd) {
        this.b = abbd;
    }

    public final void a(Long l) {
        this.g = l;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("additional_info", str);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("with_gallery", bool);
        }
        aasc aasc = this.e;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("cell_view_position", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aamk aamk = this.l;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.m;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
        }
        str = this.n;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
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
        return asDictionary().equals(((aade) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_CHAT_SCREENSHOT";
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
        abbd abbd = this.b;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.e;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamk aamk = this.l;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.m;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        str = this.n;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
