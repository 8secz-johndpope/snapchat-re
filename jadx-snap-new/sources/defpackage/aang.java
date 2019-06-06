package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aang */
public abstract class aang extends abhw {
    public String a;
    public String b;
    public String c;
    public String d;
    private String e;

    /* renamed from: a */
    public aang clone() {
        aang aang = (aang) super.clone();
        String str = this.a;
        if (str != null) {
            aang.a = str;
        }
        str = this.b;
        if (str != null) {
            aang.b = str;
        }
        str = this.c;
        if (str != null) {
            aang.c = str;
        }
        str = this.d;
        if (str != null) {
            aang.d = str;
        }
        str = this.e;
        if (str != null) {
            aang.e = str;
        }
        return aang;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("entry_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("source_snap_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("source_entry_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aang) obj).asDictionary());
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
