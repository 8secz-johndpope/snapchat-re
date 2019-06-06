package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqs */
public final class aaqs extends abhw {
    public Long a;
    public abbd b;
    public zyr c;
    public aajv d;
    public Long e;
    public Double f;
    public Long g;
    public Long h;
    public Long i;
    public String j;
    public Long k;
    public Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;

    private aaqs a() {
        aaqs aaqs = (aaqs) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqs.a = l;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aaqs.b = abbd;
        }
        zyr zyr = this.c;
        if (zyr != null) {
            aaqs.c = zyr;
        }
        aajv aajv = this.d;
        if (aajv != null) {
            aaqs.d = aajv;
        }
        l = this.e;
        if (l != null) {
            aaqs.e = l;
        }
        Double d = this.f;
        if (d != null) {
            aaqs.f = d;
        }
        l = this.g;
        if (l != null) {
            aaqs.g = l;
        }
        l = this.h;
        if (l != null) {
            aaqs.h = l;
        }
        l = this.i;
        if (l != null) {
            aaqs.i = l;
        }
        String str = this.j;
        if (str != null) {
            aaqs.j = str;
        }
        l = this.k;
        if (l != null) {
            aaqs.k = l;
        }
        l = this.l;
        if (l != null) {
            aaqs.l = l;
        }
        l = this.m;
        if (l != null) {
            aaqs.m = l;
        }
        l = this.n;
        if (l != null) {
            aaqs.n = l;
        }
        l = this.o;
        if (l != null) {
            aaqs.o = l;
        }
        l = this.p;
        if (l != null) {
            aaqs.p = l;
        }
        l = this.q;
        if (l != null) {
            aaqs.q = l;
        }
        return aaqs;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        zyr zyr = this.c;
        if (zyr != null) {
            hashMap.put("action", zyr.toString());
        }
        aajv aajv = this.d;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        l = this.e;
        if (l != null) {
            hashMap.put("viewport_friend_count", l);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("map_friend_count", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("viewport_friend_max_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("viewport_friend_accum_count", l);
        }
        String str = this.j;
        if (str != null) {
            hashMap.put("map_poi_view_list", str);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("game_score", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("viewport_game_marker_max_count", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("friend_active_game_count", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("viewport_unviewed_status_count", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("viewport_viewed_status_count", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("viewport_status_max_count", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("viewport_status_accum_count", l);
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
        return asDictionary().equals(((aaqs) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_MAP_CLOSE";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abbd abbd = this.b;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        zyr zyr = this.c;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        aajv aajv = this.d;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
