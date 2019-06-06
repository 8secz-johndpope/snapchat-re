package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abea */
public abstract class abea extends abeb {
    public Long A;
    public Long B;
    public Long C;
    public Long D;
    private Long a;
    public Long z;

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.z;
        if (l != null) {
            hashMap.put("amba_temperature", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("nordic_temperature", l);
        }
        l = this.B;
        if (l != null) {
            hashMap.put("coulomb_ctrl_temperature", l);
        }
        l = this.C;
        if (l != null) {
            hashMap.put("wifi_temperature", l);
        }
        l = this.a;
        if (l != null) {
            hashMap.put("qca_temperature", l);
        }
        l = this.D;
        if (l != null) {
            hashMap.put("temperature_report_utc", l);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: b */
    public abea clone() {
        abea abea = (abea) super.clone();
        Long l = this.z;
        if (l != null) {
            abea.z = l;
        }
        l = this.A;
        if (l != null) {
            abea.A = l;
        }
        l = this.B;
        if (l != null) {
            abea.B = l;
        }
        l = this.C;
        if (l != null) {
            abea.C = l;
        }
        l = this.a;
        if (l != null) {
            abea.a = l;
        }
        l = this.D;
        if (l != null) {
            abea.D = l;
        }
        return abea;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abea) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.z;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.B;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.C;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.a;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.D;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
