package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aakc */
public final class aakc extends aaka {
    public aakb g;
    public String h;
    public String i;
    private zyr j;

    private aakc b() {
        aakc aakc = (aakc) super.clone();
        aakb aakb = this.g;
        if (aakb != null) {
            aakc.g = aakb;
        }
        zyr zyr = this.j;
        if (zyr != null) {
            aakc.j = zyr;
        }
        String str = this.h;
        if (str != null) {
            aakc.h = str;
        }
        str = this.i;
        if (str != null) {
            aakc.i = str;
        }
        return aakc;
    }

    public final /* synthetic */ aaka a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakb aakb = this.g;
        if (aakb != null) {
            hashMap.put("entry_type", aakb.toString());
        }
        zyr zyr = this.j;
        if (zyr != null) {
            hashMap.put(MapboxEvent.KEY_GESTURE_ID, zyr.toString());
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("user_locales", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("experiment_settings", str);
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
        return asDictionary().equals(((aakc) obj).asDictionary());
    }

    public final String getEventName() {
        return "FEED_PAGE_OPEN";
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
        aakb aakb = this.g;
        int i = 0;
        hashCode = (hashCode + (aakb != null ? aakb.hashCode() : 0)) * 31;
        zyr zyr = this.j;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
