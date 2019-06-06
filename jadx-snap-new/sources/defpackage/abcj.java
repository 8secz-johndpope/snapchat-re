package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abcj */
public abstract class abcj extends abeb {
    public String b;
    public String c;
    public abcp d;
    public Double e;

    /* renamed from: a */
    public abcj clone() {
        abcj abcj = (abcj) super.clone();
        String str = this.b;
        if (str != null) {
            abcj.b = str;
        }
        str = this.c;
        if (str != null) {
            abcj.c = str;
        }
        abcp abcp = this.d;
        if (abcp != null) {
            abcj.d = abcp;
        }
        Double d = this.e;
        if (d != null) {
            abcj.e = d;
        }
        return abcj;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.b;
        if (str != null) {
            hashMap.put("update_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("target_firmware_version", str);
        }
        abcp abcp = this.d;
        if (abcp != null) {
            hashMap.put("update_type", abcp.toString());
        }
        Double d = this.e;
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
        return asDictionary().equals(((abcj) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.b;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abcp abcp = this.d;
        hashCode = (hashCode + (abcp != null ? abcp.hashCode() : 0)) * 31;
        Double d = this.e;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
