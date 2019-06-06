package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aady */
public final class aady extends aadz {
    public aaee a;
    public Double b;
    public Long c;
    public Long d;

    private aady c() {
        aady aady = (aady) super.clone();
        aaee aaee = this.a;
        if (aaee != null) {
            aady.a = aaee;
        }
        Double d = this.b;
        if (d != null) {
            aady.b = d;
        }
        Long l = this.c;
        if (l != null) {
            aady.c = l;
        }
        l = this.d;
        if (l != null) {
            aady.d = l;
        }
        return aady;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaee aaee = this.a;
        if (aaee != null) {
            hashMap.put("status", aaee.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("cognac_time_sec", d);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("max_participant_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("current_participant_count", l);
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
        return asDictionary().equals(((aady) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ACTION_CLOSE_SUCCESS";
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
        aaee aaee = this.a;
        int i = 0;
        hashCode = (hashCode + (aaee != null ? aaee.hashCode() : 0)) * 31;
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
