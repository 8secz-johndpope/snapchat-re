package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanx */
public final class aanx extends abgb {
    private String a;
    private String b;
    private String c;
    private aapp d;
    private Long e;

    private aanx a() {
        aanx aanx = (aanx) super.clone();
        String str = this.a;
        if (str != null) {
            aanx.a = str;
        }
        str = this.b;
        if (str != null) {
            aanx.b = str;
        }
        str = this.c;
        if (str != null) {
            aanx.c = str;
        }
        aapp aapp = this.d;
        if (aapp != null) {
            aanx.d = aapp;
        }
        Long l = this.e;
        if (l != null) {
            aanx.e = l;
        }
        return aanx;
    }

    public final void a(aapp aapp) {
        this.d = aapp;
    }

    public final void a(Long l) {
        this.e = l;
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
            hashMap.put("lens_option_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("filter_geolens_id", str);
        }
        aapp aapp = this.d;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("camera", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abgb b() {
        return a();
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanx) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_LENS_OPTION_SWIPE";
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
        aapp aapp = this.d;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
