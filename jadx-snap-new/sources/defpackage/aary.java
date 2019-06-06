package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aary */
public final class aary extends aarw {
    private Long a;
    private Long b;
    private aarx c;
    private Long d;
    private aahr e;

    private aary b() {
        aary aary = (aary) super.clone();
        Long l = this.a;
        if (l != null) {
            aary.a = l;
        }
        l = this.b;
        if (l != null) {
            aary.b = l;
        }
        aarx aarx = this.c;
        if (aarx != null) {
            aary.c = aarx;
        }
        l = this.d;
        if (l != null) {
            aary.d = l;
        }
        aahr aahr = this.e;
        if (aahr != null) {
            aahr = aahr.clone();
            if (aahr == null) {
                aary.e = null;
            } else {
                aary.e = new aahr(aahr);
            }
        }
        return aary;
    }

    public final /* synthetic */ aarw a() {
        return b();
    }

    public final void a(aarx aarx) {
        this.c = aarx;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("loop_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("playback_duration_ms", l);
        }
        aarx aarx = this.c;
        if (aarx != null) {
            hashMap.put("failure_type", aarx.toString());
        }
        l = this.d;
        if (l != null) {
            hashMap.put("restart_delay_ms", l);
        }
        aahr aahr = this.e;
        if (aahr != null) {
            hashMap.putAll(aahr.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.a = l;
    }

    public final void c(Long l) {
        this.b = l;
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
        return asDictionary().equals(((aary) obj).asDictionary());
    }

    public final String getEventName() {
        return "MEDIA_PLAYER_RUNNING_EVENT";
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
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aarx aarx = this.c;
        hashCode = (hashCode + (aarx != null ? aarx.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahr aahr = this.e;
        if (aahr != null) {
            i = aahr.hashCode();
        }
        return hashCode + i;
    }
}
