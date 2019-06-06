package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aban */
public abstract class aban extends abhw {
    private String a;
    private aapa b;
    private String c;
    private String d;

    /* renamed from: a */
    public aban clone() {
        aban aban = (aban) super.clone();
        String str = this.a;
        if (str != null) {
            aban.a = str;
        }
        aapa aapa = this.b;
        if (aapa != null) {
            aban.b = aapa;
        }
        str = this.c;
        if (str != null) {
            aban.c = str;
        }
        str = this.d;
        if (str != null) {
            aban.d = str;
        }
        return aban;
    }

    public final void a(aapa aapa) {
        this.b = aapa;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("o_auth_client_id", str);
        }
        aapa aapa = this.b;
        if (aapa != null) {
            hashMap.put("kit_variant", aapa.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("kit_variant_version", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("kit_app_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aban) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapa aapa = this.b;
        hashCode = (hashCode + (aapa != null ? aapa.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
