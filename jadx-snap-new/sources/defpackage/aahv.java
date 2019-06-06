package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahv */
public final class aahv extends abhw {
    private Long a;
    private aahw b;

    private aahv a() {
        aahv aahv = (aahv) super.clone();
        Long l = this.a;
        if (l != null) {
            aahv.a = l;
        }
        aahw aahw = this.b;
        if (aahw != null) {
            aahv.b = aahw;
        }
        return aahv;
    }

    public final void a(aahw aahw) {
        this.b = aahw;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("data_saver_enable_duration_ms", l);
        }
        aahw aahw = this.b;
        if (aahw != null) {
            hashMap.put("data_saver_enable_reason", aahw.toString());
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
        return asDictionary().equals(((aahv) obj).asDictionary());
    }

    public final String getEventName() {
        return "DATA_SAVER_ENABLE_EVENT";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahw aahw = this.b;
        if (aahw != null) {
            i = aahw.hashCode();
        }
        return hashCode + i;
    }
}
