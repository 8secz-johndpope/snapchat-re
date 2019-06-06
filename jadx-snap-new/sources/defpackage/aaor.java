package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaor */
public final class aaor extends abhw {
    public String a;
    public String b;
    public Boolean c;

    private aaor a() {
        aaor aaor = (aaor) super.clone();
        String str = this.a;
        if (str != null) {
            aaor.a = str;
        }
        str = this.b;
        if (str != null) {
            aaor.b = str;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aaor.c = bool;
        }
        return aaor;
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
        Boolean bool = this.c;
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
        return asDictionary().equals(((aaor) obj).asDictionary());
    }

    public final String getEventName() {
        return "IN_SETTING_REPORT_CANCEL";
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
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
