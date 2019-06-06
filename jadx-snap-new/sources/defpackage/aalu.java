package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalu */
public final class aalu extends aamd {
    private aasc a;
    private aalv b;
    private aamf c;
    private aalw d;
    private aama e;
    private Boolean f;
    private Double g;
    private Long h;
    private String i;
    private String j;

    private aalu c() {
        aalu aalu = (aalu) super.clone();
        aasc aasc = this.a;
        if (aasc != null) {
            aalu.a = aasc;
        }
        aalv aalv = this.b;
        if (aalv != null) {
            aalu.b = aalv;
        }
        aamf aamf = this.c;
        if (aamf != null) {
            aalu.c = aamf;
        }
        aalw aalw = this.d;
        if (aalw != null) {
            aalu.d = aalw;
        }
        aama aama = this.e;
        if (aama != null) {
            aalu.e = aama;
        }
        Boolean bool = this.f;
        if (bool != null) {
            aalu.f = bool;
        }
        Double d = this.g;
        if (d != null) {
            aalu.g = d;
        }
        Long l = this.h;
        if (l != null) {
            aalu.h = l;
        }
        String str = this.i;
        if (str != null) {
            aalu.i = str;
        }
        str = this.j;
        if (str != null) {
            aalu.j = str;
        }
        return aalu;
    }

    public final /* synthetic */ aamd a() {
        return c();
    }

    public final void a(aalv aalv) {
        this.b = aalv;
    }

    public final void a(aama aama) {
        this.e = aama;
    }

    public final void a(aamf aamf) {
        this.c = aamf;
    }

    public final void a(aasc aasc) {
        this.a = aasc;
    }

    public final void a(Boolean bool) {
        this.f = bool;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aasc aasc = this.a;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        aalv aalv = this.b;
        if (aalv != null) {
            hashMap.put("filter_filter_type", aalv.toString());
        }
        aamf aamf = this.c;
        if (aamf != null) {
            hashMap.put("filter_visual", aamf.toString());
        }
        aalw aalw = this.d;
        if (aalw != null) {
            hashMap.put("filter_info", aalw.toString());
        }
        aama aama = this.e;
        if (aama != null) {
            hashMap.put("filter_motion", aama.toString());
        }
        Boolean bool = this.f;
        if (bool != null) {
            hashMap.put("filter_reverse", bool);
        }
        Double d = this.g;
        if (d != null) {
            hashMap.put("filter_info_value", d);
        }
        Long l = this.h;
        if (l != null) {
            hashMap.put("filter_streak_value", l);
        }
        String str = this.i;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abgb b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aalu) obj).asDictionary());
    }

    public final String getEventName() {
        return "FILTER_FILTER_SWIPE";
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
        aasc aasc = this.a;
        int i = 0;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        aalv aalv = this.b;
        hashCode = (hashCode + (aalv != null ? aalv.hashCode() : 0)) * 31;
        aamf aamf = this.c;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        aalw aalw = this.d;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
        aama aama = this.e;
        hashCode = (hashCode + (aama != null ? aama.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
