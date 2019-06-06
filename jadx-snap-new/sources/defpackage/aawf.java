package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawf */
public final class aawf extends abhw {
    private aaxp a;
    private aaxo b;
    private String c;

    private aawf a() {
        aawf aawf = (aawf) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawf.a = aaxp;
        }
        aaxo aaxo = this.b;
        if (aaxo != null) {
            aawf.b = aaxo;
        }
        String str = this.c;
        if (str != null) {
            aawf.c = str;
        }
        return aawf;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        aaxo aaxo = this.b;
        if (aaxo != null) {
            hashMap.put("verification_type", aaxo.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
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
        return asDictionary().equals(((aawf) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_CONTACT_PAGEVIEW";
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
        aaxp aaxp = this.a;
        int i = 0;
        hashCode = (hashCode + (aaxp != null ? aaxp.hashCode() : 0)) * 31;
        aaxo aaxo = this.b;
        hashCode = (hashCode + (aaxo != null ? aaxo.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
