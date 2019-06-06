package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagh */
public final class aagh extends aagi {
    private aagf a;
    private Long c;

    private aagh c() {
        aagh aagh = (aagh) super.clone();
        aagf aagf = this.a;
        if (aagf != null) {
            aagh.a = aagf;
        }
        Long l = this.c;
        if (l != null) {
            aagh.c = l;
        }
        return aagh;
    }

    public final /* synthetic */ aagi a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagf aagf = this.a;
        if (aagf != null) {
            hashMap.put("destination_page", aagf.toString());
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
        return asDictionary().equals(((aagh) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_PAGE_CLOSE_EVENT";
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
        int i = 0;
        hashCode = (hashCode + (aagf != null ? aagf.hashCode() : 0)) * 31;
        Long l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
