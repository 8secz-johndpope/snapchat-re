package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacu */
public final class aacu extends aacv {
    private Double A;
    private String B;
    private Boolean C;
    private aahr D;
    private aayv E;
    private abgp F;
    private String a;
    private Long b;
    private String c;
    private aaxw d;
    private Double e;
    private Long f;
    private String g;
    private String h;
    private String i;
    private String j;
    private abgq k;
    private Double l;
    private Boolean m;
    private String n;
    private aabc o;
    private String p;
    private String q;
    private String r;
    private Long s;
    private Long t;
    private String u;
    private String v;
    private String w;
    private String x;
    private Boolean y;
    private Double z;

    private aacu b() {
        aacu aacu = (aacu) super.clone();
        String str = this.a;
        if (str != null) {
            aacu.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aacu.b = l;
        }
        str = this.c;
        if (str != null) {
            aacu.c = str;
        }
        aaxw aaxw = this.d;
        if (aaxw != null) {
            aacu.d = aaxw;
        }
        Double d = this.e;
        if (d != null) {
            aacu.e = d;
        }
        l = this.f;
        if (l != null) {
            aacu.f = l;
        }
        str = this.g;
        if (str != null) {
            aacu.g = str;
        }
        str = this.h;
        if (str != null) {
            aacu.h = str;
        }
        str = this.i;
        if (str != null) {
            aacu.i = str;
        }
        str = this.j;
        if (str != null) {
            aacu.j = str;
        }
        abgq abgq = this.k;
        if (abgq != null) {
            aacu.k = abgq;
        }
        d = this.l;
        if (d != null) {
            aacu.l = d;
        }
        Boolean bool = this.m;
        if (bool != null) {
            aacu.m = bool;
        }
        str = this.n;
        if (str != null) {
            aacu.n = str;
        }
        aabc aabc = this.o;
        if (aabc != null) {
            aacu.o = aabc;
        }
        str = this.p;
        if (str != null) {
            aacu.p = str;
        }
        str = this.q;
        if (str != null) {
            aacu.q = str;
        }
        str = this.r;
        if (str != null) {
            aacu.r = str;
        }
        l = this.s;
        if (l != null) {
            aacu.s = l;
        }
        l = this.t;
        if (l != null) {
            aacu.t = l;
        }
        str = this.u;
        if (str != null) {
            aacu.u = str;
        }
        str = this.v;
        if (str != null) {
            aacu.v = str;
        }
        str = this.w;
        if (str != null) {
            aacu.w = str;
        }
        str = this.x;
        if (str != null) {
            aacu.x = str;
        }
        bool = this.y;
        if (bool != null) {
            aacu.y = bool;
        }
        d = this.z;
        if (d != null) {
            aacu.z = d;
        }
        d = this.A;
        if (d != null) {
            aacu.A = d;
        }
        str = this.B;
        if (str != null) {
            aacu.B = str;
        }
        bool = this.C;
        if (bool != null) {
            aacu.C = bool;
        }
        aahr aahr = this.D;
        if (aahr != null) {
            aacu.a(aahr.clone());
        }
        aayv aayv = this.E;
        if (aayv != null) {
            aacu.a(aayv.clone());
        }
        abgp abgp = this.F;
        if (abgp != null) {
            aacu.a(abgp.clone());
        }
        return aacu;
    }

    public final /* synthetic */ aacv a() {
        return b();
    }

    public final void a(aabc aabc) {
        this.o = aabc;
    }

    public final void a(aahr aahr) {
        if (aahr == null) {
            this.D = null;
        } else {
            this.D = new aahr(aahr);
        }
    }

    public final void a(aaxw aaxw) {
        this.d = aaxw;
    }

    public final void a(aayv aayv) {
        if (aayv == null) {
            this.E = null;
        } else {
            this.E = new aayv(aayv);
        }
    }

    public final void a(abgp abgp) {
        if (abgp == null) {
            this.F = null;
        } else {
            this.F = new abgp(abgp);
        }
    }

