package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaic */
public final class aaic extends abhw {
    private String a;
    private Long b;
    private Long c;
    private Long d;

    private aaic a() {
        aaic aaic = (aaic) super.clone();
        String str = this.a;
        if (str != null) {
            aaic.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aaic.b = l;
        }
        l = this.c;
        if (l != null) {
            aaic.c = l;
        }
        l = this.d;
        if (l != null) {
            aaic.d = l;
        }
        return aaic;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("storage_path", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("storage_file_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("storage_total_size_kb", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("storage_size_kb", l);
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
        return asDictionary().equals(((aaic) obj).asDictionary());
    }

    public final String getEventName() {
        return "DEVICE_STORAGE_DIRECTORY_USAGE";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
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
