package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbp */
public abstract class abbp extends abea {
    private Double a;
    public String s;
    public abec t;
    public abej u;
    public Long v;
    public Boolean w;
    public Long x;
    public Long y;

    /* renamed from: a */
    public abbp clone() {
        abbp abbp = (abbp) super.clone();
        String str = this.s;
        if (str != null) {
            abbp.s = str;
        }
        abec abec = this.t;
        if (abec != null) {
            abbp.t = abec;
        }
        abej abej = this.u;
        if (abej != null) {
            abbp.u = abej;
        }
        Long l = this.v;
        if (l != null) {
            abbp.v = l;
        }
        Boolean bool = this.w;
        if (bool != null) {
            abbp.w = bool;
        }
        l = this.x;
        if (l != null) {
            abbp.x = l;
        }
        l = this.y;
        if (l != null) {
            abbp.y = l;
        }
        Double d = this.a;
        if (d != null) {
            abbp.a = d;
        }
        return abbp;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.s;
        if (str != null) {
            hashMap.put("transfer_session_id", str);
        }
        abec abec = this.t;
        if (abec != null) {
            hashMap.put("transfer_channel", abec.toString());
        }
        abej abej = this.u;
        if (abej != null) {
            hashMap.put("transfer_type", abej.toString());
        }
        Long l = this.v;
        if (l != null) {
            hashMap.put("wifi_frequency_mhz", l);
        }
        Boolean bool = this.w;
        if (bool != null) {
            hashMap.put("is_charging", bool);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("device_battery", l);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("device_storage", l);
        }
        Double d = this.a;
        if (d != null) {
            hashMap.put("duration_sec", d);
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
        return asDictionary().equals(((abbp) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.s;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abec abec = this.t;
        hashCode = (hashCode + (abec != null ? abec.hashCode() : 0)) * 31;
        abej abej = this.u;
        hashCode = (hashCode + (abej != null ? abej.hashCode() : 0)) * 31;
        Long l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.w;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.a;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
