package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawo */
public final class aawo extends aaxl {
    private Boolean a;
    private aava b;
    private String c;

    private aawo b() {
        aawo aawo = (aawo) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aawo.a = bool;
        }
        aava aava = this.b;
        if (aava != null) {
            aawo.b = aava;
        }
        String str = this.c;
        if (str != null) {
            aawo.c = str;
        }
        return aawo;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(aava aava) {
        this.b = aava;
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
            hashMap.put("granted", bool);
        }
        aava aava = this.b;
        if (aava != null) {
            hashMap.put("prompt_type", aava.toString());
        }
        String str = this.c;
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
        return asDictionary().equals(((aawo) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_GRANT_CONTACTS_PERMISSION";
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
        aava aava = this.b;
        hashCode = (hashCode + (aava != null ? aava.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
