package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaso */
public final class aaso extends abhw {
    private String a;
    private String b;
    private abag c;

    private aaso a() {
        aaso aaso = (aaso) super.clone();
        String str = this.a;
        if (str != null) {
            aaso.a = str;
        }
        str = this.b;
        if (str != null) {
            aaso.b = str;
        }
        abag abag = this.c;
        if (abag != null) {
            aaso.c = abag;
        }
        return aaso;
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
        return asDictionary().equals(((aaso) obj).asDictionary());
    }

    public final String getEventName() {
        return "MUSIC_VIEWER_OPEN";
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
        if (abag != null) {
            i = abag.hashCode();
        }
        return hashCode + i;
    }
}
