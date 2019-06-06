package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgw */
public final class abgw extends abgz {
    private String a;

    private abgw b() {
        abgw abgw = (abgw) super.clone();
        String str = this.a;
        if (str != null) {
            abgw.a = str;
        }
        return abgw;
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
            hashMap.put("source_page_type", str);
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
        return asDictionary().equals(((abgw) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_ACTION_MENU_PAGE_VIEW";
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
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
