package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqo */
public final class aaqo extends abhw {
    private Long a;
    private String b;
    private String c;
    private Boolean d;
    private Long e;
    private Boolean f;

    private aaqo a() {
        aaqo aaqo = (aaqo) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqo.a = l;
        }
        String str = this.b;
        if (str != null) {
            aaqo.b = str;
        }
        str = this.c;
        if (str != null) {
            aaqo.c = str;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaqo.d = bool;
        }
        l = this.e;
        if (l != null) {
            aaqo.e = l;
        }
        bool = this.f;
        if (bool != null) {
            aaqo.f = bool;
        }
        return aaqo;
    }

    public final void a(Boolean bool) {
        this.f = bool;
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
        str = this.c;
        if (str != null) {
            hashMap.put("marker_id", str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("did_acquire", bool);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("score", l);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("user_in_ghost_mode", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaqo) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_GAME_MARKER_ACQUIRE_TAP";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
