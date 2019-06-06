package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaej */
public final class aaej extends aaei {
    private String a;

    private aaej c() {
        aaej aaej = (aaej) super.clone();
        String str = this.a;
        if (str != null) {
            aaej.a = str;
        }
        return aaej;
    }

    public final /* synthetic */ aaei a() {
        return c();
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("slot_ids", str);
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
        return asDictionary().equals(((aaej) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_AD_INITIALIZE";
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
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
