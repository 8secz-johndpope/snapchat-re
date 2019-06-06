package defpackage;

import com.brightcove.player.event.Event;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aarg */
public final class aarg extends abhw {
    public Long a;
    public Long b;
    public aarh c;
    public Long d;
    public Long e;
    private String f;

    private aarg a() {
        aarg aarg = (aarg) super.clone();
        Long l = this.a;
        if (l != null) {
            aarg.a = l;
        }
        l = this.b;
        if (l != null) {
            aarg.b = l;
        }
        aarh aarh = this.c;
        if (aarh != null) {
            aarg.c = aarh;
        }
        l = this.d;
        if (l != null) {
            aarg.d = l;
        }
        l = this.e;
        if (l != null) {
            aarg.e = l;
        }
        String str = this.f;
        if (str != null) {
            aarg.f = str;
        }
        return aarg;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("status_session_id", l);
        }
        aarh aarh = this.c;
        if (aarh != null) {
            hashMap.put("status_option_type", aarh.toString());
        }
        l = this.d;
        if (l != null) {
            hashMap.put("sticker_bitmoji_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put(Event.INDEX, l);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("chosen_actionmoji_sticker_id", str);
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
        return asDictionary().equals(((aarg) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_STATUS_OPTION_TAP";
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
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aarh aarh = this.c;
        hashCode = (hashCode + (aarh != null ? aarh.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
