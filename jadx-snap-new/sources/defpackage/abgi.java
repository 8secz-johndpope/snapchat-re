package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgi */
public final class abgi extends abgf {
    public abgj a;
    public Boolean b;
    public Boolean c;
    private Boolean n;

    private abgi b() {
        abgi abgi = (abgi) super.clone();
        abgj abgj = this.a;
        if (abgj != null) {
            abgi.a = abgj;
        }
        Boolean bool = this.b;
        if (bool != null) {
            abgi.b = bool;
        }
        bool = this.c;
        if (bool != null) {
            abgi.c = bool;
        }
        bool = this.n;
        if (bool != null) {
            abgi.n = bool;
        }
        return abgi;
    }

    public final /* synthetic */ abgf a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abgj abgj = this.a;
        if (abgj != null) {
            hashMap.put("end_phase", abgj.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_incoming_call_abandon", bool);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("with_presence", bool);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("with_local_user_rejected", bool);
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
        return asDictionary().equals(((abgi) obj).asDictionary());
    }

    public final String getEventName() {
        return "TALK_CALL_REQUEST";
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
        abgj abgj = this.a;
        int i = 0;
        hashCode = (hashCode + (abgj != null ? abgj.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.n;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
