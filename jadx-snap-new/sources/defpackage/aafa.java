package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aafa */
public final class aafa extends aadz {
    private aafg a;
    private Boolean b;

    private aafa c() {
        aafa aafa = (aafa) super.clone();
        aafg aafg = this.a;
        if (aafg != null) {
            aafa.a = aafg;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aafa.b = bool;
        }
        return aafa;
    }

    public final /* synthetic */ aadz a() {
        return c();
    }

    public final void a(aafg aafg) {
        this.a = aafg;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aafg aafg = this.a;
        if (aafg != null) {
            hashMap.put("selection", aafg.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("app_audio_on", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aafa) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_IN_APP_SETTINGS_PAGE_SELECTION";
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
        aafg aafg = this.a;
        int i = 0;
        hashCode = (hashCode + (aafg != null ? aafg.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
