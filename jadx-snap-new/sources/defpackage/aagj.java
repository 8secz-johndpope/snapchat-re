package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagj */
public final class aagj extends aagi {
    public aagf a;

    private aagj c() {
        aagj aagj = (aagj) super.clone();
        aagf aagf = this.a;
        if (aagf != null) {
            aagj.a = aagf;
        }
        return aagj;
    }

    public final /* synthetic */ aagi a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagf aagf = this.a;
        if (aagf != null) {
            hashMap.put("source_page", aagf.toString());
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
        return asDictionary().equals(((aagj) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_PAGE_OPEN_EVENT";
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
        aagf aagf = this.a;
        return hashCode + (aagf != null ? aagf.hashCode() : 0);
    }
}
