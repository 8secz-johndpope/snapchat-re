package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aara */
public final class aara extends abhw {
    private abbd a;
    private Boolean b;
    private String c;

    private aara a() {
        aara aara = (aara) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aara.a = abbd;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aara.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aara.c = str;
        }
        return aara;
    }

    public final void a(abbd abbd) {
        this.a = abbd;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbd abbd = this.a;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("is_mischief", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("share_message_type", str);
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
        return asDictionary().equals(((aara) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_SHARE_REQUEST_LOCATION_SHOWN";
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
        abbd abbd = this.a;
        int i = 0;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
