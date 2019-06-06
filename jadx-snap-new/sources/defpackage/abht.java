package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abht */
public final class abht extends abhw {
    private abhu a;
    private String b;
    private String c;

    private abht a() {
        abht abht = (abht) super.clone();
        abhu abhu = this.a;
        if (abhu != null) {
            abht.a = abhu;
        }
        String str = this.b;
        if (str != null) {
            abht.b = str;
        }
        str = this.c;
        if (str != null) {
            abht.c = str;
        }
        return abht;
    }

    public final void a(abhu abhu) {
        this.a = abhu;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abhu abhu = this.a;
        if (abhu != null) {
            hashMap.put("setting_field_name", abhu.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("setting_field_value", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("setting_field_value_previous", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abht) obj).asDictionary());
    }

    public final String getEventName() {
        return "USER_PROFILE_UPDATE";
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
        abhu abhu = this.a;
        int i = 0;
        hashCode = (hashCode + (abhu != null ? abhu.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
