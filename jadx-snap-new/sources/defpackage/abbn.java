package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbn */
public final class abbn extends abea {
    public Long a;
    public Long b;
    public Long c;
    public Boolean d;
    public abbx e;
    private Long f;
    private Long g;

    private abbn a() {
        abbn abbn = (abbn) super.clone();
        Long l = this.a;
        if (l != null) {
            abbn.a = l;
        }
        l = this.b;
        if (l != null) {
            abbn.b = l;
        }
        l = this.c;
        if (l != null) {
            abbn.c = l;
        }
        Boolean bool = this.d;
        if (bool != null) {
            abbn.d = bool;
        }
        abbx abbx = this.e;
        if (abbx != null) {
            abbn.e = abbx;
        }
        l = this.f;
        if (l != null) {
            abbn.f = l;
        }
        l = this.g;
        if (l != null) {
            abbn.g = l;
        }
        return abbn;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("time_of_capture", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("device_battery", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("device_storage", l);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("ble_connected", bool);
        }
        abbx abbx = this.e;
        if (abbx != null) {
            hashMap.put("error_type", abbx.toString());
        }
        l = this.f;
        if (l != null) {
            hashMap.put("ambient_light_intensity", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("sensor_begin_temperature", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abea b() {
        return a();
    }

    public final /* synthetic */ abeb c() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbn) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_CONTENT_CAPTURE_ERROR";
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
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abbx abbx = this.e;
        hashCode = (hashCode + (abbx != null ? abbx.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
