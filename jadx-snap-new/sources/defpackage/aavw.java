package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavw */
public abstract class aavw extends aaxl {
    private Long a;
    private Boolean b;

    public final void a(Long l) {
        this.a = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("latency_ms", l);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("success", bool);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: b */
    public aavw clone() {
        aavw aavw = (aavw) super.clone();
        Long l = this.a;
        if (l != null) {
            aavw.a = l;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aavw.b = bool;
        }
        return aavw;
    }

    public final void c(Boolean bool) {
        this.b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aavw) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
