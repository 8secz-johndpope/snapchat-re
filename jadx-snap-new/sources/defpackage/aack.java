package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aack */
public final class aack extends aach {
    private Long a;
    private Long b;
    private aacl c;
    private aacm d;

    private aack b() {
        aack aack = (aack) super.clone();
        Long l = this.a;
        if (l != null) {
            aack.a = l;
        }
        l = this.b;
        if (l != null) {
            aack.b = l;
        }
        aacl aacl = this.c;
        if (aacl != null) {
            aack.c = aacl;
        }
        aacm aacm = this.d;
        if (aacm != null) {
            aack.d = aacm;
        }
        return aack;
    }

    public final /* synthetic */ aach a() {
        return b();
    }

    public final void a(aacl aacl) {
        this.c = aacl;
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
        aacl aacl = this.c;
        if (aacl != null) {
            hashMap.put("camera_open_interrupt_reason", aacl.toString());
        }
        aacm aacm = this.d;
        if (aacm != null) {
            hashMap.put("camera_open_state", aacm.toString());
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
        return asDictionary().equals(((aack) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_OPEN_INTERRUPT";
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
        aacl aacl = this.c;
        hashCode = (hashCode + (aacl != null ? aacl.hashCode() : 0)) * 31;
        aacm aacm = this.d;
        if (aacm != null) {
            i = aacm.hashCode();
        }
        return hashCode + i;
    }
}
