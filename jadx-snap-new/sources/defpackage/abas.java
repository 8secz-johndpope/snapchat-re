package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abas */
public final class abas extends abhw {
    public Long a;
    private abaf b;

    private abas a() {
        abas abas = (abas) super.clone();
        Long l = this.a;
        if (l != null) {
            abas.a = l;
        }
        abaf abaf = this.b;
        if (abaf != null) {
            abas.a(abaf.clone());
        }
        return abas;
    }

    public final void a(abaf abaf) {
        if (abaf == null) {
            this.b = null;
        } else {
            this.b = new abaf(abaf);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("latency_millis", l);
        }
        abaf abaf = this.b;
        if (abaf != null) {
            hashMap.putAll(abaf.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abas) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_RECORDING_DELAY";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abaf abaf = this.b;
        if (abaf != null) {
            i = abaf.hashCode();
        }
        return hashCode + i;
    }
}
