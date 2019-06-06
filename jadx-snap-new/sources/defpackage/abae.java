package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abae */
public final class abae extends abhw {
    public Boolean a;
    public Boolean b;

    private abae a() {
        abae abae = (abae) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abae.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            abae.b = bool;
        }
        return abae;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("enable", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("in_setting_report_enabled", bool);
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
        return asDictionary().equals(((abae) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_TO_REPORT_SETTING_ENABLE";
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
        bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
