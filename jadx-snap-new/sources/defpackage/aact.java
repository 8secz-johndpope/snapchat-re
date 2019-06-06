package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aact */
public final class aact implements Cloneable {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public String e;

    public aact(aact aact) {
        this.a = aact.a;
        this.b = aact.b;
        this.c = aact.c;
        this.d = aact.d;
        this.e = aact.e;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("camera_visible_time_ms", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("camera_open_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("camera_leaked_time_ms", l);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("camera_optimization_time_map", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("camera_usage_attribution_map", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aact clone() {
        aact aact = (aact) super.clone();
        Long l = this.a;
        if (l != null) {
            aact.a = l;
        }
        l = this.b;
        if (l != null) {
            aact.b = l;
        }
        l = this.c;
        if (l != null) {
            aact.c = l;
        }
        String str = this.d;
        if (str != null) {
            aact.d = str;
        }
        str = this.e;
        if (str != null) {
            aact.e = str;
        }
        return aact;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aact) obj).a());
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
