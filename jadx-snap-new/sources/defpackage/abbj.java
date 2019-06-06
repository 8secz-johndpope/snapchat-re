package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbj */
public final class abbj extends abbi {
    public String f;

    private abbj d() {
        abbj abbj = (abbj) super.clone();
        String str = this.f;
        if (str != null) {
            abbj.f = str;
        }
        return abbj;
    }

    public final /* synthetic */ abbi a() {
        return d();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.f;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abea b() {
        return d();
    }

    public final /* synthetic */ abeb c() {
        return d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbj) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_CONNECTION_FAILURE";
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
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
