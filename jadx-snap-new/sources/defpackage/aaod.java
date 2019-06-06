package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaod */
public final class aaod extends abhw {
    private String a;
    private String b;
    private String c;
    private Long d;
    private aaoe e;
    private String f;

    private aaod a() {
        aaod aaod = (aaod) super.clone();
        String str = this.a;
        if (str != null) {
            aaod.a = str;
        }
        str = this.b;
        if (str != null) {
            aaod.b = str;
        }
        str = this.c;
        if (str != null) {
            aaod.c = str;
        }
        Long l = this.d;
        if (l != null) {
            aaod.d = l;
        }
        aaoe aaoe = this.e;
        if (aaoe != null) {
            aaod.e = aaoe;
        }
        str = this.f;
        if (str != null) {
            aaod.f = str;
        }
        return aaod;
    }

    public final void a(aaoe aaoe) {
        this.e = aaoe;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("enc_geocell", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("geocell_batch", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("ip_address", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("age_in_years", l);
        }
        aaoe aaoe = this.e;
        if (aaoe != null) {
            hashMap.put("ghost_mode_state", aaoe.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("registration_country_code", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaod) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOLOCATION_LOCATION_DATA_READY";
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
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaoe aaoe = this.e;
        hashCode = (hashCode + (aaoe != null ? aaoe.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
