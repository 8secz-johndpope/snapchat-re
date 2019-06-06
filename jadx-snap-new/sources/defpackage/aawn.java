package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawn */
public final class aawn extends aaxl {
    private Long a;
    private Boolean b;
    private String c;

    private aawn b() {
        aawn aawn = (aawn) super.clone();
        Long l = this.a;
        if (l != null) {
            aawn.a = l;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aawn.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aawn.c = str;
        }
        return aawn;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("snapchatters_found", l);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("trimmed_snapchatters", bool);
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
        return asDictionary().equals(((aawn) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_FIND_FRIENDS";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
