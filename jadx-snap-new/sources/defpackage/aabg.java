package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabg */
public final class aabg implements Cloneable {
    public Long a;
    public Long b;
    public Long c;
    private String d;

    public aabg(aabg aabg) {
        this.a = aabg.a;
        this.b = aabg.b;
        this.c = aabg.c;
        this.d = aabg.d;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("fg_time_ms", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("bg_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("real_time_ms", l);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("bg_time_attribution_map", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aabg clone() {
        aabg aabg = (aabg) super.clone();
        Long l = this.a;
        if (l != null) {
            aabg.a = l;
        }
        l = this.b;
        if (l != null) {
            aabg.b = l;
        }
        l = this.c;
        if (l != null) {
            aabg.c = l;
        }
        String str = this.d;
        if (str != null) {
            aabg.d = str;
        }
        return aabg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aabg) obj).a());
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Long l2 = this.b;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.c;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
