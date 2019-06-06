package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagp */
public final class aagp extends aafn {
    private aahs F;
    public String e;
    public Double f;

    private aagp c() {
        aagp aagp = (aagp) super.clone();
        aahs aahs = this.F;
        if (aahs != null) {
            aagp.F = aahs;
        }
        String str = this.e;
        if (str != null) {
            aagp.e = str;
        }
        Double d = this.f;
        if (d != null) {
            aagp.f = d;
        }
        return aagp;
    }

    public final /* synthetic */ aafn a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahs aahs = this.F;
        if (aahs != null) {
            hashMap.put("currency_type", aahs.toString());
        }
        String str = this.e;
        if (str != null) {
            hashMap.put("shipping_method_id", str);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("shipping_amount", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aagp) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_SHIPPING_METHOD_API_EVENT";
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
        aahs aahs = this.F;
        int i = 0;
        hashCode = (hashCode + (aahs != null ? aahs.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.f;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
