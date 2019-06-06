package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aala */
public final class aala extends abhw {
    public aalb a;
    public String b;
    public String c;

    private aala a() {
        aala aala = (aala) super.clone();
        aalb aalb = this.a;
        if (aalb != null) {
            aala.a = aalb;
        }
        String str = this.b;
        if (str != null) {
            aala.b = str;
        }
        str = this.c;
        if (str != null) {
            aala.c = str;
        }
        return aala;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aalb aalb = this.a;
        if (aalb != null) {
            hashMap.put("event_type", aalb.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("source", str);
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
        return asDictionary().equals(((aala) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_IDENTITY_KEYS_OPERATION";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aalb aalb = this.a;
        int i = 0;
        hashCode = (hashCode + (aalb != null ? aalb.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
