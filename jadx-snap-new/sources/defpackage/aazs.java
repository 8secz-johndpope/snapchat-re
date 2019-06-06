package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazs */
public final class aazs implements Cloneable {
    public String a;
    public Boolean b;
    public Boolean c;

    public aazs(aazs aazs) {
        this.a = aazs.a;
        this.b = aazs.b;
        this.c = aazs.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("shake_id", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_shake_v2", bool);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("is_auto_shake", bool);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aazs clone() {
        aazs aazs = (aazs) super.clone();
        String str = this.a;
        if (str != null) {
            aazs.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aazs.b = bool;
        }
        bool = this.c;
        if (bool != null) {
            aazs.c = bool;
        }
        return aazs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aazs) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
