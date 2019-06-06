package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaex */
public class aaex extends abhw {
    private aaog a;

    public final void a(aaog aaog) {
        if (aaog == null) {
            this.a = null;
        } else {
            this.a = new aaog(aaog);
        }
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaog aaog = this.a;
        if (aaog != null) {
            hashMap.putAll(aaog.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: b */
    public aaex clone() {
        aaex aaex = (aaex) super.clone();
        aaog aaog = this.a;
        if (aaog != null) {
            aaex.a(aaog.clone());
        }
        return aaex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaex) obj).asDictionary());
    }

    public String getEventName() {
        return "COGNAC_EVENT_BASE";
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
        aaog aaog = this.a;
        return hashCode + (aaog != null ? aaog.hashCode() : 0);
    }
}
