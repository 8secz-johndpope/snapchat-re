package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfu */
public final class abfu extends abhw {
    private abfx a;
    private Double b;

    private abfu a() {
        abfu abfu = (abfu) super.clone();
        abfx abfx = this.a;
        if (abfx != null) {
            abfu.a = abfx;
        }
        Double d = this.b;
        if (d != null) {
            abfu.b = d;
        }
        return abfu;
    }

    public final void a(abfx abfx) {
        this.a = abfx;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abfx abfx = this.a;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("time_viewed", d);
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
        return asDictionary().equals(((abfu) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_STORY_MANAGEMENT_VIEW";
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
        abfx abfx = this.a;
        int i = 0;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        Double d = this.b;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
