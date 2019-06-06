package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbt */
public final class abbt extends abbr {
    private Long a;

    private abbt b() {
        abbt abbt = (abbt) super.clone();
        Long l = this.a;
        if (l != null) {
            abbt.a = l;
        }
        return abbt;
    }

    public final /* synthetic */ abbr a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("video_count", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return b();
    }

    public final void c(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbt) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_DEVICE_STATUS";
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
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
