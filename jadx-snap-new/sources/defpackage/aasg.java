package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasg */
public final class aasg implements Cloneable {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Boolean e;

    public aasg(aasg aasg) {
        this.a = aasg.a;
        this.b = aasg.b;
        this.c = aasg.c;
        this.d = aasg.d;
        this.e = aasg.e;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("multi_snap_preview_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("multi_snap_preview_index", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("multi_snap_output_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("multi_snap_output_index", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("trimmed", bool);
        }
        return hashMap;
    }

    public final void a(Long l) {
        this.a = l;
    }

    /* renamed from: b */
    public final aasg clone() {
        aasg aasg = (aasg) super.clone();
        Long l = this.a;
        if (l != null) {
            aasg.a = l;
        }
        l = this.b;
        if (l != null) {
            aasg.b = l;
        }
        l = this.c;
        if (l != null) {
            aasg.c = l;
        }
        l = this.d;
        if (l != null) {
            aasg.d = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aasg.e = bool;
        }
        return aasg;
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
        return a().equals(((aasg) obj).a());
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
