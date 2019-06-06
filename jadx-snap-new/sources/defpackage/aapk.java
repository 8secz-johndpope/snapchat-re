package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapk */
public final class aapk extends abhw {
    private aapj a;
    private aapj b;
    private Double c;
    private Long d;

    private aapk a() {
        aapk aapk = (aapk) super.clone();
        aapj aapj = this.a;
        if (aapj != null) {
            aapk.a = aapj;
        }
        aapj = this.b;
        if (aapj != null) {
            aapk.b = aapj;
        }
        Double d = this.c;
        if (d != null) {
            aapk.c = d;
        }
        Long l = this.d;
        if (l != null) {
            aapk.d = l;
        }
        return aapk;
    }

    public final void a(aapj aapj) {
        this.a = aapj;
    }

    public final void a(Double d) {
        this.c = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aapj aapj = this.a;
        if (aapj != null) {
            hashMap.put("entry_point", aapj.toString());
        }
        aapj = this.b;
        if (aapj != null) {
            hashMap.put("exit_type", aapj.toString());
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("session_time", d);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("refresh_actions_count", l);
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
        return asDictionary().equals(((aapk) obj).asDictionary());
    }

    public final String getEventName() {
        return "LENS_EXPLORER_SESSION_EVENT";
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
        aapj aapj = this.a;
        int i = 0;
        hashCode = (hashCode + (aapj != null ? aapj.hashCode() : 0)) * 31;
        aapj = this.b;
        hashCode = (hashCode + (aapj != null ? aapj.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
