package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahk */
public final class aahk implements Cloneable {
    public String a;

    public aahk(aahk aahk) {
        this.a = aahk.a;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("cpu_freq_record", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aahk clone() {
        aahk aahk = (aahk) super.clone();
        String str = this.a;
        if (str != null) {
            aahk.a = str;
        }
        return aahk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aahk) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) + 381486;
    }
}
