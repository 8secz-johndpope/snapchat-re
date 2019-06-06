package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahf */
public final class aahf extends aahe {
    private Double a;
    private Long b;
    private Long c;
    private Long d;
    private aajr e;
    private aajv f;
    private Boolean g;
    private String h;
    private String i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;
    private Long r;
    private Long s;
    private Long t;
    private Long u;
    private Long v;

    private aahf b() {
        aahf aahf = (aahf) super.clone();
        Double d = this.a;
        if (d != null) {
            aahf.a = d;
        }
        Long l = this.b;
        if (l != null) {
            aahf.b = l;
        }
        l = this.c;
        if (l != null) {
            aahf.c = l;
        }
        l = this.d;
        if (l != null) {
            aahf.d = l;
        }
        aajr aajr = this.e;
        if (aajr != null) {
            aahf.e = aajr;
        }
        aajv aajv = this.f;
        if (aajv != null) {
            aahf.f = aajv;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aahf.g = bool;
        }
        String str = this.h;
        if (str != null) {
            aahf.h = str;
        }
        str = this.i;
        if (str != null) {
            aahf.i = str;
        }
        l = this.j;
        if (l != null) {
            aahf.j = l;
        }
        l = this.k;
        if (l != null) {
            aahf.k = l;
        }
        l = this.l;
        if (l != null) {
            aahf.l = l;
        }
        l = this.m;
        if (l != null) {
            aahf.m = l;
        }
        l = this.n;
        if (l != null) {
            aahf.n = l;
        }
        l = this.o;
        if (l != null) {
            aahf.o = l;
        }
        l = this.p;
        if (l != null) {
            aahf.p = l;
        }
        l = this.q;
        if (l != null) {
            aahf.q = l;
        }
        l = this.r;
        if (l != null) {
            aahf.r = l;
        }
        l = this.s;
        if (l != null) {
            aahf.s = l;
        }
        l = this.t;
        if (l != null) {
            aahf.t = l;
        }
        l = this.u;
        if (l != null) {
            aahf.u = l;
        }
        l = this.v;
        if (l != null) {
            aahf.v = l;
        }
        return aahf;
    }

    public final /* synthetic */ aahe a() {
        return b();
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("card_load_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("tap_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("venue_distance_meter", l);
        }
        aajr aajr = this.e;
        if (aajr != null) {
            hashMap.put("enter_type", aajr.toString());
        }
        aajv aajv = this.f;
        if (aajv != null) {
            hashMap.put("exit_type", aajv.toString());
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("has_attachment", bool);
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("cards_available_ids", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("cards_seen_ids", str);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("scroll_distance_seen_pixel", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("scroll_distance_available_pixel", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("card_request_overall_latency_ms", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("card_request_server_latency_ms", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("card_request_queue_wait_ms", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("card_request_transmit_latency_ms", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("text_sent_count", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("snap_sent_count", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("sticker_sent_count", l);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("video_call_count", l);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("audio_call_count", l);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("video_note_send_count", l);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("audio_note_send_count", l);
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
        return asDictionary().equals(((aahf) obj).asDictionary());
    }

    public final String getEventName() {
        return "CONTEXT_MENU_DISMISS";
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
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aajr aajr = this.e;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
        aajv aajv = this.f;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.v;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
