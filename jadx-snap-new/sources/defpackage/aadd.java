package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadd */
public final class aadd extends abhw {
    private abbd a;
    private String b;
    private aajv c;
    private String d;
    private abfy e;
    private Long f;
    private String g;
    private String h;
    private String i;
    private String j;
    private aajr k;
    private aamk l;
    private aahj m;
    private String n;

    private aadd a() {
        aadd aadd = (aadd) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aadd.a = abbd;
        }
        String str = this.b;
        if (str != null) {
            aadd.b = str;
        }
        aajv aajv = this.c;
        if (aajv != null) {
            aadd.c = aajv;
        }
        str = this.d;
        if (str != null) {
            aadd.d = str;
        }
        abfy abfy = this.e;
        if (abfy != null) {
            aadd.e = abfy;
        }
        Long l = this.f;
        if (l != null) {
            aadd.f = l;
        }
        str = this.g;
        if (str != null) {
            aadd.g = str;
        }
        str = this.h;
        if (str != null) {
            aadd.h = str;
        }
        str = this.i;
        if (str != null) {
            aadd.i = str;
        }
        str = this.j;
        if (str != null) {
            aadd.j = str;
        }
        aajr aajr = this.k;
        if (aajr != null) {
            aadd.k = aajr;
        }
        aamk aamk = this.l;
        if (aamk != null) {
            aadd.l = aamk;
        }
        aahj aahj = this.m;
        if (aahj != null) {
            aadd.m = aahj;
        }
        str = this.n;
        if (str != null) {
            aadd.n = str;
        }
        return aadd;
    }

    public final void a(aamk aamk) {
        this.l = aamk;
    }

    public final void a(abbd abbd) {
        this.a = abbd;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbd abbd = this.a;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        aajv aajv = this.c;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        abfy abfy = this.e;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("cell_view_position", l);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aajr aajr = this.k;
        if (aajr != null) {
            hashMap.put("navigation_action", aajr.toString());
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
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aadd) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_CHAT_CREATE";
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
        abbd abbd = this.a;
        int i = 0;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aajv aajv = this.c;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abfy abfy = this.e;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aajr aajr = this.k;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
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
