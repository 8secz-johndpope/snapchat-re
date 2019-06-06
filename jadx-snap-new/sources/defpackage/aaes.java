package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaes */
public final class aaes extends aaer {
    private aaee b;
    private aafh c;

    private aaes c() {
        aaes aaes = (aaes) super.clone();
        aaee aaee = this.b;
        if (aaee != null) {
            aaes.b = aaee;
        }
        aafh aafh = this.c;
        if (aafh != null) {
            aaes.c = aafh;
        }
        return aaes;
    }

    public final /* synthetic */ aaer a() {
        return c();
    }

    public final void a(aaee aaee) {
        this.b = aaee;
    }

    public final void a(aafh aafh) {
        this.c = aafh;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaee aaee = this.b;
        if (aaee != null) {
            hashMap.put("status", aaee.toString());
        }
        aafh aafh = this.c;
        if (aafh != null) {
            hashMap.put("cognac_hide_source", aafh.toString());
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
        return asDictionary().equals(((aaes) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_CHAT_DOCK_HIDE";
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
        aaee aaee = this.b;
        int i = 0;
        hashCode = (hashCode + (aaee != null ? aaee.hashCode() : 0)) * 31;
        aafh aafh = this.c;
        if (aafh != null) {
            i = aafh.hashCode();
        }
        return hashCode + i;
    }
}
