package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaax */
public final class aaax extends abhw {
    public Double a;
    public Long b;
    public Long c;
    public aaat d;
    public Long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public Double k;
    public Double l;
    public Double m;
    public Double n;
    public Double o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public Double u;
    public Double v;
    public Double w;
    public Double x;
    public Double y;

    private aaax a() {
        aaax aaax = (aaax) super.clone();
        Double d = this.a;
        if (d != null) {
            aaax.a = d;
        }
        Long l = this.b;
        if (l != null) {
            aaax.b = l;
        }
        l = this.c;
        if (l != null) {
            aaax.c = l;
        }
        aaat aaat = this.d;
        if (aaat != null) {
            aaax.d = aaat;
        }
        l = this.e;
        if (l != null) {
            aaax.e = l;
        }
        String str = this.f;
        if (str != null) {
            aaax.f = str;
        }
        str = this.g;
        if (str != null) {
            aaax.g = str;
        }
        str = this.h;
        if (str != null) {
            aaax.h = str;
        }
        str = this.i;
        if (str != null) {
            aaax.i = str;
        }
        str = this.j;
        if (str != null) {
            aaax.j = str;
        }
        d = this.k;
        if (d != null) {
            aaax.k = d;
        }
        d = this.l;
        if (d != null) {
            aaax.l = d;
        }
        d = this.m;
        if (d != null) {
            aaax.m = d;
        }
        d = this.n;
        if (d != null) {
            aaax.n = d;
        }
        d = this.o;
        if (d != null) {
            aaax.o = d;
        }
        str = this.p;
        if (str != null) {
            aaax.p = str;
        }
        str = this.q;
        if (str != null) {
            aaax.q = str;
        }
        str = this.r;
        if (str != null) {
            aaax.r = str;
        }
        str = this.s;
        if (str != null) {
            aaax.s = str;
        }
        str = this.t;
        if (str != null) {
            aaax.t = str;
        }
        d = this.u;
        if (d != null) {
            aaax.u = d;
        }
        d = this.v;
        if (d != null) {
            aaax.v = d;
        }
        d = this.w;
        if (d != null) {
            aaax.w = d;
        }
        d = this.x;
        if (d != null) {
            aaax.x = d;
        }
        d = this.y;
        if (d != null) {
            aaax.y = d;
        }
        return aaax;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("first_app_open_ts", d);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("app_open_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("session_time_sec", l);
        }
        aaat aaat = this.d;
        if (aaat != null) {
            hashMap.put("source", aaat.toString());
        }
        l = this.e;
        if (l != null) {
            hashMap.put("last_active_notification_ms", l);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("first_page1", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("first_page2", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("first_page3", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("first_page4", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("first_page5", str);
        }
        d = this.k;
        if (d != null) {
            hashMap.put("view_time_sec_first_page1", d);
        }
        d = this.l;
        if (d != null) {
            hashMap.put("view_time_sec_first_page2", d);
        }
        d = this.m;
        if (d != null) {
            hashMap.put("view_time_sec_first_page3", d);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("view_time_sec_first_page4", d);
        }
        d = this.o;
        if (d != null) {
            hashMap.put("view_time_sec_first_page5", d);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("last_page1", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("last_page2", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("last_page3", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("last_page4", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("last_page5", str);
        }
        d = this.u;
        if (d != null) {
            hashMap.put("view_time_sec_last_page1", d);
        }
        d = this.v;
        if (d != null) {
            hashMap.put("view_time_sec_last_page2", d);
        }
        d = this.w;
        if (d != null) {
            hashMap.put("view_time_sec_last_page3", d);
        }
        d = this.x;
        if (d != null) {
            hashMap.put("view_time_sec_last_page4", d);
        }
        d = this.y;
        if (d != null) {
            hashMap.put("view_time_sec_last_page5", d);
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
        return asDictionary().equals(((aaax) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_SESSION_SUMMARY";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaat aaat = this.d;
        hashCode = (hashCode + (aaat != null ? aaat.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.k;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.l;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.u;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.v;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.w;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.x;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.y;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
