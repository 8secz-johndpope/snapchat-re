package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafu */
public final class aafu extends aagi {
    public aafr a;

    private aafu c() {
        aafu aafu = (aafu) super.clone();
        aafr aafr = this.a;
        if (aafr != null) {
            aafu.a = aafr;
        }
        return aafu;
    }

    public final /* synthetic */ aagi a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafr aafr = this.a;
        if (aafr != null) {
            hashMap.put("card", aafr.toString());
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
        return asDictionary().equals(((aafu) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_CARD_OPEN_EVENT";
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
        aafr aafr = this.a;
        return hashCode + (aafr != null ? aafr.hashCode() : 0);
    }
}
