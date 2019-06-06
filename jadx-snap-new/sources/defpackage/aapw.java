package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapw */
public final class aapw extends abhw {
    private aapz a;
    private aapx b;

    private aapw a() {
        aapw aapw = (aapw) super.clone();
        aapz aapz = this.a;
        if (aapz != null) {
            aapw.a = aapz;
        }
        aapx aapx = this.b;
        if (aapx != null) {
            aapw.a(aapx.clone());
        }
        return aapw;
    }

    public final void a(aapx aapx) {
        if (aapx == null) {
            this.b = null;
        } else {
            this.b = new aapx(aapx);
        }
    }

    public final void a(aapz aapz) {
        this.a = aapz;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aapz aapz = this.a;
        if (aapz != null) {
            hashMap.put("login_source", aapz.toString());
        }
        aapx aapx = this.b;
        if (aapx != null) {
            hashMap.putAll(aapx.a());
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
        return asDictionary().equals(((aapw) obj).asDictionary());
    }

    public final String getEventName() {
        return "LOGIN_FLOW_START";
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
        aapz aapz = this.a;
        int i = 0;
        hashCode = (hashCode + (aapz != null ? aapz.hashCode() : 0)) * 31;
        aapx aapx = this.b;
        if (aapx != null) {
            i = aapx.hashCode();
        }
        return hashCode + i;
    }
}
