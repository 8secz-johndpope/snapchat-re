package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafd */
public final class aafd extends aadz {
    private Double a;
    private Long b;
    private Long c;
    private Double d;
    private Double e;
    private abbd f;
    private aajv g;

    private aafd c() {
        aafd aafd = (aafd) super.clone();
        Double d = this.a;
        if (d != null) {
            aafd.a = d;
        }
        Long l = this.b;
        if (l != null) {
            aafd.b = l;
        }
        l = this.c;
        if (l != null) {
            aafd.c = l;
        }
        d = this.d;
        if (d != null) {
            aafd.d = d;
        }
        d = this.e;
        if (d != null) {
            aafd.e = d;
        }
        abbd abbd = this.f;
        if (abbd != null) {
            aafd.f = abbd;
        }
        aajv aajv = this.g;
        if (aajv != null) {
            aafd.g = aajv;
        }
        return aafd;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(aajv aajv) {
        this.g = aajv;
    }

    public final void a(abbd abbd) {
        this.f = abbd;
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("cognac_time_sec", d);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("max_participant_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("current_participant_count", l);
        }
        d = this.d;
        if (d != null) {
            hashMap.put("worst_scenario_avg_fps", d);
        }
        d = this.e;
        if (d != null) {
            hashMap.put("general_avg_fps", d);
        }
        abbd abbd = this.f;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        aajv aajv = this.g;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return c();
    }

    public final void b(Double d) {
        this.d = d;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final void c(Double d) {
        this.e = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aafd) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_PERF_ON_CLOSE";
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
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abbd abbd = this.f;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        aajv aajv = this.g;
        if (aajv != null) {
            i = aajv.hashCode();
        }
        return hashCode + i;
    }
}
