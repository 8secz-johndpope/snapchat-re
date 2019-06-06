package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhd */
public final class abhd extends abgz {
    private Long a;
    private Long b;
    private abhe c;
    private Double d;
    private Double e;

    private abhd b() {
        abhd abhd = (abhd) super.clone();
        Long l = this.a;
        if (l != null) {
            abhd.a = l;
        }
        l = this.b;
        if (l != null) {
            abhd.b = l;
        }
        abhe abhe = this.c;
        if (abhe != null) {
            abhd.c = abhe;
        }
        Double d = this.d;
        if (d != null) {
            abhd.d = d;
        }
        d = this.e;
        if (d != null) {
            abhd.e = d;
        }
        return abhd;
    }

    public final /* synthetic */ abgz a() {
        return b();
    }

    public final void a(abhe abhe) {
        this.c = abhe;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("duration_ms", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("load_duration_ms", l);
        }
        abhe abhe = this.c;
        if (abhe != null) {
            hashMap.put("profile_source", abhe.toString());
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("full_animation_frame_drop_rate", d);
        }
        d = this.e;
        if (d != null) {
            hashMap.put("profile_animation_frame_drop_rate", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhd) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_OPEN_ANIMATION";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abhe abhe = this.c;
        hashCode = (hashCode + (abhe != null ? abhe.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.e;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
