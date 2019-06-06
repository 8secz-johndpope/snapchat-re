package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfr */
public final class abfr extends abfs {
    private Long A;
    private Long B;
    private aahp C;
    private aavf a;
    private aabm b;
    private Long c;
    private aahb d;
    private abfn e;
    private String f;
    private String g;
    private String h;
    private abgl i;
    private Long j;
    private Long k;
    private abet l;
    private Long m;
    private String n;
    private String o;
    private String p;
    private String q;
    private aamk r;
    private aahj s;
    private String t;
    private abbd u;
    private String v;
    private String w;
    private String x;
    private Long y;
    private Long z;

    private abfr b() {
        abfr abfr = (abfr) super.clone();
        aavf aavf = this.a;
        if (aavf != null) {
            abfr.a = aavf;
        }
        aabm aabm = this.b;
        if (aabm != null) {
            abfr.b = aabm;
        }
        Long l = this.c;
        if (l != null) {
            abfr.c = l;
        }
        aahb aahb = this.d;
        if (aahb != null) {
            abfr.d = aahb;
        }
        abfn abfn = this.e;
        if (abfn != null) {
            abfr.e = abfn;
        }
        String str = this.f;
        if (str != null) {
            abfr.f = str;
        }
        str = this.g;
        if (str != null) {
            abfr.g = str;
        }
        str = this.h;
        if (str != null) {
            abfr.h = str;
        }
        abgl abgl = this.i;
        if (abgl != null) {
            abfr.i = abgl;
        }
        l = this.j;
        if (l != null) {
            abfr.j = l;
        }
        l = this.k;
        if (l != null) {
            abfr.k = l;
        }
        abet abet = this.l;
        if (abet != null) {
            abfr.l = abet;
        }
        l = this.m;
        if (l != null) {
            abfr.m = l;
        }
        str = this.n;
        if (str != null) {
            abfr.n = str;
        }
        str = this.o;
        if (str != null) {
            abfr.o = str;
        }
        str = this.p;
        if (str != null) {
            abfr.p = str;
        }
        str = this.q;
        if (str != null) {
            abfr.q = str;
        }
        aamk aamk = this.r;
        if (aamk != null) {
            abfr.r = aamk;
        }
        aahj aahj = this.s;
        if (aahj != null) {
            abfr.s = aahj;
        }
        str = this.t;
        if (str != null) {
            abfr.t = str;
        }
        abbd abbd = this.u;
        if (abbd != null) {
            abfr.u = abbd;
        }
        str = this.v;
        if (str != null) {
            abfr.v = str;
        }
        str = this.w;
        if (str != null) {
            abfr.w = str;
        }
        str = this.x;
        if (str != null) {
            abfr.x = str;
        }
        l = this.y;
        if (l != null) {
            abfr.y = l;
        }
        l = this.z;
        if (l != null) {
            abfr.z = l;
        }
        l = this.A;
        if (l != null) {
            abfr.A = l;
        }
        l = this.B;
        if (l != null) {
            abfr.B = l;
        }
        aahp aahp = this.C;
        if (aahp != null) {
            abfr.a(aahp.clone());
        }
        return abfr;
    }

    public final /* synthetic */ abax a() {
        return b();
    }

    public final void a(aahb aahb) {
        this.d = aahb;
    }

    public final void a(aahp aahp) {
        if (aahp == null) {
            this.C = null;
        } else {
            this.C = new aahp(aahp);
        }
    }

    public final void a(abet abet) {
        this.l = abet;
    }

    public final void a(String str) {
        this.x = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aavf aavf = this.a;
        if (aavf != null) {
            hashMap.put("read_state", aavf.toString());
        }
        aabm aabm = this.b;
        if (aabm != null) {
            hashMap.put("bandwidth_class", aabm.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("view_location", l);
        }
        aahb aahb = this.d;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        abfn abfn = this.e;
        if (abfn != null) {
            hashMap.put("play_mode", abfn.toString());
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("tracking_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("sort_order_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("collection_id", str);
        }
        abgl abgl = this.i;
        if (abgl != null) {
            hashMap.put("collection_type", abgl.toString());
        }
        l = this.j;
        if (l != null) {
            hashMap.put("collection_pos", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        abet abet = this.l;
        if (abet != null) {
            hashMap.put("story_access_type", abet.toString());
        }
        l = this.m;
        if (l != null) {
            hashMap.put("view_location_pos", l);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aamk aamk = this.r;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.s;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
        }
        str = this.t;
        if (str != null) {
            hashMap.put("media_resolution", str);
        }
        abbd abbd = this.u;
        if (abbd != null) {
            hashMap.put("send_source", abbd.toString());
        }
        str = this.v;
        if (str != null) {
            hashMap.put("gallery_collection_category", str);
        }
        str = this.w;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("team_snapchat_story_snap_hash", str);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("num_chats_sent", l);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("num_snaps_sent", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("num_saves", l);
        }
        l = this.B;
        if (l != null) {
            hashMap.put("num_sends", l);
        }
        aahp aahp = this.C;
        if (aahp != null) {
            hashMap.putAll(aahp.f());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final /* synthetic */ abfs c() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfr) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_SNAP_VIEW";
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
        aavf aavf = this.a;
        int i = 0;
        hashCode = (hashCode + (aavf != null ? aavf.hashCode() : 0)) * 31;
        aabm aabm = this.b;
        hashCode = (hashCode + (aabm != null ? aabm.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.d;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        abfn abfn = this.e;
        hashCode = (hashCode + (abfn != null ? abfn.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgl abgl = this.i;
        hashCode = (hashCode + (abgl != null ? abgl.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abet abet = this.l;
        hashCode = (hashCode + (abet != null ? abet.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamk aamk = this.r;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.s;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.u;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.B;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahp aahp = this.C;
        if (aahp != null) {
            i = aahp.hashCode();
        }
        return hashCode + i;
    }
}
