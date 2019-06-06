package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaaz */
public final class aaaz extends abhw {
    private String a;
    private Boolean b;
    private Long c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private String g;
    private Long h;
    private Long i;
    private String j;
    private String k;
    private Boolean l;

    private aaaz a() {
        aaaz aaaz = (aaaz) super.clone();
        String str = this.a;
        if (str != null) {
            aaaz.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaaz.b = bool;
        }
        Long l = this.c;
        if (l != null) {
            aaaz.c = l;
        }
        bool = this.d;
        if (bool != null) {
            aaaz.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aaaz.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aaaz.f = bool;
        }
        str = this.g;
        if (str != null) {
            aaaz.g = str;
        }
        l = this.h;
        if (l != null) {
            aaaz.h = l;
        }
        l = this.i;
        if (l != null) {
            aaaz.i = l;
        }
        str = this.j;
        if (str != null) {
            aaaz.j = str;
        }
        str = this.k;
        if (str != null) {
            aaaz.k = str;
        }
        bool = this.l;
        if (bool != null) {
            aaaz.l = bool;
        }
        return aaaz;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("source", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_user_in_feed", bool);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("time_spent_waiting_ms", l);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("with_triggered_by_notification", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_result_successful", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_disk_encrypted", bool);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("performance_mode", str);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("time_since_app_start_ms", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("latency_millis", l);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("splits", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("notification_type", str);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("has_feed_items_changed", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.d = bool;
    }

    public final void b(Long l) {
        this.h = l;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final void c(Boolean bool) {
        this.e = bool;
    }

    public final void c(Long l) {
        this.i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaaz) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_STARTUP_FEED_READY";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.l;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
