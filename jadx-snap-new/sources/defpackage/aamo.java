package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamo */
public final class aamo extends abhw {
    private String a;
    private Long b;
    private String c;
    private aarr d;
    private aamy e;

    private aamo a() {
        aamo aamo = (aamo) super.clone();
        String str = this.a;
        if (str != null) {
            aamo.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aamo.b = l;
        }
        str = this.c;
        if (str != null) {
            aamo.c = str;
        }
        aarr aarr = this.d;
        if (aarr != null) {
            aamo.d = aarr;
        }
        aamy aamy = this.e;
        if (aamy != null) {
            aamo.e = aamy;
        }
        return aamo;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("latency", l);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("specs_content_id", str);
        }
        aarr aarr = this.d;
        if (aarr != null) {
            hashMap.put("media_format", aarr.toString());
        }
        aamy aamy = this.e;
        if (aamy != null) {
            hashMap.put("gallery_media_type", aamy.toString());
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
        return asDictionary().equals(((aamo) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_BROWSE_VIEW_LATENCY";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aarr aarr = this.d;
        hashCode = (hashCode + (aarr != null ? aarr.hashCode() : 0)) * 31;
        aamy aamy = this.e;
        if (aamy != null) {
            i = aamy.hashCode();
        }
        return hashCode + i;
    }
}
