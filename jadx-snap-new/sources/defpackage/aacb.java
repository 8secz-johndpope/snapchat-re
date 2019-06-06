package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacb */
public final class aacb extends abhw {
    private String a;
    private String b;
    private aaof c;
    private String d;
    private String e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private aaxu j;

    private aacb d() {
        aacb aacb = (aacb) super.clone();
        String str = this.a;
        if (str != null) {
            aacb.a = str;
        }
        str = this.b;
        if (str != null) {
            aacb.b = str;
        }
        aaof aaof = this.c;
        if (aaof != null) {
            aacb.c = aaof;
        }
        str = this.d;
        if (str != null) {
            aacb.d = str;
        }
        str = this.e;
        if (str != null) {
            aacb.e = str;
        }
        Long l = this.f;
        if (l != null) {
            aacb.f = l;
        }
        l = this.g;
        if (l != null) {
            aacb.g = l;
        }
        l = this.h;
        if (l != null) {
            aacb.h = l;
        }
        l = this.i;
        if (l != null) {
            aacb.i = l;
        }
        aaxu aaxu = this.j;
        if (aaxu != null) {
            aaxu = aaxu.clone();
            if (aaxu == null) {
                aacb.j = null;
            } else {
                aacb.j = new aaxu(aaxu);
            }
        }
        return aacb;
    }

    public final Long a() {
        return this.f;
    }

    public final void a(aaof aaof) {
        this.c = aaof;
    }

    public final void a(Long l) {
        this.f = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("player_tag", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("caller", str);
        }
        aaof aaof = this.c;
        if (aaof != null) {
            hashMap.put("gles_version", aaof.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("status", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("setup_delay_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("setup_to_first_frame_delay_ms", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("load_bitmap_delay_ms", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("release_delay_ms", l);
        }
        aaxu aaxu = this.j;
        if (aaxu != null) {
            hashMap.putAll(aaxu.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final Long b() {
        return this.g;
    }

    public final void b(Long l) {
        this.g = l;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final Long c() {
        return this.i;
    }

    public final void c(Long l) {
        this.i = l;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacb) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_IMAGE_PLAYER_EVENT";
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
        aaof aaof = this.c;
        hashCode = (hashCode + (aaof != null ? aaof.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaxu aaxu = this.j;
        if (aaxu != null) {
            i = aaxu.hashCode();
        }
        return hashCode + i;
    }
}
