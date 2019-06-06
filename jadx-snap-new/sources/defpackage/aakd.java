package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aakd */
public final class aakd extends aaka {
    public zyr g;
    public Double h;
    public Double i;

    private aakd b() {
        aakd aakd = (aakd) super.clone();
        zyr zyr = this.g;
        if (zyr != null) {
            aakd.g = zyr;
        }
        Double d = this.h;
        if (d != null) {
            aakd.h = d;
        }
        d = this.i;
        if (d != null) {
            aakd.i = d;
        }
        return aakd;
    }

    public final /* synthetic */ aaka a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        zyr zyr = this.g;
        if (zyr != null) {
            hashMap.put(MapboxEvent.KEY_GESTURE_ID, zyr.toString());
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("scroll_start_ts", d);
        }
        d = this.i;
        if (d != null) {
            hashMap.put("scroll_duration_secs", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aakd) obj).asDictionary());
    }

    public final String getEventName() {
        return "FEED_PAGE_SCROLL";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        zyr zyr = this.g;
        int i = 0;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.i;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
