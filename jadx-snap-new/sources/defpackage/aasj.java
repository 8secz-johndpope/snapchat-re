package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasj */
public final class aasj extends abhw {
    private String a;

    private aasj a() {
        aasj aasj = (aasj) super.clone();
        String str = this.a;
        if (str != null) {
            aasj.a = str;
        }
        return aasj;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("destination_url", str);
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
        return asDictionary().equals(((aasj) obj).asDictionary());
    }

    public final String getEventName() {
        return "MUSIC_EXTERNAL_BROWSER_OPEN";
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
