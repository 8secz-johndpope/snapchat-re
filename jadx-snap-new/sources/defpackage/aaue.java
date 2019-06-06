package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaue */
public final class aaue extends abhw {
    public aauf a;
    public aaud b;
    public Boolean c;
    private Long d;

    private aaue a() {
        aaue aaue = (aaue) super.clone();
        aauf aauf = this.a;
        if (aauf != null) {
            aaue.a = aauf;
        }
        aaud aaud = this.b;
        if (aaud != null) {
            aaue.b = aaud;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aaue.c = bool;
        }
        Long l = this.d;
        if (l != null) {
            aaue.d = l;
        }
        return aaue;
    }

    public final void a(aaud aaud) {
        this.b = aaud;
    }

    public final void a(aauf aauf) {
        this.a = aauf;
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aauf aauf = this.a;
        if (aauf != null) {
            hashMap.put("permission_prompt_type", aauf.toString());
        }
        aaud aaud = this.b;
        if (aaud != null) {
            hashMap.put("permision_prompt_action_type", aaud.toString());
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("accepted", bool);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("map_session_id", l);
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
        return asDictionary().equals(((aaue) obj).asDictionary());
    }

    public final String getEventName() {
        return "PERMISSION_PROMPT_RESPONSE";
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
        aauf aauf = this.a;
        int i = 0;
        hashCode = (hashCode + (aauf != null ? aauf.hashCode() : 0)) * 31;
        aaud aaud = this.b;
        hashCode = (hashCode + (aaud != null ? aaud.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
