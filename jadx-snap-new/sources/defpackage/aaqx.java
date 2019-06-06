package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqx */
public final class aaqx extends abhw {
    private Boolean a;
    private abbd b;
    private Boolean c;
    private String d;
    private String e;

    private aaqx a() {
        aaqx aaqx = (aaqx) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaqx.a = bool;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aaqx.b = abbd;
        }
        bool = this.c;
        if (bool != null) {
            aaqx.c = bool;
        }
        String str = this.d;
        if (str != null) {
            aaqx.d = str;
        }
        str = this.e;
        if (str != null) {
            aaqx.e = str;
        }
        return aaqx;
    }

    public final void a(abbd abbd) {
        this.b = abbd;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_success", bool);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("is_mischief", bool);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("share_dialog_type", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("result_sharing_audience", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.c = bool;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaqx) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_SHARE_LOCATION_TAPPED";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abbd abbd = this.b;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
