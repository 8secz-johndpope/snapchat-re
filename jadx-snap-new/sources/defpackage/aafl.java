package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafl */
public class aafl extends aaga {
    public zyr a;
    public aagf b;
    public String c;

    /* renamed from: a */
    public aafl clone() {
        aafl aafl = (aafl) super.clone();
        zyr zyr = this.a;
        if (zyr != null) {
            aafl.a = zyr;
        }
        aagf aagf = this.b;
        if (aagf != null) {
            aafl.b = aagf;
        }
        String str = this.c;
        if (str != null) {
            aafl.c = str;
        }
        return aafl;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        zyr zyr = this.a;
        if (zyr != null) {
            hashMap.put("action_type", zyr.toString());
        }
        aagf aagf = this.b;
        if (aagf != null) {
            hashMap.put("current_page", aagf.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("container_view", str);
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
        return asDictionary().equals(((aafl) obj).asDictionary());
    }

    public String getEventName() {
        return "COMMERCE_ACTION_EVENT_BASE";
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
        zyr zyr = this.a;
        int i = 0;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        aagf aagf = this.b;
        hashCode = (hashCode + (aagf != null ? aagf.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
