package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aate */
public final class aate extends abhw {
    private String a;
    private Boolean b;
    private Double c;
    private zyr d;

    private aate a() {
        aate aate = (aate) super.clone();
        String str = this.a;
        if (str != null) {
            aate.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aate.b = bool;
        }
        Double d = this.c;
        if (d != null) {
            aate.c = d;
        }
        zyr zyr = this.d;
        if (zyr != null) {
            aate.d = zyr;
        }
        return aate;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("notification_type", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("is_system", bool);
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        zyr zyr = this.d;
        if (zyr != null) {
            hashMap.put("action", zyr.toString());
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
        return asDictionary().equals(((aate) obj).asDictionary());
    }

    public final String getEventName() {
        return "NOTIFICATION_DISPLAYED";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        zyr zyr = this.d;
        if (zyr != null) {
            i = zyr.hashCode();
        }
        return hashCode + i;
    }
}
