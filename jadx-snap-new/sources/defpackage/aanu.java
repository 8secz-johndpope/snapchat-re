package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanu */
public final class aanu extends abhw {
    private String a;
    private String b;
    private String c;
    private String d;
    private Double e;
    private Long f;
    private aapb g;

    private aanu a() {
        aanu aanu = (aanu) super.clone();
        String str = this.a;
        if (str != null) {
            aanu.a = str;
        }
        str = this.b;
        if (str != null) {
            aanu.b = str;
        }
        str = this.c;
        if (str != null) {
            aanu.c = str;
        }
        str = this.d;
        if (str != null) {
            aanu.d = str;
        }
        Double d = this.e;
        if (d != null) {
            aanu.e = d;
        }
        Long l = this.f;
        if (l != null) {
            aanu.f = l;
        }
        aapb aapb = this.g;
        if (aapb != null) {
            aanu.g = aapb;
        }
        return aanu;
    }

    public final void a(aapb aapb) {
        this.g = aapb;
    }

    public final void a(Double d) {
        this.e = d;
    }

    public final void a(Long l) {
        this.f = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("thumbnail_list", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("on_screen_lenses", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("all_lenses", str);
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("total_lens_session_time_sec", d);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("activation_time_millis", l);
        }
        aapb aapb = this.g;
        if (aapb != null) {
            hashMap.put("activation_flow", aapb.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanu) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_GEOLENS_SESSION";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aapb aapb = this.g;
        if (aapb != null) {
            i = aapb.hashCode();
        }
        return hashCode + i;
    }
}
