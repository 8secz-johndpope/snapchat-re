package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatu */
public final class aatu implements Cloneable {
    private aayu a;
    private Long b;
    private aaoz c;
    private String d;
    private String e;
    private Long f;
    private String g;

    public aatu(aatu aatu) {
        this.a = aatu.a;
        this.b = aatu.b;
        this.c = aatu.c;
        this.d = aatu.d;
        this.e = aatu.e;
        this.f = aatu.f;
        this.g = aatu.g;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        aayu aayu = this.a;
        if (aayu != null) {
            hashMap.put("section_layout", aayu.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("section_update_id", l);
        }
        aaoz aaoz = this.c;
        if (aaoz != null) {
            hashMap.put("item_type", aaoz.toString());
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("item_type_specific", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("item_id", str);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("item_pos", l);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("item_appearance", str);
        }
        return hashMap;
    }

    public final void a(String str) {
        this.e = str;
    }

    /* renamed from: b */
    public final aatu clone() {
        aatu aatu = (aatu) super.clone();
        aayu aayu = this.a;
        if (aayu != null) {
            aatu.a = aayu;
        }
        Long l = this.b;
        if (l != null) {
            aatu.b = l;
        }
        aaoz aaoz = this.c;
        if (aaoz != null) {
            aatu.c = aaoz;
        }
        String str = this.d;
        if (str != null) {
            aatu.d = str;
        }
        str = this.e;
        if (str != null) {
            aatu.e = str;
        }
        l = this.f;
        if (l != null) {
            aatu.f = l;
        }
        str = this.g;
        if (str != null) {
            aatu.g = str;
        }
        return aatu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aatu) obj).a());
    }

    public final int hashCode() {
        aayu aayu = this.a;
        int i = 0;
        int hashCode = ((aayu != null ? aayu.hashCode() : 0) + 381486) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaoz aaoz = this.c;
        hashCode = (hashCode + (aaoz != null ? aaoz.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
