package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaeo */
public final class aaeo extends aadz {
    private aaep a;

    private aaeo c() {
        aaeo aaeo = (aaeo) super.clone();
        aaep aaep = this.a;
        if (aaep != null) {
            aaeo.a = aaep;
        }
        return aaeo;
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
        return asDictionary().equals(((aaeo) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ALERT_OPEN";
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
