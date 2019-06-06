package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbb */
public final class abbb extends abaz {
    private abba a;

    private abbb c() {
        abbb abbb = (abbb) super.clone();
        abba abba = this.a;
        if (abba != null) {
            abbb.a = abba;
        }
        return abbb;
    }

    public final /* synthetic */ aapi a() {
        return c();
    }

    public final void a(abba abba) {
        this.a = abba;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abba abba = this.a;
        if (abba != null) {
            hashMap.put("snappable_invite_action", abba.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abaz b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbb) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAPPABLE_INVITE_VIEW";
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
        abba abba = this.a;
        return hashCode + (abba != null ? abba.hashCode() : 0);
    }
}
