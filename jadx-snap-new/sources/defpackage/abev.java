package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abev */
public final class abev extends abfs {
    private String a;
    private String b;
    private Long c;
    private Long d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Long i;
    private zza j;
    private zyz k;

    private abev b() {
        abev abev = (abev) super.clone();
        String str = this.a;
        if (str != null) {
            abev.a = str;
        }
        str = this.b;
        if (str != null) {
            abev.b = str;
        }
        Long l = this.c;
        if (l != null) {
            abev.c = l;
        }
        l = this.d;
        if (l != null) {
            abev.d = l;
        }
        str = this.e;
        if (str != null) {
            abev.e = str;
        }
        str = this.f;
        if (str != null) {
            abev.f = str;
        }
        str = this.g;
        if (str != null) {
            abev.g = str;
        }
        str = this.h;
        if (str != null) {
            abev.h = str;
        }
        l = this.i;
        if (l != null) {
            abev.i = l;
        }
        zza zza = this.j;
        if (zza != null) {
            abev.j = zza;
        }
        zyz zyz = this.k;
        if (zyz != null) {
            abev.k = zyz;
        }
        return abev;
    }

    public final /* synthetic */ abax a() {
        return b();
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void a(zyz zyz) {
        this.k = zyz;
    }

    public final void a(zza zza) {
        this.j = zza;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("adsnap_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("ad_id", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("ad_index_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("ad_index_pos", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("ad_unit_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("ad_request_client_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("adsnap_line_item_id", str);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("exit_level", l);
        }
        zza zza = this.j;
        if (zza != null) {
            hashMap.put("ad_flagged_reason", zza.toString());
        }
        zyz zyz = this.k;
        if (zyz != null) {
            hashMap.put("exit_type", zyz.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final /* synthetic */ abfs c() {
        return b();
    }

    public final void c(String str) {
        this.f = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abev) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_AD_REPORT";
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
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        zza zza = this.j;
        hashCode = (hashCode + (zza != null ? zza.hashCode() : 0)) * 31;
        zyz zyz = this.k;
        if (zyz != null) {
            i = zyz.hashCode();
        }
        return hashCode + i;
    }
}
