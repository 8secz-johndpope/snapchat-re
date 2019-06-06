package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abai */
public final class abai extends abhw {
    private String a;
    private Long b;

    private abai a() {
        abai abai = (abai) super.clone();
        String str = this.a;
        if (str != null) {
            abai.a = str;
        }
        Long l = this.b;
        if (l != null) {
            abai.b = l;
        }
        return abai;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("scope", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("os_error", l);
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
        return asDictionary().equals(((abai) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_ACCESS_TOKEN_DISK_SAVE";
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
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
