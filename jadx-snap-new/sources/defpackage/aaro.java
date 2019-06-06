package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaro */
public final class aaro extends abhw {
    private String a;
    private String b;
    private String c;
    private abaw d;
    private aarv e;
    private String f;
    private Long g;
    private String h;
    private Long i;
    private aart j;
    private aaru k;
    private Long l;
    private String m;

    private aaro a() {
        aaro aaro = (aaro) super.clone();
        String str = this.a;
        if (str != null) {
            aaro.a = str;
        }
        str = this.b;
        if (str != null) {
            aaro.b = str;
        }
        str = this.c;
        if (str != null) {
            aaro.c = str;
        }
        abaw abaw = this.d;
        if (abaw != null) {
            aaro.d = abaw;
        }
        aarv aarv = this.e;
        if (aarv != null) {
            aaro.e = aarv;
        }
        str = this.f;
        if (str != null) {
            aaro.f = str;
        }
        Long l = this.g;
        if (l != null) {
            aaro.g = l;
        }
        str = this.h;
        if (str != null) {
            aaro.h = str;
        }
        l = this.i;
        if (l != null) {
            aaro.i = l;
        }
        aart aart = this.j;
        if (aart != null) {
            aaro.j = aart;
        }
        aaru aaru = this.k;
        if (aaru != null) {
            aaro.k = aaru;
        }
        l = this.l;
        if (l != null) {
            aaro.l = l;
        }
        str = this.m;
        if (str != null) {
            aaro.m = str;
        }
        return aaro;
    }

    public final void a(aart aart) {
        this.j = aart;
    }

    public final void a(aaru aaru) {
        this.k = aaru;
    }

    public final void a(aarv aarv) {
        this.e = aarv;
    }

    public final void a(abaw abaw) {
        this.d = abaw;
    }

    public final void a(Long l) {
        this.g = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("fk_send_message_attempt_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("media_orchestration_attempt_id", str);
        }
        abaw abaw = this.d;
        if (abaw != null) {
            hashMap.put("feature_source", abaw.toString());
        }
        aarv aarv = this.e;
        if (aarv != null) {
            hashMap.put("trigger_type", aarv.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("media_size", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("media_resolution_post_transcoding", str);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("upload_quality_level", l);
        }
        aart aart = this.j;
        if (aart != null) {
            hashMap.put("media_orchestration_result", aart.toString());
        }
        aaru aaru = this.k;
        if (aaru != null) {
            hashMap.put("failed_step", aaru.toString());
        }
        l = this.l;
        if (l != null) {
            hashMap.put("total_latency_ms", l);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("step_latencies_ms", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.i = l;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(Long l) {
        this.l = l;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaro) obj).asDictionary());
    }

    public final void f(String str) {
        this.m = str;
    }

    public final String getEventName() {
        return "MDP_MEDIA_ORCHESTRATION";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abaw abaw = this.d;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        aarv aarv = this.e;
        hashCode = (hashCode + (aarv != null ? aarv.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aart aart = this.j;
        hashCode = (hashCode + (aart != null ? aart.hashCode() : 0)) * 31;
        aaru aaru = this.k;
        hashCode = (hashCode + (aaru != null ? aaru.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.m;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
