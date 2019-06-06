package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaaj */
public final class aaaj extends abhw {
    public Long a;
    public Boolean b;
    public Long c;
    public Long d;
    public Double e;
    public String f;
    public Long g;
    public String h;
    public Long i;
    private Long j;
    private Long k;
    private String l;
    private Boolean m;

    private aaaj a() {
        aaaj aaaj = (aaaj) super.clone();
        Long l = this.a;
        if (l != null) {
            aaaj.a = l;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaaj.b = bool;
        }
        l = this.c;
        if (l != null) {
            aaaj.c = l;
        }
        l = this.d;
        if (l != null) {
            aaaj.d = l;
        }
        Double d = this.e;
        if (d != null) {
            aaaj.e = d;
        }
        String str = this.f;
        if (str != null) {
            aaaj.f = str;
        }
        l = this.g;
        if (l != null) {
            aaaj.g = l;
        }
        str = this.h;
        if (str != null) {
            aaaj.h = str;
        }
        l = this.j;
        if (l != null) {
            aaaj.j = l;
        }
        l = this.k;
        if (l != null) {
            aaaj.k = l;
        }
        str = this.l;
        if (str != null) {
            aaaj.l = str;
        }
        l = this.i;
        if (l != null) {
            aaaj.i = l;
        }
        bool = this.m;
        if (bool != null) {
            aaaj.m = bool;
        }
        return aaaj;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("status_code", l);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("success", bool);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("send_bytes", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("receive_bytes", l);
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("latency_time_sec", d);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("server_name", str);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("num_events_on_disk", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("blizzard_config_version", str);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("min_log_queue_seq_id", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("max_log_queue_seq_id", l);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("request_id", str);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("num_events_in_request", l);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("in_background", bool);
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
        return asDictionary().equals(((aaaj) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_BLIZZARD_REQUEST";
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
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.m;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
