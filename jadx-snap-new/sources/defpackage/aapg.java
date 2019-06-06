package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapg */
public abstract class aapg extends abhw {
    private String a;
    private String b;
    private String c;
    private Long d;
    private Long e;
    private Long f;
    private aapm g;

    /* renamed from: a */
    public aapg clone() {
        aapg aapg = (aapg) super.clone();
        String str = this.a;
        if (str != null) {
            aapg.a = str;
        }
        str = this.b;
        if (str != null) {
            aapg.b = str;
        }
        str = this.c;
        if (str != null) {
            aapg.c = str;
        }
        Long l = this.d;
        if (l != null) {
            aapg.d = l;
        }
        l = this.e;
        if (l != null) {
            aapg.e = l;
        }
        l = this.f;
        if (l != null) {
            aapg.f = l;
        }
        aapm aapm = this.g;
        if (aapm != null) {
            aapm = aapm.clone();
            if (aapm == null) {
                aapg.g = null;
            } else {
                aapg.g = new aapm(aapm);
            }
        }
        return aapg;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("interaction_name", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("interaction_value", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("session_total_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("action_sequence_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("camera", l);
        }
        aapm aapm = this.g;
        if (aapm != null) {
            hashMap.putAll(aapm.a());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(Long l) {
        this.f = l;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aapg) obj).asDictionary());
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aapm aapm = this.g;
        if (aapm != null) {
            i = aapm.hashCode();
        }
        return hashCode + i;
    }
}
