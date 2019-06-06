package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadi */
public final class aadi implements Cloneable {
    public Long a;
    public String b;

    public aadi(aadi aadi) {
        this.a = aadi.a;
        this.b = aadi.b;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("group_size", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("chat_dock_id", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aadi clone() {
        aadi aadi = (aadi) super.clone();
        Long l = this.a;
        if (l != null) {
            aadi.a = l;
        }
        String str = this.b;
        if (str != null) {
            aadi.b = str;
        }
        return aadi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aadi) obj).a());
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
