package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aago */
public final class aago extends aafn {
    public String e;

    private aago c() {
        aago aago = (aago) super.clone();
        String str = this.e;
        if (str != null) {
            aago.e = str;
        }
        return aago;
    }

    public final /* synthetic */ aafn a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.e;
        if (str != null) {
            hashMap.put("shipping_address_id", str);
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
        return asDictionary().equals(((aago) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_SHIPPING_ADDRESS_API_EVENT";
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
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
