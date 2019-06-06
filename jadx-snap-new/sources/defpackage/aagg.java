package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagg */
public final class aagg extends aafl {
    public aagf d;

    private aagg c() {
        aagg aagg = (aagg) super.clone();
        aagf aagf = this.d;
        if (aagf != null) {
            aagg.d = aagf;
        }
        return aagg;
    }

    public final /* synthetic */ aafl a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagf aagf = this.d;
        if (aagf != null) {
            hashMap.put("target", aagf.toString());
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
        return asDictionary().equals(((aagg) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_PAGE_ACTION_EVENT";
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
        aagf aagf = this.d;
        return hashCode + (aagf != null ? aagf.hashCode() : 0);
    }
}
