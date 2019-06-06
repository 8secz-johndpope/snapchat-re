package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aajx */
public final class aajx extends abhw {
    public String a;
    public String b;

    private aajx a() {
        aajx aajx = (aajx) super.clone();
        String str = this.a;
        if (str != null) {
            aajx.a = str;
        }
        str = this.b;
        if (str != null) {
            aajx.b = str;
        }
        return aajx;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("study_name", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("experiment_id", str);
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
        return asDictionary().equals(((aajx) obj).asDictionary());
    }

    public final String getEventName() {
        return "EXPERIMENT_USER_TREATMENT";
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
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
