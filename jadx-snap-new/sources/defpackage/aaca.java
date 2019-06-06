package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaca */
public abstract class aaca extends abhw {
    private Long a;
    private Double b;
    private aabz c;
    private Boolean d;

    /* renamed from: a */
    public aaca clone() {
        aaca aaca = (aaca) super.clone();
        Long l = this.a;
        if (l != null) {
            aaca.a = l;
        }
        Double d = this.b;
        if (d != null) {
            aaca.b = d;
        }
        aabz aabz = this.c;
        if (aabz != null) {
            aaca.c = aabz;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaca.d = bool;
        }
        return aaca;
    }

    public final void a(aabz aabz) {
        this.c = aabz;
    }

    public final void a(Boolean bool) {
        this.d = bool;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("camera", l);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        aabz aabz = this.c;
        if (aabz != null) {
            hashMap.put("action", aabz.toString());
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("is_recording", bool);
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
        return asDictionary().equals(((aaca) obj).asDictionary());
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
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aabz aabz = this.c;
        hashCode = (hashCode + (aabz != null ? aabz.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
