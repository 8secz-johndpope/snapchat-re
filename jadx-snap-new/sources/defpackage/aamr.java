package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aamr */
public final class aamr extends abhw {
    private Boolean a;
    private aamq b;
    private aams c;
    private Long d;
    private Long e;
    private String f;

    private aamr a() {
        aamr aamr = (aamr) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aamr.a = bool;
        }
        aamq aamq = this.b;
        if (aamq != null) {
            aamr.b = aamq;
        }
        aams aams = this.c;
        if (aams != null) {
            aamr.c = aams;
        }
        Long l = this.d;
        if (l != null) {
            aamr.d = l;
        }
        l = this.e;
        if (l != null) {
            aamr.e = l;
        }
        String str = this.f;
        if (str != null) {
            aamr.f = str;
        }
        return aamr;
    }

    public final void a(aamq aamq) {
        this.b = aamq;
    }

    public final void a(aams aams) {
        this.c = aams;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_user_trigger", bool);
        }
        aamq aamq = this.b;
        if (aamq != null) {
            hashMap.put("action_taken", aamq.toString());
        }
        aams aams = this.c;
        if (aams != null) {
            hashMap.put("context", aams.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("snap_pending_backup_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("snap_delete_count", l);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("previous_username", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aamr) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_DATA_DELETE_ATTEMPT";
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
        aamq aamq = this.b;
        hashCode = (hashCode + (aamq != null ? aamq.hashCode() : 0)) * 31;
        aams aams = this.c;
        hashCode = (hashCode + (aams != null ? aams.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
