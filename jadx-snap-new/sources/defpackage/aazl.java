package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazl */
public final class aazl extends abhw {
    private aaua a;
    private String b;

    private aazl a() {
        aazl aazl = (aazl) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazl.a = aaua;
        }
        String str = this.b;
        if (str != null) {
            aazl.b = str;
        }
        return aazl;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("bitmoji_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aazl) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_OUTFIT_CANCEL";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
