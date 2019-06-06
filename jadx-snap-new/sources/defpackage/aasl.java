package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasl */
public final class aasl extends abhw {
    private String a;
    private String b;
    private abag c;
    private String d;
    private Long e;

    private aasl a() {
        aasl aasl = (aasl) super.clone();
        String str = this.a;
        if (str != null) {
            aasl.a = str;
        }
        str = this.b;
        if (str != null) {
            aasl.b = str;
        }
        abag abag = this.c;
        if (abag != null) {
            aasl.c = abag;
        }
        str = this.d;
        if (str != null) {
            aasl.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aasl.e = l;
        }
        return aasl;
    }

    public final void a(abag abag) {
        this.c = abag;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("song_title", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("artist_name", str);
        }
        abag abag = this.c;
        if (abag != null) {
            hashMap.put("source", abag.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("recipient_count", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aasl) obj).asDictionary());
    }

    public final String getEventName() {
        return "MUSIC_SHARE";
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
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abag abag = this.c;
        hashCode = (hashCode + (abag != null ? abag.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
