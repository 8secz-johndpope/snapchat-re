package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abeb */
public abstract class abeb extends abhw {
    public String E;
    public String F;
    public String G;
    public abcq H;

    public final void a(abcq abcq) {
        this.H = abcq;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.E;
        if (str != null) {
            hashMap.put("device_id", str);
        }
        str = this.F;
        if (str != null) {
            hashMap.put("firmware_version", str);
        }
        str = this.G;
        if (str != null) {
            hashMap.put("hardware_version", str);
        }
        abcq abcq = this.H;
        if (abcq != null) {
            hashMap.put("frame_color", abcq.toString());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.E = str;
    }

    /* renamed from: c */
    public abeb clone() {
        abeb abeb = (abeb) super.clone();
        String str = this.E;
        if (str != null) {
            abeb.E = str;
        }
        str = this.F;
        if (str != null) {
            abeb.F = str;
        }
        str = this.G;
        if (str != null) {
            abeb.G = str;
        }
        abcq abcq = this.H;
        if (abcq != null) {
            abeb.H = abcq;
        }
        return abeb;
    }

    public final void c(String str) {
        this.F = str;
    }

    public final void d(String str) {
        this.G = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abeb) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.E;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.G;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abcq abcq = this.H;
        if (abcq != null) {
            i = abcq.hashCode();
        }
        return hashCode + i;
    }
}
