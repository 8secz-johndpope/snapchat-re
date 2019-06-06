package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abaz */
public abstract class abaz extends aapi {
    private String a;
    private String b;

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("snappable_session_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("snappable_funnel_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: b */
    public abaz clone() {
        abaz abaz = (abaz) super.clone();
        String str = this.a;
        if (str != null) {
            abaz.a = str;
        }
        str = this.b;
        if (str != null) {
            abaz.b = str;
        }
        return abaz;
    }

    public final void c(String str) {
        this.a = str;
    }

    public final void d(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abaz) obj).asDictionary());
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
