package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanh */
public final class aanh extends aang {
    public abah e;

    private aanh b() {
        aanh aanh = (aanh) super.clone();
        abah abah = this.e;
        if (abah != null) {
            aanh.e = abah;
        }
        return aanh;
    }

    public final /* synthetic */ aang a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abah abah = this.e;
        if (abah != null) {
            hashMap.put("skip_type", abah.toString());
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
        return asDictionary().equals(((aanh) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_SNAP_UPLOAD";
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
        abah abah = this.e;
        return hashCode + (abah != null ? abah.hashCode() : 0);
    }
}
