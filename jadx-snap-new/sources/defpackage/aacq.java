package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacq */
public final class aacq extends abhw {
    private String a;
    private String b;
    private String c;

    private aacq a() {
        aacq aacq = (aacq) super.clone();
        String str = this.a;
        if (str != null) {
            aacq.a = str;
        }
        str = this.b;
        if (str != null) {
            aacq.b = str;
        }
        str = this.c;
        if (str != null) {
            aacq.c = str;
        }
        return aacq;
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
        str = this.b;
        if (str != null) {
            hashMap.put("step_name", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("step_description", str);
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
        return asDictionary().equals(((aacq) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_SNAP_CREATE_STEP";
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
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
