package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafb */
public final class aafb implements Cloneable {
    public String a;
    public String b;
    public String c;

    public aafb(aafb aafb) {
        this.a = aafb.a;
        this.b = aafb.b;
        this.c = aafb.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("cognac_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("cognac_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("cognac_build_id", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aafb clone() {
        aafb aafb = (aafb) super.clone();
        String str = this.a;
        if (str != null) {
            aafb.a = str;
        }
        str = this.b;
        if (str != null) {
            aafb.b = str;
        }
        str = this.c;
        if (str != null) {
            aafb.c = str;
        }
        return aafb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aafb) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
