package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaik */
public final class aaik extends abhw {
    private String a;
    private aajp b;

    private aaik a() {
        aaik aaik = (aaik) super.clone();
        String str = this.a;
        if (str != null) {
            aaik.a = str;
        }
        aajp aajp = this.b;
        if (aajp != null) {
            aaik.b = aajp;
        }
        return aaik;
    }

    public final void a(aajp aajp) {
        this.b = aajp;
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
        aajp aajp = this.b;
        if (aajp != null) {
            hashMap.put("source", aajp.toString());
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
        return asDictionary().equals(((aaik) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_EDIT";
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
        aajp aajp = this.b;
        if (aajp != null) {
            i = aajp.hashCode();
        }
        return hashCode + i;
    }
}
