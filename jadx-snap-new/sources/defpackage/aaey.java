package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaey */
public final class aaey extends aadz {
    private aaez a;

    private aaey c() {
        aaey aaey = (aaey) super.clone();
        aaez aaez = this.a;
        if (aaez != null) {
            aaey.a = aaez;
        }
        return aaey;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(aaez aaez) {
        this.a = aaez;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaez aaez = this.a;
        if (aaez != null) {
            hashMap.put("button_type", aaez.toString());
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
        return asDictionary().equals(((aaey) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_IN_APP_BUTTON_TAP";
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
        aaez aaez = this.a;
        return hashCode + (aaez != null ? aaez.hashCode() : 0);
    }
}
