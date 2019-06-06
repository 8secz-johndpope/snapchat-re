package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamv */
public final class aamv extends abhw {
    private aamp a;
    private Long b;
    private Long c;
    private aamx d;
    private aamw e;
    private String f;
    private Long g;
    private String h;

    private aamv a() {
        aamv aamv = (aamv) super.clone();
        aamp aamp = this.a;
        if (aamp != null) {
            aamv.a = aamp;
        }
        Long l = this.b;
        if (l != null) {
            aamv.b = l;
        }
        l = this.c;
        if (l != null) {
            aamv.c = l;
        }
        aamx aamx = this.d;
        if (aamx != null) {
            aamv.d = aamx;
        }
        aamw aamw = this.e;
        if (aamw != null) {
            aamv.e = aamw;
        }
        String str = this.f;
        if (str != null) {
            aamv.f = str;
        }
        l = this.g;
        if (l != null) {
            aamv.g = l;
        }
        str = this.h;
        if (str != null) {
            aamv.h = str;
        }
        return aamv;
    }

    public final void a(aamp aamp) {
        this.a = aamp;
    }

    public final void a(aamw aamw) {
        this.e = aamw;
    }

    public final void a(aamx aamx) {
        this.d = aamx;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aamp aamp = this.a;
        if (aamp != null) {
            hashMap.put("gallery_context_menu_source", aamp.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("story_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("snap_count", l);
        }
        aamx aamx = this.d;
        if (aamx != null) {
            hashMap.put("export_result", aamx.toString());
        }
        aamw aamw = this.e;
        if (aamw != null) {
            hashMap.put("export_destination", aamw.toString());
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("content", str);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("latency_ms", l);
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
        this.c = l;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(Long l) {
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aamv) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_EXPORT_COMPLETE";
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
        aamp aamp = this.a;
        int i = 0;
        hashCode = (hashCode + (aamp != null ? aamp.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aamx aamx = this.d;
        hashCode = (hashCode + (aamx != null ? aamx.hashCode() : 0)) * 31;
        aamw aamw = this.e;
        hashCode = (hashCode + (aamw != null ? aamw.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
