package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aand */
public final class aand extends abhw {
    public String a;
    public String b;
    public aanj c;
    public String d;
    public aani e;
    public String f;
    private String g;

    private aand a() {
        aand aand = (aand) super.clone();
        String str = this.a;
        if (str != null) {
            aand.a = str;
        }
        str = this.b;
        if (str != null) {
            aand.b = str;
        }
        str = this.g;
        if (str != null) {
            aand.g = str;
        }
        aanj aanj = this.c;
        if (aanj != null) {
            aand.c = aanj;
        }
        str = this.d;
        if (str != null) {
            aand.d = str;
        }
        aani aani = this.e;
        if (aani != null) {
            aand.e = aani;
        }
        str = this.f;
        if (str != null) {
            aand.f = str;
        }
        return aand;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("entry_id", str);
        }
        aanj aanj = this.c;
        if (aanj != null) {
            hashMap.put("operation_type", aanj.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("request_id", str);
        }
        aani aani = this.e;
        if (aani != null) {
            hashMap.put("error_reason", aani.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("error_message", str);
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
        return asDictionary().equals(((aand) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_SNAP_ABANDON";
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
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aanj aanj = this.c;
        hashCode = (hashCode + (aanj != null ? aanj.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aani aani = this.e;
        hashCode = (hashCode + (aani != null ? aani.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
