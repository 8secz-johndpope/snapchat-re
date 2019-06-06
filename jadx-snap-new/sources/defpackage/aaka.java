package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaka */
public abstract class aaka extends abhw {
    public aaua a;
    public String b;
    public aake c;
    public Long d;
    public String e;
    public String f;

    /* renamed from: a */
    public aaka clone() {
        aaka aaka = (aaka) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aaka.a = aaua;
        }
        String str = this.b;
        if (str != null) {
            aaka.b = str;
        }
        aake aake = this.c;
        if (aake != null) {
            aaka.c = aake;
        }
        Long l = this.d;
        if (l != null) {
            aaka.d = l;
        }
        str = this.e;
        if (str != null) {
            aaka.e = str;
        }
        str = this.f;
        if (str != null) {
            aaka.f = str;
        }
        return aaka;
    }

    public final void a(aake aake) {
        this.c = aake;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(String str) {
        this.e = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("page_type", aaua.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("page_type_specific", str);
        }
        aake aake = this.c;
        if (aake != null) {
            hashMap.put("section", aake.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("section_pos", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("section_name", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("page_session_id", str);
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
        return asDictionary().equals(((aaka) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aake aake = this.c;
        hashCode = (hashCode + (aake != null ? aake.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
