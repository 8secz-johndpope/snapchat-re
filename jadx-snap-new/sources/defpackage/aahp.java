package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahp */
public final class aahp implements Cloneable {
    public aaho a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public aahq g;
    public Boolean h;

    public aahp(aahp aahp) {
        this.a = aahp.a;
        this.b = aahp.b;
        this.c = aahp.c;
        this.d = aahp.d;
        this.e = aahp.e;
        this.f = aahp.f;
        this.g = aahp.g;
        this.h = aahp.h;
    }

    public final Boolean a() {
        return this.c;
    }

    public final void a(aaho aaho) {
        this.a = aaho;
    }

    public final void a(aahq aahq) {
        this.g = aahq;
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Boolean b() {
        return this.d;
    }

    public final void b(Boolean bool) {
        this.d = bool;
    }

    public final Boolean c() {
        return this.e;
    }

    public final void c(Boolean bool) {
        this.e = bool;
    }

    public final Boolean d() {
        return this.f;
    }

    public final void d(Boolean bool) {
        this.f = bool;
    }

    public final Boolean e() {
        return this.h;
    }

    public final void e(Boolean bool) {
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return f().equals(((aahp) obj).f());
    }

    public final Map<String, Object> f() {
        HashMap hashMap = new HashMap();
        aaho aaho = this.a;
        if (aaho != null) {
            hashMap.put("snap_kit_share_type", aaho.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("o_auth_client_id", str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("snap_kit_with_attachment_url", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("snap_kit_delete_attachment_url", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("snap_kit_with_caption", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("snap_kit_delete_caption", bool);
        }
        aahq aahq = this.g;
        if (aahq != null) {
            hashMap.put("snap_kit_sticker_type", aahq.toString());
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("snap_kit_delete_sticker", bool);
        }
        return hashMap;
    }

    /* renamed from: g */
    public final aahp clone() {
        aahp aahp = (aahp) super.clone();
        aaho aaho = this.a;
        if (aaho != null) {
            aahp.a = aaho;
        }
        String str = this.b;
        if (str != null) {
            aahp.b = str;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aahp.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aahp.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aahp.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aahp.f = bool;
        }
        aahq aahq = this.g;
        if (aahq != null) {
            aahp.g = aahq;
        }
        bool = this.h;
        if (bool != null) {
            aahp.h = bool;
        }
        return aahp;
    }

    public final int hashCode() {
        aaho aaho = this.a;
        int i = 0;
        int hashCode = ((aaho != null ? aaho.hashCode() : 0) + 381486) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aahq aahq = this.g;
        hashCode = (hashCode + (aahq != null ? aahq.hashCode() : 0)) * 31;
        bool = this.h;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
