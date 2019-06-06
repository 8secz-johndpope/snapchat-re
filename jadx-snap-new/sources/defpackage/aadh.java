package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadh */
public final class aadh extends abhw {
    private String a;
    private aasd b;
    private aasc c;
    private Double d;
    private abbd e;
    private String f;
    private Double g;
    private Boolean h;
    private Long i;
    private Long j;
    private String k;
    private String l;
    private String m;
    private Long n;
    private String o;
    private String p;
    private String q;
    private String r;
    private aadk s;
    private Long t;
    private Long u;
    private aamk v;
    private aahj w;
    private abba x;
    private abbd y;
    private String z;

    private aadh a() {
        aadh aadh = (aadh) super.clone();
        String str = this.a;
        if (str != null) {
            aadh.a = str;
        }
        aasd aasd = this.b;
        if (aasd != null) {
            aadh.b = aasd;
        }
        aasc aasc = this.c;
        if (aasc != null) {
            aadh.c = aasc;
        }
        Double d = this.d;
        if (d != null) {
            aadh.d = d;
        }
        abbd abbd = this.e;
        if (abbd != null) {
            aadh.e = abbd;
        }
        str = this.f;
        if (str != null) {
            aadh.f = str;
        }
        d = this.g;
        if (d != null) {
            aadh.g = d;
        }
        Boolean bool = this.h;
        if (bool != null) {
            aadh.h = bool;
        }
        Long l = this.i;
        if (l != null) {
            aadh.i = l;
        }
        l = this.j;
        if (l != null) {
            aadh.j = l;
        }
        str = this.k;
        if (str != null) {
            aadh.k = str;
        }
        str = this.l;
        if (str != null) {
            aadh.l = str;
        }
        str = this.m;
        if (str != null) {
            aadh.m = str;
        }
        l = this.n;
        if (l != null) {
            aadh.n = l;
        }
        str = this.o;
        if (str != null) {
            aadh.o = str;
        }
        str = this.p;
        if (str != null) {
            aadh.p = str;
        }
        str = this.q;
        if (str != null) {
            aadh.q = str;
        }
        str = this.r;
        if (str != null) {
            aadh.r = str;
        }
        aadk aadk = this.s;
        if (aadk != null) {
            aadh.s = aadk;
        }
        l = this.t;
        if (l != null) {
            aadh.t = l;
        }
        l = this.u;
        if (l != null) {
            aadh.u = l;
        }
        aamk aamk = this.v;
        if (aamk != null) {
            aadh.v = aamk;
        }
        aahj aahj = this.w;
        if (aahj != null) {
            aadh.w = aahj;
        }
        abba abba = this.x;
        if (abba != null) {
            aadh.x = abba;
        }
        abbd = this.y;
        if (abbd != null) {
            aadh.y = abbd;
        }
        str = this.z;
        if (str != null) {
            aadh.z = str;
        }
        return aadh;
    }

    public final void a(aasc aasc) {
        this.c = aasc;
    }

    public final void a(aasd aasd) {
        this.b = aasd;
    }

    public final void a(abbd abbd) {
        this.e = abbd;
    }

    public final void a(Double d) {
        this.d = d;
    }

    public final void a(Long l) {
        this.j = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        aasd aasd = this.b;
        if (aasd != null) {
            hashMap.put("message_type", aasd.toString());
        }
        aasc aasc = this.c;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("ack_time_sec", d);
        }
        abbd abbd = this.e;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        d = this.g;
        if (d != null) {
            hashMap.put("note_time_sec", d);
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("playback_audio", bool);
        }
        Long l = this.i;
        if (l != null) {
            hashMap.put("tap_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("camera", l);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("chat_id", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("teamsnap_id", str);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("cell_view_position", l);
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
        str = this.r;
        if (str != null) {
            hashMap.put("parcel_type", str);
        }
        aadk aadk = this.s;
        if (aadk != null) {
            hashMap.put("chat_erase_mode", aadk.toString());
        }
        l = this.t;
        if (l != null) {
            hashMap.put("mention_count", l);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("unique_mention_count", l);
        }
        aamk aamk = this.v;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.w;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
        }
        abba abba = this.x;
        if (abba != null) {
            hashMap.put("snappable_invite_action", abba.toString());
        }
        abbd = this.y;
        if (abbd != null) {
            hashMap.put("send_source", abbd.toString());
        }
        str = this.z;
        if (str != null) {
            hashMap.put("gallery_collection_category", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.k = str;
    }

    public final void c(String str) {
        this.l = str;
    }

    public final void d(String str) {
        this.m = str;
    }

    public final void e(String str) {
        this.r = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aadh) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_CHAT_VIEW";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aasd aasd = this.b;
        hashCode = (hashCode + (aasd != null ? aasd.hashCode() : 0)) * 31;
        aasc aasc = this.c;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abbd abbd = this.e;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aadk aadk = this.s;
        hashCode = (hashCode + (aadk != null ? aadk.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aamk aamk = this.v;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.w;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        abba abba = this.x;
        hashCode = (hashCode + (abba != null ? abba.hashCode() : 0)) * 31;
        abbd = this.y;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.z;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
