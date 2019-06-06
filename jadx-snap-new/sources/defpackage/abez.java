package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abez */
public final class abez extends aaka {
    public String g;
    public String h;
    private Long i;
    private String j;

    private abez b() {
        abez abez = (abez) super.clone();
        String str = this.g;
        if (str != null) {
            abez.g = str;
        }
        Long l = this.i;
        if (l != null) {
            abez.i = l;
        }
        str = this.j;
        if (str != null) {
            abez.j = str;
        }
        str = this.h;
        if (str != null) {
            abez.h = str;
        }
        return abez;
    }

    public final /* synthetic */ aaka a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.g;
        if (str != null) {
            hashMap.put("stream_id", str);
        }
        Long l = this.i;
        if (l != null) {
            hashMap.put("reranking_id", l);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("client_model_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("client_reranking", str);
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
        return asDictionary().equals(((abez) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_FEED_CLIENT_RERANKING";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.g;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
