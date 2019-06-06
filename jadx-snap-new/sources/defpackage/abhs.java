package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhs */
public final class abhs extends abhw {
    private Boolean a;
    private Boolean b;
    private Long c;
    private Long d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Long j;
    private String k;
    private Boolean l;
    private Long m;

    private abhs a() {
        abhs abhs = (abhs) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abhs.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            abhs.b = bool;
        }
        Long l = this.c;
        if (l != null) {
            abhs.c = l;
        }
        l = this.d;
        if (l != null) {
            abhs.d = l;
        }
        bool = this.e;
        if (bool != null) {
            abhs.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            abhs.f = bool;
        }
        bool = this.g;
        if (bool != null) {
            abhs.g = bool;
        }
        bool = this.h;
        if (bool != null) {
            abhs.h = bool;
        }
        bool = this.i;
        if (bool != null) {
            abhs.i = bool;
        }
        l = this.j;
        if (l != null) {
            abhs.j = l;
        }
        String str = this.k;
        if (str != null) {
            abhs.k = str;
        }
        bool = this.l;
        if (bool != null) {
            abhs.l = bool;
        }
        l = this.m;
        if (l != null) {
            abhs.m = l;
        }
        return abhs;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("system_push_notification_enabled", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("app_notification_enabled", bool);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("device_id", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("alert_style", l);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_sound_enabled", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_badge_enabled", bool);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("with_alert_enabled", bool);
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("display_on_lock_screen", bool);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("display_in_notification_center", bool);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("time_since_startup_finish_ms", l);
        }
        String str = this.k;
        if (str != null) {
            hashMap.put("startup_path", str);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("from_login", bool);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("login_session", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.b = bool;
    }

    public final void b(Long l) {
        this.j = l;
    }

    public final void c(Boolean bool) {
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhs) obj).asDictionary());
    }

    public final String getEventName() {
        return "USER_PROFILE_SETTING";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.m;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
