package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadv */
public final class aadv extends abhw {
    public Boolean a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public String f;
    public String g;
    public Long h;
    public Long i;
    public Long j;
    private Long k;
    private Long l;

    private aadv a() {
        aadv aadv = (aadv) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aadv.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aadv.b = str;
        }
        str = this.c;
        if (str != null) {
            aadv.c = str;
        }
        str = this.d;
        if (str != null) {
            aadv.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aadv.e = l;
        }
        str = this.f;
        if (str != null) {
            aadv.f = str;
        }
        str = this.g;
        if (str != null) {
            aadv.g = str;
        }
        l = this.h;
        if (l != null) {
            aadv.h = l;
        }
        l = this.i;
        if (l != null) {
            aadv.i = l;
        }
        l = this.k;
        if (l != null) {
            aadv.k = l;
        }
        l = this.l;
        if (l != null) {
            aadv.l = l;
        }
        l = this.j;
        if (l != null) {
            aadv.j = l;
        }
        return aadv;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_codec_exhausted", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("request_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("request_use_case", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("request_caller", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("use_case_count", l);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("active_use_cases", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("active_callers", str);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("active_encoding_pixel_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("active_decoding_pixel_count", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("active_encoding_bitrate_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("active_decoding_bitrate_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("waiting_time_ms", l);
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
        return asDictionary().equals(((aadv) obj).asDictionary());
    }

    public final String getEventName() {
        return "CODEC_LEASING_ENGINE_EVENT";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
