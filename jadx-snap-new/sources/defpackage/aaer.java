package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaer */
public class aaer extends aaex {
    public String a;
    private aadi b;

    /* renamed from: a */
    public aaer clone() {
        aaer aaer = (aaer) super.clone();
        String str = this.a;
        if (str != null) {
            aaer.a = str;
        }
        aadi aadi = this.b;
        if (aadi != null) {
            aaer.a(aadi.clone());
        }
        return aaer;
    }

    public final void a(aadi aadi) {
        if (aadi == null) {
            this.b = null;
        } else {
            this.b = new aadi(aadi);
        }
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("cognac_id", str);
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
        return asDictionary().equals(((aaer) obj).asDictionary());
    }

    public String getEventName() {
        return "COGNAC_CHAT_DOCK_EVENT_BASE";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aadi aadi = this.b;
        if (aadi != null) {
            i = aadi.hashCode();
        }
        return hashCode + i;
    }
}
