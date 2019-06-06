package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhy */
public final class abhy extends abhw {
    private String a;
    private String b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private Boolean h;
    private Long i;
    private Long j;
    private Long k;
    private Long l;
    private Boolean m;
    private Boolean n;
    private String o;
    private String p;
    private aars q;

    private abhy a() {
        abhy abhy = (abhy) super.clone();
        String str = this.a;
        if (str != null) {
            abhy.a = str;
        }
        str = this.b;
        if (str != null) {
            abhy.b = str;
        }
        Long l = this.c;
        if (l != null) {
            abhy.c = l;
        }
        l = this.d;
        if (l != null) {
            abhy.d = l;
        }
        l = this.e;
        if (l != null) {
            abhy.e = l;
        }
        l = this.f;
        if (l != null) {
            abhy.f = l;
        }
        l = this.g;
        if (l != null) {
            abhy.g = l;
        }
        Boolean bool = this.h;
        if (bool != null) {
            abhy.h = bool;
        }
        l = this.i;
        if (l != null) {
            abhy.i = l;
        }
        l = this.j;
        if (l != null) {
            abhy.j = l;
        }
        l = this.k;
        if (l != null) {
            abhy.k = l;
        }
        l = this.l;
        if (l != null) {
            abhy.l = l;
        }
        bool = this.m;
        if (bool != null) {
            abhy.m = bool;
        }
        bool = this.n;
        if (bool != null) {
            abhy.n = bool;
        }
        str = this.o;
        if (str != null) {
            abhy.o = str;
        }
        str = this.p;
        if (str != null) {
            abhy.p = str;
        }
        aars aars = this.q;
        if (aars != null) {
            abhy.a(aars.clone());
        }
        return abhy;
    }

    public final void a(aars aars) {
        if (aars == null) {
            this.q = null;
        } else {
            this.q = new aars(aars);
        }
    }

    public final void a(Boolean bool) {
        this.h = bool;
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
            hashMap.put("status", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("task_start_duration_ms", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("mixer_init_duration_ms", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("video_encoder_init_duration_ms", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("audio_encoder_init_duration_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("audio_recorder_init_duration_ms", l);
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("noise_suppressor_enabled", bool);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("task_stop_mixer_duration_ms", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("task_video_validation_duration_ms", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("task_end_duration_ms", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("max_audio_encode_buffer_size", l);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("is_audio_buffer_enabled", bool);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("is_software_recording", bool);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("profile_level", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("bitrate_mode", str);
        }
        aars aars = this.q;
        if (aars != null) {
            hashMap.putAll(aars.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.m = bool;
    }

    public final void b(Long l) {
        this.d = l;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(Boolean bool) {
        this.n = bool;
    }

    public final void c(Long l) {
        this.e = l;
    }

    public final void d(Long l) {
        this.f = l;
    }

    public final void e(Long l) {
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhy) obj).asDictionary());
    }

    public final void f(Long l) {
        this.i = l;
    }

    public final void g(Long l) {
        this.j = l;
    }

    public final String getEventName() {
        return "VIDEO_RECORDING_METRICS";
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

    public final void h(Long l) {
        this.k = l;
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
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aars aars = this.q;
        if (aars != null) {
            i = aars.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Long l) {
        this.l = l;
    }
}
