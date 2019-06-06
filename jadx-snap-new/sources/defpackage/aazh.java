package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazh */
public final class aazh extends abhw {
    private String a;
    private String b;
    private String c;
    private Long d;
    private String e;
    private Boolean f;
    private Boolean g;
    private String h;
    private Boolean i;
    private String j;
    private String k;
    private String l;
    private String m;

    private aazh a() {
        aazh aazh = (aazh) super.clone();
        String str = this.a;
        if (str != null) {
            aazh.a = str;
        }
        str = this.b;
        if (str != null) {
            aazh.b = str;
        }
        str = this.c;
        if (str != null) {
            aazh.c = str;
        }
        Long l = this.d;
        if (l != null) {
            aazh.d = l;
        }
        str = this.e;
        if (str != null) {
            aazh.e = str;
        }
        Boolean bool = this.f;
        if (bool != null) {
            aazh.f = bool;
        }
        bool = this.g;
        if (bool != null) {
            aazh.g = bool;
        }
        str = this.h;
        if (str != null) {
            aazh.h = str;
        }
        bool = this.i;
        if (bool != null) {
            aazh.i = bool;
        }
        str = this.j;
        if (str != null) {
            aazh.j = str;
        }
        str = this.k;
        if (str != null) {
            aazh.k = str;
        }
        str = this.l;
        if (str != null) {
            aazh.l = str;
        }
        str = this.m;
        if (str != null) {
            aazh.m = str;
        }
        return aazh;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("notification_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("notification_type", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("notification_source", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("notification_sent_ts", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("sender_id", str);
        }
        Boolean bool = this.f;
        if (bool != null) {
            hashMap.put("is_sender_teamsnapchat", bool);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("is_sender_employee", bool);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("recipient_id", str);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("is_recipient_employee", bool);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("recipient_app_version", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("recipient_app_platform", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("ghost_sender_id", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("ghost_recipient_id", str);
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
        return asDictionary().equals(((aazh) obj).asDictionary());
    }

    public final String getEventName() {
        return "SERVER_GENERATED_PUSH_NOTIFICATION_OPENED";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
