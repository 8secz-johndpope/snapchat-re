package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxl */
public abstract class aaxl extends abhw {
    private String a;
    private Boolean b;

    /* renamed from: a */
    public aaxl clone() {
        aaxl aaxl = (aaxl) super.clone();
        String str = this.a;
        if (str != null) {
            aaxl.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaxl.b = bool;
        }
        return aaxl;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("registration_session_id", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("has_logged_in_before", bool);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void d(Boolean bool) {
        this.b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaxl) obj).asDictionary());
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
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
