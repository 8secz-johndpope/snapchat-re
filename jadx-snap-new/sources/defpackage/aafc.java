package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafc */
public final class aafc extends aadz {
    private abbd a;

    private aafc c() {
        aafc aafc = (aafc) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aafc.a = abbd;
        }
        return aafc;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(abbd abbd) {
        this.a = abbd;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbd abbd = this.a;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
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
        return asDictionary().equals(((aafc) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_OPEN";
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
        abbd abbd = this.a;
        return hashCode + (abbd != null ? abbd.hashCode() : 0);
    }
}
