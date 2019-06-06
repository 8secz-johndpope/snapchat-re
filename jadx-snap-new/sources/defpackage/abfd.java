package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfd */
public final class abfd extends abfc {
    public final /* synthetic */ aaka a() {
        return (abfd) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* bridge */ /* synthetic */ abfc b() {
        return (abfd) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfd) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_FEED_ITEM_ACTION_CRITICAL";
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
