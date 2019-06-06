package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abaf */
public final class abaf implements Cloneable {
    public String a;
    public aaqd b;
    public aatd c;
    public Double d;
    public String e;
    public aasc f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public Boolean p;
    public String q;
    private aadc r;
    private abaw s;

    public abaf(abaf abaf) {
        this.a = abaf.a;
        this.b = abaf.b;
        this.c = abaf.c;
        this.d = abaf.d;
        this.e = abaf.e;
        this.f = abaf.f;
        this.g = abaf.g;
        this.h = abaf.h;
        this.i = abaf.i;
        this.j = abaf.j;
        this.k = abaf.k;
        this.l = abaf.l;
        this.m = abaf.m;
        this.n = abaf.n;
        this.o = abaf.o;
        this.r = abaf.r;
        this.s = abaf.s;
        this.p = abaf.p;
        this.q = abaf.q;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("analytics_version", str);
        }
        aaqd aaqd = this.b;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.c;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("power_mode", str);
        }
        aasc aasc = this.f;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("camera_api", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("camera_position", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("camera_open_source", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("camera_level", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("splits", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("start_type", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("start_sub_type", str);
        }
        aadc aadc = this.r;
        if (aadc != null) {
            hashMap.put("capture_source", aadc.toString());
        }
        abaw abaw = this.s;
        if (abaw != null) {
            hashMap.put("snap_source", abaw.toString());
        }
        Boolean bool = this.p;
        if (bool != null) {
            hashMap.put("flash", bool);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("camera_sdk", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final abaf clone() {
        abaf abaf = (abaf) super.clone();
        String str = this.a;
        if (str != null) {
            abaf.a = str;
        }
        aaqd aaqd = this.b;
        if (aaqd != null) {
            abaf.b = aaqd;
        }
        aatd aatd = this.c;
        if (aatd != null) {
            abaf.c = aatd;
        }
        Double d = this.d;
        if (d != null) {
            abaf.d = d;
        }
        str = this.e;
        if (str != null) {
            abaf.e = str;
        }
        aasc aasc = this.f;
        if (aasc != null) {
            abaf.f = aasc;
        }
        str = this.g;
        if (str != null) {
            abaf.g = str;
        }
        str = this.h;
        if (str != null) {
            abaf.h = str;
        }
        str = this.i;
        if (str != null) {
            abaf.i = str;
        }
        str = this.j;
        if (str != null) {
            abaf.j = str;
        }
        str = this.k;
        if (str != null) {
            abaf.k = str;
        }
        str = this.l;
        if (str != null) {
            abaf.l = str;
        }
        str = this.m;
        if (str != null) {
            abaf.m = str;
        }
        str = this.n;
        if (str != null) {
            abaf.n = str;
        }
        str = this.o;
        if (str != null) {
            abaf.o = str;
        }
        aadc aadc = this.r;
        if (aadc != null) {
            abaf.r = aadc;
        }
        abaw abaw = this.s;
        if (abaw != null) {
            abaf.s = abaw;
        }
        Boolean bool = this.p;
        if (bool != null) {
            abaf.p = bool;
        }
        str = this.q;
        if (str != null) {
            abaf.q = str;
        }
        return abaf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((abaf) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        aaqd aaqd = this.b;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.c;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        aasc aasc = this.f;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.k;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.m;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.n;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.o;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        aadc aadc = this.r;
        hashCode = (hashCode + (aadc != null ? aadc.hashCode() : 0)) * 31;
        abaw abaw = this.s;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        Boolean bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str2 = this.q;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
