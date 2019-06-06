package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abfe */
public class abfe extends aaka {
    public zyr g;
    public String h;
    public abff i;
    public Long j;
    public Long k;
    public abfi l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public Boolean r;
    public Boolean s;
    public Boolean t;
    public abfh u;
    public String v;
    public String w;
    public Long x;
    private String y;
    private String z;

    public final void a(abff abff) {
        this.i = abff;
    }

    public final void a(abfi abfi) {
        this.l = abfi;
    }

    public final void a(Long l) {
        this.j = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        zyr zyr = this.g;
        if (zyr != null) {
            hashMap.put(MapboxEvent.KEY_GESTURE_ID, zyr.toString());
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("stream_id", str);
        }
        abff abff = this.i;
        if (abff != null) {
            hashMap.put("item_layout", abff.toString());
        }
        Long l = this.j;
        if (l != null) {
            hashMap.put("item_pos", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("reranking_id", l);
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
            hashMap.put("item_id", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("correspondent_id", str);
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
            hashMap.put("tile_autoplayed", bool);
        }
        bool = this.s;
        if (bool != null) {
            hashMap.put("is_promoted", bool);
        }
        bool = this.t;
        if (bool != null) {
            hashMap.put("is_subscribed", bool);
        }
        abfh abfh = this.u;
        if (abfh != null) {
            hashMap.put("source", abfh.toString());
        }
        str = this.v;
        if (str != null) {
            hashMap.put("attached_info", str);
        }
        str = this.w;
        if (str != null) {
            hashMap.put("triggering_item_id", str);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("triggering_item_playlist_offset", l);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("teamsnap_id", str);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: b */
    public abfe clone() {
        abfe abfe = (abfe) super.clone();
        zyr zyr = this.g;
        if (zyr != null) {
            abfe.g = zyr;
        }
        String str = this.h;
        if (str != null) {
            abfe.h = str;
        }
        abff abff = this.i;
        if (abff != null) {
            abfe.i = abff;
        }
        Long l = this.j;
        if (l != null) {
            abfe.j = l;
        }
        l = this.k;
        if (l != null) {
            abfe.k = l;
        }
        abfi abfi = this.l;
        if (abfi != null) {
            abfe.l = abfi;
        }
        str = this.m;
        if (str != null) {
            abfe.m = str;
        }
        str = this.n;
        if (str != null) {
            abfe.n = str;
        }
        str = this.o;
        if (str != null) {
            abfe.o = str;
        }
        str = this.p;
        if (str != null) {
            abfe.p = str;
        }
        str = this.q;
        if (str != null) {
            abfe.q = str;
        }
        Boolean bool = this.r;
        if (bool != null) {
            abfe.r = bool;
        }
        bool = this.s;
        if (bool != null) {
            abfe.s = bool;
        }
        bool = this.t;
        if (bool != null) {
            abfe.t = bool;
        }
        abfh abfh = this.u;
        if (abfh != null) {
            abfe.u = abfh;
        }
        str = this.v;
        if (str != null) {
            abfe.v = str;
        }
        str = this.w;
        if (str != null) {
            abfe.w = str;
        }
        l = this.x;
        if (l != null) {
            abfe.x = l;
        }
        str = this.y;
        if (str != null) {
            abfe.y = str;
        }
        str = this.z;
        if (str != null) {
            abfe.z = str;
        }
        return abfe;
    }

    public final void b(String str) {
        this.n = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfe) obj).asDictionary());
    }

    public String getEventName() {
        return "STORY_FEED_ITEM_IMP";
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
        zyr zyr = this.g;
        int i = 0;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abff abff = this.i;
        hashCode = (hashCode + (abff != null ? abff.hashCode() : 0)) * 31;
        Long l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abfi abfi = this.l;
        hashCode = (hashCode + (abfi != null ? abfi.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.r;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.s;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.t;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abfh abfh = this.u;
        hashCode = (hashCode + (abfh != null ? abfh.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.z;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
