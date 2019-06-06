package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: zzk */
public final class zzk extends abhw {
    public Double a;
    private String b;
    private aahz c;
    private String d;
    private aabh e;

    private zzk a() {
        zzk zzk = (zzk) super.clone();
        String str = this.b;
        if (str != null) {
            zzk.b = str;
        }
        Double d = this.a;
        if (d != null) {
            zzk.a = d;
        }
        aahz aahz = this.c;
        if (aahz != null) {
            zzk.c = aahz;
        }
        str = this.d;
        if (str != null) {
            zzk.d = str;
        }
        aabh aabh = this.e;
        if (aabh != null) {
            zzk.e = aabh;
        }
        return zzk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.b;
        if (str != null) {
            hashMap.put("additional_info", str);
        }
        Double d = this.a;
        if (d != null) {
            hashMap.put("app_open_ts", d);
        }
        aahz aahz = this.c;
        if (aahz != null) {
            hashMap.put("deep_link_source", aahz.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        aabh aabh = this.e;
        if (aabh != null) {
            hashMap.put("application_state", aabh.toString());
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
        return asDictionary().equals(((zzk) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_APPLICATION_CLOSE";
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
        String str = this.b;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.a;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aahz aahz = this.c;
        hashCode = (hashCode + (aahz != null ? aahz.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabh aabh = this.e;
        if (aabh != null) {
            i = aabh.hashCode();
        }
        return hashCode + i;
    }
}
