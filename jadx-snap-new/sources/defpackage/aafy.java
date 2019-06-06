package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafy */
public final class aafy extends aafn {
    private Double F;
    private aahs e;
    private String f;

    private aafy c() {
        aafy aafy = (aafy) super.clone();
        aahs aahs = this.e;
        if (aahs != null) {
            aafy.e = aahs;
        }
        String str = this.f;
        if (str != null) {
            aafy.f = str;
        }
        Double d = this.F;
        if (d != null) {
            aafy.F = d;
        }
        return aafy;
    }

    public final /* synthetic */ aafn a() {
        return c();
    }

    public final void a(Double d) {
        this.F = d;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahs aahs = this.e;
        if (aahs != null) {
            hashMap.put("currency_type", aahs.toString());
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("discount_code", str);
        }
        Double d = this.F;
        if (d != null) {
            hashMap.put("discount_amount", d);
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
        return asDictionary().equals(((aafy) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_DISCOUNT_API_EVENT";
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
        aahs aahs = this.e;
        int i = 0;
        hashCode = (hashCode + (aahs != null ? aahs.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.F;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
