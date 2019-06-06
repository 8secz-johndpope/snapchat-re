package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxj */
public final class aaxj extends abhw {
    private String a;
    private aavn b;
    private abel c;

    private aaxj a() {
        aaxj aaxj = (aaxj) super.clone();
        String str = this.a;
        if (str != null) {
            aaxj.a = str;
        }
        aavn aavn = this.b;
        if (aavn != null) {
            aaxj.a(aavn.clone());
        }
        abel abel = this.c;
        if (abel != null) {
            aaxj.a(abel.clone());
        }
        return aaxj;
    }

    public final void a(aavn aavn) {
        if (aavn == null) {
            this.b = null;
        } else {
            this.b = new aavn(aavn);
        }
    }

    public final void a(abel abel) {
        if (abel == null) {
            this.c = null;
        } else {
            this.c = new abel(abel);
        }
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        aavn aavn = this.b;
        if (aavn != null) {
            hashMap.putAll(aavn.a());
        }
        abel abel = this.c;
        if (abel != null) {
            hashMap.putAll(abel.d());
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
        return asDictionary().equals(((aaxj) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_STATE_TRANSITION";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aavn aavn = this.b;
        hashCode = (hashCode + (aavn != null ? aavn.hashCode() : 0)) * 31;
        abel abel = this.c;
        if (abel != null) {
            i = abel.hashCode();
        }
        return hashCode + i;
    }
}
