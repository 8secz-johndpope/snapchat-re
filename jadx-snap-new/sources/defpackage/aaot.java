package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaot */
public final class aaot extends abhw {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public Boolean e;

    private aaot a() {
        aaot aaot = (aaot) super.clone();
        String str = this.a;
        if (str != null) {
            aaot.a = str;
        }
        str = this.b;
        if (str != null) {
            aaot.b = str;
        }
        str = this.c;
        if (str != null) {
            aaot.c = str;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaot.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aaot.e = bool;
        }
        return aaot;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("ticket_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("page_name", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("topic_name", str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("with_screenshot", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_topic_required", bool);
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
        return asDictionary().equals(((aaot) obj).asDictionary());
    }

    public final String getEventName() {
        return "IN_SETTING_REPORT_SUBMIT";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