    public final void a(abgq abgq) {
        this.k = abgq;
    }

    public final void a(Boolean bool) {
        this.m = bool;
    }

    public final void a(Double d) {
        this.l = d;
    }

    public final void a(Long l) {
        this.f = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("transcoding_task_id", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("gaussian_blur_level", l);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("camera", str);
        }
        aaxw aaxw = this.d;
        if (aaxw != null) {
            hashMap.put("retry_context", aaxw.toString());
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("quality_score", d);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("retry_count", l);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("transcoding_library_version", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("transcoding_tweaks", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("analytics_version", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("splits", str);
        }
        abgq abgq = this.k;
        if (abgq != null) {
            hashMap.put("process_type", abgq.toString());
        }
        d = this.l;
        if (d != null) {
            hashMap.put("transcoding_speed", d);
        }
        Boolean bool = this.m;
        if (bool != null) {
            hashMap.put("with_software_decoder", bool);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("lease_history", str);
        }
        aabc aabc = this.o;
        if (aabc != null) {
            hashMap.put("app_state", aabc.toString());
        }
        str = this.p;
        if (str != null) {
            hashMap.put("video_processing_metric_id", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("fk_media_orchestration_attempt_id", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("metric_type", str);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("start_time", l);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("end_time", l);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("end_status", str);
        }
        str = this.v;
        if (str != null) {
            hashMap.put("key_event_times", str);
        }
        str = this.w;
        if (str != null) {
            hashMap.put("transcoding_metric_id", str);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("transcoding_type", str);
        }
        bool = this.y;
        if (bool != null) {
            hashMap.put("codec_leasing_engine_enabled", bool);
        }
        d = this.z;
        if (d != null) {
            hashMap.put("expected_frame_rate", d);
        }
        d = this.A;
        if (d != null) {
            hashMap.put("expected_bitrate", d);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("transcoding_task_execution_metric_id", str);
        }
        bool = this.C;
        if (bool != null) {
            hashMap.put("software_encoder_enabled", bool);
        }
        aahr aahr = this.D;
        if (aahr != null) {
            hashMap.putAll(aahr.a());
        }
        aayv aayv = this.E;
        if (aayv != null) {
            hashMap.putAll(aayv.a());
        }
        abgp abgp = this.F;
        if (abgp != null) {
            hashMap.putAll(abgp.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.C = bool;
    }

    public final void b(Long l) {
        this.s = l;
    }

    public final void b(String str) {
        this.g = str;
    }

    public final void c(Long l) {
        this.t = l;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final void d(String str) {
        this.i = str;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacu) obj).asDictionary());
    }

    public final void f(String str) {
        this.p = str;
    }

    public final void g(String str) {
        this.q = str;
    }

    public final String getEventName() {
        return "CAMERA_TRANSCODING";
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

    public final void h(String str) {
        this.r = str;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaxw aaxw = this.d;
        hashCode = (hashCode + (aaxw != null ? aaxw.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgq abgq = this.k;
        hashCode = (hashCode + (abgq != null ? abgq.hashCode() : 0)) * 31;
        d = this.l;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabc aabc = this.o;
        hashCode = (hashCode + (aabc != null ? aabc.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.z;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.A;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.C;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aahr aahr = this.D;
        hashCode = (hashCode + (aahr != null ? aahr.hashCode() : 0)) * 31;
        aayv aayv = this.E;
        hashCode = (hashCode + (aayv != null ? aayv.hashCode() : 0)) * 31;
        abgp abgp = this.F;
        if (abgp != null) {
            i = abgp.hashCode();
        }
        return hashCode + i;
    }

    public final void i(String str) {
        this.u = str;
    }

    public final void j(String str) {
        this.v = str;
    }

    public final void k(String str) {
        this.w = str;
    }

    public final void l(String str) {
        this.x = str;
    }

    public final void m(String str) {
        this.B = str;
    }
}
