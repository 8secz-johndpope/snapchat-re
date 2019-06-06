package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadz */
public class aadz extends aaex {
    private aafb a;
    private aadi b;

    /* renamed from: a */
    public aadz clone() {
        aadz aadz = (aadz) super.clone();
        aafb aafb = this.a;
        if (aafb != null) {
            aadz.a(aafb.clone());
        }
        aadi aadi = this.b;
        if (aadi != null) {
            aadz.a(aadi.clone());
        }
        return aadz;
    }

    public final void a(aadi aadi) {
        if (aadi == null) {
            this.b = null;
        } else {
            this.b = new aadi(aadi);
        }
    }

    public final void a(aafb aafb) {
        if (aafb == null) {
            this.a = null;
        } else {
            this.a = new aafb(aafb);
        }
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafb aafb = this.a;
        if (aafb != null) {
            hashMap.putAll(aafb.a());
        }
        aadi aadi = this.b;
        if (aadi != null) {
            hashMap.putAll(aadi.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aadz) obj).asDictionary());
    }

    public String getEventName() {
        return "COGNAC_ACTION_EVENT_BASE";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        aafb aafb = this.a;
        int i = 0;
        hashCode = (hashCode + (aafb != null ? aafb.hashCode() : 0)) * 31;
        aadi aadi = this.b;
        if (aadi != null) {
            i = aadi.hashCode();
        }
        return hashCode + i;
    }
}
