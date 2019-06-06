package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapo */
public final class aapo extends abhr {
    private String a;
    private aaph b;
    private String c;

    private aapo a() {
        aapo aapo = (aapo) super.clone();
        String str = this.a;
        if (str != null) {
            aapo.a = str;
        }
        aaph aaph = this.b;
        if (aaph != null) {
            aapo.b = aaph;
        }
        str = this.c;
        if (str != null) {
            aapo.c = str;
        }
        return aapo;
    }

    public final void a(aaph aaph) {
        this.b = aaph;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        aaph aaph = this.b;
        if (aaph != null) {
            hashMap.put("device_class", aaph.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("reason", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aapo) obj).asDictionary());
    }

    public final String getEventName() {
        return "LENS_POSSIBLE_CRASH";
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
        aaph aaph = this.b;
        hashCode = (hashCode + (aaph != null ? aaph.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
