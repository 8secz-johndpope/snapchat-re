package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapi */
public abstract class aapi extends abhw {
    private String a;
    private String b;

    /* renamed from: a */
    public aapi clone() {
        aapi aapi = (aapi) super.clone();
        String str = this.a;
        if (str != null) {
            aapi.a = str;
        }
        str = this.b;
        if (str != null) {
            aapi.b = str;
        }
        return aapi;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aapi) obj).asDictionary());
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
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
