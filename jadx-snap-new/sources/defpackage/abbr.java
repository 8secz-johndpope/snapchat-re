package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbr */
public abstract class abbr extends abeb {
    private Boolean a;
    private Long b;
    private Long c;

    /* renamed from: a */
    public abbr clone() {
        abbr abbr = (abbr) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abbr.a = bool;
        }
        Long l = this.b;
        if (l != null) {
            abbr.b = l;
        }
        l = this.c;
        if (l != null) {
            abbr.c = l;
        }
        return abbr;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_charging", bool);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("device_battery", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("device_storage", l);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbr) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
