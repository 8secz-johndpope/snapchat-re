package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacv */
public abstract class aacv extends abhw {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private abgo g;
    private aasb h;
    private aarp i;
    private abgr j;
    private String k;
    private Long l;
    private aaqd m;
    private aatd n;
    private Double o;

    /* renamed from: a */
    public aacv clone() {
        aacv aacv = (aacv) super.clone();
        String str = this.a;
        if (str != null) {
            aacv.a = str;
        }
        str = this.b;
        if (str != null) {
            aacv.b = str;
        }
        str = this.c;
        if (str != null) {
            aacv.c = str;
        }
        str = this.d;
        if (str != null) {
            aacv.d = str;
        }
        str = this.e;
        if (str != null) {
            aacv.e = str;
        }
        str = this.f;
        if (str != null) {
            aacv.f = str;
        }
        abgo abgo = this.g;
        if (abgo != null) {
            aacv.g = abgo;
        }
        aasb aasb = this.h;
        if (aasb != null) {
            aacv.h = aasb;
        }
        aarp aarp = this.i;
        if (aarp != null) {
            aacv.i = aarp;
        }
        abgr abgr = this.j;
        if (abgr != null) {
            aacv.j = abgr;
        }
        str = this.k;
        if (str != null) {
            aacv.k = str;
        }
        Long l = this.l;
        if (l != null) {
            aacv.l = l;
        }
        aaqd aaqd = this.m;
        if (aaqd != null) {
            aacv.m = aaqd;
        }
        aatd aatd = this.n;
        if (aatd != null) {
            aacv.n = aatd;
        }
        Double d = this.o;
        if (d != null) {
            aacv.o = d;
        }
        return aacv;
    }

    public final void a(aarp aarp) {
        this.i = aarp;
    }

    public final void a(aasb aasb) {
        this.h = aasb;
    }

    public final void a(abgo abgo) {
        this.g = abgo;
    }

    public final void a(abgr abgr) {
        this.j = abgr;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("callers", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("input_media_meta_data", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("input_media_metadata", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("output_media_metadata", str);
        }
        abgo abgo = this.g;
        if (abgo != null) {
            hashMap.put("transcoding_context", abgo.toString());
        }
        aasb aasb = this.h;
        if (aasb != null) {
            hashMap.put("media_source", aasb.toString());
        }
        aarp aarp = this.i;
        if (aarp != null) {
            hashMap.put("media_destination", aarp.toString());
        }
        abgr abgr = this.j;
        if (abgr != null) {
            hashMap.put("transcoding_status", abgr.toString());
        }
        str = this.k;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        Long l = this.l;
        if (l != null) {
            hashMap.put("latency_millis", l);
        }
        aaqd aaqd = this.m;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.n;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.o;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void d(Long l) {
        this.l = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacv) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
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
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgo abgo = this.g;
        hashCode = (hashCode + (abgo != null ? abgo.hashCode() : 0)) * 31;
        aasb aasb = this.h;
        hashCode = (hashCode + (aasb != null ? aasb.hashCode() : 0)) * 31;
        aarp aarp = this.i;
        hashCode = (hashCode + (aarp != null ? aarp.hashCode() : 0)) * 31;
        abgr abgr = this.j;
        hashCode = (hashCode + (abgr != null ? abgr.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaqd aaqd = this.m;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.n;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.o;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public final void n(String str) {
        this.a = str;
    }

    public final void o(String str) {
        this.b = str;
    }

    public final void p(String str) {
        this.c = str;
    }

    public final void q(String str) {
        this.d = str;
    }

    public final void r(String str) {
        this.e = str;
    }

    public final void s(String str) {
        this.f = str;
    }

    public final void t(String str) {
        this.k = str;
    }
}
