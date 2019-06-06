package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdm */
public final class abdm extends abde {
    private Long a;

    private abdm b() {
        abdm abdm = (abdm) super.clone();
        Long l = this.a;
        if (l != null) {
            abdm.a = l;
        }
        return abdm;
    }

    public final /* synthetic */ abde a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("other_paired_device_count", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.a = l;
    }

    public final /* synthetic */ abeb c() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abdm) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_PAIRING_START";
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
