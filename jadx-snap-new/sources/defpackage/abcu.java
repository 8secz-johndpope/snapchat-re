package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abcu */
public final class abcu extends abct {
    private abcv a;

    private abcu b() {
        abcu abcu = (abcu) super.clone();
        abcv abcv = this.a;
        if (abcv != null) {
            abcu.a = abcv;
        }
        return abcu;
    }

    public final /* synthetic */ abct a() {
        return b();
    }

    public final void a(abcv abcv) {
        this.a = abcv;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abcv abcv = this.a;
        if (abcv != null) {
            hashMap.put("onboarding_exit_source", abcv.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abcu) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_ONBOARDING_EXIT";
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
        abcv abcv = this.a;
        return hashCode + (abcv != null ? abcv.hashCode() : 0);
    }
}
