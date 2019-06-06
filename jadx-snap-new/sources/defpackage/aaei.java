package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaei */
public class aaei extends aaex {
    private aafb a;
    private aaek b;

    /* renamed from: a */
    public aaei clone() {
        aaei aaei = (aaei) super.clone();
        aafb aafb = this.a;
        if (aafb != null) {
            aaei.a(aafb.clone());
        }
        aaek aaek = this.b;
        if (aaek != null) {
            aaei.a(aaek.clone());
        }
        return aaei;
    }

    public final void a(aaek aaek) {
        if (aaek == null) {
            this.b = null;
        } else {
            this.b = new aaek(aaek);
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
        aaek aaek = this.b;
        if (aaek != null) {
            hashMap.putAll(aaek.a());
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
        return asDictionary().equals(((aaei) obj).asDictionary());
    }

    public String getEventName() {
        return "COGNAC_AD_EVENT_BASE";
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
        aaek aaek = this.b;
        if (aaek != null) {
            i = aaek.hashCode();
        }
        return hashCode + i;
    }
}
