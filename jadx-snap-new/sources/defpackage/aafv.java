package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafv */
public final class aafv extends aafn {
    private Double F;
    private Double G;
    private Double H;
    private String I;
    private Double J;
    private aahs K;
    private Boolean L;
    private Boolean M;
    private Boolean N;
    private String e;
    private Double f;

    private aafv c() {
        aafv aafv = (aafv) super.clone();
        String str = this.e;
        if (str != null) {
            aafv.e = str;
        }
        Double d = this.f;
        if (d != null) {
            aafv.f = d;
        }
        d = this.F;
        if (d != null) {
            aafv.F = d;
        }
        d = this.G;
        if (d != null) {
            aafv.G = d;
        }
        d = this.H;
        if (d != null) {
            aafv.H = d;
        }
        str = this.I;
        if (str != null) {
            aafv.I = str;
        }
        d = this.J;
        if (d != null) {
            aafv.J = d;
        }
        aahs aahs = this.K;
        if (aahs != null) {
            aafv.K = aahs;
        }
        Boolean bool = this.L;
        if (bool != null) {
            aafv.L = bool;
        }
        bool = this.M;
        if (bool != null) {
            aafv.M = bool;
        }
        bool = this.N;
        if (bool != null) {
            aafv.N = bool;
        }
        return aafv;
    }

    public final /* synthetic */ aafn a() {
        return c();
    }

    public final void a(aahs aahs) {
        this.K = aahs;
    }

    public final void a(Boolean bool) {
        this.L = bool;
    }

    public final void a(Double d) {
        this.f = d;
    }

    public final void a(String str) {
        this.e = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.e;
        if (str != null) {
            hashMap.put("cart_items", str);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("sub_total", d);
        }
        d = this.F;
        if (d != null) {
            hashMap.put("discount", d);
        }
        d = this.G;
        if (d != null) {
            hashMap.put("tax", d);
        }
        d = this.H;
        if (d != null) {
            hashMap.put("shipping_amount", d);
        }
        str = this.I;
        if (str != null) {
            hashMap.put("shipping_method_id", str);
        }
        d = this.J;
        if (d != null) {
            hashMap.put("total", d);
        }
        aahs aahs = this.K;
        if (aahs != null) {
            hashMap.put("currency_type", aahs.toString());
        }
        Boolean bool = this.L;
        if (bool != null) {
            hashMap.put("has_valid_payment_method", bool);
        }
        bool = this.M;
        if (bool != null) {
            hashMap.put("has_valid_shipping_address", bool);
        }
        bool = this.N;
        if (bool != null) {
            hashMap.put("has_valid_contact_info", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return c();
    }

    public final void b(Boolean bool) {
        this.M = bool;
    }

    public final void b(Double d) {
        this.F = d;
    }

    public final void b(String str) {
        this.I = str;
    }

    public final void c(Boolean bool) {
        this.N = bool;
    }

    public final void c(Double d) {
        this.G = d;
    }

    public final void d(Double d) {
        this.H = d;
    }

    public final void e(Double d) {
        this.J = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aafv) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_CHECKOUT_API_EVENT";
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
        String str = this.e;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.F;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.G;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.H;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.I;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.J;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aahs aahs = this.K;
        hashCode = (hashCode + (aahs != null ? aahs.hashCode() : 0)) * 31;
        Boolean bool = this.L;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.M;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.N;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
