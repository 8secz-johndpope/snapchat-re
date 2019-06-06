package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abge */
public final class abge extends abgf {
    public abgj a;
    public Boolean b;
    public Long c;
    private Boolean n;
    private Long o;
    private Long p;

    private abge b() {
        abge abge = (abge) super.clone();
        abgj abgj = this.a;
        if (abgj != null) {
            abge.a = abgj;
        }
        Boolean bool = this.b;
        if (bool != null) {
            abge.b = bool;
        }
        bool = this.n;
        if (bool != null) {
            abge.n = bool;
        }
        Long l = this.c;
        if (l != null) {
            abge.c = l;
        }
        l = this.o;
        if (l != null) {
            abge.o = l;
        }
        l = this.p;
        if (l != null) {
            abge.p = l;
        }
        return abge;
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
        bool = this.n;
        if (bool != null) {
            hashMap.put("with_call_start_from_phone_recent_list", bool);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("user_present_count", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("filter_lens_count", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("selfie_mode_activation_count", l);
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
        return asDictionary().equals(((abge) obj).asDictionary());
    }

    public final String getEventName() {
        return "TALK_CALL_ATTEMPT";
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
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
