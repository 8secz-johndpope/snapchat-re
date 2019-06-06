package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakq */
public final class aakq extends abhw {
    public aakr a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Long f;
    private Long g;
    private String h;
    private String i;
    private Long j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private Boolean q;
    private Boolean r;

    private aakq a() {
        aakq aakq = (aakq) super.clone();
        aakr aakr = this.a;
        if (aakr != null) {
            aakq.a = aakr;
        }
        Long l = this.g;
        if (l != null) {
            aakq.g = l;
        }
        String str = this.h;
        if (str != null) {
            aakq.h = str;
        }
        str = this.b;
        if (str != null) {
            aakq.b = str;
        }
        str = this.i;
        if (str != null) {
            aakq.i = str;
        }
        l = this.j;
        if (l != null) {
            aakq.j = l;
        }
        str = this.k;
        if (str != null) {
            aakq.k = str;
        }
        str = this.l;
        if (str != null) {
            aakq.l = str;
        }
        str = this.c;
        if (str != null) {
            aakq.c = str;
        }
        str = this.m;
        if (str != null) {
            aakq.m = str;
        }
        str = this.n;
        if (str != null) {
            aakq.n = str;
        }
        str = this.o;
        if (str != null) {
            aakq.o = str;
        }
        str = this.p;
        if (str != null) {
            aakq.p = str;
        }
        Boolean bool = this.q;
        if (bool != null) {
            aakq.q = bool;
        }
        bool = this.r;
        if (bool != null) {
            aakq.r = bool;
        }
        l = this.d;
        if (l != null) {
            aakq.d = l;
        }
        l = this.e;
        if (l != null) {
            aakq.e = l;
        }
        l = this.f;
        if (l != null) {
            aakq.f = l;
        }
        return aakq;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakr aakr = this.a;
        if (aakr != null) {
            hashMap.put("event_type", aakr.toString());
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("operation_time_ms", l);
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("database_table", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("database_type", str);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("error_code", l);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("statement", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("source", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("free_disk_space_mb", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("total_disk_space_mb", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("free_nodes", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("total_nodes", str);
        }
        Boolean bool = this.q;
        if (bool != null) {
            hashMap.put("with_new_db", bool);
        }
        bool = this.r;
        if (bool != null) {
            hashMap.put("with_identity_missing", bool);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("db_size_byte", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("total_db_siz_byte", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("db_count", l);
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
        return asDictionary().equals(((aakq) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_DB_OPERATION";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aakr aakr = this.a;
        int i = 0;
        hashCode = (hashCode + (aakr != null ? aakr.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.q;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
