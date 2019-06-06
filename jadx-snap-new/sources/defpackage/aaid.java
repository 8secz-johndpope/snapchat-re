package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaid */
public final class aaid extends abhw {
    private Long a;
    private Long b;
    private Long c;
    private Long d;

    private aaid a() {
        aaid aaid = (aaid) super.clone();
        Long l = this.a;
        if (l != null) {
            aaid.a = l;
        }
        l = this.b;
        if (l != null) {
            aaid.b = l;
        }
        l = this.c;
        if (l != null) {
            aaid.c = l;
        }
        l = this.d;
        if (l != null) {
            aaid.d = l;
        }
        return aaid;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("storage_total_size_kb", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("storage_file_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("storage_user_space_free_kb", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("storage_user_space_kb", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final void c(Long l) {
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaid) obj).asDictionary());
    }

    public final String getEventName() {
        return "DEVICE_STORAGE_DISK_USAGE";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
