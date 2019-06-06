package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaok */
public final class aaok extends abhw {
    private String a;
    private aaol b;
    private abfy c;
    private Long d;
    private Long e;
    private Long f;

    private aaok d() {
        aaok aaok = (aaok) super.clone();
        String str = this.a;
        if (str != null) {
            aaok.a = str;
        }
        aaol aaol = this.b;
        if (aaol != null) {
            aaok.b = aaol;
        }
        abfy abfy = this.c;
        if (abfy != null) {
            aaok.c = abfy;
        }
        Long l = this.d;
        if (l != null) {
            aaok.d = l;
        }
        l = this.e;
        if (l != null) {
            aaok.e = l;
        }
        l = this.f;
        if (l != null) {
            aaok.f = l;
        }
        return aaok;
    }

    public final void a() {
        this.d = null;
    }

    public final void a(aaol aaol) {
        this.b = aaol;
    }

    public final void a(abfy abfy) {
        this.c = abfy;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("group_story_id", str);
        }
        aaol aaol = this.b;
        if (aaol != null) {
            hashMap.put("leave_reason", aaol.toString());
        }
        abfy abfy = this.c;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("snap_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("friend_snap_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("my_snap_count", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b() {
        this.e = null;
    }

    public final void c() {
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaok) obj).asDictionary());
    }

    public final String getEventName() {
        return "GROUP_STORY_DELETE";
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
        aaol aaol = this.b;
        hashCode = (hashCode + (aaol != null ? aaol.hashCode() : 0)) * 31;
        abfy abfy = this.c;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
