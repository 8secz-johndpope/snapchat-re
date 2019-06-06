package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaao */
public final class aaao implements Cloneable {
    private Long a;
    private Long b;
    private Long c;

    public aaao(aaao aaao) {
        this.a = aaao.a;
        this.b = aaao.b;
        this.c = aaao.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("storage_usage_total_m_b", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("storage_space_free_m_b", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("storage_space_total_m_b", l);
        }
        return hashMap;
    }

    public final void a(Long l) {
        this.a = null;
    }

    /* renamed from: b */
    public final aaao clone() {
        aaao aaao = (aaao) super.clone();
        Long l = this.a;
        if (l != null) {
            aaao.a = l;
        }
        l = this.b;
        if (l != null) {
            aaao.b = l;
        }
        l = this.c;
        if (l != null) {
            aaao.c = l;
        }
        return aaao;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaao) obj).a());
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Long l2 = this.b;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.c;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
