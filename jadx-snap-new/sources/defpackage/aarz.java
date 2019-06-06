package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aarz */
public final class aarz extends aarw {
    private Double a;
    private Double b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private String f;
    private Boolean g;
    private Boolean h;
    private Long i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;

    private aarz b() {
        aarz aarz = (aarz) super.clone();
        Double d = this.a;
        if (d != null) {
            aarz.a = d;
        }
        d = this.b;
        if (d != null) {
            aarz.b = d;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aarz.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aarz.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aarz.e = bool;
        }
        String str = this.f;
        if (str != null) {
            aarz.f = str;
        }
        bool = this.g;
        if (bool != null) {
            aarz.g = bool;
        }
        bool = this.h;
        if (bool != null) {
            aarz.h = bool;
        }
        Long l = this.i;
        if (l != null) {
            aarz.i = l;
        }
        l = this.j;
        if (l != null) {
            aarz.j = l;
        }
        l = this.k;
        if (l != null) {
            aarz.k = l;
        }
        l = this.l;
        if (l != null) {
            aarz.l = l;
        }
        l = this.m;
        if (l != null) {
            aarz.m = l;
        }
        return aarz;
    }

    public final /* synthetic */ aarw a() {
        return b();
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("frame_rate", d);
        }
        d = this.b;
        if (d != null) {
            hashMap.put("playback_rate", d);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("has_video", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("has_audio", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("has_audio_processing_pass", bool);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("rewind_video_capabilities", str);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("is_multi_snap", bool);
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("is_setup_successful", bool);
        }
        Long l = this.i;
        if (l != null) {
            hashMap.put("gl_context_setup_delay_ms", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("video_setup_delay_ms", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("audio_setup_delay_ms", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("player_setup_delay_ms", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("setup_to_first_frame_delay_ms", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.d = bool;
    }

    public final void b(Double d) {
        this.b = d;
    }

    public final void b(Long l) {
        this.i = l;
    }

    public final void c(Boolean bool) {
        this.e = bool;
    }

    public final void c(Long l) {
        this.j = l;
    }

    public final void d(Boolean bool) {
        this.g = bool;
    }

    public final void d(Long l) {
        this.k = l;
    }

    public final void e(Boolean bool) {
        this.h = bool;
    }

    public final void e(Long l) {
        this.l = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aarz) obj).asDictionary());
    }

    public final void f(Long l) {
        this.m = l;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final String getEventName() {
        return "MEDIA_PLAYER_SETUP_EVENT";
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
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
