package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadx */
public final class aadx extends aadz {
    private aaee a;

    private aadx c() {
        aadx aadx = (aadx) super.clone();
        aaee aaee = this.a;
        if (aaee != null) {
            aadx.a = aaee;
        }
        return aadx;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(aaee aaee) {
        this.a = aaee;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaee aaee = this.a;
        if (aaee != null) {
            hashMap.put("status", aaee.toString());
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
        return asDictionary().equals(((aadx) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ACTION_CLOSE_ATTEMPT";
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
        return hashCode + (aaee != null ? aaee.hashCode() : 0);
    }
}
