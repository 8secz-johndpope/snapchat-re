package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamu */
public final class aamu extends abhw {
    private String a;
    private String b;
    private String c;

    private aamu a() {
        aamu aamu = (aamu) super.clone();
        String str = this.a;
        if (str != null) {
            aamu.a = str;
        }
        str = this.b;
        if (str != null) {
            aamu.b = str;
        }
        str = this.c;
        if (str != null) {
            aamu.c = str;
        }
        return aamu;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("exception_type", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("extra_params", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aamu) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_EXCEPTION";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
