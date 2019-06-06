package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aati */
public final class aati extends abhw {
    private aatj a;
    private String b;

    private aati a() {
        aati aati = (aati) super.clone();
        aatj aatj = this.a;
        if (aatj != null) {
            aati.a = aatj;
        }
        String str = this.b;
        if (str != null) {
            aati.b = str;
        }
        return aati;
    }

    public final void a(aatj aatj) {
        this.a = aatj;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aatj aatj = this.a;
        if (aatj != null) {
            hashMap.put("action", aatj.toString());
        }
        String str = this.b;
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
        return asDictionary().equals(((aati) obj).asDictionary());
    }

    public final String getEventName() {
        return "ONE_TAP_LOGIN_OPT_IN_DIALOG";
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
        aatj aatj = this.a;
        int i = 0;
        hashCode = (hashCode + (aatj != null ? aatj.hashCode() : 0)) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
