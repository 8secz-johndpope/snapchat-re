package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfj */
public class abfj extends aaka {
    public Long A;
    public Double B;
    public Boolean C;
    public Boolean D;
    public abfh E;
    public String F;
    public String G;
    public Long H;
    private abff I;
    private Double J;
    private String K;
    public String g;
    public String h;
    public String i;
    public Long j;
    public Long k;
    public abfi l;
    public String m;
    public String n;
    public Long o;
    public String p;
    public String q;
    public Boolean r;
    public abfl s;
    public aajr t;
    public aajv u;
    public aasc v;
    public Double w;
    public Double x;
    public Long y;
    public Long z;

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.g;
        if (str != null) {
            hashMap.put("stream_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("item_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        Long l = this.j;
        if (l != null) {
            hashMap.put("item_pos", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("reranking_id", l);
        }
        abff abff = this.I;
        if (abff != null) {
            hashMap.put("item_layout", abff.toString());
        }
        abfi abfi = this.l;
        if (abfi != null) {
            hashMap.put("item_type", abfi.toString());
        }
        str = this.m;
        if (str != null) {
            hashMap.put("item_type_specific", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("subitem_id", str);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("subitem_index", l);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("tile_id", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("variant_id", str);
        }
        Boolean bool = this.r;
        if (bool != null) {
            hashMap.put("with_viewed_state", bool);
        }
        Double d = this.J;
        if (d != null) {
            hashMap.put("impression_fraction", d);
        }
        abfl abfl = this.s;
        if (abfl != null) {
            hashMap.put("view_session_type", abfl.toString());
        }
        aajr aajr = this.t;
        if (aajr != null) {
            hashMap.put("entry_event", aajr.toString());
        }
        aajv aajv = this.u;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        aasc aasc = this.v;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        d = this.w;
        if (d != null) {
            hashMap.put("view_time_secs", d);
        }
        d = this.x;
        if (d != null) {
            hashMap.put("view_session_start_ts", d);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("num_subitems_available", l);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("num_unique_subitems_viewed", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("max_subitem_view_index", l);
        }
        d = this.B;
        if (d != null) {
            hashMap.put("total_media_duration_secs", d);
        }
        bool = this.C;
        if (bool != null) {
            hashMap.put("is_promoted", bool);
        }
        bool = this.D;
        if (bool != null) {
            hashMap.put("is_subscribed", bool);
        }
        abfh abfh = this.E;
        if (abfh != null) {
            hashMap.put("source", abfh.toString());
        }
        str = this.F;
        if (str != null) {
            hashMap.put("attached_info", str);
        }
        str = this.G;
        if (str != null) {
            hashMap.put("triggering_item_id", str);
        }
        l = this.H;
        if (l != null) {
            hashMap.put("triggering_item_playlist_offset", l);
        }
        str = this.K;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: b */
    public abfj clone() {
        abfj abfj = (abfj) super.clone();
        String str = this.g;
        if (str != null) {
            abfj.g = str;
        }
        str = this.h;
        if (str != null) {
            abfj.h = str;
        }
        str = this.i;
        if (str != null) {
            abfj.i = str;
        }
        Long l = this.j;
        if (l != null) {
            abfj.j = l;
        }
        l = this.k;
        if (l != null) {
            abfj.k = l;
        }
        abff abff = this.I;
        if (abff != null) {
            abfj.I = abff;
        }
        abfi abfi = this.l;
        if (abfi != null) {
            abfj.l = abfi;
        }
        str = this.m;
        if (str != null) {
            abfj.m = str;
        }
        str = this.n;
        if (str != null) {
            abfj.n = str;
        }
        l = this.o;
        if (l != null) {
            abfj.o = l;
        }
        str = this.p;
        if (str != null) {
            abfj.p = str;
        }
        str = this.q;
        if (str != null) {
            abfj.q = str;
        }
        Boolean bool = this.r;
        if (bool != null) {
            abfj.r = bool;
        }
        Double d = this.J;
        if (d != null) {
            abfj.J = d;
        }
        abfl abfl = this.s;
        if (abfl != null) {
            abfj.s = abfl;
        }
        aajr aajr = this.t;
        if (aajr != null) {
            abfj.t = aajr;
        }
        aajv aajv = this.u;
        if (aajv != null) {
            abfj.u = aajv;
        }
        aasc aasc = this.v;
        if (aasc != null) {
            abfj.v = aasc;
        }
        d = this.w;
        if (d != null) {
            abfj.w = d;
        }
        d = this.x;
        if (d != null) {
            abfj.x = d;
        }
        l = this.y;
        if (l != null) {
            abfj.y = l;
        }
        l = this.z;
        if (l != null) {
            abfj.z = l;
        }
        l = this.A;
        if (l != null) {
            abfj.A = l;
        }
        d = this.B;
        if (d != null) {
            abfj.B = d;
        }
        bool = this.C;
        if (bool != null) {
            abfj.C = bool;
        }
        bool = this.D;
        if (bool != null) {
            abfj.D = bool;
        }
        abfh abfh = this.E;
        if (abfh != null) {
            abfj.E = abfh;
        }
        str = this.F;
        if (str != null) {
            abfj.F = str;
        }
        str = this.G;
        if (str != null) {
            abfj.G = str;
        }
        l = this.H;
        if (l != null) {
            abfj.H = l;
        }
        str = this.K;
        if (str != null) {
            abfj.K = str;
        }
        return abfj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfj) obj).asDictionary());
    }

    public String getEventName() {
        return "STORY_FEED_ITEM_VIEW_SESSION";
    }

    public aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.g;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abff abff = this.I;
        hashCode = (hashCode + (abff != null ? abff.hashCode() : 0)) * 31;
        abfi abfi = this.l;
        hashCode = (hashCode + (abfi != null ? abfi.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.r;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.J;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abfl abfl = this.s;
        hashCode = (hashCode + (abfl != null ? abfl.hashCode() : 0)) * 31;
        aajr aajr = this.t;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
        aajv aajv = this.u;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        aasc aasc = this.v;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        d = this.w;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.x;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.B;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.C;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.D;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abfh abfh = this.E;
        hashCode = (hashCode + (abfh != null ? abfh.hashCode() : 0)) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.G;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.H;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.K;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
