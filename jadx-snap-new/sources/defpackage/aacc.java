package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacc */
public final class aacc extends aacv {
    private Long a;
    private Long b;
    private Long c;
    private Long d;

    private aacc b() {
        aacc aacc = (aacc) super.clone();
        Long l = this.a;
        if (l != null) {
            aacc.a = l;
        }
        l = this.b;
        if (l != null) {
            aacc.b = l;
        }
        l = this.c;
        if (l != null) {
            aacc.c = l;
        }
        l = this.d;
        if (l != null) {
            aacc.d = l;
        }
        return aacc;
    }

    public final /* synthetic */ aacv a() {
        return b();
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("image_encoding_quality", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("image_width_hint", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("image_height_hint", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("network_bandwidth_bits_per_sec", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacc) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_IMAGE_TRANSCODING";
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
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
