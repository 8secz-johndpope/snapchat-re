package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazm */
public final class aazm extends abhw {
    private aaua a;
    private Long b;
    private Boolean c;
    private String d;

    private aazm a() {
        aazm aazm = (aazm) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aazm.a = aaua;
        }
        Long l = this.b;
        if (l != null) {
            aazm.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aazm.c = bool;
        }
        String str = this.d;
        if (str != null) {
            aazm.d = str;
        }
        return aazm;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("bitmoji_outfit_id", l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("success", bool);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("bitmoji_session_id", str);
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
        return asDictionary().equals(((aazm) obj).asDictionary());
    }

    public final String getEventName() {
        return "SETTING_BITMOJI_OUTFIT_CHANGE";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
