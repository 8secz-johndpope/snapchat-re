package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaih */
public final class aaih extends abhw {
    private String a;
    private aasc b;
    private aaig c;
    private String d;
    private String e;
    private aaif f;
    private String g;
    private Boolean h;
    private aasa i;

    private aaih a() {
        aaih aaih = (aaih) super.clone();
        String str = this.a;
        if (str != null) {
            aaih.a = str;
        }
        aasc aasc = this.b;
        if (aasc != null) {
            aaih.b = aasc;
        }
        aaig aaig = this.c;
        if (aaig != null) {
            aaih.c = aaig;
        }
        str = this.d;
        if (str != null) {
            aaih.d = str;
        }
        str = this.e;
        if (str != null) {
            aaih.e = str;
        }
        aaif aaif = this.f;
        if (aaif != null) {
            aaih.f = aaif;
        }
        str = this.g;
        if (str != null) {
            aaih.g = str;
        }
        Boolean bool = this.h;
        if (bool != null) {
            aaih.h = bool;
        }
        aasa aasa = this.i;
        if (aasa != null) {
            aaih.i = aasa;
        }
        return aaih;
    }

    public final void a(aaif aaif) {
        this.f = aaif;
    }

    public final void a(aaig aaig) {
        this.c = aaig;
    }

    public final void a(aasa aasa) {
        this.i = aasa;
    }

    public final void a(aasc aasc) {
        this.b = aasc;
    }

    public final void a(Boolean bool) {
        this.h = bool;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        aasc aasc = this.b;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        aaig aaig = this.c;
        if (aaig != null) {
            hashMap.put("action_type", aaig.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("page", str);
        }
        aaif aaif = this.f;
        if (aaif != null) {
            hashMap.put("button_name", aaif.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("stack_trace", str);
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("is_early_init_recorder", bool);
        }
        aasa aasa = this.i;
        if (aasa != null) {
            hashMap.put("media_recorder_type", aasa.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaih) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_CAPTURE_LOSS";
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
        aasc aasc = this.b;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        aaig aaig = this.c;
        hashCode = (hashCode + (aaig != null ? aaig.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaif aaif = this.f;
        hashCode = (hashCode + (aaif != null ? aaif.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasa aasa = this.i;
        if (aasa != null) {
            i = aasa.hashCode();
        }
        return hashCode + i;
    }
}
