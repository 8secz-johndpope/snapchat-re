package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgg */
public final class abgg extends abgf {
    public Double a;
    public Double b;
    public Double c;
    public Double n;
    public Long o;
    private Long p;
    private Long q;
    private Double r;
    private Long s;
    private Long t;
    private Long u;
    private Long v;
    private Long w;
    private Boolean x;
    private Boolean y;
    private Boolean z;

    private abgg b() {
        abgg abgg = (abgg) super.clone();
        Long l = this.p;
        if (l != null) {
            abgg.p = l;
        }
        l = this.q;
        if (l != null) {
            abgg.q = l;
        }
        Double d = this.a;
        if (d != null) {
            abgg.a = d;
        }
        d = this.b;
        if (d != null) {
            abgg.b = d;
        }
        d = this.c;
        if (d != null) {
            abgg.c = d;
        }
        d = this.n;
        if (d != null) {
            abgg.n = d;
        }
        d = this.r;
        if (d != null) {
            abgg.r = d;
        }
        l = this.s;
        if (l != null) {
            abgg.s = l;
        }
        l = this.t;
        if (l != null) {
            abgg.t = l;
        }
        l = this.u;
        if (l != null) {
            abgg.u = l;
        }
        l = this.v;
        if (l != null) {
            abgg.v = l;
        }
        l = this.w;
        if (l != null) {
            abgg.w = l;
        }
        l = this.o;
        if (l != null) {
            abgg.o = l;
        }
        Boolean bool = this.x;
        if (bool != null) {
            abgg.x = bool;
        }
        bool = this.y;
        if (bool != null) {
            abgg.y = bool;
        }
        bool = this.z;
        if (bool != null) {
            abgg.z = bool;
        }
        return abgg;
    }

    public final /* synthetic */ abgf a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.p;
        if (l != null) {
            hashMap.put("filter_lens_count", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("selfie_mode_activation_count", l);
        }
        Double d = this.a;
        if (d != null) {
            hashMap.put("audio_duration_sec", d);
        }
        d = this.b;
        if (d != null) {
            hashMap.put("video_duration_sec", d);
        }
        d = this.c;
        if (d != null) {
            hashMap.put("mute_duration_sec", d);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("lens_active_duration_sec", d);
        }
        d = this.r;
        if (d != null) {
            hashMap.put("call_lock_duration_sec", d);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("muted_while_phone_lock_count", l);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("speakers_while_phone_lock_count", l);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("chat_sent_count", l);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("chat_media_sent_count", l);
        }
        l = this.w;
        if (l != null) {
            hashMap.put("sticker_sent_count", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("recipient_max_count", l);
        }
        Boolean bool = this.x;
        if (bool != null) {
            hashMap.put("with_start_and_end_phone_lock", bool);
        }
        bool = this.y;
        if (bool != null) {
            hashMap.put("with_call_upgrade_to_app_from_phone_lock", bool);
        }
        bool = this.z;
        if (bool != null) {
            hashMap.put("with_media_update_to_video_from_phone_lock", bool);
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
        return asDictionary().equals(((abgg) obj).asDictionary());
    }

    public final String getEventName() {
        return "TALK_CALL_LEG";
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
        Long l = this.p;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.a;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.r;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.w;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.x;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.z;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
