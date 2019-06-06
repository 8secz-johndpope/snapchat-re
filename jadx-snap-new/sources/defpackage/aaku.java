package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaku */
public final class aaku extends abhw {
    public String a;
    public Long b;
    public Long c;

    private aaku a() {
        aaku aaku = (aaku) super.clone();
        String str = this.a;
        if (str != null) {
            aaku.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aaku.b = l;
        }
        l = this.c;
        if (l != null) {
            aaku.c = l;
        }
        return aaku;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("current_device_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("previous_device_count", l);
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
        return asDictionary().equals(((aaku) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_FRIEND_ADDED";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
