package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqw */
public final class aaqw extends abhw {
    public Long a;
    public abbd b;
    public aaua c;
    public aaqv d;
    public Double e;

    private aaqw a() {
        aaqw aaqw = (aaqw) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqw.a = l;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aaqw.b = abbd;
        }
        aaua aaua = this.c;
        if (aaua != null) {
            aaqw.c = aaua;
        }
        aaqv aaqv = this.d;
        if (aaqv != null) {
            aaqw.d = aaqv;
        }
        Double d = this.e;
        if (d != null) {
            aaqw.e = d;
        }
        return aaqw;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        aaua aaua = this.c;
        if (aaua != null) {
            hashMap.put("page", aaua.toString());
        }
        aaqv aaqv = this.d;
        if (aaqv != null) {
            hashMap.put("page_name", aaqv.toString());
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("view_time_sec", d);
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
        return asDictionary().equals(((aaqw) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_PAGE_VIEW";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abbd abbd = this.b;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        aaua aaua = this.c;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        aaqv aaqv = this.d;
        hashCode = (hashCode + (aaqv != null ? aaqv.hashCode() : 0)) * 31;
        Double d = this.e;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
