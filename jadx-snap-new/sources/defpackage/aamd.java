package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamd */
public abstract class aamd extends abgb {
    private Double a;
    private String b;
    private String c;
    private aalt d;
    private Long e;

    /* renamed from: a */
    public aamd clone() {
        aamd aamd = (aamd) super.clone();
        Double d = this.a;
        if (d != null) {
            aamd.a = d;
        }
        String str = this.b;
        if (str != null) {
            aamd.b = str;
        }
        str = this.c;
        if (str != null) {
            aamd.c = str;
        }
        aalt aalt = this.d;
        if (aalt != null) {
            aamd.d = aalt;
        }
        Long l = this.e;
        if (l != null) {
            aamd.e = l;
        }
        return aamd;
    }

    public final void a(aalt aalt) {
        this.d = aalt;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("snap_taken_ts", d);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("carousel_config_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("carousel_version_id", str);
        }
        aalt aalt = this.d;
        if (aalt != null) {
            hashMap.put("swipe_direction", aalt.toString());
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("tap_count", l);
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
        return asDictionary().equals(((aamd) obj).asDictionary());
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
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aalt aalt = this.d;
        hashCode = (hashCode + (aalt != null ? aalt.hashCode() : 0)) * 31;
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
