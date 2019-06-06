package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abav */
public final class abav extends abhw {
    private Long a;

    private abav a() {
        abav abav = (abav) super.clone();
        Long l = this.a;
        if (l != null) {
            abav.a = l;
        }
        return abav;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("os_error", l);
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
        return asDictionary().equals(((abav) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_SESSION_TOKEN_DISK_SAVE";
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
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
