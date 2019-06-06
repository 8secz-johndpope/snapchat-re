package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abde */
public abstract class abde extends abeb {
    private String a;
    private abdr b;
    private abdl c;
    private Long d;
    private Double e;
    private abbe f;
    private abbf g;

    /* renamed from: a */
    public abde clone() {
        abde abde = (abde) super.clone();
        String str = this.a;
        if (str != null) {
            abde.a = str;
        }
        abdr abdr = this.b;
        if (abdr != null) {
            abde.b = abdr;
        }
        abdl abdl = this.c;
        if (abdl != null) {
            abde.c = abdl;
        }
        Long l = this.d;
        if (l != null) {
            abde.d = l;
        }
        Double d = this.e;
        if (d != null) {
            abde.e = d;
        }
        abbe abbe = this.f;
        if (abbe != null) {
            abde.f = abbe;
        }
        abbf abbf = this.g;
        if (abbf != null) {
            abde.g = abbf;
        }
        return abde;
    }

    public final void a(abbe abbe) {
        this.f = abbe;
    }

    public final void a(abbf abbf) {
        this.g = abbf;
    }

    public final void a(abdl abdl) {
        this.c = abdl;
    }

    public final void a(abdr abdr) {
        this.b = abdr;
    }

    public final void a(Double d) {
        this.e = d;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("pairing_session_id", str);
        }
        abdr abdr = this.b;
        if (abdr != null) {
            hashMap.put("pairing_type", abdr.toString());
        }
        abdl abdl = this.c;
        if (abdl != null) {
            hashMap.put("pairing_source", abdl.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("retry_count", l);
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("duration_sec", d);
        }
        abbe abbe = this.f;
        if (abbe != null) {
            hashMap.put("ble_state", abbe.toString());
        }
        abbf abbf = this.g;
        if (abbf != null) {
            hashMap.put("btc_state", abbf.toString());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abde) obj).asDictionary());
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
        abdr abdr = this.b;
        hashCode = (hashCode + (abdr != null ? abdr.hashCode() : 0)) * 31;
        abdl abdl = this.c;
        hashCode = (hashCode + (abdl != null ? abdl.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abbe abbe = this.f;
        hashCode = (hashCode + (abbe != null ? abbe.hashCode() : 0)) * 31;
        abbf abbf = this.g;
        if (abbf != null) {
            i = abbf.hashCode();
        }
        return hashCode + i;
    }
}
