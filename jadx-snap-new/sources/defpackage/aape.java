package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aape */
public abstract class aape extends aaca {
    private String a;

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: b */
    public aape clone() {
        aape aape = (aape) super.clone();
        String str = this.a;
        if (str != null) {
            aape.a = str;
        }
        return aape;
    }

    public final void b(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aape) obj).asDictionary());
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
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
