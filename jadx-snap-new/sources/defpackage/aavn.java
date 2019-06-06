package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavn */
public final class aavn implements Cloneable {
    private String a;
    private Boolean b;
    private String c;

    public aavn(aavn aavn) {
        this.a = aavn.a;
        this.b = aavn.b;
        this.c = aavn.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("registration_session_id", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("has_logged_in_before", bool);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        return hashMap;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(String str) {
        this.a = str;
    }

    /* renamed from: b */
    public final aavn clone() {
        aavn aavn = (aavn) super.clone();
        String str = this.a;
        if (str != null) {
            aavn.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aavn.b = bool;
        }
        str = this.c;
        if (str != null) {
            aavn.c = str;
        }
        return aavn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aavn) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
