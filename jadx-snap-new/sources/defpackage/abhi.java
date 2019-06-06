package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhi */
public final class abhi extends abgz {
    private String a;
    private Long b;

    private abhi b() {
        abhi abhi = (abhi) super.clone();
        String str = this.a;
        if (str != null) {
            abhi.a = str;
        }
        Long l = this.b;
        if (l != null) {
            abhi.b = l;
        }
        return abhi;
    }

    public final /* synthetic */ abgz a() {
        return b();
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("section_type", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("duration_ms", l);
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
        return asDictionary().equals(((abhi) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_SECTION_INIT_TO_INTERACTIVE";
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
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
