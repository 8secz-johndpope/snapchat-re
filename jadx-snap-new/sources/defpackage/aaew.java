package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaew */
public final class aaew extends aaeu {
    private aafi a;

    private aaew c() {
        aaew aaew = (aaew) super.clone();
        aafi aafi = this.a;
        if (aafi != null) {
            aaew.a = aafi;
        }
        return aaew;
    }

    public final /* synthetic */ aaeu a() {
        return c();
    }

    public final void a(aafi aafi) {
        this.a = aafi;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafi aafi = this.a;
        if (aafi != null) {
            hashMap.put("tile_action_type", aafi.toString());
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
        return asDictionary().equals(((aaew) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_DRAWER_TILE_TAP";
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
        aafi aafi = this.a;
        return hashCode + (aafi != null ? aafi.hashCode() : 0);
    }
}
