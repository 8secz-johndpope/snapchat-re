package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasr */
public abstract class aasr extends abhw {
    public aatc a;
    public String b;
    public String c;
    private String d;
    private aabc e;
    private Long f;
    private Boolean g;
    private String h;
    private String i;

    /* renamed from: a */
    public aasr clone() {
        aasr aasr = (aasr) super.clone();
        String str = this.d;
        if (str != null) {
            aasr.d = str;
        }
        aabc aabc = this.e;
        if (aabc != null) {
            aasr.e = aabc;
        }
        Long l = this.f;
        if (l != null) {
            aasr.f = l;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aasr.g = bool;
        }
        str = this.h;
        if (str != null) {
            aasr.h = str;
        }
        str = this.i;
        if (str != null) {
            aasr.i = str;
        }
        aatc aatc = this.a;
        if (aatc != null) {
            aasr.a = aatc;
        }
        str = this.b;
        if (str != null) {
            aasr.b = str;
        }
        str = this.c;
        if (str != null) {
            aasr.c = str;
        }
        return aasr;
    }

    public final void a(aabc aabc) {
        this.e = aabc;
    }

    public final void a(aatc aatc) {
        this.a = aatc;
    }

    public final void a(Long l) {
        this.f = l;
    }

    public final void a(String str) {
        this.d = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.d;
        if (str != null) {
            hashMap.put("app_session_id", str);
        }
        aabc aabc = this.e;
        if (aabc != null) {
            hashMap.put("app_state", aabc.toString());
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("time_since_app_state_change", l);
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("app_is_travel_mode", bool);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("task_id", str);
        }
        aatc aatc = this.a;
        if (aatc != null) {
            hashMap.put("task_type", aatc.toString());
        }
        str = this.b;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("media_context_type", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(String str) {
        this.i = str;
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
        return asDictionary().equals(((aasr) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.d;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabc aabc = this.e;
        hashCode = (hashCode + (aabc != null ? aabc.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aatc aatc = this.a;
        hashCode = (hashCode + (aatc != null ? aatc.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
