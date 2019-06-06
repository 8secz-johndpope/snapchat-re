package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaou */
public final class aaou extends abhw {
    public aaos a;

    private aaou a() {
        aaou aaou = (aaou) super.clone();
        aaos aaos = this.a;
        if (aaos != null) {
            aaou.a = aaos;
        }
        return aaou;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaos aaos = this.a;
        if (aaos != null) {
            hashMap.put("from_source_page", aaos.toString());
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
        return asDictionary().equals(((aaou) obj).asDictionary());
    }

    public final String getEventName() {
        return "IN_SETTING_SUPPORT_EXIT";
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
        aaos aaos = this.a;
        return hashCode + (aaos != null ? aaos.hashCode() : 0);
    }
}
