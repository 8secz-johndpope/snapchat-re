package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaoa */
public final class aaoa extends aape {
    private String a;
    private aapp b;

    private aaoa c() {
        aaoa aaoa = (aaoa) super.clone();
        String str = this.a;
        if (str != null) {
            aaoa.a = str;
        }
        aapp aapp = this.b;
        if (aapp != null) {
            aaoa.b = aapp;
        }
        return aaoa;
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
            hashMap.put("filter_geolens_id", str);
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
        return asDictionary().equals(((aaoa) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOLENS_CAMERA_FLIP";
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
