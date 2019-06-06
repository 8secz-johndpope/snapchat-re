package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagu */
public final class aagu extends aafl {
    public String d;
    public aaya e;
    private aagf f;

    private aagu c() {
        aagu aagu = (aagu) super.clone();
        aagf aagf = this.f;
        if (aagf != null) {
            aagu.f = aagf;
        }
        String str = this.d;
        if (str != null) {
            aagu.d = str;
        }
        aaya aaya = this.e;
        if (aaya != null) {
            aagu.e = aaya;
        }
        return aagu;
    }

    public final /* synthetic */ aafl a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagf aagf = this.f;
        if (aagf != null) {
            hashMap.put("unlock_page", aagf.toString());
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("unlockable_id", str);
        }
        aaya aaya = this.e;
        if (aaya != null) {
            hashMap.put("unlockable_type", aaya.toString());
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
        return asDictionary().equals(((aagu) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_UNLOCK_MAPPING_EVENT";
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
        aagf aagf = this.f;
        int i = 0;
        hashCode = (hashCode + (aagf != null ? aagf.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaya aaya = this.e;
        if (aaya != null) {
            i = aaya.hashCode();
        }
        return hashCode + i;
    }
}
