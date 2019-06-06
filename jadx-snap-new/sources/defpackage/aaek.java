package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaek */
public final class aaek implements Cloneable {
    public String a;
    public String b;
    public String c;
    public aaee d;

    public aaek(aaek aaek) {
        this.a = aaek.a;
        this.b = aaek.b;
        this.c = aaek.c;
        this.d = aaek.d;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("slot_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("external_request_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("fail_reasons", str);
        }
        aaee aaee = this.d;
        if (aaee != null) {
            hashMap.put("status", aaee.toString());
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aaek clone() {
        aaek aaek = (aaek) super.clone();
        String str = this.a;
        if (str != null) {
            aaek.a = str;
        }
        str = this.b;
        if (str != null) {
            aaek.b = str;
        }
        str = this.c;
        if (str != null) {
            aaek.c = str;
        }
        aaee aaee = this.d;
        if (aaee != null) {
            aaek.d = aaee;
        }
        return aaek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaek) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        aaee aaee = this.d;
        if (aaee != null) {
            i = aaee.hashCode();
        }
        return hashCode + i;
    }
}
