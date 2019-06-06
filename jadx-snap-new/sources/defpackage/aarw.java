package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aarw */
public class aarw extends abhw {
    private String a;
    private String b;
    private Long c;
    private String d;
    private String e;
    private String f;
    private aaxu g;

    /* renamed from: a */
    public aarw clone() {
        aarw aarw = (aarw) super.clone();
        String str = this.a;
        if (str != null) {
            aarw.a = str;
        }
        str = this.b;
        if (str != null) {
            aarw.b = str;
        }
        Long l = this.c;
        if (l != null) {
            aarw.c = l;
        }
        str = this.d;
        if (str != null) {
            aarw.d = str;
        }
        str = this.e;
        if (str != null) {
            aarw.e = str;
        }
        str = this.f;
        if (str != null) {
            aarw.f = str;
        }
        aaxu aaxu = this.g;
        if (aaxu != null) {
            aarw.a(aaxu.clone());
        }
        return aarw;
    }

    public final void a(aaxu aaxu) {
        if (aaxu == null) {
            this.g = null;
        } else {
            this.g = new aaxu(aaxu);
        }
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("playback_session_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("caller", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("source_duration_ms", l);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("error_type", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("error_cause", str);
        }
        aaxu aaxu = this.g;
        if (aaxu != null) {
            hashMap.putAll(aaxu.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final void e(String str) {
        this.f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aarw) obj).asDictionary());
    }

    public String getEventName() {
        return "MEDIA_PLAYER_EVENT_BASE";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaxu aaxu = this.g;
        if (aaxu != null) {
            i = aaxu.hashCode();
        }
        return hashCode + i;
    }
}
