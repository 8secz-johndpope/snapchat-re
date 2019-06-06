package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abdx */
public final class abdx extends abhw {
    private String a;
    private abdy b;
    private aamp c;
    private abdz d;
    private String e;

    private abdx a() {
        abdx abdx = (abdx) super.clone();
        String str = this.a;
        if (str != null) {
            abdx.a = str;
        }
        abdy abdy = this.b;
        if (abdy != null) {
            abdx.b = abdy;
        }
        aamp aamp = this.c;
        if (aamp != null) {
            abdx.c = aamp;
        }
        abdz abdz = this.d;
        if (abdz != null) {
            abdx.d = abdz;
        }
        str = this.e;
        if (str != null) {
            abdx.e = str;
        }
        return abdx;
    }

    public final void a(abdy abdy) {
        this.b = abdy;
    }

    public final void a(abdz abdz) {
        this.d = abdz;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put(UploadedMediaModel.CONTENT_ID, str);
        }
        abdy abdy = this.b;
        if (abdy != null) {
            hashMap.put("prompt_action", abdy.toString());
        }
        aamp aamp = this.c;
        if (aamp != null) {
            hashMap.put("source", aamp.toString());
        }
        abdz abdz = this.d;
        if (abdz != null) {
            hashMap.put("cancellation_source", abdz.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("share_channel", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abdx) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_SNAP_CUSTOM_EXPORT";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abdy abdy = this.b;
        hashCode = (hashCode + (abdy != null ? abdy.hashCode() : 0)) * 31;
        aamp aamp = this.c;
        hashCode = (hashCode + (aamp != null ? aamp.hashCode() : 0)) * 31;
        abdz abdz = this.d;
        hashCode = (hashCode + (abdz != null ? abdz.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
