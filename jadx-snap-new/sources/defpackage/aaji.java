package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaji */
public final class aaji extends aajk {
    private aasc a;
    private Double b;
    private Double c;
    private Long d;
    private Long e;
    private String f;
    private Boolean g;
    private Double h;
    private Double i;
    private Double j;
    private Long k;
    private Long l;

    private aaji b() {
        aaji aaji = (aaji) super.clone();
        aasc aasc = this.a;
        if (aasc != null) {
            aaji.a = aasc;
        }
        Double d = this.b;
        if (d != null) {
            aaji.b = d;
        }
        d = this.c;
        if (d != null) {
            aaji.c = d;
        }
        Long l = this.d;
        if (l != null) {
            aaji.d = l;
        }
        l = this.e;
        if (l != null) {
            aaji.e = l;
        }
        String str = this.f;
        if (str != null) {
            aaji.f = str;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aaji.g = bool;
        }
        d = this.h;
        if (d != null) {
            aaji.h = d;
        }
        d = this.i;
        if (d != null) {
            aaji.i = d;
        }
        d = this.j;
        if (d != null) {
            aaji.j = d;
        }
        l = this.k;
        if (l != null) {
            aaji.k = l;
        }
        l = this.l;
        if (l != null) {
            aaji.l = l;
        }
        return aaji;
    }

    public final /* synthetic */ aajk a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aasc aasc = this.a;
        if (aasc != null) {
            hashMap.put("longform_type", aasc.toString());
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("inline_video_time_viewed", d);
        }
        d = this.c;
        if (d != null) {
            hashMap.put("caption_time_sec", d);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("inline_video_view_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("inline_video_total_count", l);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("video_partner_id", str);
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("with_caption_on_start", bool);
        }
        d = this.h;
        if (d != null) {
            hashMap.put("landscape_time_sec", d);
        }
        d = this.i;
        if (d != null) {
            hashMap.put("duration_sec", d);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("aspect_ratio", d);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("page_height_total_pixel", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("page_height_seen_pixel", l);
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
        return asDictionary().equals(((aaji) obj).asDictionary());
    }

    public final String getEventName() {
        return "DISCOVER_SNAP_LONGFORM_VIEW";
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
        aasc aasc = this.a;
        int i = 0;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
