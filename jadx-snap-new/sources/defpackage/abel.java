package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abel */
public final class abel implements Cloneable {
    private String a;
    private String b;
    private String c;
    private Long d;

    public abel(abel abel) {
        this.a = abel.a;
        this.b = abel.b;
        this.c = abel.c;
        this.d = abel.d;
    }

    public final String a() {
        return this.a;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final String b() {
        return this.b;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final Long c() {
        return this.d;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("from_state", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("to_state", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("trigger", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("transition_time_ms", l);
        }
        return hashMap;
    }

    /* renamed from: e */
    public final abel clone() {
        abel abel = (abel) super.clone();
        String str = this.a;
        if (str != null) {
            abel.a = str;
        }
        str = this.b;
        if (str != null) {
            abel.b = str;
        }
        str = this.c;
        if (str != null) {
            abel.c = str;
        }
        Long l = this.d;
        if (l != null) {
            abel.d = l;
        }
        return abel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d().equals(((abel) obj).d());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
