package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagq */
public final class aagq extends aagr {
    public Long a;
    public Long b;
    public Long c;

    private aagq c() {
        aagq aagq = (aagq) super.clone();
        Long l = this.a;
        if (l != null) {
            aagq.a = l;
        }
        l = this.b;
        if (l != null) {
            aagq.b = l;
        }
        l = this.c;
        if (l != null) {
            aagq.c = l;
        }
        return aagq;
    }

    public final /* synthetic */ aagr a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("time_spent", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("max_row_scrolled", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("total_rows", l);
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
        return asDictionary().equals(((aagq) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_STORE_CATEGORY_CLOSE_EVENT";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
