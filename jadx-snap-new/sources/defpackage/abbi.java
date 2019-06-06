package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbi */
public abstract class abbi extends abea {
    public abec a;
    public Boolean b;
    public Long c;
    public Long d;
    public abds e;
    private String f;
    private String g;
    private String h;

    /* renamed from: a */
    public abbi clone() {
        abbi abbi = (abbi) super.clone();
        String str = this.f;
        if (str != null) {
            abbi.f = str;
        }
        str = this.g;
        if (str != null) {
            abbi.g = str;
        }
        str = this.h;
        if (str != null) {
            abbi.h = str;
        }
        abec abec = this.a;
        if (abec != null) {
            abbi.a = abec;
        }
        Boolean bool = this.b;
        if (bool != null) {
            abbi.b = bool;
        }
        Long l = this.c;
        if (l != null) {
            abbi.c = l;
        }
        l = this.d;
        if (l != null) {
            abbi.d = l;
        }
        abds abds = this.e;
        if (abds != null) {
            abbi.e = abds;
        }
        return abbi;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.f;
        if (str != null) {
            hashMap.put("pairing_session_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("transfer_session_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("update_session_id", str);
        }
        abec abec = this.a;
        if (abec != null) {
            hashMap.put("transfer_channel", abec.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("is_charging", bool);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("device_battery", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("device_storage", l);
        }
        abds abds = this.e;
        if (abds != null) {
            hashMap.put("phone_wifi_status", abds.toString());
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
        return asDictionary().equals(((abbi) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abec abec = this.a;
        hashCode = (hashCode + (abec != null ? abec.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abds abds = this.e;
        if (abds != null) {
            i = abds.hashCode();
        }
        return hashCode + i;
    }
}
