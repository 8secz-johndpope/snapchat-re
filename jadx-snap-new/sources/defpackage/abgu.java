package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgu */
public final class abgu extends abgz {
    private String a;
    private String b;
    private String c;

    private abgu b() {
        abgu abgu = (abgu) super.clone();
        String str = this.a;
        if (str != null) {
            abgu.a = str;
        }
        str = this.b;
        if (str != null) {
            abgu.b = str;
        }
        str = this.c;
        if (str != null) {
            abgu.c = str;
        }
        return abgu;
    }

    public final /* synthetic */ abgz a() {
        return b();
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("action_name", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("action_menu_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("source_page_type", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abgu) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_ACTION";
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
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
