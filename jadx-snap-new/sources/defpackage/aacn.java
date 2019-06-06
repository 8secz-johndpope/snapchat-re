package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacn */
public final class aacn extends aach {
    private Long a;
    private Long b;

    private aacn b() {
        aacn aacn = (aacn) super.clone();
        Long l = this.a;
        if (l != null) {
            aacn.a = l;
        }
        l = this.b;
        if (l != null) {
            aacn.b = l;
        }
        return aacn;
    }

    public final /* synthetic */ aach a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("duration_until_camera_open_ms", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("duration_ms", l);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacn) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_OPEN_SUCCESS";
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
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
