package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafx */
public final class aafx extends aafn {
    public String e;
    public zzj f;

    private aafx c() {
        aafx aafx = (aafx) super.clone();
        String str = this.e;
        if (str != null) {
            aafx.e = str;
        }
        zzj zzj = this.f;
        if (zzj != null) {
            aafx.f = zzj;
        }
        return aafx;
    }

    public final /* synthetic */ aafn a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.e;
        if (str != null) {
            hashMap.put("payment_method_id", str);
        }
        zzj zzj = this.f;
        if (zzj != null) {
            hashMap.put("card_type", zzj.toString());
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
        return asDictionary().equals(((aafx) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_CREDIT_CARD_API_EVENT";
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
        zzj zzj = this.f;
        if (zzj != null) {
            i = zzj.hashCode();
        }
        return hashCode + i;
    }
}
