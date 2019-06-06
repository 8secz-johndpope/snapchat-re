package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavv */
public final class aavv extends aavw {
    private Boolean a;
    private Boolean b;
    private String c;

    private aavv c() {
        aavv aavv = (aavv) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aavv.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            aavv.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aavv.c = str;
        }
        return aavv;
    }

    public final /* synthetic */ aaxl a() {
        return c();
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_available", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("has_suggestions", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aavw b() {
        return c();
    }

    public final void b(Boolean bool) {
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aavv) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_RESPONSE_SUGGEST_USERNAME";
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
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
