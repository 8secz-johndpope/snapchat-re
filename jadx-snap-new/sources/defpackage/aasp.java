package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasp */
public final class aasp implements Cloneable {
    public Long a;
    public Long b;
    public Long c;
    public Long d;

    public aasp(aasp aasp) {
        this.a = aasp.a;
        this.b = aasp.b;
        this.c = aasp.c;
        this.d = aasp.d;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("wifi_bytes_rx", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("wifi_bytes_tx", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("radio_bytes_rx", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("radio_bytes_tx", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aasp clone() {
        aasp aasp = (aasp) super.clone();
        Long l = this.a;
        if (l != null) {
            aasp.a = l;
        }
        l = this.b;
        if (l != null) {
            aasp.b = l;
        }
        l = this.c;
        if (l != null) {
            aasp.c = l;
        }
        l = this.d;
        if (l != null) {
            aasp.d = l;
        }
        return aasp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aasp) obj).a());
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
