package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapm */
public final class aapm implements Cloneable {
    private String a;
    private String b;
    private aapp c;
    private String d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private aapr k;

    public aapm(aapm aapm) {
        this.a = aapm.a;
        this.b = aapm.b;
        this.c = aapm.c;
        this.d = aapm.d;
        this.e = aapm.e;
        this.f = aapm.f;
        this.g = aapm.g;
        this.h = aapm.h;
        this.i = aapm.i;
        this.j = aapm.j;
        this.k = aapm.k;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("lens_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        aapp aapp = this.c;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("lens_bundle_url", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("lens_index_pos", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("lens_index_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("lens_option_index_pos", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("lens_option_index_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("face_front_camera_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("face_back_camera_count", l);
        }
        aapr aapr = this.k;
        if (aapr != null) {
            hashMap.put("lens_type", aapr.toString());
        }
        return hashMap;
    }

    public final void a(aapp aapp) {
        this.c = aapp;
    }

    public final void a(aapr aapr) {
        this.k = aapr;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    /* renamed from: b */
    public final aapm clone() {
        aapm aapm = (aapm) super.clone();
        String str = this.a;
        if (str != null) {
            aapm.a = str;
        }
        str = this.b;
        if (str != null) {
            aapm.b = str;
        }
        aapp aapp = this.c;
        if (aapp != null) {
            aapm.c = aapp;
        }
        str = this.d;
        if (str != null) {
            aapm.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aapm.e = l;
        }
        l = this.f;
        if (l != null) {
            aapm.f = l;
        }
        l = this.g;
        if (l != null) {
            aapm.g = l;
        }
        l = this.h;
        if (l != null) {
            aapm.h = l;
        }
        l = this.i;
        if (l != null) {
            aapm.i = l;
        }
        l = this.j;
        if (l != null) {
            aapm.j = l;
        }
        aapr aapr = this.k;
        if (aapr != null) {
            aapm.k = aapr;
        }
        return aapm;
    }

    public final void b(Long l) {
        this.f = l;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(Long l) {
        this.i = l;
    }

    public final void d(Long l) {
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aapm) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        aapp aapp = this.c;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aapr aapr = this.k;
        if (aapr != null) {
            i = aapr.hashCode();
        }
        return hashCode + i;
    }
}
