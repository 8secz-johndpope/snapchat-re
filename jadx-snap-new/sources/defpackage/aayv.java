package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aayv */
public final class aayv implements Cloneable {
    private Double a;
    private Double b;
    private Double c;
    private Long d;
    private Long e;

    public aayv(aayv aayv) {
        this.a = aayv.a;
        this.b = aayv.b;
        this.c = aayv.c;
        this.d = aayv.d;
        this.e = aayv.e;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("segment_start_time", d);
        }
        d = this.b;
        if (d != null) {
            hashMap.put("segment_duration", d);
        }
        d = this.c;
        if (d != null) {
            hashMap.put("source_video_duration", d);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("segment_index", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("num_segments", l);
        }
        return hashMap;
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final void a(Long l) {
        this.d = l;
    }

    /* renamed from: b */
    public final aayv clone() {
        aayv aayv = (aayv) super.clone();
        Double d = this.a;
        if (d != null) {
            aayv.a = d;
        }
        d = this.b;
        if (d != null) {
            aayv.b = d;
        }
        d = this.c;
        if (d != null) {
            aayv.c = d;
        }
        Long l = this.d;
        if (l != null) {
            aayv.d = l;
        }
        l = this.e;
        if (l != null) {
            aayv.e = l;
        }
        return aayv;
    }

    public final void b(Double d) {
        this.b = d;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void c(Double d) {
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aayv) obj).a());
    }

    public final int hashCode() {
        Double d = this.a;
        int i = 0;
        int hashCode = ((d != null ? d.hashCode() : 0) + 381486) * 31;
        Double d2 = this.b;
        hashCode = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        d2 = this.c;
        hashCode = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
