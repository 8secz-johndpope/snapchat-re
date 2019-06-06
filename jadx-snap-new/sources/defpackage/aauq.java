package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aauq */
public final class aauq implements Cloneable {
    private String a;

    public aauq(aauq aauq) {
        this.a = aauq.a;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("restrictions_map", str);
        }
        return hashMap;
    }

    public final void a(String str) {
        this.a = str;
    }

    /* renamed from: b */
    public final aauq clone() {
        aauq aauq = (aauq) super.clone();
        String str = this.a;
        if (str != null) {
            aauq.a = str;
        }
        return aauq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aauq) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) + 381486;
    }
}
