package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafn */
public class aafn extends aaga {
    public aafm a;
    public Boolean b;
    public String c;
    public String d;

    /* renamed from: a */
    public aafn clone() {
        aafn aafn = (aafn) super.clone();
        aafm aafm = this.a;
        if (aafm != null) {
            aafn.a = aafm;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aafn.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aafn.c = str;
        }
        str = this.d;
        if (str != null) {
            aafn.d = str;
        }
        return aafn;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafm aafm = this.a;
        if (aafm != null) {
            hashMap.put("action_type", aafm.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("success", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("commerce_error_code", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("checkout_id", str);
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
        return asDictionary().equals(((aafn) obj).asDictionary());
    }

    public String getEventName() {
        return "COMMERCE_API_EVENT_BASE";
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
        aafm aafm = this.a;
        int i = 0;
        hashCode = (hashCode + (aafm != null ? aafm.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
