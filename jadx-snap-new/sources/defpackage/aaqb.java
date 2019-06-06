package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqb */
public final class aaqb extends abhw {
    private aaqc a;
    private String b;

    private aaqb a() {
        aaqb aaqb = (aaqb) super.clone();
        aaqc aaqc = this.a;
        if (aaqc != null) {
            aaqb.a = aaqc;
        }
        String str = this.b;
        if (str != null) {
            aaqb.b = str;
        }
        return aaqb;
    }

    public final void a(aaqc aaqc) {
        this.a = aaqc;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaqc aaqc = this.a;
        if (aaqc != null) {
            hashMap.put("context", aaqc.toString());
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
        return asDictionary().equals(((aaqb) obj).asDictionary());
    }

    public final String getEventName() {
        return "LOGOUT_DIALOG_ACTION";
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
        aaqc aaqc = this.a;
        int i = 0;
        hashCode = (hashCode + (aaqc != null ? aaqc.hashCode() : 0)) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
