package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aach */
public abstract class aach extends abhw {
    private aabv a;
    private Long b;
    private abaw c;
    private abbd d;
    private aacx e;

    /* renamed from: a */
    public aach clone() {
        aach aach = (aach) super.clone();
        aabv aabv = this.a;
        if (aabv != null) {
            aach.a = aabv;
        }
        Long l = this.b;
        if (l != null) {
            aach.b = l;
        }
        abaw abaw = this.c;
        if (abaw != null) {
            aach.c = abaw;
        }
        abbd abbd = this.d;
        if (abbd != null) {
            aach.d = abbd;
        }
        aacx aacx = this.e;
        if (aacx != null) {
            aach.e = aacx;
        }
        return aach;
    }

    public final void a(aabv aabv) {
        this.a = aabv;
    }

    public final void a(aacx aacx) {
        this.e = aacx;
    }

    public final void a(abaw abaw) {
        this.c = abaw;
    }

    public final void a(abbd abbd) {
        this.d = abbd;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aabv aabv = this.a;
        if (aabv != null) {
            hashMap.put("camera_api", aabv.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("camera", l);
        }
        abaw abaw = this.c;
        if (abaw != null) {
            hashMap.put("snap_source", abaw.toString());
        }
        abbd abbd = this.d;
        if (abbd != null) {
            hashMap.put("source_type", abbd.toString());
        }
        aacx aacx = this.e;
        if (aacx != null) {
            hashMap.put("camera_usage_type", aacx.toString());
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
        return asDictionary().equals(((aach) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        aabv aabv = this.a;
        int i = 0;
        hashCode = (hashCode + (aabv != null ? aabv.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abaw abaw = this.c;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        abbd abbd = this.d;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        aacx aacx = this.e;
        if (aacx != null) {
            i = aacx.hashCode();
        }
        return hashCode + i;
    }
}
