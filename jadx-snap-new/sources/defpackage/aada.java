package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aada */
public final class aada extends abhw {
    private String a;
    private Double b;
    private Long c;
    private String d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private aadb h;
    private Boolean i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;
    private String n;

    private aada a() {
        aada aada = (aada) super.clone();
        String str = this.a;
        if (str != null) {
            aada.a = str;
        }
        Double d = this.b;
        if (d != null) {
            aada.b = d;
        }
        Long l = this.c;
        if (l != null) {
            aada.c = l;
        }
        str = this.d;
        if (str != null) {
            aada.d = str;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aada.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aada.f = bool;
        }
        bool = this.g;
        if (bool != null) {
            aada.g = bool;
        }
        aadb aadb = this.h;
        if (aadb != null) {
            aada.h = aadb;
        }
        bool = this.i;
        if (bool != null) {
            aada.i = bool;
        }
        l = this.j;
        if (l != null) {
            aada.j = l;
        }
        l = this.k;
        if (l != null) {
            aada.k = l;
        }
        l = this.l;
        if (l != null) {
            aada.l = l;
        }
        l = this.m;
        if (l != null) {
            aada.m = l;
        }
        str = this.n;
        if (str != null) {
            aada.n = str;
        }
        return aada;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("caption_add_tap_position", str);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("caption_font_loading_delay", d);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("caption_view_count", l);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("caption_view_list", str);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("with_caption_resize", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_caption_color_pick", bool);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("with_caption", bool);
        }
        aadb aadb = this.h;
        if (aadb != null) {
            hashMap.put("caption_exit_source", aadb.toString());
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("with_tag", bool);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("tag_mode_from_typing_count", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("tag_mode_from_button_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("tag_mode_from_sticker_count", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("tag_select_count", l);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.f = bool;
    }

    public final void b(Long l) {
        this.j = l;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(Boolean bool) {
        this.g = bool;
    }

    public final void c(Long l) {
        this.k = l;
    }

    public final void d(Boolean bool) {
        this.i = bool;
    }

    public final void d(Long l) {
        this.m = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aada) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAPTION_CAROUSEL_SESSION_END";
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
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aadb aadb = this.h;
        hashCode = (hashCode + (aadb != null ? aadb.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.n;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
