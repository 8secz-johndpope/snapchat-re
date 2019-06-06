package defpackage;

import com.brightcove.player.event.EventType;
import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abax */
public abstract class abax extends abhw {
    private Long a;
    private Long b;
    private Boolean c;
    private String d;
    private aame e;
    private Boolean f;
    private abbd g;
    private Long h;
    private aahb i;
    private Double j;
    private Boolean k;
    private aasc l;
    private Boolean m;
    private Double n;
    private Double o;
    private aamf p;
    private aalw q;
    private String r;
    private Double s;
    private Boolean t;

    /* renamed from: a */
    public abax clone() {
        abax abax = (abax) super.clone();
        Long l = this.a;
        if (l != null) {
            abax.a = l;
        }
        l = this.b;
        if (l != null) {
            abax.a(l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            abax.c = bool;
        }
        String str = this.d;
        if (str != null) {
            abax.d = str;
        }
        aame aame = this.e;
        if (aame != null) {
            abax.e = aame;
        }
        bool = this.f;
        if (bool != null) {
            abax.f = bool;
        }
        abbd abbd = this.g;
        if (abbd != null) {
            abax.a(abbd);
        }
        l = this.h;
        if (l != null) {
            abax.b(l);
        }
        aahb aahb = this.i;
        if (aahb != null) {
            abax.a(aahb);
        }
        Double d = this.j;
        if (d != null) {
            abax.j = d;
        }
        bool = this.k;
        if (bool != null) {
            abax.k = bool;
        }
        aasc aasc = this.l;
        if (aasc != null) {
            abax.l = aasc;
        }
        bool = this.m;
        if (bool != null) {
            abax.m = bool;
        }
        d = this.n;
        if (d != null) {
            abax.b(d);
        }
        d = this.o;
        if (d != null) {
            abax.o = d;
        }
        aamf aamf = this.p;
        if (aamf != null) {
            abax.p = aamf;
        }
        aalw aalw = this.q;
        if (aalw != null) {
            abax.q = aalw;
        }
        str = this.r;
        if (str != null) {
            abax.r = str;
        }
        d = this.s;
        if (d != null) {
            abax.s = d;
        }
        bool = this.t;
        if (bool != null) {
            abax.t = bool;
        }
        return abax;
    }

    public void a(aahb aahb) {
        this.i = aahb;
    }

    public final void a(aasc aasc) {
        this.l = aasc;
    }

    public void a(abbd abbd) {
        this.g = abbd;
    }

    public final void a(Boolean bool) {
        this.k = bool;
    }

    public final void a(Double d) {
        this.j = d;
    }

    public void a(Long l) {
        this.b = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put(EventType.CAPTION, l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("camera", l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("drawing", bool);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put(ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER, str);
        }
        aame aame = this.e;
        if (aame != null) {
            hashMap.put("filter_type", aame.toString());
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("flash", bool);
        }
        abbd abbd = this.g;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        l = this.h;
        if (l != null) {
            hashMap.put("view_location", l);
        }
        aahb aahb = this.i;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        Double d = this.j;
        if (d != null) {
            hashMap.put("snap_time", d);
        }
        bool = this.k;
        if (bool != null) {
            hashMap.put("snap_time_is_loop", bool);
        }
        aasc aasc = this.l;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("time_viewed", d);
        }
        d = this.o;
        if (d != null) {
            hashMap.put("video_view_time_sec", d);
        }
        aamf aamf = this.p;
        if (aamf != null) {
            hashMap.put("filter_visual", aamf.toString());
        }
        aalw aalw = this.q;
        if (aalw != null) {
            hashMap.put("filter_info", aalw.toString());
        }
        str = this.r;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        d = this.s;
        if (d != null) {
            hashMap.put("ack_time_sec", d);
        }
        bool = this.t;
        if (bool != null) {
            hashMap.put("with_attachment", bool);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public void b(Double d) {
        this.n = d;
    }

    public void b(Long l) {
        this.h = l;
    }

    public final void c(Double d) {
        this.o = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abax) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aame aame = this.e;
        hashCode = (hashCode + (aame != null ? aame.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abbd abbd = this.g;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.i;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        Double d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.l;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aamf aamf = this.p;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        aalw aalw = this.q;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.s;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.t;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
