package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatx */
public final class aatx implements Cloneable {
    private aatv a;
    private Long b;
    private aaty c;
    private String d;
    private String e;
    private Long f;

    public aatx(aatx aatx) {
        this.a = aatx.a;
        this.b = aatx.b;
        this.c = aatx.c;
        this.d = aatx.d;
        this.e = aatx.e;
        this.f = aatx.f;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        aatv aatv = this.a;
        if (aatv != null) {
            hashMap.put("page_layout", aatv.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("page_update_id", l);
        }
        aaty aaty = this.c;
        if (aaty != null) {
            hashMap.put("section_type", aaty.toString());
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("section_type_specific", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("section_id", str);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("section_pos", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aatx clone() {
        aatx aatx = (aatx) super.clone();
        aatv aatv = this.a;
        if (aatv != null) {
            aatx.a = aatv;
        }
        Long l = this.b;
        if (l != null) {
            aatx.b = l;
        }
        aaty aaty = this.c;
        if (aaty != null) {
            aatx.c = aaty;
        }
        String str = this.d;
        if (str != null) {
            aatx.d = str;
        }
        str = this.e;
        if (str != null) {
            aatx.e = str;
        }
        l = this.f;
        if (l != null) {
            aatx.f = l;
        }
        return aatx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aatx) obj).a());
    }

    public final int hashCode() {
        aatv aatv = this.a;
        int i = 0;
        int hashCode = ((aatv != null ? aatv.hashCode() : 0) + 381486) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaty aaty = this.c;
        hashCode = (hashCode + (aaty != null ? aaty.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
