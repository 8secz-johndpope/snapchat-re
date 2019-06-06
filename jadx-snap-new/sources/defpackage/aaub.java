package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaub */
public final class aaub implements Cloneable {
    public String a;
    public String b;

    public aaub(aaub aaub) {
        this.a = aaub.a;
        this.b = aaub.b;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("page_type_most_view", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("page_type_ms_record", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aaub clone() {
        aaub aaub = (aaub) super.clone();
        String str = this.a;
        if (str != null) {
            aaub.a = str;
        }
        str = this.b;
        if (str != null) {
            aaub.b = str;
        }
        return aaub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaub) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
