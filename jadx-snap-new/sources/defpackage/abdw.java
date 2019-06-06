package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdw */
public final class abdw extends abbr {
    private abdv a;
    private abdy b;
    private Long c;
    private abdu d;

    private abdw b() {
        abdw abdw = (abdw) super.clone();
        abdv abdv = this.a;
        if (abdv != null) {
            abdw.a = abdv;
        }
        abdy abdy = this.b;
        if (abdy != null) {
            abdw.b = abdy;
        }
        Long l = this.c;
        if (l != null) {
            abdw.c = l;
        }
        abdu abdu = this.d;
        if (abdu != null) {
            abdw.d = abdu;
        }
        return abdw;
    }

    public final /* synthetic */ abbr a() {
        return b();
    }

    public final void a(abdu abdu) {
        this.d = abdu;
    }

    public final void a(abdv abdv) {
        this.a = abdv;
    }

    public final void a(abdy abdy) {
        this.b = abdy;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abdv abdv = this.a;
        if (abdv != null) {
            hashMap.put("settings_action", abdv.toString());
        }
        abdy abdy = this.b;
        if (abdy != null) {
            hashMap.put("prompt_action", abdy.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("num_devices", l);
        }
        abdu abdu = this.d;
        if (abdu != null) {
            hashMap.put("failure_reason", abdu.toString());
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
        return asDictionary().equals(((abdw) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_SETTINGS_DEVICE_ACTION";
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
        abdv abdv = this.a;
        int i = 0;
        hashCode = (hashCode + (abdv != null ? abdv.hashCode() : 0)) * 31;
        abdy abdy = this.b;
        hashCode = (hashCode + (abdy != null ? abdy.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abdu abdu = this.d;
        if (abdu != null) {
            i = abdu.hashCode();
        }
        return hashCode + i;
    }
}
