package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfm */
public final class abfm extends abhw {
    private String a;
    private aajr b;
    private aajv c;
    private Double d;
    private String e;
    private String f;
    private String g;
    private aaox h;
    private abbd i;
    private String j;
    private Long k;
    private Long l;
    private abfx m;
    private abfy n;
    private aahb o;
    private String p;

    private abfm a() {
        abfm abfm = (abfm) super.clone();
        String str = this.a;
        if (str != null) {
            abfm.a = str;
        }
        aajr aajr = this.b;
        if (aajr != null) {
            abfm.b = aajr;
        }
        aajv aajv = this.c;
        if (aajv != null) {
            abfm.c = aajv;
        }
        Double d = this.d;
        if (d != null) {
            abfm.d = d;
        }
        str = this.e;
        if (str != null) {
            abfm.e = str;
        }
        str = this.f;
        if (str != null) {
            abfm.f = str;
        }
        str = this.g;
        if (str != null) {
            abfm.g = str;
        }
        aaox aaox = this.h;
        if (aaox != null) {
            abfm.h = aaox;
        }
        abbd abbd = this.i;
        if (abbd != null) {
            abfm.i = abbd;
        }
        str = this.j;
        if (str != null) {
            abfm.j = str;
        }
        Long l = this.k;
        if (l != null) {
            abfm.k = l;
        }
        l = this.l;
        if (l != null) {
            abfm.l = l;
        }
        abfx abfx = this.m;
        if (abfx != null) {
            abfm.m = abfx;
        }
        abfy abfy = this.n;
        if (abfy != null) {
            abfm.n = abfy;
        }
        aahb aahb = this.o;
        if (aahb != null) {
            abfm.o = aahb;
        }
        str = this.p;
        if (str != null) {
            abfm.p = str;
        }
        return abfm;
    }

    public final void a(aajv aajv) {
        this.c = aajv;
    }

    public final void a(abfx abfx) {
        this.m = abfx;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("poster_id", str);
        }
        aajr aajr = this.b;
        if (aajr != null) {
            hashMap.put("entry_event", aajr.toString());
        }
        aajv aajv = this.c;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aaox aaox = this.h;
        if (aaox != null) {
            hashMap.put("type", aaox.toString());
        }
        abbd abbd = this.i;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.j;
        if (str != null) {
            hashMap.put("edition_id", str);
        }
        Long l = this.k;
        if (l != null) {
            hashMap.put("absolute_story_index", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("relative_story_index", l);
        }
        abfx abfx = this.m;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        abfy abfy = this.n;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        aahb aahb = this.o;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        str = this.p;
        if (str != null) {
            hashMap.put("ghost_poster_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfm) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_INTERSTITIAL_VIEW";
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
        aajr aajr = this.b;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
        aajv aajv = this.c;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaox aaox = this.h;
        hashCode = (hashCode + (aaox != null ? aaox.hashCode() : 0)) * 31;
        abbd abbd = this.i;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abfx abfx = this.m;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        abfy abfy = this.n;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        aahb aahb = this.o;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        str = this.p;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
