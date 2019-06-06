package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalo */
public final class aalo extends abhw {
    public Boolean a;
    public Long b;
    public String c;

    private aalo a() {
        aalo aalo = (aalo) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aalo.a = bool;
        }
        Long l = this.b;
        if (l != null) {
            aalo.b = l;
        }
        String str = this.c;
        if (str != null) {
            aalo.c = str;
        }
        return aalo;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_matched", bool);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("mismatch_count", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("fidelius_manager_status", str);
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
        return asDictionary().equals(((aalo) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_SERVER_BETA_MATCH";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
