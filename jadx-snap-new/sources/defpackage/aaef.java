package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaef */
public final class aaef extends aadz {
    private Double a;

    private aaef c() {
        aaef aaef = (aaef) super.clone();
        Double d = this.a;
        if (d != null) {
            aaef.a = d;
        }
        return aaef;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("voice_time_sec", d);
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
        return asDictionary().equals(((aaef) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ACTION_VOICE_PARTY_END";
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
        Double d = this.a;
        return hashCode + (d != null ? d.hashCode() : 0);
    }
}
