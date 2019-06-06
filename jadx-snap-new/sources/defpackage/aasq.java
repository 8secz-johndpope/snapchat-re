package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasq */
public final class aasq implements Cloneable {
    private aagx a;
    private Double b;
    private Double c;
    private Long d;

    public aasq(aasq aasq) {
        this.a = aasq.a;
        this.b = aasq.b;
        this.c = aasq.c;
        this.d = aasq.d;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        aagx aagx = this.a;
        if (aagx != null) {
            hashMap.put("connection_class", aagx.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("bandwidth_mean", d);
        }
        d = this.c;
        if (d != null) {
            hashMap.put("bandwidth_median", d);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("bandwidth_sample_size", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aasq clone() {
        aasq aasq = (aasq) super.clone();
        aagx aagx = this.a;
        if (aagx != null) {
            aasq.a = aagx;
        }
        Double d = this.b;
        if (d != null) {
            aasq.b = d;
        }
        d = this.c;
        if (d != null) {
            aasq.c = d;
        }
        Long l = this.d;
        if (l != null) {
            aasq.d = l;
        }
        return aasq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aasq) obj).a());
    }

    public final int hashCode() {
        aagx aagx = this.a;
        int i = 0;
        int hashCode = ((aagx != null ? aagx.hashCode() : 0) + 381486) * 31;
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
