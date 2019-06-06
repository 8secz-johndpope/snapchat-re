package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavj */
public final class aavj extends aaxl {
    private aavk a;
    private String b;

    private aavj b() {
        aavj aavj = (aavj) super.clone();
        aavk aavk = this.a;
        if (aavk != null) {
            aavj.a = aavk;
        }
        String str = this.b;
        if (str != null) {
            aavj.b = str;
        }
        return aavj;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(aavk aavk) {
        this.a = aavk;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aavk aavk = this.a;
        if (aavk != null) {
            hashMap.put("field", aavk.toString());
        }
        String str = this.b;
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
        return asDictionary().equals(((aavj) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_FEATURE_FIELD_AUTOFILL";
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
        aavk aavk = this.a;
        int i = 0;
        hashCode = (hashCode + (aavk != null ? aavk.hashCode() : 0)) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
