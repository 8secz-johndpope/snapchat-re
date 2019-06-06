package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aayq */
public final class aayq extends abhw {
    public String a;
    public Long b;
    public aaym c;
    public aayg d;
    public aaye e;
    public Double f;
    public abbd g;
    private String h;
    private String i;
    private String j;
    private String k;
    private Long l;
    private String m;
    private zyr n;
    private String o;
    private aayl p;

    private aayq a() {
        aayq aayq = (aayq) super.clone();
        String str = this.a;
        if (str != null) {
            aayq.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aayq.b = l;
        }
        aaym aaym = this.c;
        if (aaym != null) {
            aayq.c = aaym;
        }
        str = this.h;
        if (str != null) {
            aayq.h = str;
        }
        str = this.i;
        if (str != null) {
            aayq.i = str;
        }
        str = this.j;
        if (str != null) {
            aayq.j = str;
        }
        str = this.k;
        if (str != null) {
            aayq.k = str;
        }
        l = this.l;
        if (l != null) {
            aayq.l = l;
        }
        aayg aayg = this.d;
        if (aayg != null) {
            aayq.d = aayg;
        }
        aaye aaye = this.e;
        if (aaye != null) {
            aayq.e = aaye;
        }
        str = this.m;
        if (str != null) {
            aayq.m = str;
        }
        Double d = this.f;
        if (d != null) {
            aayq.f = d;
        }
        abbd abbd = this.g;
        if (abbd != null) {
            aayq.g = abbd;
        }
        zyr zyr = this.n;
        if (zyr != null) {
            aayq.n = zyr;
        }
        str = this.o;
        if (str != null) {
            aayq.o = str;
        }
        aayl aayl = this.p;
        if (aayl != null) {
            aayq.p = aayl;
        }
        return aayq;
    }

    public final void a(aaye aaye) {
        this.e = aaye;
    }

    public final void a(aayg aayg) {
        this.d = aayg;
    }

    public final void a(aayl aayl) {
        this.p = aayl;
    }

    public final void a(aaym aaym) {
        this.c = aaym;
    }

    public final void a(abbd abbd) {
        this.g = abbd;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void a(zyr zyr) {
        this.n = zyr;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("search_query_id", l);
        }
        aaym aaym = this.c;
        if (aaym != null) {
            hashMap.put("search_result_section", aaym.toString());
        }
        str = this.h;
        if (str != null) {
            hashMap.put("search_result_section_title", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("search_result_ranking_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("search_result_identifier", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("result_subcomponent_id", str);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("result_subcomponent_index", l);
        }
        aayg aayg = this.d;
        if (aayg != null) {
            hashMap.put("context", aayg.toString());
        }
        aaye aaye = this.e;
        if (aaye != null) {
            hashMap.put("action", aaye.toString());
        }
        str = this.m;
        if (str != null) {
            hashMap.put("action_screen_location", str);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("client_timestamp", d);
        }
        abbd abbd = this.g;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        zyr zyr = this.n;
        if (zyr != null) {
            hashMap.put(MapboxEvent.KEY_GESTURE_ID, zyr.toString());
        }
        str = this.o;
        if (str != null) {
            hashMap.put("action_destination", str);
        }
        aayl aayl = this.p;
        if (aayl != null) {
            hashMap.put("search_result_reason", aayl.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aayq) obj).asDictionary());
    }

    public final String getEventName() {
        return "SEARCHRANKING_ACTION";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaym aaym = this.c;
        hashCode = (hashCode + (aaym != null ? aaym.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aayg aayg = this.d;
        hashCode = (hashCode + (aayg != null ? aayg.hashCode() : 0)) * 31;
        aaye aaye = this.e;
        hashCode = (hashCode + (aaye != null ? aaye.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abbd abbd = this.g;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        zyr zyr = this.n;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aayl aayl = this.p;
        if (aayl != null) {
            i = aayl.hashCode();
        }
        return hashCode + i;
    }
}
