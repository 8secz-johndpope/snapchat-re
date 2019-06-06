package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aayw */
public final class aayw extends abhw {
    private String a;
    private String b;
    private String c;
    private String d;
    private Long e;
    private String f;
    private abaw g;
    private aayx h;
    private String i;
    private String j;
    private aayz k;
    private aaza l;
    private Long m;
    private String n;
    private Long o;
    private Long p;
    private Long q;
    private Long r;
    private String s;
    private String t;
    private String u;
    private Long v;
    private Long w;
    private Long x;
    private Long y;
    private Long z;

    private aayw a() {
        aayw aayw = (aayw) super.clone();
        String str = this.a;
        if (str != null) {
            aayw.a = str;
        }
        str = this.b;
        if (str != null) {
            aayw.b = str;
        }
        str = this.c;
        if (str != null) {
            aayw.c = str;
        }
        str = this.d;
        if (str != null) {
            aayw.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aayw.e = l;
        }
        str = this.f;
        if (str != null) {
            aayw.f = str;
        }
        abaw abaw = this.g;
        if (abaw != null) {
            aayw.g = abaw;
        }
        aayx aayx = this.h;
        if (aayx != null) {
            aayw.h = aayx;
        }
        str = this.i;
        if (str != null) {
            aayw.i = str;
        }
        str = this.j;
        if (str != null) {
            aayw.j = str;
        }
        aayz aayz = this.k;
        if (aayz != null) {
            aayw.k = aayz;
        }
        aaza aaza = this.l;
        if (aaza != null) {
            aayw.l = aaza;
        }
        l = this.m;
        if (l != null) {
            aayw.m = l;
        }
        str = this.n;
        if (str != null) {
            aayw.n = str;
        }
        l = this.o;
        if (l != null) {
            aayw.o = l;
        }
        l = this.p;
        if (l != null) {
            aayw.p = l;
        }
        l = this.q;
        if (l != null) {
            aayw.q = l;
        }
        l = this.r;
        if (l != null) {
            aayw.r = l;
        }
        str = this.s;
        if (str != null) {
            aayw.s = str;
        }
        str = this.t;
        if (str != null) {
            aayw.t = str;
        }
        str = this.u;
        if (str != null) {
            aayw.u = str;
        }
        l = this.v;
        if (l != null) {
            aayw.v = l;
        }
        l = this.w;
        if (l != null) {
            aayw.w = l;
        }
        l = this.x;
        if (l != null) {
            aayw.x = l;
        }
        l = this.y;
        if (l != null) {
            aayw.y = l;
        }
        l = this.z;
        if (l != null) {
            aayw.z = l;
        }
        return aayw;
    }

    public final void a(aayx aayx) {
        this.h = aayx;
    }

    public final void a(aayz aayz) {
        this.k = aayz;
    }

    public final void a(aaza aaza) {
        this.l = aaza;
    }

    public final void a(abaw abaw) {
        this.g = abaw;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("client_message_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("send_message_attempt_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("fk_capture_session_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("user_action_id", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("recipient_count", l);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("recipient_list", str);
        }
        abaw abaw = this.g;
        if (abaw != null) {
            hashMap.put("feature_source", abaw.toString());
        }
        aayx aayx = this.h;
        if (aayx != null) {
            hashMap.put("send_message_attempt_type", aayx.toString());
        }
        str = this.i;
        if (str != null) {
            hashMap.put("message_type", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        aayz aayz = this.k;
        if (aayz != null) {
            hashMap.put("send_message_status", aayz.toString());
        }
        aaza aaza = this.l;
        if (aaza != null) {
            hashMap.put("failed_step", aaza.toString());
        }
        l = this.m;
        if (l != null) {
            hashMap.put("success_recipient_count", l);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("failed_recipient_list", str);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("user_action_timestamp", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("send_message_start_timestamp", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("send_message_end_timestamp", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("total_latency", l);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("step_latencies_ms", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("message_id", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("capture_id", str);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("auto_retry_count", l);
        }
        l = this.w;
        if (l != null) {
            hashMap.put("user_retry_count", l);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("total_latency_ms", l);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("click_send_until_sent_latency", l);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("click_send_until_send_start_latency", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.m = l;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(Long l) {
        this.o = l;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(Long l) {
        this.p = l;
    }

    public final void d(String str) {
        this.d = str;
    }

    public final void e(Long l) {
        this.q = l;
    }

    public final void e(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aayw) obj).asDictionary());
    }

    public final void f(Long l) {
        this.r = l;
    }

    public final void f(String str) {
        this.i = str;
    }

    public final void g(String str) {
        this.j = str;
    }

    public final String getEventName() {
        return "SEND_MESSAGE";
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
        this.n = str;
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
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abaw abaw = this.g;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        aayx aayx = this.h;
        hashCode = (hashCode + (aayx != null ? aayx.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aayz aayz = this.k;
        hashCode = (hashCode + (aayz != null ? aayz.hashCode() : 0)) * 31;
        aaza aaza = this.l;
        hashCode = (hashCode + (aaza != null ? aaza.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.w;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.z;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final void i(String str) {
        this.s = str;
    }
}
