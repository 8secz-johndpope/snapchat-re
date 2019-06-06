package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahh */
public final class aahh extends aahe {
    private aahi a;
    private aajr b;
    private Long c;
    private Long d;
    private String e;
    private Double f;
    private String g;
    private String h;
    private String i;

    private aahh b() {
        aahh aahh = (aahh) super.clone();
        aahi aahi = this.a;
        if (aahi != null) {
            aahh.a = aahi;
        }
        aajr aajr = this.b;
        if (aajr != null) {
            aahh.b = aajr;
        }
        Long l = this.c;
        if (l != null) {
            aahh.c = l;
        }
        l = this.d;
        if (l != null) {
            aahh.d = l;
        }
        String str = this.e;
        if (str != null) {
            aahh.e = str;
        }
        Double d = this.f;
        if (d != null) {
            aahh.f = d;
        }
        str = this.g;
        if (str != null) {
            aahh.g = str;
        }
        str = this.h;
        if (str != null) {
            aahh.h = str;
        }
        str = this.i;
        if (str != null) {
            aahh.i = str;
        }
        return aahh;
    }

    public final /* synthetic */ aahe a() {
        return b();
    }

    public final void a(String str) {
        this.g = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahi aahi = this.a;
        if (aahi != null) {
            hashMap.put("context_menu_type", aahi.toString());
        }
        aajr aajr = this.b;
        if (aajr != null) {
            hashMap.put("entry_type", aajr.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("tapped_cta_element_index", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("max_cta_element_index", l);
        }
        String str = this.e;
        if (str != null) {
            hashMap.put("tapped_cta_element_type", str);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("context_c_t_a_visible_latency", d);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("notification_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("teamsnap_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aahh) obj).asDictionary());
    }

    public final String getEventName() {
        return "CONTEXT_MENU_PRESENT";
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
        aahi aahi = this.a;
        int i = 0;
        hashCode = (hashCode + (aahi != null ? aahi.hashCode() : 0)) * 31;
        aajr aajr = this.b;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
