package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaft */
public final class aaft extends aagi {
    public aafr a;
    private Long c;

    private aaft c() {
        aaft aaft = (aaft) super.clone();
        aafr aafr = this.a;
        if (aafr != null) {
            aaft.a = aafr;
        }
        Long l = this.c;
        if (l != null) {
            aaft.c = l;
        }
        return aaft;
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
        Long l = this.c;
        if (l != null) {
            hashMap.put("time_spent", l);
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
        return asDictionary().equals(((aaft) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_CARD_CLOSE_EVENT";
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
        int i = 0;
        hashCode = (hashCode + (aafr != null ? aafr.hashCode() : 0)) * 31;
        Long l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
