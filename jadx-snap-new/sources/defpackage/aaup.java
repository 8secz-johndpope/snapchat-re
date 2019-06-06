package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaup */
public final class aaup implements Cloneable {
    public String a;

    public aaup(aaup aaup) {
        this.a = aaup.a;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("power_profile_json", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aaup clone() {
        aaup aaup = (aaup) super.clone();
        String str = this.a;
        if (str != null) {
            aaup.a = str;
        }
        return aaup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaup) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) + 381486;
    }
}
