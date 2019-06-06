package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aata */
public final class aata extends aasr {
    private Long A;
    private Long B;
    private Long C;
    private Long D;
    private String d;
    private Long e;
    private aasv f;
    private aasv g;
    private Boolean h;
    private Long i;
    private Long j;
    private aagx k;
    private aagx l;
    private String m;
    private String n;
    private Long o;
    private Long p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private Boolean v;
    private aatb w;
    private Long x;
    private String y;
    private Long z;

    private aata b() {
        aata aata = (aata) super.clone();
        String str = this.d;
        if (str != null) {
            aata.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aata.e = l;
        }
        aasv aasv = this.f;
        if (aasv != null) {
            aata.f = aasv;
        }
        aasv = this.g;
        if (aasv != null) {
            aata.g = aasv;
        }
        Boolean bool = this.h;
        if (bool != null) {
            aata.h = bool;
        }
        l = this.i;
        if (l != null) {
            aata.i = l;
        }
        l = this.j;
        if (l != null) {
            aata.j = l;
        }
        aagx aagx = this.k;
        if (aagx != null) {
            aata.k = aagx;
        }
        aagx = this.l;
        if (aagx != null) {
            aata.l = aagx;
        }
        str = this.m;
        if (str != null) {
            aata.m = str;
        }
        str = this.n;
        if (str != null) {
            aata.n = str;
        }
        l = this.o;
        if (l != null) {
            aata.o = l;
        }
        l = this.p;
        if (l != null) {
            aata.p = l;
        }
        str = this.q;
        if (str != null) {
            aata.q = str;
        }
        str = this.r;
        if (str != null) {
            aata.r = str;
        }
        str = this.s;
        if (str != null) {
            aata.s = str;
        }
        str = this.t;
        if (str != null) {
            aata.t = str;
        }
        str = this.u;
        if (str != null) {
            aata.u = str;
        }
        bool = this.v;
        if (bool != null) {
            aata.v = bool;
        }
        aatb aatb = this.w;
        if (aatb != null) {
            aata.w = aatb;
        }
        l = this.x;
        if (l != null) {
            aata.x = l;
        }
        str = this.y;
        if (str != null) {
            aata.y = str;
        }
        l = this.z;
        if (l != null) {
            aata.z = l;
        }
        l = this.A;
        if (l != null) {
            aata.A = l;
        }
        l = this.B;
        if (l != null) {
            aata.B = l;
        }
        l = this.C;
        if (l != null) {
            aata.C = l;
        }
        l = this.D;
        if (l != null) {
            aata.D = l;
        }
        return aata;
    }

    public final /* synthetic */ aasr a() {
        return b();
    }

    public final void a(aasv aasv) {
        this.f = aasv;
    }

    public final void a(aatb aatb) {
        this.w = aatb;
    }

    public final void a(Boolean bool) {
        this.v = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.d;
        if (str != null) {
            hashMap.put("app_start_type", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("time_since_app_start", l);
        }
        aasv aasv = this.f;
        if (aasv != null) {
            hashMap.put("reachability_start", aasv.toString());
        }
        aasv = this.g;
        if (aasv != null) {
            hashMap.put("reachability_end", aasv.toString());
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("reachability_has_changed", bool);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("bandwidth_estimation_start", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("bandwidth_estimation_end", l);
        }
        aagx aagx = this.k;
        if (aagx != null) {
            hashMap.put("bandwidth_class_start", aagx.toString());
        }
        aagx = this.l;
        if (aagx != null) {
            hashMap.put("bandwidth_class_end", aagx.toString());
        }
        str = this.m;
        if (str != null) {
            hashMap.put("bandwidth_range_class_start", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("bandwidth_range_class_end", str);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("rtt_estimation_start", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("rtt_estimation_end", l);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("carrier_name", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("connection_type", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("request_u_r_i", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("user_context", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("task_context", str);
        }
        bool = this.v;
        if (bool != null) {
            hashMap.put("task_success", bool);
        }
        aatb aatb = this.w;
        if (aatb != null) {
            hashMap.put("task_error_category", aatb.toString());
        }
        l = this.x;
        if (l != null) {
            hashMap.put("task_error_code", l);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("task_error_msg", str);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("task_latency", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("task_network_latency", l);
        }
        l = this.B;
        if (l != null) {
            hashMap.put("task_queuing_latency", l);
        }
        l = this.C;
        if (l != null) {
            hashMap.put("task_user_blocking_network_latency", l);
        }
        l = this.D;
        if (l != null) {
            hashMap.put("task_user_blocking_queuing_latency", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(aasv aasv) {
        this.g = aasv;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void c(Long l) {
        this.i = l;
    }

    public final void d(Long l) {
        this.j = l;
    }

    public final void e(Long l) {
        this.x = l;
    }

    public final void e(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aata) obj).asDictionary());
    }

    public final void f(Long l) {
        this.z = l;
    }

    public final void f(String str) {
        this.m = str;
    }

    public final void g(Long l) {
        this.A = l;
    }

    public final void g(String str) {
        this.n = str;
    }

    public final String getEventName() {
        return "NETWORK_TASK";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final void h(Long l) {
        this.B = l;
    }

    public final void h(String str) {
        this.q = str;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.d;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aasv aasv = this.f;
        hashCode = (hashCode + (aasv != null ? aasv.hashCode() : 0)) * 31;
        aasv = this.g;
        hashCode = (hashCode + (aasv != null ? aasv.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aagx aagx = this.k;
        hashCode = (hashCode + (aagx != null ? aagx.hashCode() : 0)) * 31;
        aagx = this.l;
        hashCode = (hashCode + (aagx != null ? aagx.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aatb aatb = this.w;
        hashCode = (hashCode + (aatb != null ? aatb.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.B;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.C;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.D;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Long l) {
        this.C = l;
    }

    public final void i(String str) {
        this.r = str;
    }

    public final void j(Long l) {
        this.D = l;
    }

    public final void j(String str) {
        this.s = str;
    }

    public final void k(String str) {
        this.u = str;
    }

    public final void l(String str) {
        this.y = str;
    }
}
