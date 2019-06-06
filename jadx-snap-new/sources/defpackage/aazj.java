package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazj */
public final class aazj extends abhw {
    private aaua a;
    private aabq b;
    private aabp c;
    private Boolean d;

    private aazj a() {
        aazj aazj = (aazj) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazj.a = aaua;
        }
        aabq aabq = this.b;
        if (aabq != null) {
            aazj.b = aabq;
        }
        aabp aabp = this.c;
        if (aabp != null) {
            aazj.c = aabp;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aazj.d = bool;
        }
        return aazj;
    }

    public final void a(aabp aabp) {
        this.c = aabp;
    }

    public final void a(aabq aabq) {
        this.b = aabq;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(Boolean bool) {
        this.d = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        aabq aabq = this.b;
        if (aabq != null) {
            hashMap.put("action", aabq.toString());
        }
        aabp aabp = this.c;
        if (aabp != null) {
            hashMap.put("bitmoji_avatar_builder_type", aabp.toString());
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("with_edited_avatar", bool);
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
        return asDictionary().equals(((aazj) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_AVATAR_SAVE";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        aabq aabq = this.b;
        hashCode = (hashCode + (aabq != null ? aabq.hashCode() : 0)) * 31;
        aabp aabp = this.c;
        hashCode = (hashCode + (aabp != null ? aabp.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
