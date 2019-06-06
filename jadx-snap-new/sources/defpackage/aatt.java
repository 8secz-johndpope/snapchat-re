package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatt */
public final class aatt implements Cloneable {
    private aaua a;
    private String b;
    private String c;
    private String d;

    public aatt(aatt aatt) {
        this.a = aatt.a;
        this.b = aatt.b;
        this.c = aatt.c;
        this.d = aatt.d;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("page_type", aaua.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("page_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("page_type_specific", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("page_session_id", str);
        }
        return hashMap;
    }

    public final void a(String str) {
        this.d = str;
    }

    /* renamed from: b */
    public final aatt clone() {
        aatt aatt = (aatt) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aatt.a = aaua;
        }
        String str = this.b;
        if (str != null) {
            aatt.b = str;
        }
        str = this.c;
        if (str != null) {
            aatt.c = str;
        }
        str = this.d;
        if (str != null) {
            aatt.d = str;
        }
        return aatt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aatt) obj).a());
    }

    public final int hashCode() {
        aaua aaua = this.a;
        int i = 0;
        int hashCode = ((aaua != null ? aaua.hashCode() : 0) + 381486) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
