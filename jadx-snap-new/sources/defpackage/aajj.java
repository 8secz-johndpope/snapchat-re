package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aajj */
public final class aajj extends aajk {
    private Boolean a;
    private Boolean b;
    private aavf c;
    private Long d;
    private aahb e;
    private Boolean f;
    private aasc g;
    private Double h;
    private Double i;
    private aabm j;
    private String k;

    private aajj b() {
        aajj aajj = (aajj) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aajj.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            aajj.b = bool;
        }
        aavf aavf = this.c;
        if (aavf != null) {
            aajj.c = aavf;
        }
        Long l = this.d;
        if (l != null) {
            aajj.d = l;
        }
        aahb aahb = this.e;
        if (aahb != null) {
            aajj.e = aahb;
        }
        bool = this.f;
        if (bool != null) {
            aajj.f = bool;
        }
        aasc aasc = this.g;
        if (aasc != null) {
            aajj.g = aasc;
        }
        Double d = this.h;
        if (d != null) {
            aajj.h = d;
        }
        d = this.i;
        if (d != null) {
            aajj.i = d;
        }
        aabm aabm = this.j;
        if (aabm != null) {
            aajj.j = aabm;
        }
        String str = this.k;
        if (str != null) {
            aajj.k = str;
        }
        return aajj;
    }

    public final /* synthetic */ aajk a() {
        return b();
    }

    public final void a(aahb aahb) {
        this.e = aahb;
    }

    public final void a(aasc aasc) {
        this.g = aasc;
    }

    public final void a(Double d) {
        this.h = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("with_subscription", bool);
        }
        aavf aavf = this.c;
        if (aavf != null) {
            hashMap.put("read_state", aavf.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("view_location", l);
        }
        aahb aahb = this.e;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("edition_end", bool);
        }
        aasc aasc = this.g;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        d = this.i;
        if (d != null) {
            hashMap.put("media_display_time_sec", d);
        }
        aabm aabm = this.j;
        if (aabm != null) {
            hashMap.put("bandwidth_class", aabm.toString());
        }
        String str = this.k;
        if (str != null) {
            hashMap.put("sort_order_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aajj) obj).asDictionary());
    }

    public final String getEventName() {
        return "DISCOVER_SNAP_VIEW";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aavf aavf = this.c;
        hashCode = (hashCode + (aavf != null ? aavf.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.e;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.g;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aabm aabm = this.j;
        hashCode = (hashCode + (aabm != null ? aabm.hashCode() : 0)) * 31;
        String str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
