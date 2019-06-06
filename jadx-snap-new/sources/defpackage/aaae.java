package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaae */
public final class aaae extends abhw {
    public Boolean a;
    public String b;

    private aaae a() {
        aaae aaae = (aaae) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaae.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aaae.b = str;
        }
        return aaae;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("forced", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("reason", str);
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
        return asDictionary().equals(((aaae) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_APPLICATION_LOGOUT";
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
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
