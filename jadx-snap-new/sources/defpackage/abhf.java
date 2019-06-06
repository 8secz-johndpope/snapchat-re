package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhf */
public final class abhf extends abgz {
    private Long a;
    private abhe b;

    private abhf b() {
        abhf abhf = (abhf) super.clone();
        Long l = this.a;
        if (l != null) {
            abhf.a = l;
        }
        abhe abhe = this.b;
        if (abhe != null) {
            abhf.b = abhe;
        }
        return abhf;
    }

    public final /* synthetic */ abgz a() {
        return b();
    }

    public final void a(abhe abhe) {
        this.b = abhe;
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
        abhe abhe = this.b;
        if (abhe != null) {
            hashMap.put("profile_source", abhe.toString());
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
        return asDictionary().equals(((abhf) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_OPEN_TIME_TO_INTERACTIVE";
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
        abhe abhe = this.b;
        if (abhe != null) {
            i = abhe.hashCode();
        }
        return hashCode + i;
    }
}
