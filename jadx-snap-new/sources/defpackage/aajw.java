package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aajw */
public final class aajw extends abhw {
    public String a;
    public String b;
    public String c;

    private aajw a() {
        aajw aajw = (aajw) super.clone();
        String str = this.a;
        if (str != null) {
            aajw.a = str;
        }
        str = this.b;
        if (str != null) {
            aajw.b = str;
        }
        str = this.c;
        if (str != null) {
            aajw.c = str;
        }
        return aajw;
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
        str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
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
        return asDictionary().equals(((aajw) obj).asDictionary());
    }

    public final String getEventName() {
        return "EXPERIMENT_DEVICE_TREATMENT";
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
