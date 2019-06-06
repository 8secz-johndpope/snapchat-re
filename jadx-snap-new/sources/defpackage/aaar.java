package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaar */
public final class aaar extends abhw {
    private aahz a;
    private String b;
    private aaas c;

    private aaar a() {
        aaar aaar = (aaar) super.clone();
        aahz aahz = this.a;
        if (aahz != null) {
            aaar.a = aahz;
        }
        String str = this.b;
        if (str != null) {
            aaar.b = str;
        }
        aaas aaas = this.c;
        if (aaas != null) {
            aaar.c = aaas;
        }
        return aaar;
    }

    public final void a(aaas aaas) {
        this.c = aaas;
    }

    public final void a(aahz aahz) {
        this.a = aahz;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahz aahz = this.a;
        if (aahz != null) {
            hashMap.put("deep_link_source", aahz.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        aaas aaas = this.c;
        if (aaas != null) {
            hashMap.put("failed_action", aaas.toString());
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
        return asDictionary().equals(((aaar) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_LOGIN_KIT_LOGIN_FAILURE";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aahz aahz = this.a;
        int i = 0;
        hashCode = (hashCode + (aahz != null ? aahz.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaas aaas = this.c;
        if (aaas != null) {
            i = aaas.hashCode();
        }
        return hashCode + i;
    }
}
