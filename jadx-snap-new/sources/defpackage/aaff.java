package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaff */
public final class aaff extends aadz {
    private abbd a;
    private Double b;

    private aaff c() {
        aaff aaff = (aaff) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aaff.a = abbd;
        }
        Double d = this.b;
        if (d != null) {
            aaff.b = d;
        }
        return aaff;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(abbd abbd) {
        this.a = abbd;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbd abbd = this.a;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("load_time_sec", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaff) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_READY_TO_START";
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
        abbd abbd = this.a;
        int i = 0;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        Double d = this.b;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
