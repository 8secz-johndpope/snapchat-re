package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaoy */
public abstract class aaoy extends abhw {
    private Double a;
    private aaoq b;
    private aatt c;
    private aatx d;
    private aatu e;

    /* renamed from: a */
    public aaoy clone() {
        aaoy aaoy = (aaoy) super.clone();
        Double d = this.a;
        if (d != null) {
            aaoy.a = d;
        }
        aaoq aaoq = this.b;
        if (aaoq != null) {
            aaoy.b = aaoq;
        }
        aatt aatt = this.c;
        if (aatt != null) {
            aaoy.a(aatt.clone());
        }
        aatx aatx = this.d;
        if (aatx != null) {
            aatx = aatx.clone();
            if (aatx == null) {
                aaoy.d = null;
            } else {
                aaoy.d = new aatx(aatx);
            }
        }
        aatu aatu = this.e;
        if (aatu != null) {
            aaoy.a(aatu.clone());
        }
        return aaoy;
    }

    public final void a(aatt aatt) {
        if (aatt == null) {
            this.c = null;
        } else {
            this.c = new aatt(aatt);
        }
    }

    public final void a(aatu aatu) {
        if (aatu == null) {
            this.e = null;
        } else {
            this.e = new aatu(aatu);
        }
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("impression_time_secs", d);
        }
        aaoq aaoq = this.b;
        if (aaoq != null) {
            hashMap.put("impression_type", aaoq.toString());
        }
        aatt aatt = this.c;
        if (aatt != null) {
            hashMap.putAll(aatt.a());
        }
        aatx aatx = this.d;
        if (aatx != null) {
            hashMap.putAll(aatx.a());
        }
        aatu aatu = this.e;
        if (aatu != null) {
            hashMap.putAll(aatu.a());
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
        return asDictionary().equals(((aaoy) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aaoq aaoq = this.b;
        hashCode = (hashCode + (aaoq != null ? aaoq.hashCode() : 0)) * 31;
        aatt aatt = this.c;
        hashCode = (hashCode + (aatt != null ? aatt.hashCode() : 0)) * 31;
        aatx aatx = this.d;
        hashCode = (hashCode + (aatx != null ? aatx.hashCode() : 0)) * 31;
        aatu aatu = this.e;
        if (aatu != null) {
            i = aatu.hashCode();
        }
        return hashCode + i;
    }
}
