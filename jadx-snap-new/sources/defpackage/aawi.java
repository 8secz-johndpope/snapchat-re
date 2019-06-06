package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawi */
public final class aawi extends abhw {
    private aaxp a;
    private Boolean b;
    private Long c;
    private Long d;
    private aaxo e;
    private Long f;
    private Boolean g;
    private Double h;
    private String i;

    private aawi a() {
        aawi aawi = (aawi) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawi.a = aaxp;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aawi.b = bool;
        }
        Long l = this.c;
        if (l != null) {
            aawi.c = l;
        }
        l = this.d;
        if (l != null) {
            aawi.d = l;
        }
        aaxo aaxo = this.e;
        if (aaxo != null) {
            aawi.e = aaxo;
        }
        l = this.f;
        if (l != null) {
            aawi.f = l;
        }
        bool = this.g;
        if (bool != null) {
            aawi.g = bool;
        }
        Double d = this.h;
        if (d != null) {
            aawi.h = d;
        }
        String str = this.i;
        if (str != null) {
            aawi.i = str;
        }
        return aawi;
    }

    public final void a(aaxo aaxo) {
        this.e = aaxo;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(Double d) {
        this.h = d;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("dialog_action", bool);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("contact_found_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("recommended_contact_count", l);
        }
        aaxo aaxo = this.e;
        if (aaxo != null) {
            hashMap.put("verification_type", aaxo.toString());
        }
        l = this.f;
        if (l != null) {
            hashMap.put("contact_book_size", l);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("server_data_ready", bool);
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("wait_time_sec", d);
        }
        String str = this.i;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.g = bool;
    }

    public final void b(Long l) {
        this.d = l;
    }

    public final void c(Long l) {
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aawi) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_CONTACT_SKIP_DIALOG";
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
        aaxp aaxp = this.a;
        int i = 0;
        hashCode = (hashCode + (aaxp != null ? aaxp.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaxo aaxo = this.e;
        hashCode = (hashCode + (aaxo != null ? aaxo.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
