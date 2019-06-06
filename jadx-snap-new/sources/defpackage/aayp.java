package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aayp */
public final class aayp extends abhr {
    public Long a;
    public aasc b;
    public aayf c;
    public abbd d;
    private Long e;
    private Long f;
    private aayh g;

    private aayp a() {
        aayp aayp = (aayp) super.clone();
        Long l = this.e;
        if (l != null) {
            aayp.e = l;
        }
        l = this.f;
        if (l != null) {
            aayp.f = l;
        }
        l = this.a;
        if (l != null) {
            aayp.a = l;
        }
        aayh aayh = this.g;
        if (aayh != null) {
            aayp.g = aayh;
        }
        aasc aasc = this.b;
        if (aasc != null) {
            aayp.b = aasc;
        }
        aayf aayf = this.c;
        if (aayf != null) {
            aayp.c = aayf;
        }
        abbd abbd = this.d;
        if (abbd != null) {
            aayp.d = abbd;
        }
        return aayp;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.e;
        if (l != null) {
            hashMap.put("first_bytes_latency_milliseconds", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("total_bytes_latency_milliseconds", l);
        }
        l = this.a;
        if (l != null) {
            hashMap.put("server_latency_milliseconds", l);
        }
        aayh aayh = this.g;
        if (aayh != null) {
            hashMap.put("search_media_type", aayh.toString());
        }
        aasc aasc = this.b;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        aayf aayf = this.c;
        if (aayf != null) {
            hashMap.put("search_cache_status", aayf.toString());
        }
        abbd abbd = this.d;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
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
        return asDictionary().equals(((aayp) obj).asDictionary());
    }

    public final String getEventName() {
        return "SEARCHMEDIA_LATENCY";
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
        Long l = this.e;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.a;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aayh aayh = this.g;
        hashCode = (hashCode + (aayh != null ? aayh.hashCode() : 0)) * 31;
        aasc aasc = this.b;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        aayf aayf = this.c;
        hashCode = (hashCode + (aayf != null ? aayf.hashCode() : 0)) * 31;
        abbd abbd = this.d;
        if (abbd != null) {
            i = abbd.hashCode();
        }
        return hashCode + i;
    }
}
