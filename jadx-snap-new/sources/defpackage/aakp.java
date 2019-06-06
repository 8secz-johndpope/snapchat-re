package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakp */
public final class aakp extends abhw {
    public String a;
    public Boolean b;
    public String c;
    private String d;

    private aakp a() {
        aakp aakp = (aakp) super.clone();
        String str = this.a;
        if (str != null) {
            aakp.a = str;
        }
        str = this.d;
        if (str != null) {
            aakp.d = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aakp.b = bool;
        }
        str = this.c;
        if (str != null) {
            aakp.c = str;
        }
        return aakp;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("source", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("reason", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_cleartext_key", bool);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("recipient_beta", str);
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
        return asDictionary().equals(((aakp) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_CLIENT_SNAP_SUPPRESSED";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
