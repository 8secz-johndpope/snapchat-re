package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfg */
public final class abfg extends abfe {
    public Double A;
    public Boolean B;
    private abfa C;
    public Double y;
    public Double z;

    private abfg c() {
        abfg abfg = (abfg) super.clone();
        Double d = this.y;
        if (d != null) {
            abfg.y = d;
        }
        d = this.z;
        if (d != null) {
            abfg.z = d;
        }
        abfa abfa = this.C;
        if (abfa != null) {
            abfg.C = abfa;
        }
        d = this.A;
        if (d != null) {
            abfg.A = d;
        }
        Boolean bool = this.B;
        if (bool != null) {
            abfg.B = bool;
        }
        return abfg;
    }

    public final /* synthetic */ aaka a() {
        return c();
    }

    public final void a(Double d) {
        this.z = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.y;
        if (d != null) {
            hashMap.put("imp_start_ts", d);
        }
        d = this.z;
        if (d != null) {
            hashMap.put("imp_time_secs", d);
        }
        abfa abfa = this.C;
        if (abfa != null) {
            hashMap.put("exit_event", abfa.toString());
        }
        d = this.A;
        if (d != null) {
            hashMap.put("imp_minimal_visible_frac", d);
        }
        Boolean bool = this.B;
        if (bool != null) {
            hashMap.put("with_viewed_state", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abfe b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfg) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_FEED_ITEM_LONG_IMP";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.y;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.z;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abfa abfa = this.C;
        hashCode = (hashCode + (abfa != null ? abfa.hashCode() : 0)) * 31;
        d = this.A;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.B;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
