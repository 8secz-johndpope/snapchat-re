package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaen */
public final class aaen extends aadz {
    private aaep a;

    private aaen c() {
        aaen aaen = (aaen) super.clone();
        aaep aaep = this.a;
        if (aaep != null) {
            aaen.a = aaep;
        }
        return aaen;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(aaep aaep) {
        this.a = aaep;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaep aaep = this.a;
        if (aaep != null) {
            hashMap.put("type", aaep.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaen) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ALERT_DISMISS";
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
        aaep aaep = this.a;
        return hashCode + (aaep != null ? aaep.hashCode() : 0);
    }
}
