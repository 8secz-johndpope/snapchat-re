package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaba */
public final class aaba implements Cloneable {
    private Double a;
    private String b;
    private Double c;

    public aaba(aaba aaba) {
        this.a = aaba.a;
        this.b = aaba.b;
        this.c = aaba.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("duration_since_startup_finish_sec", d);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("startup_type", str);
        }
        d = this.c;
        if (d != null) {
            hashMap.put("process_start_ts", d);
        }
        return hashMap;
    }

    public final void a(Double d) {
        this.a = null;
    }

    public final void a(String str) {
        this.b = str;
    }

    /* renamed from: b */
    public final aaba clone() {
        aaba aaba = (aaba) super.clone();
        Double d = this.a;
        if (d != null) {
            aaba.a = d;
        }
        String str = this.b;
        if (str != null) {
            aaba.b = str;
        }
        d = this.c;
        if (d != null) {
            aaba.c = d;
        }
        return aaba;
    }

    public final void b(Double d) {
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaba) obj).a());
    }

    public final int hashCode() {
        Double d = this.a;
        int i = 0;
        int hashCode = ((d != null ? d.hashCode() : 0) + 381486) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d2 = this.c;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode + i;
    }
}
