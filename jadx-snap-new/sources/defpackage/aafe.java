package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafe */
public final class aafe extends aadz {
    private abbd a;
    private Double b;
    private aagx c;

    private aafe c() {
        aafe aafe = (aafe) super.clone();
        abbd abbd = this.a;
        if (abbd != null) {
            aafe.a = abbd;
        }
        Double d = this.b;
        if (d != null) {
            aafe.b = d;
        }
        aagx aagx = this.c;
        if (aagx != null) {
            aafe.c = aagx;
        }
        return aafe;
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
        aagx aagx = this.c;
        if (aagx != null) {
            hashMap.put("connection_class", aagx.toString());
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
        return asDictionary().equals(((aafe) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_PERF_ON_START";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        abbd abbd = this.a;
        int i = 0;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aagx aagx = this.c;
        if (aagx != null) {
            i = aagx.hashCode();
        }
        return hashCode + i;
    }
}
