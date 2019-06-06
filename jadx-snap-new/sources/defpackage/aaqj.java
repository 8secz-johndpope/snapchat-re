package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqj */
public final class aaqj extends abhw {
    public Long a;
    public aajv b;
    public Long c;
    public Long d;
    public Double e;

    private aaqj a() {
        aaqj aaqj = (aaqj) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqj.a = l;
        }
        aajv aajv = this.b;
        if (aajv != null) {
            aaqj.b = aajv;
        }
        l = this.c;
        if (l != null) {
            aaqj.c = l;
        }
        l = this.d;
        if (l != null) {
            aaqj.d = l;
        }
        Double d = this.e;
        if (d != null) {
            aaqj.e = d;
        }
        return aaqj;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        aajv aajv = this.b;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        l = this.c;
        if (l != null) {
            hashMap.put("status_view_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("status_available_count", l);
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
        return asDictionary().equals(((aaqj) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_EXPLORE_CLOSE";
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
        aajv aajv = this.b;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.e;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
