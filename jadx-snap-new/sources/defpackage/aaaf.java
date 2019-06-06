package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaaf */
public final class aaaf extends abhw {
    public String a;
    private aatl b;
    private String c;
    private String d;
    private abbd e;
    private aahz f;
    private String g;
    private String h;
    private Double i;
    private String j;
    private String k;
    private Boolean l;
    private aabh m;

    private aaaf b() {
        aaaf aaaf = (aaaf) super.clone();
        aatl aatl = this.b;
        if (aatl != null) {
            aaaf.b = aatl;
        }
        String str = this.c;
        if (str != null) {
            aaaf.c = str;
        }
        str = this.d;
        if (str != null) {
            aaaf.d = str;
        }
        abbd abbd = this.e;
        if (abbd != null) {
            aaaf.e = abbd;
        }
        aahz aahz = this.f;
        if (aahz != null) {
            aaaf.f = aahz;
        }
        str = this.g;
        if (str != null) {
            aaaf.g = str;
        }
        str = this.h;
        if (str != null) {
            aaaf.h = str;
        }
        Double d = this.i;
        if (d != null) {
            aaaf.i = d;
        }
        str = this.a;
        if (str != null) {
            aaaf.a = str;
        }
        str = this.j;
        if (str != null) {
            aaaf.j = str;
        }
        str = this.k;
        if (str != null) {
            aaaf.k = str;
        }
        Boolean bool = this.l;
        if (bool != null) {
            aaaf.l = bool;
        }
        aabh aabh = this.m;
        if (aabh != null) {
            aaaf.m = aabh;
        }
        return aaaf;
    }

    public final Double a() {
        return this.i;
    }

    public final void a(aahz aahz) {
        this.f = aahz;
    }

    public final void a(aatl aatl) {
        this.b = aatl;
    }

    public final void a(abbd abbd) {
        this.e = abbd;
    }

    public final void a(Double d) {
        this.i = d;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aatl aatl = this.b;
        if (aatl != null) {
            hashMap.put("open_state", aatl.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("notification_type", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("notification_id", str);
        }
        abbd abbd = this.e;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        aahz aahz = this.f;
        if (aahz != null) {
            hashMap.put("deep_link_source", aahz.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("user_ad_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("app_open_ts", d);
        }
        str = this.a;
        if (str != null) {
            hashMap.put("blizzard_config_version", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("channel_id", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        Boolean bool = this.l;
        if (bool != null) {
            hashMap.put("from_login", bool);
        }
        aabh aabh = this.m;
        if (aabh != null) {
            hashMap.put("application_state", aabh.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaaf) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_APPLICATION_OPEN";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aatl aatl = this.b;
        int i = 0;
        hashCode = (hashCode + (aatl != null ? aatl.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.e;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        aahz aahz = this.f;
        hashCode = (hashCode + (aahz != null ? aahz.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.a;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aabh aabh = this.m;
        if (aabh != null) {
            i = aabh.hashCode();
        }
        return hashCode + i;
    }
}
