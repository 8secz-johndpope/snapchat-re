package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abia */
public final class abia implements Cloneable {
    public Long a;
    public Long b;

    public abia(abia abia) {
        this.a = abia.a;
        this.b = abia.b;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("wakelock_acq_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("wakelock_held_ms", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final abia clone() {
        abia abia = (abia) super.clone();
        Long l = this.a;
        if (l != null) {
            abia.a = l;
        }
        l = this.b;
        if (l != null) {
            abia.b = l;
        }
        return abia;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((abia) obj).a());
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
