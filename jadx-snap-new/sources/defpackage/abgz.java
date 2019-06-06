package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgz */
public class abgz extends abhw {
    private String a;
    private aauz b;
    private aamk c;

    /* renamed from: a */
    public abgz clone() {
        abgz abgz = (abgz) super.clone();
        String str = this.a;
        if (str != null) {
            abgz.a = str;
        }
        aauz aauz = this.b;
        if (aauz != null) {
            abgz.b = aauz;
        }
        aamk aamk = this.c;
        if (aamk != null) {
            abgz.c = aamk;
        }
        return abgz;
    }

    public final void a(aamk aamk) {
        this.c = aamk;
    }

    public final void a(aauz aauz) {
        this.b = aauz;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("profile_session_id", str);
        }
        aauz aauz = this.b;
        if (aauz != null) {
            hashMap.put("profile_type", aauz.toString());
        }
        aamk aamk = this.c;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final String c() {
        return this.a;
    }

    public final void d(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abgz) obj).asDictionary());
    }

    public String getEventName() {
        return "UNIFIED_PROFILE_BASE_EVENT";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aauz aauz = this.b;
        hashCode = (hashCode + (aauz != null ? aauz.hashCode() : 0)) * 31;
        aamk aamk = this.c;
        if (aamk != null) {
            i = aamk.hashCode();
        }
        return hashCode + i;
    }
}
