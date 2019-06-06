package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavy */
public final class aavy extends aaxl {
    private Long a;
    private String b;

    private aavy b() {
        aavy aavy = (aavy) super.clone();
        Long l = this.a;
        if (l != null) {
            aavy.a = l;
        }
        String str = this.b;
        if (str != null) {
            aavy.b = str;
        }
        return aavy;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("friends_added", l);
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
        return asDictionary().equals(((aavy) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_ADD_ALL_FRIENDS";
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
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
