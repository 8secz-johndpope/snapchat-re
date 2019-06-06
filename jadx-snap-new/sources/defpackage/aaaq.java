package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaaq */
public final class aaaq implements Cloneable {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Boolean e;

    public aaaq(aaaq aaaq) {
        this.a = aaaq.a;
        this.b = aaaq.b;
        this.c = aaaq.c;
        this.d = aaaq.d;
        this.e = aaaq.e;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("memory_class_m_b", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("available_memory_m_b", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("total_memory_m_b", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("threshold_memory_m_b", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("is_low_memory", bool);
        }
        return hashMap;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final void a(Long l) {
        this.a = l;
    }

    /* renamed from: b */
    public final aaaq clone() {
        aaaq aaaq = (aaaq) super.clone();
        Long l = this.a;
        if (l != null) {
            aaaq.a = l;
        }
        l = this.b;
        if (l != null) {
            aaaq.b = l;
        }
        l = this.c;
        if (l != null) {
            aaaq.c = l;
        }
        l = this.d;
        if (l != null) {
            aaaq.d = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aaaq.e = bool;
        }
        return aaaq;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final void d(Long l) {
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaaq) obj).a());
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Long l2 = this.b;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.c;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.d;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
