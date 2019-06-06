package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaap */
public final class aaap extends abhw {
    private aaju a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private aaba h;
    private aaaq i;
    private aaao j;

    private aaap a() {
        aaap aaap = (aaap) super.clone();
        aaju aaju = this.a;
        if (aaju != null) {
            aaap.a = aaju;
        }
        String str = this.b;
        if (str != null) {
            aaap.b = str;
        }
        str = this.c;
        if (str != null) {
            aaap.c = str;
        }
        str = this.d;
        if (str != null) {
            aaap.d = str;
        }
        str = this.e;
        if (str != null) {
            aaap.e = str;
        }
        str = this.f;
        if (str != null) {
            aaap.f = str;
        }
        str = this.g;
        if (str != null) {
            aaap.g = str;
        }
        aaba aaba = this.h;
        if (aaba != null) {
            aaap.a(aaba.clone());
        }
        aaaq aaaq = this.i;
        if (aaaq != null) {
            aaap.a(aaaq.clone());
        }
        aaao aaao = this.j;
        if (aaao != null) {
            aaap.a(aaao.clone());
        }
        return aaap;
    }

    public final void a(aaao aaao) {
        if (aaao == null) {
            this.j = null;
        } else {
            this.j = new aaao(aaao);
        }
    }

    public final void a(aaaq aaaq) {
        if (aaaq == null) {
            this.i = null;
        } else {
            this.i = new aaaq(aaaq);
        }
    }

    public final void a(aaba aaba) {
        if (aaba == null) {
            this.h = null;
        } else {
            this.h = new aaba(aaba);
        }
    }

    public final void a(aaju aaju) {
        this.a = aaju;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaju aaju = this.a;
        if (aaju != null) {
            hashMap.put("severity", aaju.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("exception_name", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("exception_message", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("stack_trace", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("callsite", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("trigger_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("feature", str);
        }
        aaba aaba = this.h;
        if (aaba != null) {
            hashMap.putAll(aaba.a());
        }
        aaaq aaaq = this.i;
        if (aaaq != null) {
            hashMap.putAll(aaaq.a());
        }
        aaao aaao = this.j;
        if (aaao != null) {
            hashMap.putAll(aaao.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.e = str;
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
        return asDictionary().equals(((aaap) obj).asDictionary());
    }

    public final void f(String str) {
        this.g = str;
    }

    public final String getEventName() {
        return "APP_EXCEPTION_REPORT";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aaju aaju = this.a;
        int i = 0;
        hashCode = (hashCode + (aaju != null ? aaju.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaba aaba = this.h;
        hashCode = (hashCode + (aaba != null ? aaba.hashCode() : 0)) * 31;
        aaaq aaaq = this.i;
        hashCode = (hashCode + (aaaq != null ? aaaq.hashCode() : 0)) * 31;
        aaao aaao = this.j;
        if (aaao != null) {
            i = aaao.hashCode();
        }
        return hashCode + i;
    }
}
