package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaai */
public final class aaai extends abhw {
    private String a;
    private String b;

    private aaai a() {
        aaai aaai = (aaai) super.clone();
        String str = this.a;
        if (str != null) {
            aaai.a = str;
        }
        str = this.b;
        if (str != null) {
            aaai.b = str;
        }
        return aaai;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("old_version", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("new_version", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaai) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_BLIZZARD_CONFIG_CHANGE";
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
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
