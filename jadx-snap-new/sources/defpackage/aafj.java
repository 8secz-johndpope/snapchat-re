package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafj */
public final class aafj extends aadz {
    private aafk a;

    private aafj c() {
        aafj aafj = (aafj) super.clone();
        aafk aafk = this.a;
        if (aafk != null) {
            aafj.a = aafk;
        }
        return aafj;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(aafk aafk) {
        this.a = aafk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafk aafk = this.a;
        if (aafk != null) {
            hashMap.put("tooltip_type", aafk.toString());
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
        return asDictionary().equals(((aafj) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_TOOLTIP_DISPLAY";
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
        aafk aafk = this.a;
        return hashCode + (aafk != null ? aafk.hashCode() : 0);
    }
}
