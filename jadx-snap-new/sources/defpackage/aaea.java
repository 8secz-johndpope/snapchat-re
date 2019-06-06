package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaea */
public final class aaea extends aadz {
    private Long a;

    private aaea c() {
        aaea aaea = (aaea) super.clone();
        Long l = this.a;
        if (l != null) {
            aaea.a = l;
        }
        return aaea;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("invitee_count", l);
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
        return asDictionary().equals(((aaea) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ACTION_INVITE_SENT";
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
        Long l = this.a;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
