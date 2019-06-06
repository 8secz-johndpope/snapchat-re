package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abeh */
public final class abeh extends abbp {
    public abds a;
    public Long b;
    public Long c;

    private abeh d() {
        abeh abeh = (abeh) super.clone();
        abds abds = this.a;
        if (abds != null) {
            abeh.a = abds;
        }
        Long l = this.b;
        if (l != null) {
            abeh.b = l;
        }
        l = this.c;
        if (l != null) {
            abeh.c = l;
        }
        return abeh;
    }

    public final /* synthetic */ abbp a() {
        return d();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abds abds = this.a;
        if (abds != null) {
            hashMap.put("phone_wifi_status", abds.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("btc_connection_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("wifi_connection_time_ms", l);
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
        return asDictionary().equals(((abeh) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_TRANSFER_SESSION_START";
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
        abds abds = this.a;
        int i = 0;
        hashCode = (hashCode + (abds != null ? abds.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
