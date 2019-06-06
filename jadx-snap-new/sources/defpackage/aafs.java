package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafs */
public final class aafs extends aafl {
    public aafr d;

    private aafs c() {
        aafs aafs = (aafs) super.clone();
        aafr aafr = this.d;
        if (aafr != null) {
            aafs.d = aafr;
        }
        return aafs;
    }

    public final /* synthetic */ aafl a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafr aafr = this.d;
        if (aafr != null) {
            hashMap.put("target", aafr.toString());
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
        return asDictionary().equals(((aafs) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_CARD_ACTION_EVENT";
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
        aafr aafr = this.d;
        return hashCode + (aafr != null ? aafr.hashCode() : 0);
    }
}
