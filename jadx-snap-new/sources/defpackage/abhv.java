package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhv */
public final class abhv implements Cloneable {
    private Long a;
    private Long b;
    private Long c;
    private Long d;

    public abhv(abhv abhv) {
        this.a = abhv.a;
        this.b = abhv.b;
        this.c = abhv.c;
        this.d = abhv.d;
    }

    public final Long a() {
        return this.a;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Long b() {
        return this.b;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final Long c() {
        return this.c;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("tag_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("tag_from_carousel_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("regexed_string_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("bidirectional_friend_tag_count", l);
        }
        return hashMap;
    }

    /* renamed from: e */
    public final abhv clone() {
        abhv abhv = (abhv) super.clone();
        Long l = this.a;
        if (l != null) {
            abhv.a = l;
        }
        l = this.b;
        if (l != null) {
            abhv.b = l;
        }
        l = this.c;
        if (l != null) {
            abhv.c = l;
        }
        l = this.d;
        if (l != null) {
            abhv.d = l;
        }
        return abhv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d().equals(((abhv) obj).d());
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
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
