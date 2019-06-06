package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamn */
public final class aamn extends abhw {
    private aanj a;
    private Boolean b;
    private String c;
    private Long d;
    private Long e;

    private aamn a() {
        aamn aamn = (aamn) super.clone();
        aanj aanj = this.a;
        if (aanj != null) {
            aamn.a = aanj;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aamn.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aamn.c = str;
        }
        Long l = this.d;
        if (l != null) {
            aamn.d = l;
        }
        l = this.e;
        if (l != null) {
            aamn.e = l;
        }
        return aamn;
    }

    public final void a(aanj aanj) {
        this.a = aanj;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aanj aanj = this.a;
        if (aanj != null) {
            hashMap.put("operation_type", aanj.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("from_retry", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("status_code", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("detail_status_code", l);
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
        return asDictionary().equals(((aamn) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_BACKUP_ERROR";
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
        aanj aanj = this.a;
        int i = 0;
        hashCode = (hashCode + (aanj != null ? aanj.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
