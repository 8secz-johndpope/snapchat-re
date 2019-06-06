package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapd */
public final class aapd extends aape {
    private String a;
    private aapp b;

    private aapd c() {
        aapd aapd = (aapd) super.clone();
        String str = this.a;
        if (str != null) {
            aapd.a = str;
        }
        aapp aapp = this.b;
        if (aapp != null) {
            aapd.b = aapp;
        }
        return aapd;
    }

    public final /* synthetic */ aaca a() {
        return c();
    }

    public final void a(aapp aapp) {
        this.b = aapp;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        aapp aapp = this.b;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aape b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aapd) obj).asDictionary());
    }

    public final String getEventName() {
        return "LENS_CAMERA_FLIP";
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
        aapp aapp = this.b;
        if (aapp != null) {
            i = aapp.hashCode();
        }
        return hashCode + i;
    }
}
