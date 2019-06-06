package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqz */
public final class aaqz extends abhw {
    private Boolean a;
    private Boolean b;
    private String c;

    private aaqz a() {
        aaqz aaqz = (aaqz) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaqz.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            aaqz.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aaqz.c = str;
        }
        return aaqz;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("can_share_back", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("was_already_sharing", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("share_message_type", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaqz) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_SHARE_REQUEST_LOCATION_SEEN";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
