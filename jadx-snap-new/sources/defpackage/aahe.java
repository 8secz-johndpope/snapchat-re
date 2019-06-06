package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahe */
public class aahe extends abhw {
    private abbd a;
    private String b;
    private String c;
    private String d;
    private String e;
    private aasc f;
    private abbd g;
    private String h;
    private String i;
    private aahg j;

    /* renamed from: a */
    public aahe clone() {
        aahe aahe = (aahe) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aahe.a = abbd;
        }
        String str = this.b;
        if (str != null) {
            aahe.b = str;
        }
        str = this.c;
        if (str != null) {
            aahe.c = str;
        }
        str = this.d;
        if (str != null) {
            aahe.d = str;
        }
        str = this.e;
        if (str != null) {
            aahe.e = str;
        }
        aasc aasc = this.f;
        if (aasc != null) {
            aahe.f = aasc;
        }
        abbd = this.g;
        if (abbd != null) {
            aahe.g = abbd;
        }
        str = this.h;
        if (str != null) {
            aahe.h = str;
        }
        str = this.i;
        if (str != null) {
            aahe.i = str;
        }
        aahg aahg = this.j;
        if (aahg != null) {
            aahe.j = aahg;
        }
        return aahe;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbd abbd = this.a;
        if (abbd != null) {
            hashMap.put("source_type", abbd.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("context_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("context_request_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("filter_venue_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("filter_geofilter_id", str);
        }
        aasc aasc = this.f;
        if (aasc != null) {
            hashMap.put("source_media_type", aasc.toString());
        }
        abbd = this.g;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.h;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("available_context_types", str);
        }
        aahg aahg = this.j;
        if (aahg != null) {
            hashMap.put("context_menu_location", aahg.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aahe) obj).asDictionary());
    }

    public final void f(String str) {
        this.d = str;
    }

    public final void g(String str) {
        this.e = str;
    }

    public String getEventName() {
        return "CONTEXT_MENU_BASE";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final void h(String str) {
        this.h = str;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        abbd abbd = this.a;
        int i = 0;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aasc aasc = this.f;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        abbd = this.g;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aahg aahg = this.j;
        if (aahg != null) {
            i = aahg.hashCode();
        }
        return hashCode + i;
    }

    public final void i(String str) {
        this.i = str;
    }
}
