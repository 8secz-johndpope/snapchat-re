package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgb */
public abstract class abgb extends abhw {
    private Double a;
    private Long b;
    private Long c;
    private Long d;
    private Double e;
    private Double f;
    private abaw g;
    private Long h;
    private String i;
    private Long j;
    private abhl k;

    public final void a(abaw abaw) {
        this.g = abaw;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("filter_index_pos", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("filter_index_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("filter_count", l);
        }
        d = this.e;
        if (d != null) {
            hashMap.put("filter_render_ts", d);
        }
        d = this.f;
        if (d != null) {
            hashMap.put("filter_score", d);
        }
        abaw abaw = this.g;
        if (abaw != null) {
            hashMap.put("source", abaw.toString());
        }
        l = this.h;
        if (l != null) {
            hashMap.put("swipe_sequence_count", l);
        }
        String str = this.i;
        if (str != null) {
            hashMap.put("swipe_geocell", str);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("location_accuracy_meters", l);
        }
        abhl abhl = this.k;
        if (abhl != null) {
            hashMap.put("eligibility_type", abhl.toString());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: b */
    public abgb clone() {
        abgb abgb = (abgb) super.clone();
        Double d = this.a;
        if (d != null) {
            abgb.a = d;
        }
        Long l = this.b;
        if (l != null) {
            abgb.b = l;
        }
        l = this.c;
        if (l != null) {
            abgb.c = l;
        }
        l = this.d;
        if (l != null) {
            abgb.d = l;
        }
        d = this.e;
        if (d != null) {
            abgb.e = d;
        }
        d = this.f;
        if (d != null) {
            abgb.f = d;
        }
        abaw abaw = this.g;
        if (abaw != null) {
            abgb.g = abaw;
        }
        l = this.h;
        if (l != null) {
            abgb.h = l;
        }
        String str = this.i;
        if (str != null) {
            abgb.i = str;
        }
        l = this.j;
        if (l != null) {
            abgb.j = l;
        }
        abhl abhl = this.k;
        if (abhl != null) {
            abgb.k = abhl;
        }
        return abgb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abgb) obj).asDictionary());
    }

    public final void g(Double d) {
        this.a = d;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final void h(Long l) {
        this.b = l;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abaw abaw = this.g;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abhl abhl = this.k;
        if (abhl != null) {
            i = abhl.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Long l) {
        this.c = l;
    }

    public final void j(Long l) {
        this.d = l;
    }
}
