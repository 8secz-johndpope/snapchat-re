package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadj */
public final class aadj extends abhw {
    private aajn a;
    private aajo b;
    private aajm c;
    private Long d;
    private Boolean e;
    private aauv f;
    private Boolean g;
    private abbd h;
    private String i;

    private aadj a() {
        aadj aadj = (aadj) super.clone();
        aajn aajn = this.a;
        if (aajn != null) {
            aadj.a = aajn;
        }
        aajo aajo = this.b;
        if (aajo != null) {
            aadj.b = aajo;
        }
        aajm aajm = this.c;
        if (aajm != null) {
            aadj.c = aajm;
        }
        Long l = this.d;
        if (l != null) {
            aadj.d = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aadj.e = bool;
        }
        aauv aauv = this.f;
        if (aauv != null) {
            aadj.f = aauv;
        }
        bool = this.g;
        if (bool != null) {
            aadj.g = bool;
        }
        abbd abbd = this.h;
        if (abbd != null) {
            aadj.h = abbd;
        }
        String str = this.i;
        if (str != null) {
            aadj.i = str;
        }
        return aadj;
    }

    public final void a(aajm aajm) {
        this.c = aajm;
    }

    public final void a(aajn aajn) {
        this.a = aajn;
    }

    public final void a(aajo aajo) {
        this.b = aajo;
    }

    public final void a(aauv aauv) {
        this.f = aauv;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aajn aajn = this.a;
        if (aajn != null) {
            hashMap.put("drawer", aajn.toString());
        }
        aajo aajo = this.b;
        if (aajo != null) {
            hashMap.put("drawer_view_mode", aajo.toString());
        }
        aajm aajm = this.c;
        if (aajm != null) {
            hashMap.put("drawer_action_type", aajm.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("item_sent_count", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("with_search", bool);
        }
        aauv aauv = this.f;
        if (aauv != null) {
            hashMap.put("preview_icon_provider", aauv.toString());
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("with_bitmoji_tab_visible", bool);
        }
        abbd abbd = this.h;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        String str = this.i;
        if (str != null) {
            hashMap.put("section", str);
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
        return asDictionary().equals(((aadj) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_DRAWER_ACTION";
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
        aajn aajn = this.a;
        int i = 0;
        hashCode = (hashCode + (aajn != null ? aajn.hashCode() : 0)) * 31;
        aajo aajo = this.b;
        hashCode = (hashCode + (aajo != null ? aajo.hashCode() : 0)) * 31;
        aajm aajm = this.c;
        hashCode = (hashCode + (aajm != null ? aajm.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aauv aauv = this.f;
        hashCode = (hashCode + (aauv != null ? aauv.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abbd abbd = this.h;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
