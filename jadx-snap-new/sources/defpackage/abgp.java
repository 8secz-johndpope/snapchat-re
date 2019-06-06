package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgp */
public final class abgp implements Cloneable {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;
    private Long r;
    private Long s;
    private Long t;
    private Long u;
    private Long v;
    private Long w;
    private Long x;

    public abgp(abgp abgp) {
        this.a = abgp.a;
        this.b = abgp.b;
        this.c = abgp.c;
        this.d = abgp.d;
        this.e = abgp.e;
        this.f = abgp.f;
        this.g = abgp.g;
        this.h = abgp.h;
        this.i = abgp.i;
        this.j = abgp.j;
        this.k = abgp.k;
        this.l = abgp.l;
        this.m = abgp.m;
        this.n = abgp.n;
        this.o = abgp.o;
        this.p = abgp.p;
        this.q = abgp.q;
        this.r = abgp.r;
        this.s = abgp.s;
        this.t = abgp.t;
        this.u = abgp.u;
        this.v = abgp.v;
        this.w = abgp.w;
        this.x = abgp.x;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("setup_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("setup_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("mixer_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("mixer_ms", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("video_extractor_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("video_extractor_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("audio_extractor_count", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("audio_extractor_ms", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("video_decoder_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("video_decoder_ms", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("audio_decoder_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("audio_decoder_ms", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("video_encoder_count", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("video_encoder_ms", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("audio_encoder_count", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("audio_encoder_ms", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("video_renderer_count", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("video_renderer_ms", l);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("video_buffered_renderer_count", l);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("video_buffered_renderer_ms", l);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("video_decoder_input_buffer_num", l);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("video_decoder_output_buffer_num", l);
        }
        l = this.w;
        if (l != null) {
            hashMap.put("video_encoder_input_buffer_num", l);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("video_encoder_output_buffer_num", l);
        }
        return hashMap;
    }

    public final void a(Long l) {
        this.a = l;
    }

    /* renamed from: b */
    public final abgp clone() {
        abgp abgp = (abgp) super.clone();
        Long l = this.a;
        if (l != null) {
            abgp.a = l;
        }
        l = this.b;
        if (l != null) {
            abgp.b = l;
        }
        l = this.c;
        if (l != null) {
            abgp.c = l;
        }
        l = this.d;
        if (l != null) {
            abgp.d = l;
        }
        l = this.e;
        if (l != null) {
            abgp.e = l;
        }
        l = this.f;
        if (l != null) {
            abgp.f = l;
        }
        l = this.g;
        if (l != null) {
            abgp.g = l;
        }
        l = this.h;
        if (l != null) {
            abgp.h = l;
        }
        l = this.i;
        if (l != null) {
            abgp.i = l;
        }
        l = this.j;
        if (l != null) {
            abgp.j = l;
        }
        l = this.k;
        if (l != null) {
            abgp.k = l;
        }
        l = this.l;
        if (l != null) {
            abgp.l = l;
        }
        l = this.m;
        if (l != null) {
            abgp.m = l;
        }
        l = this.n;
        if (l != null) {
            abgp.n = l;
        }
        l = this.o;
        if (l != null) {
            abgp.o = l;
        }
        l = this.p;
        if (l != null) {
            abgp.p = l;
        }
        l = this.q;
        if (l != null) {
            abgp.q = l;
        }
        l = this.r;
        if (l != null) {
            abgp.r = l;
        }
        l = this.s;
        if (l != null) {
            abgp.s = l;
        }
        l = this.t;
        if (l != null) {
            abgp.t = l;
        }
        l = this.u;
        if (l != null) {
            abgp.u = l;
        }
        l = this.v;
        if (l != null) {
            abgp.v = l;
        }
        l = this.w;
        if (l != null) {
            abgp.w = l;
        }
        l = this.x;
        if (l != null) {
            abgp.x = l;
        }
        return abgp;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final void d(Long l) {
        this.d = l;
    }

    public final void e(Long l) {
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((abgp) obj).a());
    }

    public final void f(Long l) {
        this.f = l;
    }

    public final void g(Long l) {
        this.g = l;
    }

    public final void h(Long l) {
        this.h = l;
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Long l2 = this.b;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.c;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.d;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.e;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.f;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.g;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.h;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.i;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.j;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.k;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.l;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.m;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.n;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.o;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.p;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.q;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.r;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.s;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.t;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.u;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.v;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.w;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.x;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Long l) {
        this.i = l;
    }

    public final void j(Long l) {
        this.j = l;
    }

    public final void k(Long l) {
        this.k = l;
    }

    public final void l(Long l) {
        this.l = l;
    }

    public final void m(Long l) {
        this.m = l;
    }

    public final void n(Long l) {
        this.n = l;
    }

    public final void o(Long l) {
        this.o = l;
    }

    public final void p(Long l) {
        this.p = l;
    }

    public final void q(Long l) {
        this.q = l;
    }

    public final void r(Long l) {
        this.r = l;
    }

    public final void s(Long l) {
        this.s = l;
    }

    public final void t(Long l) {
        this.t = l;
    }

    public final void u(Long l) {
        this.u = l;
    }

    public final void v(Long l) {
        this.x = l;
    }
}
