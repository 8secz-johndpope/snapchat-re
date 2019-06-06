package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aakf */
public final class aakf extends aaka {
    public zyr g;
    public Double h;
    public String i;

    private aakf b() {
        aakf aakf = (aakf) super.clone();
        zyr zyr = this.g;
        if (zyr != null) {
            aakf.g = zyr;
        }
        Double d = this.h;
        if (d != null) {
            aakf.h = d;
        }
        String str = this.i;
        if (str != null) {
            aakf.i = str;
        }
        return aakf;
    }

    public final /* synthetic */ aaka a() {
        return b();
    }

    public final void a(Double d) {
        this.h = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        zyr zyr = this.g;
        if (zyr != null) {
            hashMap.put(MapboxEvent.KEY_GESTURE_ID, zyr.toString());
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("time_viewed_sec", d);
        }
        String str = this.i;
        if (str != null) {
            hashMap.put("section_interactions", str);
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
        return asDictionary().equals(((aakf) obj).asDictionary());
    }

    public final String getEventName() {
        return "FEED_PAGE_VIEW";
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
        zyr zyr = this.g;
        int i = 0;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
