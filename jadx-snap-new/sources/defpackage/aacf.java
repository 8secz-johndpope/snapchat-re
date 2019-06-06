package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacf */
public final class aacf extends abhw {
    private String a;
    private String b;
    private Long c;
    private aayb d;
    private abbd e;
    private String f;
    private Boolean g;
    private String h;

    private aacf a() {
        aacf aacf = (aacf) super.clone();
        String str = this.a;
        if (str != null) {
            aacf.a = str;
        }
        str = this.b;
        if (str != null) {
            aacf.b = str;
        }
        Long l = this.c;
        if (l != null) {
            aacf.c = l;
        }
        aayb aayb = this.d;
        if (aayb != null) {
            aacf.d = aayb;
        }
        abbd abbd = this.e;
        if (abbd != null) {
            aacf.e = abbd;
        }
        str = this.f;
        if (str != null) {
            aacf.f = str;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aacf.g = bool;
        }
        str = this.h;
        if (str != null) {
            aacf.h = str;
        }
        return aacf;
    }

    public final void a(aayb aayb) {
        this.d = aayb;
    }

    public final void a(abbd abbd) {
        this.e = abbd;
    }

    public final void a(Boolean bool) {
        this.g = bool;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("song_title", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("artist_name", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("latency", l);
        }
        aayb aayb = this.d;
        if (aayb != null) {
            hashMap.put("camera_orientation", aayb.toString());
        }
        abbd abbd = this.e;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("has_geolens", bool);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("genre", str);
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

    public final void d(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacf) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_MUSIC_DETECT";
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
        aayb aayb = this.d;
        hashCode = (hashCode + (aayb != null ? aayb.hashCode() : 0)) * 31;
        abbd abbd = this.e;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
