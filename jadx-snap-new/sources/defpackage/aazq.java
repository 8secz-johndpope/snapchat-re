package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazq */
public final class aazq extends abhw {
    private aaua a;
    private Boolean b;
    private aabp c;
    private String d;

    private aazq a() {
        aazq aazq = (aazq) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazq.a = aaua;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aazq.b = bool;
        }
        aabp aabp = this.c;
        if (aabp != null) {
            aazq.c = aabp;
        }
        String str = this.d;
        if (str != null) {
            aazq.d = str;
        }
        return aazq;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("is_bitmoji_linked", bool);
        }
        aabp aabp = this.c;
        if (aabp != null) {
            hashMap.put("bitmoji_avatar_builder_type", aabp.toString());
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("profile_session_id", str);
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
        return asDictionary().equals(((aazq) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_VIEW";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aabp aabp = this.c;
        hashCode = (hashCode + (aabp != null ? aabp.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
