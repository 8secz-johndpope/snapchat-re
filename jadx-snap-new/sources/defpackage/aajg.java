package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aajg */
public abstract class aajg extends abhw {
    public String a;
    public String b;
    public abbd c;
    private String d;
    private String e;
    private String f;
    private abgl g;
    private Long h;

    /* renamed from: a */
    public aajg clone() {
        aajg aajg = (aajg) super.clone();
        String str = this.a;
        if (str != null) {
            aajg.a = str;
        }
        str = this.b;
        if (str != null) {
            aajg.b = str;
        }
        str = this.d;
        if (str != null) {
            aajg.d = str;
        }
        str = this.e;
        if (str != null) {
            aajg.e = str;
        }
        abbd abbd = this.c;
        if (abbd != null) {
            aajg.c = abbd;
        }
        str = this.f;
        if (str != null) {
            aajg.f = str;
        }
        abgl abgl = this.g;
        if (abgl != null) {
            aajg.g = abgl;
        }
        Long l = this.h;
        if (l != null) {
            aajg.h = l;
        }
        return aajg;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("publisher_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("edition_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("tracking_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("dsnap_id", str);
        }
        abbd abbd = this.c;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("collection_id", str);
        }
        abgl abgl = this.g;
        if (abgl != null) {
            hashMap.put("collection_type", abgl.toString());
        }
        Long l = this.h;
        if (l != null) {
            hashMap.put("collection_pos", l);
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
        return asDictionary().equals(((aajg) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.c;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgl abgl = this.g;
        hashCode = (hashCode + (abgl != null ? abgl.hashCode() : 0)) * 31;
        Long l = this.h;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
