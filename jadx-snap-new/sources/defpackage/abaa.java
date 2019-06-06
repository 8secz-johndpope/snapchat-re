package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abaa */
public final class abaa extends abhw {
    public Long a;
    public Long b;
    public String c;
    private aazs d;

    private abaa a() {
        abaa abaa = (abaa) super.clone();
        Long l = this.a;
        if (l != null) {
            abaa.a = l;
        }
        l = this.b;
        if (l != null) {
            abaa.b = l;
        }
        String str = this.c;
        if (str != null) {
            abaa.c = str;
        }
        aazs aazs = this.d;
        if (aazs != null) {
            abaa.a(aazs.clone());
        }
        return abaa;
    }

    public final void a(aazs aazs) {
        if (aazs == null) {
            this.d = null;
        } else {
            this.d = new aazs(aazs);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("retry_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("total_file_size_kb", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("individual_file_sizes", str);
        }
        aazs aazs = this.d;
        if (aazs != null) {
            hashMap.putAll(aazs.a());
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
        return asDictionary().equals(((abaa) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_REPORT_UPLOAD";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aazs aazs = this.d;
        if (aazs != null) {
            i = aazs.hashCode();
        }
        return hashCode + i;
    }
}
