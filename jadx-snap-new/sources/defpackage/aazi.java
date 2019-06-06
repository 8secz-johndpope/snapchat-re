package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazi */
public final class aazi extends abhw {
    private aaua a;
    private aabq b;
    private aabp c;

    private aazi a() {
        aazi aazi = (aazi) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazi.a = aaua;
        }
        aabq aabq = this.b;
        if (aabq != null) {
            aazi.b = aabq;
        }
        aabp aabp = this.c;
        if (aabp != null) {
            aazi.c = aabp;
        }
        return aazi;
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
        return asDictionary().equals(((aazi) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_AVATAR_EXIT";
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
        if (aabp != null) {
            i = aabp.hashCode();
        }
        return hashCode + i;
    }
}
