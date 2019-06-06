package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aass */
public final class aass implements Cloneable {
    public Long a;
    public Long b;
    public Long c;
    public Long d;

    public aass(aass aass) {
        this.a = aass.a;
        this.b = aass.b;
        this.c = aass.c;
        this.d = aass.d;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("wifi_packets_rx", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("wifi_packets_tx", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("wwan_packets_rx", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("wwan_packets_tx", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aass clone() {
        aass aass = (aass) super.clone();
        Long l = this.a;
        if (l != null) {
            aass.a = l;
        }
        l = this.b;
        if (l != null) {
            aass.b = l;
        }
        l = this.c;
        if (l != null) {
            aass.c = l;
        }
        l = this.d;
        if (l != null) {
            aass.d = l;
        }
        return aass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aass) obj).a());
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
