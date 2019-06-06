package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abcf */
public final class abcf extends abeb {
    private abcg a;

    private abcf a() {
        abcf abcf = (abcf) super.clone();
        abcg abcg = this.a;
        if (abcg != null) {
            abcf.a = abcg;
        }
        return abcf;
    }

    public final void a(abcg abcg) {
        this.a = abcg;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abcg abcg = this.a;
        if (abcg != null) {
            hashMap.put("prompt_action", abcg.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abcf) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_FIRMWARE_UPDATE_PROMPT";
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
        abcg abcg = this.a;
        return hashCode + (abcg != null ? abcg.hashCode() : 0);
    }
}
