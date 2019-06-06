package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakv */
public final class aakv extends abhw {
    public aakw a;
    public String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    private aakv a() {
        aakv aakv = (aakv) super.clone();
        aakw aakw = this.a;
        if (aakw != null) {
            aakv.a = aakw;
        }
        String str = this.c;
        if (str != null) {
            aakv.c = str;
        }
        str = this.d;
        if (str != null) {
            aakv.d = str;
        }
        str = this.e;
        if (str != null) {
            aakv.e = str;
        }
        str = this.f;
        if (str != null) {
            aakv.f = str;
        }
        str = this.g;
        if (str != null) {
            aakv.g = str;
        }
        str = this.b;
        if (str != null) {
            aakv.b = str;
        }
        str = this.h;
        if (str != null) {
            aakv.h = str;
        }
        str = this.i;
        if (str != null) {
            aakv.i = str;
        }
        return aakv;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakw aakw = this.a;
        if (aakw != null) {
            hashMap.put("event_type", aakw.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("file", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("free_disk_space_mb", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("total_disk_space_mb", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("free_nodes", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("total_nodes", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("source", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("key_length", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aakv) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_GENERAL_ERROR";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aakw aakw = this.a;
        int i = 0;
        hashCode = (hashCode + (aakw != null ? aakw.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
