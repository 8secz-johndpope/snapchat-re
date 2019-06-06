package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaco */
public final class aaco extends abhw {
    private aaya a;
    private aayb b;
    private aayc c;
    private String d;
    private String e;
    private aayd f;
    private String g;
    private String h;
    private String i;
    private String j;

    private aaco a() {
        aaco aaco = (aaco) super.clone();
        aaya aaya = this.a;
        if (aaya != null) {
            aaco.a = aaya;
        }
        aayb aayb = this.b;
        if (aayb != null) {
            aaco.b = aayb;
        }
        aayc aayc = this.c;
        if (aayc != null) {
            aaco.c = aayc;
        }
        String str = this.d;
        if (str != null) {
            aaco.d = str;
        }
        str = this.e;
        if (str != null) {
            aaco.e = str;
        }
        aayd aayd = this.f;
        if (aayd != null) {
            aaco.f = aayd;
        }
        str = this.g;
        if (str != null) {
            aaco.g = str;
        }
        str = this.h;
        if (str != null) {
            aaco.h = str;
        }
        str = this.i;
        if (str != null) {
            aaco.i = str;
        }
        str = this.j;
        if (str != null) {
            aaco.j = str;
        }
        return aaco;
    }

    public final void a(aaya aaya) {
        this.a = aaya;
    }

    public final void a(aayb aayb) {
        this.b = aayb;
    }

    public final void a(aayc aayc) {
        this.c = aayc;
    }

    public final void a(aayd aayd) {
        this.f = aayd;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaya aaya = this.a;
        if (aaya != null) {
            hashMap.put("scan_action_type", aaya.toString());
        }
        aayb aayb = this.b;
        if (aayb != null) {
            hashMap.put("source", aayb.toString());
        }
        aayc aayc = this.c;
        if (aayc != null) {
            hashMap.put("scan_type", aayc.toString());
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("scan_data", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("scannable_id", str);
        }
        aayd aayd = this.f;
        if (aayd != null) {
            hashMap.put("action", aayd.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("notification_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("teamsnap_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("profile_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaco) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_SCAN_ACTION";
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
        aaya aaya = this.a;
        int i = 0;
        hashCode = (hashCode + (aaya != null ? aaya.hashCode() : 0)) * 31;
        aayb aayb = this.b;
        hashCode = (hashCode + (aayb != null ? aayb.hashCode() : 0)) * 31;
        aayc aayc = this.c;
        hashCode = (hashCode + (aayc != null ? aayc.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aayd aayd = this.f;
        hashCode = (hashCode + (aayd != null ? aayd.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
