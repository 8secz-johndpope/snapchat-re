package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abct */
public abstract class abct extends abeb {
    private abcy a;
    private Double b;
    private String c;
    private abcw d;

    /* renamed from: a */
    public abct clone() {
        abct abct = (abct) super.clone();
        abcy abcy = this.a;
        if (abcy != null) {
            abct.a = abcy;
        }
        Double d = this.b;
        if (d != null) {
            abct.b = d;
        }
        String str = this.c;
        if (str != null) {
            abct.c = str;
        }
        abcw abcw = this.d;
        if (abcw != null) {
            abct.d = abcw;
        }
        return abct;
    }

    public final void a(abcw abcw) {
        this.d = abcw;
    }

    public final void a(abcy abcy) {
        this.a = abcy;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final void a(String str) {
        this.c = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abcy abcy = this.a;
        if (abcy != null) {
            hashMap.put("onboarding_source", abcy.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("duration_sec", d);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("pairing_session_id", str);
        }
        abcw abcw = this.d;
        if (abcw != null) {
            hashMap.put("onboarding_page", abcw.toString());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abct) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        abcy abcy = this.a;
        int i = 0;
        hashCode = (hashCode + (abcy != null ? abcy.hashCode() : 0)) * 31;
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abcw abcw = this.d;
        if (abcw != null) {
            i = abcw.hashCode();
        }
        return hashCode + i;
    }
}
