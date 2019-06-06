package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aave */
public final class aave implements Cloneable {
    private String a;
    private String b;
    private String c;

    public aave(aave aave) {
        this.a = aave.a;
        this.b = aave.b;
        this.c = aave.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aave clone() {
        aave aave = (aave) super.clone();
        String str = this.a;
        if (str != null) {
            aave.a = str;
        }
        str = this.b;
        if (str != null) {
            aave.b = str;
        }
        str = this.c;
        if (str != null) {
            aave.c = str;
        }
        return aave;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aave) obj).a());
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
