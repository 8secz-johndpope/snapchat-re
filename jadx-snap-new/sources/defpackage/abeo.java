package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abeo */
public final class abeo extends abhw {
    private String a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private String g;
    private String h;

    private abeo a() {
        abeo abeo = (abeo) super.clone();
        String str = this.a;
        if (str != null) {
            abeo.a = str;
        }
        Long l = this.b;
        if (l != null) {
            abeo.b = l;
        }
        l = this.c;
        if (l != null) {
            abeo.c = l;
        }
        l = this.d;
        if (l != null) {
            abeo.d = l;
        }
        l = this.e;
        if (l != null) {
            abeo.e = l;
        }
        l = this.f;
        if (l != null) {
            abeo.f = l;
        }
        str = this.g;
        if (str != null) {
            abeo.g = str;
        }
        str = this.h;
        if (str != null) {
            abeo.h = str;
        }
        return abeo;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("search_term", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("sticker_bitmoji_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("sticker_snapchat_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("sticker_emoji_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("sticker_result_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("search_sequence_id", l);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("sticker_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final void c(Long l) {
        this.d = l;
    }

    public final void d(Long l) {
        this.e = l;
    }

    public final void e(Long l) {
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abeo) obj).asDictionary());
    }

    public final String getEventName() {
        return "STICKER_PICKER_SEARCH";
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
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
