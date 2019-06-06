package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahd */
public final class aahd extends aahe {
    private aahc a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    private aahd b() {
        aahd aahd = (aahd) super.clone();
        aahc aahc = this.a;
        if (aahc != null) {
            aahd.a = aahc;
        }
        String str = this.b;
        if (str != null) {
            aahd.b = str;
        }
        str = this.c;
        if (str != null) {
            aahd.c = str;
        }
        str = this.d;
        if (str != null) {
            aahd.d = str;
        }
        str = this.e;
        if (str != null) {
            aahd.e = str;
        }
        str = this.f;
        if (str != null) {
            aahd.f = str;
        }
        return aahd;
    }

    public final /* synthetic */ aahe a() {
        return b();
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahc aahc = this.a;
        if (aahc != null) {
            hashMap.put("action_type", aahc.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("card_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("action_type_string", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("notification_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("teamsnap_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final void e(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aahd) obj).asDictionary());
    }

    public final String getEventName() {
        return "CONTEXT_MENU_ACTION";
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
        aahc aahc = this.a;
        int i = 0;
        hashCode = (hashCode + (aahc != null ? aahc.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
