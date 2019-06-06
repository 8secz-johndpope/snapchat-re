package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abed */
public final class abed extends abbo {
    public Boolean e;
    public Long f;
    public Long g;
    public Long h;
    public String i;
    public abbu j;
    public Long k;

    private abed b() {
        abed abed = (abed) super.clone();
        Boolean bool = this.e;
        if (bool != null) {
            abed.e = bool;
        }
        Long l = this.f;
        if (l != null) {
            abed.f = l;
        }
        l = this.g;
        if (l != null) {
            abed.g = l;
        }
        l = this.h;
        if (l != null) {
            abed.h = l;
        }
        String str = this.i;
        if (str != null) {
            abed.i = str;
        }
        abbu abbu = this.j;
        if (abbu != null) {
            abed.j = abbu;
        }
        l = this.k;
        if (l != null) {
            abed.k = l;
        }
        return abed;
    }

    public final /* synthetic */ abbo a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("is_charging", bool);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("device_battery", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("wifi_temperature", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("transfer_speed_bps", l);
        }
        String str = this.i;
        if (str != null) {
            hashMap.put(UploadedMediaModel.CONTENT_ID, str);
        }
        abbu abbu = this.j;
        if (abbu != null) {
            hashMap.put("file_type", abbu.toString());
        }
        l = this.k;
        if (l != null) {
            hashMap.put("file_size_bytes", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abed) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_TRANSFER_FILE_TRANSFER";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.e;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbu abbu = this.j;
        hashCode = (hashCode + (abbu != null ? abbu.hashCode() : 0)) * 31;
        l = this.k;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
