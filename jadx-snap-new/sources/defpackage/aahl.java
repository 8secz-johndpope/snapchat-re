package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahl */
public final class aahl implements Cloneable {
    public Long a;
    public Long b;

    public aahl(aahl aahl) {
        this.a = aahl.a;
        this.b = aahl.b;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("sys_cpu", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("usr_cpu", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aahl clone() {
        aahl aahl = (aahl) super.clone();
        Long l = this.a;
        if (l != null) {
            aahl.a = l;
        }
        l = this.b;
        if (l != null) {
            aahl.b = l;
        }
        return aahl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aahl) obj).a());
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
