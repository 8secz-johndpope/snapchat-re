package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaeu */
public class aaeu extends aaex {
    private Long a;

    /* renamed from: a */
    public aaeu clone() {
        aaeu aaeu = (aaeu) super.clone();
        Long l = this.a;
        if (l != null) {
            aaeu.a = l;
        }
        return aaeu;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("group_size", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaeu) obj).asDictionary());
    }

    public String getEventName() {
        return "COGNAC_DRAWER_EVENT_BASE";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
