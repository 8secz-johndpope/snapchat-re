package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaie */
public final class aaie extends abhw {
    public aaig a;
    public String b;
    public aaif c;
    public String d;
    public Boolean e;
    public Boolean f;
    private String g;
    private Boolean h;
    private Boolean i;
    private String j;

    private aaie h() {
        aaie aaie = (aaie) super.clone();
        aaig aaig = this.a;
        if (aaig != null) {
            aaie.a = aaig;
        }
        String str = this.b;
        if (str != null) {
            aaie.b = str;
        }
        aaif aaif = this.c;
        if (aaif != null) {
            aaie.c = aaif;
        }
        str = this.d;
        if (str != null) {
            aaie.d = str;
        }
        str = this.g;
        if (str != null) {
            aaie.g = str;
        }
        Boolean bool = this.h;
        if (bool != null) {
            aaie.h = bool;
        }
        bool = this.i;
        if (bool != null) {
            aaie.i = bool;
        }
        str = this.j;
        if (str != null) {
            aaie.j = str;
        }
        bool = this.e;
        if (bool != null) {
            aaie.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aaie.f = bool;
        }
        return aaie;
    }

    public final void a() {
        this.b = null;
    }

    public final void a(aaif aaif) {
        this.c = aaif;
    }

    public final void a(aaig aaig) {
        this.a = aaig;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaig aaig = this.a;
        if (aaig != null) {
            hashMap.put("action_type", aaig.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("page", str);
        }
        aaif aaif = this.c;
        if (aaif != null) {
            hashMap.put("button_name", aaif.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("with_gallery", bool);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("with_camera_roll", bool);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_lens", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_snappable", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b() {
        this.g = null;
    }

    public final void c() {
        this.h = null;
    }

    public final void d() {
        this.i = null;
    }

    public final void e() {
        this.j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaie) obj).asDictionary());
    }

    public final void f() {
        this.e = null;
    }

    public final void g() {
        this.f = null;
    }

    public final String getEventName() {
        return "DIRECT_SNAP_ACTION";
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
        aaig aaig = this.a;
        int i = 0;
        hashCode = (hashCode + (aaig != null ? aaig.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaif aaif = this.c;
        hashCode = (hashCode + (aaif != null ? aaif.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
