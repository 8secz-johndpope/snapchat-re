package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazx */
public final class aazx extends abhw {
    public String a;
    public abac b;
    private aazs c;

    private aazx a() {
        aazx aazx = (aazx) super.clone();
        String str = this.a;
        if (str != null) {
            aazx.a = str;
        }
        abac abac = this.b;
        if (abac != null) {
            aazx.b = abac;
        }
        aazs aazs = this.c;
        if (aazs != null) {
            aazx.a(aazs.clone());
        }
        return aazx;
    }

    public final void a(aazs aazs) {
        if (aazs == null) {
            this.c = null;
        } else {
            this.c = new aazs(aazs);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        abac abac = this.b;
        if (abac != null) {
            hashMap.put("shake_fail_step", abac.toString());
        }
        aazs aazs = this.c;
        if (aazs != null) {
            hashMap.putAll(aazs.a());
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
        return asDictionary().equals(((aazx) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_REPORT_ERROR";
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
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abac abac = this.b;
        hashCode = (hashCode + (abac != null ? abac.hashCode() : 0)) * 31;
        aazs aazs = this.c;
        if (aazs != null) {
            i = aazs.hashCode();
        }
        return hashCode + i;
    }
}
