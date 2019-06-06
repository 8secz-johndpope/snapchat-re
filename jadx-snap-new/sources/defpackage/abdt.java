package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdt */
public final class abdt extends abhw {
    private abbs a;
    private Long b;
    private abdv c;

    private abdt a() {
        abdt abdt = (abdt) super.clone();
        abbs abbs = this.a;
        if (abbs != null) {
            abdt.a = abbs;
        }
        Long l = this.b;
        if (l != null) {
            abdt.b = l;
        }
        abdv abdv = this.c;
        if (abdv != null) {
            abdt.c = abdv;
        }
        return abdt;
    }

    public final void a(abbs abbs) {
        this.a = abbs;
    }

    public final void a(abdv abdv) {
        this.c = abdv;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abbs abbs = this.a;
        if (abbs != null) {
            hashMap.put("device_state", abbs.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("num_devices", l);
        }
        abdv abdv = this.c;
        if (abdv != null) {
            hashMap.put("settings_action", abdv.toString());
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
        return asDictionary().equals(((abdt) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_SETTINGS_ACTION";
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
        abbs abbs = this.a;
        int i = 0;
        hashCode = (hashCode + (abbs != null ? abbs.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abdv abdv = this.c;
        if (abdv != null) {
            i = abdv.hashCode();
        }
        return hashCode + i;
    }
}
