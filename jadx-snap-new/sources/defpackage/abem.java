package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abem */
public final class abem extends aben {
    private String a;

    private abem b() {
        abem abem = (abem) super.clone();
        String str = this.a;
        if (str != null) {
            abem.a = str;
        }
        return abem;
    }

    public final /* synthetic */ aben a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("capture_session_id", str);
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
        return asDictionary().equals(((abem) obj).asDictionary());
    }

    public final String getEventName() {
        return "STICKER_PICKER_PICK";
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
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
