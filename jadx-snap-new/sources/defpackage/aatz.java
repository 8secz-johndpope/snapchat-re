package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatz */
public final class aatz extends abhw {
    private aaze A;
    private aave B;
    public String a;
    public String b;
    public String c;
    public String d;
    public aazf e;
    public String f;
    public Long g;
    public abaw h;
    public aazg i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public Long o;
    public Boolean p;
    private String q;
    private String r;
    private String s;
    private Long t;
    private aazd u;
    private Long v;
    private Long w;
    private Boolean x;
    private String y;
    private String z;

    private aatz a() {
        aatz aatz = (aatz) super.clone();
        String str = this.a;
        if (str != null) {
            aatz.a = str;
        }
        str = this.b;
        if (str != null) {
            aatz.b = str;
        }
        str = this.c;
        if (str != null) {
            aatz.c = str;
        }
        str = this.q;
        if (str != null) {
            aatz.q = str;
        }
        str = this.r;
        if (str != null) {
            aatz.r = str;
        }
        str = this.s;
        if (str != null) {
            aatz.s = str;
        }
        str = this.d;
        if (str != null) {
            aatz.d = str;
        }
        aazf aazf = this.e;
        if (aazf != null) {
            aatz.e = aazf;
        }
        str = this.f;
        if (str != null) {
            aatz.f = str;
        }
        Long l = this.g;
        if (l != null) {
            aatz.g = l;
        }
        l = this.t;
        if (l != null) {
            aatz.t = l;
        }
        abaw abaw = this.h;
        if (abaw != null) {
            aatz.h = abaw;
        }
        aazd aazd = this.u;
        if (aazd != null) {
            aatz.u = aazd;
        }
        l = this.v;
        if (l != null) {
            aatz.v = l;
        }
        l = this.w;
        if (l != null) {
            aatz.w = l;
        }
        Boolean bool = this.x;
        if (bool != null) {
            aatz.x = bool;
        }
        aazg aazg = this.i;
        if (aazg != null) {
            aatz.i = aazg;
        }
        str = this.j;
        if (str != null) {
            aatz.j = str;
        }
        str = this.k;
        if (str != null) {
            aatz.k = str;
        }
        str = this.l;
        if (str != null) {
            aatz.l = str;
        }
        str = this.m;
        if (str != null) {
            aatz.m = str;
        }
        str = this.n;
        if (str != null) {
            aatz.n = str;
        }
        l = this.o;
        if (l != null) {
            aatz.o = l;
        }
        bool = this.p;
        if (bool != null) {
            aatz.p = bool;
        }
        str = this.y;
        if (str != null) {
            aatz.y = str;
        }
        str = this.z;
        if (str != null) {
            aatz.z = str;
        }
        aaze aaze = this.A;
        if (aaze != null) {
            aatz.a(aaze.clone());
        }
        aave aave = this.B;
        if (aave != null) {
            aatz.a(aave.clone());
        }
        return aatz;
    }

    public final void a(aave aave) {
        if (aave == null) {
            this.B = null;
        } else {
            this.B = new aave(aave);
        }
    }

    public final void a(aaze aaze) {
        if (aaze == null) {
            this.A = null;
        } else {
            this.A = new aaze(aaze);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("sections_available", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("sections_friends_seen", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("sections_friends_selected", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("sections_non_snapchatters_available", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("sections_non_snapchatters_seen", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("sections_non_snapchatters_selected", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("sections_our_story_tags_seen", str);
        }
        aazf aazf = this.e;
        if (aazf != null) {
            hashMap.put("sendto_first_select_section", aazf.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("sendto_session_id", str);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("sendto_session_time_sec", l);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("sendto_session_search_time_sec", l);
        }
        abaw abaw = this.h;
        if (abaw != null) {
            hashMap.put("source", abaw.toString());
        }
        aazd aazd = this.u;
        if (aazd != null) {
            hashMap.put("best_friends_select_all_last_action_type", aazd.toString());
        }
        l = this.v;
        if (l != null) {
            hashMap.put("best_friends_select_all_action_count", l);
        }
        l = this.w;
        if (l != null) {
            hashMap.put("best_friends_deselect_all_action_count", l);
        }
        Boolean bool = this.x;
        if (bool != null) {
            hashMap.put("did_dismiss_real_time_suggestions", bool);
        }
        aazg aazg = this.i;
        if (aazg != null) {
            hashMap.put("status", aazg.toString());
        }
        str = this.j;
        if (str != null) {
            hashMap.put("stories_seen", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("stories_selected", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("story_types_available", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("story_types_seen", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("story_types_selected", str);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("stories_view_more_index", l);
        }
        bool = this.p;
        if (bool != null) {
            hashMap.put("stories_view_more_tapped", bool);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        aaze aaze = this.A;
        if (aaze != null) {
            hashMap.putAll(aaze.a());
        }
        aave aave = this.B;
        if (aave != null) {
            hashMap.putAll(aave.a());
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
        return asDictionary().equals(((aatz) obj).asDictionary());
    }

    public final String getEventName() {
        return "PAGE_SENDTO_SESSION_END";
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
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aazf aazf = this.e;
        hashCode = (hashCode + (aazf != null ? aazf.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abaw abaw = this.h;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        aazd aazd = this.u;
        hashCode = (hashCode + (aazd != null ? aazd.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.w;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.x;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aazg aazg = this.i;
        hashCode = (hashCode + (aazg != null ? aazg.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaze aaze = this.A;
        hashCode = (hashCode + (aaze != null ? aaze.hashCode() : 0)) * 31;
        aave aave = this.B;
        if (aave != null) {
            i = aave.hashCode();
        }
        return hashCode + i;
    }
}
