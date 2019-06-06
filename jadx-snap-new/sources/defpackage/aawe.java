package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawe */
public final class aawe extends abhw {
    private aaxp a;
    private Long b;
    private Long c;
    private Long d;
    private aaxo e;
    private Long f;
    private Long g;
    private String h;
    private Long i;
    private Long j;
    private Boolean k;
    private Double l;
    private String m;

    private aawe a() {
        aawe aawe = (aawe) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawe.a = aaxp;
        }
        Long l = this.b;
        if (l != null) {
            aawe.b = l;
        }
        l = this.c;
        if (l != null) {
            aawe.c = l;
        }
        l = this.d;
        if (l != null) {
            aawe.d = l;
        }
        aaxo aaxo = this.e;
        if (aaxo != null) {
            aawe.e = aaxo;
        }
        l = this.f;
        if (l != null) {
            aawe.f = l;
        }
        l = this.g;
        if (l != null) {
            aawe.g = l;
        }
        String str = this.h;
        if (str != null) {
            aawe.h = str;
        }
        l = this.i;
        if (l != null) {
            aawe.i = l;
        }
        l = this.j;
        if (l != null) {
            aawe.j = l;
        }
        Boolean bool = this.k;
        if (bool != null) {
            aawe.k = bool;
        }
        Double d = this.l;
        if (d != null) {
            aawe.l = d;
        }
        str = this.m;
        if (str != null) {
            aawe.m = str;
        }
        return aawe;
    }

    public final void a(aaxo aaxo) {
        this.e = aaxo;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Boolean bool) {
        this.k = bool;
    }

    public final void a(Double d) {
        this.l = d;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.m = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("contact_found_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("friend_add_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("contact_invite_count", l);
        }
        aaxo aaxo = this.e;
        if (aaxo != null) {
            hashMap.put("verification_type", aaxo.toString());
        }
        l = this.f;
        if (l != null) {
            hashMap.put("recommended_contact_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("recommended_add_count", l);
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("friend_add_list", str);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("max_seen_index_pos", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("contact_book_size", l);
        }
        Boolean bool = this.k;
        if (bool != null) {
            hashMap.put("server_data_ready", bool);
        }
        Double d = this.l;
        if (d != null) {
            hashMap.put("wait_time_sec", d);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final void c(Long l) {
        this.f = l;
    }

    public final void d(Long l) {
        this.g = l;
    }

    public final void e(Long l) {
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aawe) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_CONTACT_FIND_SUCCESS";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaxo aaxo = this.e;
        hashCode = (hashCode + (aaxo != null ? aaxo.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.l;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.m;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
