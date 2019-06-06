package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfk */
public final class abfk extends abfj {
    public final /* synthetic */ aaka a() {
        return (abfk) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* bridge */ /* synthetic */ abfj b() {
        return (abfk) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfk) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_FEED_ITEM_VIEW_SESSION_CRITICAL";
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
        return super.hashCode();
    }
}
