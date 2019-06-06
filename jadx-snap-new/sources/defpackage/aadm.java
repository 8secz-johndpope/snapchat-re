package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadm */
public final class aadm extends abhw {
    private aasc a;
    private Double b;

    private aadm a() {
        aadm aadm = (aadm) super.clone();
        aasc aasc = this.a;
        if (aasc != null) {
            aadm.a = aasc;
        }
        Double d = this.b;
        if (d != null) {
            aadm.b = d;
        }
        return aadm;
    }

    public final void a(aasc aasc) {
        this.a = aasc;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aasc aasc = this.a;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("note_time_sec", d);
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
        return asDictionary().equals(((aadm) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_NOTE_CREATE";
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
        aasc aasc = this.a;
        int i = 0;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.b;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
