package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aato */
public final class aato extends abhw {
    private aatm a;
    private aahb b;
    private abfi c;
    private aajv d;
    private Boolean e;
    private Boolean f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private Long k;
    private Long l;
    private String m;

    private aato a() {
        aato aato = (aato) super.clone();
        aatm aatm = this.a;
        if (aatm != null) {
            aato.a = aatm;
        }
        aahb aahb = this.b;
        if (aahb != null) {
            aato.b = aahb;
        }
        abfi abfi = this.c;
        if (abfi != null) {
            aato.c = abfi;
        }
        aajv aajv = this.d;
        if (aajv != null) {
            aato.d = aajv;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aato.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aato.f = bool;
        }
        Long l = this.g;
        if (l != null) {
            aato.g = l;
        }
        l = this.h;
        if (l != null) {
            aato.h = l;
        }
        l = this.i;
        if (l != null) {
            aato.i = l;
        }
        l = this.j;
        if (l != null) {
            aato.j = l;
        }
        l = this.k;
        if (l != null) {
            aato.k = l;
        }
        l = this.l;
        if (l != null) {
            aato.l = l;
        }
        String str = this.m;
        if (str != null) {
            aato.m = str;
        }
        return aato;
    }

    public final void a(aahb aahb) {
        this.b = aahb;
    }

    public final void a(aajv aajv) {
        this.d = aajv;
    }

    public final void a(aatm aatm) {
        this.a = aatm;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final void a(Long l) {
        this.g = l;
    }

    public final void a(String str) {
        this.m = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aatm aatm = this.a;
        if (aatm != null) {
            hashMap.put("opera_version", aatm.toString());
        }
        aahb aahb = this.b;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        abfi abfi = this.c;
        if (abfi != null) {
            hashMap.put("content_type", abfi.toString());
        }
        aajv aajv = this.d;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("stalled_on_start", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("stalled_on_exit", bool);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("stall_free_snap_count", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("snap_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("stall_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("story_count", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("session_duration_ms", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("stall_duration_ms", l);
        }
        String str = this.m;
        if (str != null) {
            hashMap.put("opera_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.f = bool;
    }

    public final void b(Long l) {
        this.h = l;
    }

    public final void c(Long l) {
        this.i = l;
    }

    public final void d(Long l) {
        this.j = l;
    }

    public final void e(Long l) {
        this.k = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aato) obj).asDictionary());
    }

    public final void f(Long l) {
        this.l = l;
    }

    public final String getEventName() {
        return "OPERA_SNAP_PLAYBACK_SESSION";
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
        aatm aatm = this.a;
        int i = 0;
        hashCode = (hashCode + (aatm != null ? aatm.hashCode() : 0)) * 31;
        aahb aahb = this.b;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        abfi abfi = this.c;
        hashCode = (hashCode + (abfi != null ? abfi.hashCode() : 0)) * 31;
        aajv aajv = this.d;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.m;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
