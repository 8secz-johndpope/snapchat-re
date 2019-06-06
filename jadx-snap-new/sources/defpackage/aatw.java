package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatw */
public final class aatw extends abhw {
    private String a;
    private Double b;
    private aajv c;
    private String d;
    private Double e;
    private String f;

    private aatw b() {
        aatw aatw = (aatw) super.clone();
        String str = this.a;
        if (str != null) {
            aatw.a = str;
        }
        Double d = this.b;
        if (d != null) {
            aatw.b = d;
        }
        aajv aajv = this.c;
        if (aajv != null) {
            aatw.c = aajv;
        }
        str = this.d;
        if (str != null) {
            aatw.d = str;
        }
        d = this.e;
        if (d != null) {
            aatw.e = d;
        }
        str = this.f;
        if (str != null) {
            aatw.f = str;
        }
        return aatw;
    }

    public final Double a() {
        return this.b;
    }

    public final void a(aajv aajv) {
        this.c = aajv;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("page", str);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        aajv aajv = this.c;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("source_page", str);
        }
        d = this.e;
        if (d != null) {
            hashMap.put("app_open_ts", d);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("profile_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aatw) obj).asDictionary());
    }

    public final String getEventName() {
        return "PAGE_PAGE_VIEW";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
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
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aajv aajv = this.c;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
