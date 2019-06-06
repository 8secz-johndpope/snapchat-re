package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxu */
public final class aaxu implements Cloneable {
    private Long a;
    private Long b;

    public aaxu(aaxu aaxu) {
        this.a = aaxu.a;
        this.b = aaxu.b;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("height", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("width", l);
        }
        return hashMap;
    }

    public final void a(Long l) {
        this.a = l;
    }

    /* renamed from: b */
    public final aaxu clone() {
        aaxu aaxu = (aaxu) super.clone();
        Long l = this.a;
        if (l != null) {
            aaxu.a = l;
        }
        l = this.b;
        if (l != null) {
            aaxu.b = l;
        }
        return aaxu;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaxu) obj).a());
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Long l2 = this.b;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
