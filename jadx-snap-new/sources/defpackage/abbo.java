package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbo */
public abstract class abbo extends abeb {
    public String a;
    public abec b;
    public abej c;
    public Long d;

    /* renamed from: a */
    public abbo clone() {
        abbo abbo = (abbo) super.clone();
        String str = this.a;
        if (str != null) {
            abbo.a = str;
        }
        abec abec = this.b;
        if (abec != null) {
            abbo.b = abec;
        }
        abej abej = this.c;
        if (abej != null) {
            abbo.c = abej;
        }
        Long l = this.d;
        if (l != null) {
            abbo.d = l;
        }
        return abbo;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("transfer_session_id", str);
        }
        abec abec = this.b;
        if (abec != null) {
            hashMap.put("transfer_channel", abec.toString());
        }
        abej abej = this.c;
        if (abej != null) {
            hashMap.put("transfer_type", abej.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("wifi_frequency_mhz", l);
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
        return asDictionary().equals(((abbo) obj).asDictionary());
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
        abec abec = this.b;
        hashCode = (hashCode + (abec != null ? abec.hashCode() : 0)) * 31;
        abej abej = this.c;
        hashCode = (hashCode + (abej != null ? abej.hashCode() : 0)) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
