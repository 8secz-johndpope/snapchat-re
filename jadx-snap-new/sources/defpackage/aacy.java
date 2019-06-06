package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacy */
public final class aacy extends abhw {
    private Boolean a;
    private String b;
    private aami c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private String h;
    private aaxu i;

    private aacy a() {
        aacy aacy = (aacy) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aacy.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aacy.b = str;
        }
        aami aami = this.c;
        if (aami != null) {
            aacy.c = aami;
        }
        Long l = this.d;
        if (l != null) {
            aacy.d = l;
        }
        l = this.e;
        if (l != null) {
            aacy.e = l;
        }
        l = this.f;
        if (l != null) {
            aacy.f = l;
        }
        l = this.g;
        if (l != null) {
            aacy.g = l;
        }
        str = this.h;
        if (str != null) {
            aacy.h = str;
        }
        aaxu aaxu = this.i;
        if (aaxu != null) {
            aacy.a(aaxu.clone());
        }
        return aacy;
    }

    public final void a(aami aami) {
        this.c = aami;
    }

    public final void a(aaxu aaxu) {
        if (aaxu == null) {
            this.i = null;
        } else {
            this.i = new aaxu(aaxu);
        }
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        aami aami = this.c;
        if (aami != null) {
            hashMap.put("frame_extractor_api", aami.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("total_delay_ms", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("max_delay_ms", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("total_frame_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("finished_frame_count", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("callers", str);
        }
        aaxu aaxu = this.i;
        if (aaxu != null) {
            hashMap.putAll(aaxu.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(Long l) {
        this.f = l;
    }

    public final void d(Long l) {
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacy) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_VIDEO_FRAME_RETRIEVE";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aami aami = this.c;
        hashCode = (hashCode + (aami != null ? aami.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaxu aaxu = this.i;
        if (aaxu != null) {
            i = aaxu.hashCode();
        }
        return hashCode + i;
    }
}
