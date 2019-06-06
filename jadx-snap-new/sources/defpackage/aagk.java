package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagk */
public final class aagk extends aaga {
    public aahs F;
    public Long G;
    public Long H;
    public String I;
    public String J;
    public zzj K;
    public aagd L;
    public String M;
    public Double N;
    private String O;
    private Long P;
    public String a;
    public String b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;

    private aagk a() {
        aagk aagk = (aagk) super.clone();
        String str = this.a;
        if (str != null) {
            aagk.a = str;
        }
        str = this.b;
        if (str != null) {
            aagk.b = str;
        }
        Double d = this.c;
        if (d != null) {
            aagk.c = d;
        }
        d = this.d;
        if (d != null) {
            aagk.d = d;
        }
        d = this.e;
        if (d != null) {
            aagk.e = d;
        }
        d = this.f;
        if (d != null) {
            aagk.f = d;
        }
        aahs aahs = this.F;
        if (aahs != null) {
            aagk.F = aahs;
        }
        Long l = this.G;
        if (l != null) {
            aagk.G = l;
        }
        l = this.H;
        if (l != null) {
            aagk.H = l;
        }
        str = this.I;
        if (str != null) {
            aagk.I = str;
        }
        str = this.J;
        if (str != null) {
            aagk.J = str;
        }
        zzj zzj = this.K;
        if (zzj != null) {
            aagk.K = zzj;
        }
        aagd aagd = this.L;
        if (aagd != null) {
            aagk.L = aagd;
        }
        str = this.O;
        if (str != null) {
            aagk.O = str;
        }
        l = this.P;
        if (l != null) {
            aagk.P = l;
        }
        str = this.M;
        if (str != null) {
            aagk.M = str;
        }
        d = this.N;
        if (d != null) {
            aagk.N = d;
        }
        return aagk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("checkout_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("order_id", str);
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("sub_total", d);
        }
        d = this.d;
        if (d != null) {
            hashMap.put("tax_amount", d);
        }
        d = this.e;
        if (d != null) {
            hashMap.put("shipping_amount", d);
        }
        d = this.f;
        if (d != null) {
            hashMap.put("total_amount", d);
        }
        aahs aahs = this.F;
        if (aahs != null) {
            hashMap.put("currency_type", aahs.toString());
        }
        Long l = this.G;
        if (l != null) {
            hashMap.put("total_product_count", l);
        }
        l = this.H;
        if (l != null) {
            hashMap.put("total_product_type_count", l);
        }
        str = this.I;
        if (str != null) {
            hashMap.put("items", str);
        }
        str = this.J;
        if (str != null) {
            hashMap.put("shipping_method_id", str);
        }
        zzj zzj = this.K;
        if (zzj != null) {
            hashMap.put("card_type", zzj.toString());
        }
        aagd aagd = this.L;
        if (aagd != null) {
            hashMap.put("status", aagd.toString());
        }
        str = this.O;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        l = this.P;
        if (l != null) {
            hashMap.put("retry_count", l);
        }
        str = this.M;
        if (str != null) {
            hashMap.put("unlocks", str);
        }
        d = this.N;
        if (d != null) {
            hashMap.put("strikethrough_sub_total", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aagk) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_PRODUCT_CHECKOUT_EVENT";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aahs aahs = this.F;
        hashCode = (hashCode + (aahs != null ? aahs.hashCode() : 0)) * 31;
        Long l = this.G;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.H;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.I;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.J;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        zzj zzj = this.K;
        hashCode = (hashCode + (zzj != null ? zzj.hashCode() : 0)) * 31;
        aagd aagd = this.L;
        hashCode = (hashCode + (aagd != null ? aagd.hashCode() : 0)) * 31;
        str = this.O;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.P;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.M;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.N;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
