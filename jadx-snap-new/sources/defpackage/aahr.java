package defpackage;

import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aahr */
public final class aahr implements Cloneable {
    private String a;
    private Double b;
    private String c;
    private Boolean d;
    private Boolean e;
    private String f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;

    public aahr(aahr aahr) {
        this.a = aahr.a;
        this.b = aahr.b;
        this.c = aahr.c;
        this.d = aahr.d;
        this.e = aahr.e;
        this.f = aahr.f;
        this.g = aahr.g;
        this.h = aahr.h;
        this.i = aahr.i;
        this.j = aahr.j;
        this.k = aahr.k;
        this.l = aahr.l;
        this.m = aahr.m;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put(ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER, str);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("playback_rate", d);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("lens_id", str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("has_geofilter", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("is_multi_snap", bool);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("multi_snap_bundle_id", str);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("is_animated", bool);
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("has3_d_stickers", bool);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("has_audio", bool);
        }
        bool = this.j;
        if (bool != null) {
            hashMap.put("has_audio_filter", bool);
        }
        bool = this.k;
        if (bool != null) {
            hashMap.put("has_stickers", bool);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("has_caption", bool);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("has_drawing", bool);
        }
        return hashMap;
    }

    public final void a(Boolean bool) {
        this.d = bool;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final void a(String str) {
        this.a = str;
    }

    /* renamed from: b */
    public final aahr clone() {
        aahr aahr = (aahr) super.clone();
        String str = this.a;
        if (str != null) {
            aahr.a = str;
        }
        Double d = this.b;
        if (d != null) {
            aahr.b = d;
        }
        str = this.c;
        if (str != null) {
            aahr.c = str;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aahr.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aahr.e = bool;
        }
        str = this.f;
        if (str != null) {
            aahr.f = str;
        }
        bool = this.g;
        if (bool != null) {
            aahr.g = bool;
        }
        bool = this.h;
        if (bool != null) {
            aahr.h = bool;
        }
        bool = this.i;
        if (bool != null) {
            aahr.i = bool;
        }
        bool = this.j;
        if (bool != null) {
            aahr.j = bool;
        }
        bool = this.k;
        if (bool != null) {
            aahr.k = bool;
        }
        bool = this.l;
        if (bool != null) {
            aahr.l = bool;
        }
        bool = this.m;
        if (bool != null) {
            aahr.m = bool;
        }
        return aahr;
    }

    public final void b(Boolean bool) {
        this.e = bool;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(Boolean bool) {
        this.g = bool;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final void d(Boolean bool) {
        this.h = bool;
    }

    public final void e(Boolean bool) {
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aahr) obj).a());
    }

    public final void f(Boolean bool) {
        this.j = bool;
    }

    public final void g(Boolean bool) {
        this.k = bool;
    }

    public final void h(Boolean bool) {
        this.l = bool;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.m;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Boolean bool) {
        this.m = bool;
    }
}
