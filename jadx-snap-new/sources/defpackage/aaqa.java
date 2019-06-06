package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqa */
public final class aaqa extends abhw {
    private aapx a;
    private abel b;

    private aaqa a() {
        aaqa aaqa = (aaqa) super.clone();
        aapx aapx = this.a;
        if (aapx != null) {
            aaqa.a(aapx.clone());
        }
        abel abel = this.b;
        if (abel != null) {
            aaqa.a(abel.clone());
        }
        return aaqa;
    }

    public final void a(aapx aapx) {
        if (aapx == null) {
            this.a = null;
        } else {
            this.a = new aapx(aapx);
        }
    }

    public final void a(abel abel) {
        if (abel == null) {
            this.b = null;
        } else {
            this.b = new abel(abel);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aapx aapx = this.a;
        if (aapx != null) {
            hashMap.putAll(aapx.a());
        }
        abel abel = this.b;
        if (abel != null) {
            hashMap.putAll(abel.d());
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
        return asDictionary().equals(((aaqa) obj).asDictionary());
    }

    public final String getEventName() {
        return "LOGIN_STATE_TRANSITION";
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
        aapx aapx = this.a;
        int i = 0;
        hashCode = (hashCode + (aapx != null ? aapx.hashCode() : 0)) * 31;
        abel abel = this.b;
        if (abel != null) {
            i = abel.hashCode();
        }
        return hashCode + i;
    }
}
