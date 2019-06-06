package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamm */
public final class aamm extends abhw {
    private Long a;
    private String b;
    private String c;
    private String d;
    private Long e;
    private aaml f;
    private Long g;
    private String h;

    private aamm b() {
        aamm aamm = (aamm) super.clone();
        Long l = this.a;
        if (l != null) {
            aamm.a = l;
        }
        String str = this.b;
        if (str != null) {
            aamm.b = str;
        }
        str = this.c;
        if (str != null) {
            aamm.c = str;
        }
        str = this.d;
        if (str != null) {
            aamm.d = str;
        }
        l = this.e;
        if (l != null) {
            aamm.e = l;
        }
        aaml aaml = this.f;
        if (aaml != null) {
            aamm.f = aaml;
        }
        l = this.g;
        if (l != null) {
            aamm.g = l;
        }
        str = this.h;
        if (str != null) {
            aamm.h = str;
        }
        return aamm;
    }

    public final String a() {
        return this.c;
    }

    public final void a(aaml aaml) {
        this.f = aaml;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("size_byte", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("host", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("url_path", str);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("latency_ms", l);
        }
        aaml aaml = this.f;
        if (aaml != null) {
            hashMap.put("asset_type", aaml.toString());
        }
        l = this.g;
        if (l != null) {
            hashMap.put("status_code", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(Long l) {
        this.g = l;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aamm) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_ASSET_UPLOAD";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaml aaml = this.f;
        hashCode = (hashCode + (aaml != null ? aaml.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
