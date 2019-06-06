package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqh */
public final class aaqh extends abhw {
    public abbd a;

    private aaqh a() {
        aaqh aaqh = (aaqh) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aaqh.a = abbd;
        }
        return aaqh;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbd abbd = this.a;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
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
        return asDictionary().equals(((aaqh) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_EMBEDDED_MAP_VIEW";
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
        abbd abbd = this.a;
        return hashCode + (abbd != null ? abbd.hashCode() : 0);
    }
}
