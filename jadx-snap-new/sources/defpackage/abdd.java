package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdd */
public final class abdd extends abde {
    private abbh a;

    private abdd b() {
        abdd abdd = (abdd) super.clone();
        abbh abbh = this.a;
        if (abbh != null) {
            abdd.a = abbh;
        }
        return abdd;
    }

    public final /* synthetic */ abde a() {
        return b();
    }

    public final void a(abbh abbh) {
        this.a = abbh;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbh abbh = this.a;
        if (abbh != null) {
            hashMap.put("cancellation_source", abbh.toString());
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
        return asDictionary().equals(((abdd) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_PAIRING_CANCEL";
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
        abbh abbh = this.a;
        return hashCode + (abbh != null ? abbh.hashCode() : 0);
    }
}
