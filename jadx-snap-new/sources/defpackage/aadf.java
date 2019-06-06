package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadf */
public final class aadf extends aadg {
    private String a;
    private String b;
    private aaua c;
    private Long d;
    private String e;
    private String f;
    private String g;
    private Long h;
    private Long i;
    private aamk j;
    private aahj k;

    private aadf b() {
        aadf aadf = (aadf) super.clone();
        String str = this.a;
        if (str != null) {
            aadf.a = str;
        }
        str = this.b;
        if (str != null) {
            aadf.b = str;
        }
        aaua aaua = this.c;
        if (aaua != null) {
            aadf.c = aaua;
        }
        Long l = this.d;
        if (l != null) {
            aadf.d = l;
        }
        str = this.e;
        if (str != null) {
            aadf.e = str;
        }
        str = this.f;
        if (str != null) {
            aadf.f = str;
        }
        str = this.g;
        if (str != null) {
            aadf.g = str;
        }
        l = this.h;
        if (l != null) {
            aadf.h = l;
        }
        l = this.i;
        if (l != null) {
            aadf.i = l;
        }
        aamk aamk = this.j;
        if (aamk != null) {
            aadf.j = aamk;
        }
        aahj aahj = this.k;
        if (aahj != null) {
            aadf.k = aahj;
        }
        return aadf;
    }

    public final /* synthetic */ aadg a() {
        return b();
    }

    public final void a(aamk aamk) {
        this.j = aamk;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("chat_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("filter_venue_id", str);
        }
        aaua aaua = this.c;
        if (aaua != null) {
            hashMap.put("send_source", aaua.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("cell_view_position", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("mention_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("unique_mention_count", l);
        }
        aamk aamk = this.j;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.k;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
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
        return asDictionary().equals(((aadf) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_CHAT_SEND";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
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
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaua aaua = this.c;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aamk aamk = this.j;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.k;
        if (aahj != null) {
            i = aahj.hashCode();
        }
        return hashCode + i;
    }
}
