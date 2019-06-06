package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaed */
public final class aaed extends aaex {
    public Long a;
    private aafb b;

    private aaed a() {
        aaed aaed = (aaed) super.clone();
        Long l = this.a;
        if (l != null) {
            aaed.a = l;
        }
        aafb aafb = this.b;
        if (aafb != null) {
            aaed.a(aafb.clone());
        }
        return aaed;
    }

    public final void a(aafb aafb) {
        if (aafb == null) {
            this.b = null;
        } else {
            this.b = new aafb(aafb);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("selected_friend_count", l);
        }
        aafb aafb = this.b;
        if (aafb != null) {
            hashMap.putAll(aafb.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaed) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_ACTION_START_WITH_FRIENDS_SELECTED";
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
        aafb aafb = this.b;
        if (aafb != null) {
            i = aafb.hashCode();
        }
        return hashCode + i;
    }
}
