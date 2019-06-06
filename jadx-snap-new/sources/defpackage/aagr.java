package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagr */
public class aagr extends aaga {
    public Long F;
    public String d;
    public String e;
    public Long f;

    /* renamed from: a */
    public aagr clone() {
        aagr aagr = (aagr) super.clone();
        String str = this.d;
        if (str != null) {
            aagr.d = str;
        }
        str = this.e;
        if (str != null) {
            aagr.e = str;
        }
        Long l = this.f;
        if (l != null) {
            aagr.f = l;
        }
        l = this.F;
        if (l != null) {
            aagr.F = l;
        }
        return aagr;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.d;
        if (str != null) {
            hashMap.put("category_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("category_title", str);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("category_row_index", l);
        }
        l = this.F;
        if (l != null) {
            hashMap.put("total_categories", l);
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
        return asDictionary().equals(((aagr) obj).asDictionary());
    }

    public String getEventName() {
        return "COMMERCE_STORE_CATEGORY_EVENT_BASE";
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
        String str = this.d;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.F;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
