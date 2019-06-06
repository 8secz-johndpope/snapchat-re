package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazk */
public final class aazk extends abhw {
    private aaua a;
    private aabq b;
    private aabp c;
    private String d;
    private String e;
    private String f;

    private aazk a() {
        aazk aazk = (aazk) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazk.a = aaua;
        }
        aabq aabq = this.b;
        if (aabq != null) {
            aazk.b = aabq;
        }
        aabp aabp = this.c;
        if (aabp != null) {
            aazk.c = aabp;
        }
        String str = this.d;
        if (str != null) {
            aazk.d = str;
        }
        str = this.e;
        if (str != null) {
            aazk.e = str;
        }
        str = this.f;
        if (str != null) {
            aazk.f = str;
        }
        return aazk;
    }

    public final void a(aabp aabp) {
        this.c = aabp;
    }

    public final void a(aabq aabq) {
        this.b = aabq;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        aabq aabq = this.b;
        if (aabq != null) {
            hashMap.put("action", aabq.toString());
        }
        aabp aabp = this.c;
        if (aabp != null) {
            hashMap.put("bitmoji_avatar_builder_type", aabp.toString());
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("application_list", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("bitmoji_session_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("profile_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aazk) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_EDIT";
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
        aabq aabq = this.b;
        hashCode = (hashCode + (aabq != null ? aabq.hashCode() : 0)) * 31;
        aabp aabp = this.c;
        hashCode = (hashCode + (aabp != null ? aabp.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
