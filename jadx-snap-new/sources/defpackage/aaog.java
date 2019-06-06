package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaog */
public final class aaog implements Cloneable {
    private String a;
    private String b;
    private String c;

    public aaog(aaog aaog) {
        this.a = aaog.a;
        this.b = aaog.b;
        this.c = aaog.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("renderer_name", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("vendor_name", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("gpu_version", str);
        }
        return hashMap;
    }

    public final void a(String str) {
        this.a = str;
    }

    /* renamed from: b */
    public final aaog clone() {
        aaog aaog = (aaog) super.clone();
        String str = this.a;
        if (str != null) {
            aaog.a = str;
        }
        str = this.b;
        if (str != null) {
            aaog.b = str;
        }
        str = this.c;
        if (str != null) {
            aaog.c = str;
        }
        return aaog;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaog) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
