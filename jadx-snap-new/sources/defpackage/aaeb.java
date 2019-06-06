package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaeb */
public final class aaeb extends aaex {
    private aafb a;

    private aaeb a() {
        aaeb aaeb = (aaeb) super.clone();
        aafb aafb = this.a;
        if (aafb != null) {
            aaeb.a(aafb.clone());
        }
        return aaeb;
    }

    public final void a(aafb aafb) {
        if (aafb == null) {
            this.a = null;
        } else {
            this.a = new aafb(aafb);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafb aafb = this.a;
        if (aafb != null) {
            hashMap.putAll(aafb.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaeb) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ACTION_START_SOLO";
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
        aafb aafb = this.a;
        return hashCode + (aafb != null ? aafb.hashCode() : 0);
    }
}
