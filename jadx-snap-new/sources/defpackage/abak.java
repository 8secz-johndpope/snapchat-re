package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abak */
public final class abak extends abhw {
    private String a;
    private String b;

    private abak a() {
        abak abak = (abak) super.clone();
        String str = this.a;
        if (str != null) {
            abak.a = str;
        }
        str = this.b;
        if (str != null) {
            abak.b = str;
        }
        return abak;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("scope", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("error", str);
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
        return asDictionary().equals(((abak) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_ACCESS_TOKEN_NETWORK_FETCH";
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
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
