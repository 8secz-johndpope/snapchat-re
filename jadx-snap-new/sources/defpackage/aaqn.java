package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqn */
public final class aaqn extends abhw {
    private Long a;
    private String b;
    private Long c;
    private Boolean d;

    private aaqn a() {
        aaqn aaqn = (aaqn) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqn.a = l;
        }
        String str = this.b;
        if (str != null) {
            aaqn.b = str;
        }
        l = this.c;
        if (l != null) {
            aaqn.c = l;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaqn.d = bool;
        }
        return aaqn;
    }

    public final void a(Boolean bool) {
        this.d = bool;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("game_id", str);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("score", l);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("user_in_ghost_mode", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaqn) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_GAME_LEADERBOARD_TAP_TO_OPEN";
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
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
