package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapl */
public final class aapl extends abhr {
    private String a;
    private aaph b;
    private String c;
    private String d;

    private aapl a() {
        aapl aapl = (aapl) super.clone();
        String str = this.a;
        if (str != null) {
            aapl.a = str;
        }
        aaph aaph = this.b;
        if (aaph != null) {
            aapl.b = aaph;
        }
        str = this.c;
        if (str != null) {
            aapl.c = str;
        }
        str = this.d;
        if (str != null) {
            aapl.d = str;
        }
        return aapl;
    }

    public final void a(aaph aaph) {
        this.b = aaph;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        aaph aaph = this.b;
        if (aaph != null) {
            hashMap.put("device_class", aaph.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("exception_type", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("reason", str);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aapl) obj).asDictionary());
    }

    public final String getEventName() {
        return "LENS_HANDLED_EXCEPTION";
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
        aaph aaph = this.b;
        hashCode = (hashCode + (aaph != null ? aaph.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
