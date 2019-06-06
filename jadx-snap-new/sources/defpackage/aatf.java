package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatf */
public final class aatf extends abhw {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;

    private aatf a() {
        aatf aatf = (aatf) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aatf.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            aatf.b = bool;
        }
        bool = this.c;
        if (bool != null) {
            aatf.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aatf.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aatf.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aatf.f = bool;
        }
        bool = this.g;
        if (bool != null) {
            aatf.g = bool;
        }
        bool = this.h;
        if (bool != null) {
            aatf.h = bool;
        }
        bool = this.i;
        if (bool != null) {
            aatf.i = bool;
        }
        bool = this.j;
        if (bool != null) {
            aatf.j = bool;
        }
        bool = this.k;
        if (bool != null) {
            aatf.k = bool;
        }
        bool = this.l;
        if (bool != null) {
            aatf.l = bool;
        }
        bool = this.m;
        if (bool != null) {
            aatf.m = bool;
        }
        bool = this.n;
        if (bool != null) {
            aatf.n = bool;
        }
        bool = this.o;
        if (bool != null) {
            aatf.o = bool;
        }
        bool = this.p;
        if (bool != null) {
            aatf.p = bool;
        }
        return aatf;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("old_value_stories", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("new_value_stories", bool);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("old_value_friend_suggestions", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("new_value_friend_suggestions", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("old_value_friend_tags", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("new_value_friend_tags", bool);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("old_value_memories", bool);
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("new_value_memories", bool);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("old_value_friends_birthday", bool);
        }
        bool = this.j;
        if (bool != null) {
            hashMap.put("new_value_friends_birthday", bool);
        }
        bool = this.k;
        if (bool != null) {
            hashMap.put("old_value_message_reminders", bool);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("new_value_message_reminders", bool);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("old_value_creative_tools", bool);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("new_value_creative_tools", bool);
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("old_value_best_friends_sounds", bool);
        }
        bool = this.p;
        if (bool != null) {
            hashMap.put("new_value_best_friends_sounds", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.b = bool;
    }

    public final void c(Boolean bool) {
        this.c = bool;
    }

    public final void d(Boolean bool) {
        this.d = bool;
    }

    public final void e(Boolean bool) {
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aatf) obj).asDictionary());
    }

    public final void f(Boolean bool) {
        this.f = bool;
    }

    public final void g(Boolean bool) {
        this.g = bool;
    }

    public final String getEventName() {
        return "NOTIFICATIONS_SETTING_PANEL_EXIT";
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

    public final void h(Boolean bool) {
        this.h = bool;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.p;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Boolean bool) {
        this.i = bool;
    }

    public final void j(Boolean bool) {
        this.j = bool;
    }

    public final void k(Boolean bool) {
        this.k = bool;
    }

    public final void l(Boolean bool) {
        this.l = bool;
    }

    public final void m(Boolean bool) {
        this.m = bool;
    }

    public final void n(Boolean bool) {
        this.n = bool;
    }
}
