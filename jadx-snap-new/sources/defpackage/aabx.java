package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabx */
public final class aabx extends abhw {
    private aasc a;
    private Long b;
    private String c;
    private Long d;
    private Boolean e;
    private aagz f;
    private aaha g;

    private aabx a() {
        aabx aabx = (aabx) super.clone();
        aasc aasc = this.a;
        if (aasc != null) {
            aabx.a = aasc;
        }
        Long l = this.b;
        if (l != null) {
            aabx.b = l;
        }
        String str = this.c;
        if (str != null) {
            aabx.c = str;
        }
        l = this.d;
        if (l != null) {
            aabx.d = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aabx.e = bool;
        }
        aagz aagz = this.f;
        if (aagz != null) {
            aabx.f = aagz;
        }
        aaha aaha = this.g;
        if (aaha != null) {
            aabx.g = aaha;
        }
        return aabx;
    }

    public final void a(aagz aagz) {
        this.f = aagz;
    }

    public final void a(aasc aasc) {
        this.a = aasc;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aasc aasc = this.a;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("capture_to_recovery_time_sec", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("recovery_attempt_count", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("success", bool);
        }
        aagz aagz = this.f;
        if (aagz != null) {
            hashMap.put("content_loss_reason", aagz.toString());
        }
        aaha aaha = this.g;
        if (aaha != null) {
            hashMap.put("content_recovery_skip_reason", aaha.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aabx) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_CONTENT_RECOVERY_ATTEMPT";
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
        aasc aasc = this.a;
        int i = 0;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aagz aagz = this.f;
        hashCode = (hashCode + (aagz != null ? aagz.hashCode() : 0)) * 31;
        aaha aaha = this.g;
        if (aaha != null) {
            i = aaha.hashCode();
        }
        return hashCode + i;
    }
}
