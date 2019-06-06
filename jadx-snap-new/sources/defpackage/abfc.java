package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abfc */
public class abfc extends aaka {
    private String A;
    public String g;
    public String h;
    public String i;
    public abff j;
    public Long k;
    public Long l;
    public abfi m;
    public String n;
    public String o;
    public String p;
    public abey q;
    public abfb r;
    public zyr s;
    public String t;
    public Long u;
    public Boolean v;
    public Boolean w;
    public abfh x;
    public String y;
    private Boolean z;

    public final void a(abey abey) {
        this.q = abey;
    }

    public final void a(abff abff) {
        this.j = abff;
    }

    public final void a(abfi abfi) {
        this.m = abfi;
    }

    public final void a(Long l) {
        this.k = l;
    }

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
        abff abff = this.j;
        if (abff != null) {
            hashMap.put("item_layout", abff.toString());
        }
        Long l = this.k;
        if (l != null) {
            hashMap.put("item_pos", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("reranking_id", l);
        }
        abfi abfi = this.m;
        if (abfi != null) {
            hashMap.put("item_type", abfi.toString());
        }
        str = this.n;
        if (str != null) {
            hashMap.put("item_type_specific", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("tile_id", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("variant_id", str);
        }
        abey abey = this.q;
        if (abey != null) {
            hashMap.put("action", abey.toString());
        }
        abfb abfb = this.r;
        if (abfb != null) {
            hashMap.put("interaction_context", abfb.toString());
        }
        zyr zyr = this.s;
        if (zyr != null) {
            hashMap.put(MapboxEvent.KEY_GESTURE_ID, zyr.toString());
        }
        str = this.t;
        if (str != null) {
            hashMap.put("subitem_id", str);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("subitem_index", l);
        }
        Boolean bool = this.v;
        if (bool != null) {
            hashMap.put("is_promoted", bool);
        }
        bool = this.w;
        if (bool != null) {
            hashMap.put("is_subscribed", bool);
        }
        bool = this.z;
        if (bool != null) {
            hashMap.put("with_viewed_state", bool);
        }
        abfh abfh = this.x;
        if (abfh != null) {
            hashMap.put("source", abfh.toString());
        }
        str = this.y;
        if (str != null) {
            hashMap.put("attached_info", str);
        }
        str = this.A;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: b */
    public abfc clone() {
        abfc abfc = (abfc) super.clone();
        String str = this.g;
        if (str != null) {
            abfc.g = str;
        }
        str = this.h;
        if (str != null) {
            abfc.h = str;
        }
        str = this.i;
        if (str != null) {
            abfc.i = str;
        }
        abff abff = this.j;
        if (abff != null) {
            abfc.j = abff;
        }
        Long l = this.k;
        if (l != null) {
            abfc.k = l;
        }
        l = this.l;
        if (l != null) {
            abfc.l = l;
        }
        abfi abfi = this.m;
        if (abfi != null) {
            abfc.m = abfi;
        }
        str = this.n;
        if (str != null) {
            abfc.n = str;
        }
        str = this.o;
        if (str != null) {
            abfc.o = str;
        }
        str = this.p;
        if (str != null) {
            abfc.p = str;
        }
        abey abey = this.q;
        if (abey != null) {
            abfc.q = abey;
        }
        abfb abfb = this.r;
        if (abfb != null) {
            abfc.r = abfb;
        }
        zyr zyr = this.s;
        if (zyr != null) {
            abfc.s = zyr;
        }
        str = this.t;
        if (str != null) {
            abfc.t = str;
        }
        l = this.u;
        if (l != null) {
            abfc.u = l;
        }
        Boolean bool = this.v;
        if (bool != null) {
            abfc.v = bool;
        }
        bool = this.w;
        if (bool != null) {
            abfc.w = bool;
        }
        bool = this.z;
        if (bool != null) {
            abfc.z = bool;
        }
        abfh abfh = this.x;
        if (abfh != null) {
            abfc.x = abfh;
        }
        str = this.y;
        if (str != null) {
            abfc.y = str;
        }
        str = this.A;
        if (str != null) {
            abfc.A = str;
        }
        return abfc;
    }

    public final void b(String str) {
        this.h = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfc) obj).asDictionary());
    }

    public String getEventName() {
        return "STORY_FEED_ITEM_ACTION";
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
        abff abff = this.j;
        hashCode = (hashCode + (abff != null ? abff.hashCode() : 0)) * 31;
        Long l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abfi abfi = this.m;
        hashCode = (hashCode + (abfi != null ? abfi.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abey abey = this.q;
        hashCode = (hashCode + (abey != null ? abey.hashCode() : 0)) * 31;
        abfb abfb = this.r;
        hashCode = (hashCode + (abfb != null ? abfb.hashCode() : 0)) * 31;
        zyr zyr = this.s;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.v;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.w;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.z;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abfh abfh = this.x;
        hashCode = (hashCode + (abfh != null ? abfh.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.A;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
