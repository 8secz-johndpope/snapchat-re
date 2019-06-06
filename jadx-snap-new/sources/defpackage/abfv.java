package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfv */
public final class abfv extends abfw {
    private aavf a;
    private abgm b;
    private String c;
    private abgl d;
    private Long e;
    private String f;
    private String g;
    private aajq h;
    private abfn i;
    private aaug j;
    private abet k;
    private String l;
    private String m;
    private String n;
    private String o;
    private aamk p;
    private aahj q;
    private Long r;
    private Long s;
    private String t;

    private abfv b() {
        abfv abfv = (abfv) super.clone();
        aavf aavf = this.a;
        if (aavf != null) {
            abfv.a = aavf;
        }
        abgm abgm = this.b;
        if (abgm != null) {
            abfv.b = abgm;
        }
        String str = this.c;
        if (str != null) {
            abfv.c = str;
        }
        abgl abgl = this.d;
        if (abgl != null) {
            abfv.d = abgl;
        }
        Long l = this.e;
        if (l != null) {
            abfv.e = l;
        }
        str = this.f;
        if (str != null) {
            abfv.f = str;
        }
        str = this.g;
        if (str != null) {
            abfv.g = str;
        }
        aajq aajq = this.h;
        if (aajq != null) {
            abfv.h = aajq;
        }
        abfn abfn = this.i;
        if (abfn != null) {
            abfv.i = abfn;
        }
        aaug aaug = this.j;
        if (aaug != null) {
            abfv.j = aaug;
        }
        abet abet = this.k;
        if (abet != null) {
            abfv.k = abet;
        }
        str = this.l;
        if (str != null) {
            abfv.l = str;
        }
        str = this.m;
        if (str != null) {
            abfv.m = str;
        }
        str = this.n;
        if (str != null) {
            abfv.n = str;
        }
        str = this.o;
        if (str != null) {
            abfv.o = str;
        }
        aamk aamk = this.p;
        if (aamk != null) {
            abfv.p = aamk;
        }
        aahj aahj = this.q;
        if (aahj != null) {
            abfv.q = aahj;
        }
        l = this.r;
        if (l != null) {
            abfv.r = l;
        }
        l = this.s;
        if (l != null) {
            abfv.s = l;
        }
        str = this.t;
        if (str != null) {
            abfv.t = str;
        }
        return abfv;
    }

    public final /* synthetic */ abfw a() {
        return b();
    }

    public final void a(abet abet) {
        this.k = abet;
    }

    public final void a(String str) {
        this.o = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aavf aavf = this.a;
        if (aavf != null) {
            hashMap.put("read_state", aavf.toString());
        }
        abgm abgm = this.b;
        if (abgm != null) {
            hashMap.put("tile_size", abgm.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("collection_id", str);
        }
        abgl abgl = this.d;
        if (abgl != null) {
            hashMap.put("collection_type", abgl.toString());
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("collection_pos", l);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("tracking_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("sort_order_id", str);
        }
        aajq aajq = this.h;
        if (aajq != null) {
            hashMap.put("enter_event", aajq.toString());
        }
        abfn abfn = this.i;
        if (abfn != null) {
            hashMap.put("play_mode", abfn.toString());
        }
        aaug aaug = this.j;
        if (aaug != null) {
            hashMap.put("play_source", aaug.toString());
        }
        abet abet = this.k;
        if (abet != null) {
            hashMap.put("story_access_type", abet.toString());
        }
        str = this.l;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        str = this.m;
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
        l = this.r;
        if (l != null) {
            hashMap.put("absolute_story_index", l);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("relative_story_index", l);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("team_snapchat_story_snap_hash", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfv) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_STORY_VIEW";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aavf aavf = this.a;
        int i = 0;
        hashCode = (hashCode + (aavf != null ? aavf.hashCode() : 0)) * 31;
        abgm abgm = this.b;
        hashCode = (hashCode + (abgm != null ? abgm.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgl abgl = this.d;
        hashCode = (hashCode + (abgl != null ? abgl.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aajq aajq = this.h;
        hashCode = (hashCode + (aajq != null ? aajq.hashCode() : 0)) * 31;
        abfn abfn = this.i;
        hashCode = (hashCode + (abfn != null ? abfn.hashCode() : 0)) * 31;
        aaug aaug = this.j;
        hashCode = (hashCode + (aaug != null ? aaug.hashCode() : 0)) * 31;
        abet abet = this.k;
        hashCode = (hashCode + (abet != null ? abet.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamk aamk = this.p;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.q;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.t;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
