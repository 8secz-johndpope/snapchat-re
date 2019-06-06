package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaui */
public final class aaui extends abhw {
    private String a;
    private Long b;
    private String c;
    private aaum d;
    private aauk e;
    private aaun f;
    private Long g;
    private Long h;
    private aahb i;
    private String j;
    private String k;
    private String l;
    private String m;
    private Boolean n;
    private String o;
    private String p;
    private aasq q;

    private aaui a() {
        aaui aaui = (aaui) super.clone();
        String str = this.a;
        if (str != null) {
            aaui.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aaui.b = l;
        }
        str = this.c;
        if (str != null) {
            aaui.c = str;
        }
        aaum aaum = this.d;
        if (aaum != null) {
            aaui.d = aaum;
        }
        aauk aauk = this.e;
        if (aauk != null) {
            aaui.e = aauk;
        }
        aaun aaun = this.f;
        if (aaun != null) {
            aaui.f = aaun;
        }
        l = this.g;
        if (l != null) {
            aaui.g = l;
        }
        l = this.h;
        if (l != null) {
            aaui.h = l;
        }
        aahb aahb = this.i;
        if (aahb != null) {
            aaui.i = aahb;
        }
        str = this.j;
        if (str != null) {
            aaui.j = str;
        }
        str = this.k;
        if (str != null) {
            aaui.k = str;
        }
        str = this.l;
        if (str != null) {
            aaui.l = str;
        }
        str = this.m;
        if (str != null) {
            aaui.m = str;
        }
        Boolean bool = this.n;
        if (bool != null) {
            aaui.n = bool;
        }
        str = this.o;
        if (str != null) {
            aaui.o = str;
        }
        str = this.p;
        if (str != null) {
            aaui.p = str;
        }
        aasq aasq = this.q;
        if (aasq != null) {
            aasq = aasq.clone();
            if (aasq == null) {
                aaui.q = null;
            } else {
                aaui.q = new aasq(aasq);
            }
        }
        return aaui;
    }

    public final void a(aahb aahb) {
        this.i = aahb;
    }

    public final void a(aauk aauk) {
        this.e = aauk;
    }

    public final void a(aaum aaum) {
        this.d = aaum;
    }

    public final void a(aaun aaun) {
        this.f = aaun;
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
            hashMap.put("media_metadata", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("active_players", l);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("playback_error", str);
        }
        aaum aaum = this.d;
        if (aaum != null) {
            hashMap.put("playback_mode", aaum.toString());
        }
        aauk aauk = this.e;
        if (aauk != null) {
            hashMap.put("playback_item_type", aauk.toString());
        }
        aaun aaun = this.f;
        if (aaun != null) {
            hashMap.put("player_type", aaun.toString());
        }
        l = this.g;
        if (l != null) {
            hashMap.put("snap_index_in_opera_session", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("time_in_opera_session_ms", l);
        }
        aahb aahb = this.i;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        str = this.j;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("opera_session_id", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("media_group_id", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("media_playback_session_id", str);
        }
        Boolean bool = this.n;
        if (bool != null) {
            hashMap.put("longform_video", bool);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("media_encoding_variant", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("media_encoding", str);
        }
        aasq aasq = this.q;
        if (aasq != null) {
            hashMap.putAll(aasq.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.g = l;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(Long l) {
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaui) obj).asDictionary());
    }

    public final String getEventName() {
        return "PLAYBACK_ERROR";
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
        aaum aaum = this.d;
        hashCode = (hashCode + (aaum != null ? aaum.hashCode() : 0)) * 31;
        aauk aauk = this.e;
        hashCode = (hashCode + (aauk != null ? aauk.hashCode() : 0)) * 31;
        aaun aaun = this.f;
        hashCode = (hashCode + (aaun != null ? aaun.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.i;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aasq aasq = this.q;
        if (aasq != null) {
            i = aasq.hashCode();
        }
        return hashCode + i;
    }
}
