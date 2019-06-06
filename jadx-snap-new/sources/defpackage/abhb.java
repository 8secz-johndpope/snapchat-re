package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhb */
public final class abhb extends abgy {
    private Boolean a;
    private Long b;
    private Long c;
    private Long d;
    private zyr e;

    private abhb d() {
        abhb abhb = (abhb) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abhb.a = bool;
        }
        Long l = this.b;
        if (l != null) {
            abhb.b = l;
        }
        l = this.c;
        if (l != null) {
            abhb.c = l;
        }
        l = this.d;
        if (l != null) {
            abhb.d = l;
        }
        zyr zyr = this.e;
        if (zyr != null) {
            abhb.e = zyr;
        }
        return abhb;
    }

    public final /* synthetic */ abgz a() {
        return d();
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(zyr zyr) {
        this.e = zyr;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_new", bool);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("pos", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("max_pos", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("view_time_millis", l);
        }
        zyr zyr = this.e;
        if (zyr != null) {
            hashMap.put("source", zyr.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abgy b() {
        return d();
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final void d(Long l) {
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhb) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_CHARM_DETAIL_IMPRESSION";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        zyr zyr = this.e;
        if (zyr != null) {
            i = zyr.hashCode();
        }
        return hashCode + i;
    }
}
