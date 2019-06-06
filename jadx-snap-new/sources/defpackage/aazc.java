package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazc */
public final class aazc extends abhw {
    private String a;
    private String b;
    private String c;
    private String d;
    private abaw e;
    private String f;
    private aazb g;
    private Long h;
    private Long i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    private aazc a() {
        aazc aazc = (aazc) super.clone();
        String str = this.a;
        if (str != null) {
            aazc.a = str;
        }
        str = this.b;
        if (str != null) {
            aazc.b = str;
        }
        str = this.c;
        if (str != null) {
            aazc.c = str;
        }
        str = this.d;
        if (str != null) {
            aazc.d = str;
        }
        abaw abaw = this.e;
        if (abaw != null) {
            aazc.e = abaw;
        }
        str = this.f;
        if (str != null) {
            aazc.f = str;
        }
        aazb aazb = this.g;
        if (aazb != null) {
            aazc.g = aazb;
        }
        Long l = this.h;
        if (l != null) {
            aazc.h = l;
        }
        l = this.i;
        if (l != null) {
            aazc.i = l;
        }
        str = this.j;
        if (str != null) {
            aazc.j = str;
        }
        str = this.k;
        if (str != null) {
            aazc.k = str;
        }
        str = this.l;
        if (str != null) {
            aazc.l = str;
        }
        str = this.m;
        if (str != null) {
            aazc.m = str;
        }
        str = this.n;
        if (str != null) {
            aazc.n = str;
        }
        return aazc;
    }

    public final void a(abaw abaw) {
        this.e = abaw;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("analytics_version", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("send_to_session_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("send_to_latency_session_id", str);
        }
        abaw abaw = this.e;
        if (abaw != null) {
            hashMap.put("snap_source", abaw.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("start_type", str);
        }
        aazb aazb = this.g;
        if (aazb != null) {
            hashMap.put("failure_type", aazb.toString());
        }
        Long l = this.h;
        if (l != null) {
            hashMap.put("user_first_interaction_millis", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("last_visible_cell_rendered_millis", l);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("splits", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("rendered_sections", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("available_sections", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("seen_sections", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("failed_sections", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(String str) {
        this.d = str;
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
        return asDictionary().equals(((aazc) obj).asDictionary());
    }

    public final void f(String str) {
        this.k = str;
    }

    public final void g(String str) {
        this.l = str;
    }

    public final String getEventName() {
        return "SEND_TO_LATENCY";
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

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abaw abaw = this.e;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aazb aazb = this.g;
        hashCode = (hashCode + (aazb != null ? aazb.hashCode() : 0)) * 31;
        Long l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
