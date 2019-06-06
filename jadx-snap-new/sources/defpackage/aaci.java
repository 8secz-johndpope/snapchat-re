package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaci */
public final class aaci extends aach {
    private Long a;
    private aacj b;

    private aaci b() {
        aaci aaci = (aaci) super.clone();
        Long l = this.a;
        if (l != null) {
            aaci.a = l;
        }
        aacj aacj = this.b;
        if (aacj != null) {
            aaci.b = aacj;
        }
        return aaci;
    }

    public final /* synthetic */ aach a() {
        return b();
    }

    public final void a(aacj aacj) {
        this.b = aacj;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("duration_ms", l);
        }
        aacj aacj = this.b;
        if (aacj != null) {
            hashMap.put("camera_open_failure_reason", aacj.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaci) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_OPEN_FAILURE";
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
        aacj aacj = this.b;
        if (aacj != null) {
            i = aacj.hashCode();
        }
        return hashCode + i;
    }
}
