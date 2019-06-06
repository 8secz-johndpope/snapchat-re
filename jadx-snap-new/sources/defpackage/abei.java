package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abei */
public abstract class abei extends abbp {
    public abds b;
    public Long c;
    public Long d;
    public Long e;

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abds abds = this.b;
        if (abds != null) {
            hashMap.put("phone_wifi_status", abds.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("num_sd_videos", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("num_hd_videos", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("num_photos", l);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: d */
    public abei clone() {
        abei abei = (abei) super.clone();
        abds abds = this.b;
        if (abds != null) {
            abei.b = abds;
        }
        Long l = this.c;
        if (l != null) {
            abei.c = l;
        }
        l = this.d;
        if (l != null) {
            abei.d = l;
        }
        l = this.e;
        if (l != null) {
            abei.e = l;
        }
        return abei;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abei) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        abds abds = this.b;
        int i = 0;
        hashCode = (hashCode + (abds != null ? abds.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
