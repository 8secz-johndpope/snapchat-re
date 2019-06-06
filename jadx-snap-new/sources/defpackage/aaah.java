package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaah */
public final class aaah extends abhw {
    public String a;
    public aabc b;
    public Long c;
    public Double d;
    private Long e;
    private aaup f;
    private aahl g;
    private aahk h;
    private aabg i;
    private aabn j;
    private aasp k;
    private aass l;
    private abia m;
    private aasu n;
    private aast o;
    private aaps p;
    private aact q;
    private aaub r;
    private aauq s;

    private aaah a() {
        aaah aaah = (aaah) super.clone();
        String str = this.a;
        if (str != null) {
            aaah.a = str;
        }
        aabc aabc = this.b;
        if (aabc != null) {
            aaah.b = aabc;
        }
        Long l = this.e;
        if (l != null) {
            aaah.e = l;
        }
        l = this.c;
        if (l != null) {
            aaah.c = l;
        }
        Double d = this.d;
        if (d != null) {
            aaah.d = d;
        }
        aaup aaup = this.f;
        if (aaup != null) {
            aaah.a(aaup.clone());
        }
        aahl aahl = this.g;
        if (aahl != null) {
            aaah.a(aahl.clone());
        }
        aahk aahk = this.h;
        if (aahk != null) {
            aaah.a(aahk.clone());
        }
        aabg aabg = this.i;
        if (aabg != null) {
            aaah.a(aabg.clone());
        }
        aabn aabn = this.j;
        if (aabn != null) {
            aaah.a(aabn.clone());
        }
        aasp aasp = this.k;
        if (aasp != null) {
            aaah.a(aasp.clone());
        }
        aass aass = this.l;
        if (aass != null) {
            aaah.a(aass.clone());
        }
        abia abia = this.m;
        if (abia != null) {
            aaah.a(abia.clone());
        }
        aasu aasu = this.n;
        if (aasu != null) {
            aaah.a(aasu.clone());
        }
        aast aast = this.o;
        if (aast != null) {
            aast = aast.clone();
            if (aast == null) {
                aaah.o = null;
            } else {
                aaah.o = new aast(aast);
            }
        }
        aaps aaps = this.p;
        if (aaps != null) {
            aaah.a(aaps.clone());
        }
        aact aact = this.q;
        if (aact != null) {
            aaah.a(aact.clone());
        }
        aaub aaub = this.r;
        if (aaub != null) {
            aaah.a(aaub.clone());
        }
        aauq aauq = this.s;
        if (aauq != null) {
            aaah.a(aauq.clone());
        }
        return aaah;
    }

    public final void a(aabg aabg) {
        if (aabg == null) {
            this.i = null;
        } else {
            this.i = new aabg(aabg);
        }
    }

    public final void a(aabn aabn) {
        if (aabn == null) {
            this.j = null;
        } else {
            this.j = new aabn(aabn);
        }
    }

    public final void a(aact aact) {
        if (aact == null) {
            this.q = null;
        } else {
            this.q = new aact(aact);
        }
    }

    public final void a(aahk aahk) {
        if (aahk == null) {
            this.h = null;
        } else {
            this.h = new aahk(aahk);
        }
    }

    public final void a(aahl aahl) {
        if (aahl == null) {
            this.g = null;
        } else {
            this.g = new aahl(aahl);
        }
    }

    public final void a(aaps aaps) {
        if (aaps == null) {
            this.p = null;
        } else {
            this.p = new aaps(aaps);
        }
    }

    public final void a(aasp aasp) {
        if (aasp == null) {
            this.k = null;
        } else {
            this.k = new aasp(aasp);
        }
    }

    public final void a(aass aass) {
        if (aass == null) {
            this.l = null;
        } else {
            this.l = new aass(aass);
        }
    }

    public final void a(aasu aasu) {
        if (aasu == null) {
            this.n = null;
        } else {
            this.n = new aasu(aasu);
        }
    }

    public final void a(aaub aaub) {
        if (aaub == null) {
            this.r = null;
        } else {
            this.r = new aaub(aaub);
        }
    }

    public final void a(aaup aaup) {
        if (aaup == null) {
            this.f = null;
        } else {
            this.f = new aaup(aaup);
        }
    }

    public final void a(aauq aauq) {
        if (aauq == null) {
            this.s = null;
        } else {
            this.s = new aauq(aauq);
        }
    }

    public final void a(abia abia) {
        if (abia == null) {
            this.m = null;
        } else {
            this.m = new abia(abia);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("app_open_id", str);
        }
        aabc aabc = this.b;
        if (aabc != null) {
            hashMap.put("app_state", aabc.toString());
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("session_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("app_time_ms", l);
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("batt_level_total", d);
        }
        aaup aaup = this.f;
        if (aaup != null) {
            hashMap.putAll(aaup.a());
        }
        aahl aahl = this.g;
        if (aahl != null) {
            hashMap.putAll(aahl.a());
        }
        aahk aahk = this.h;
        if (aahk != null) {
            hashMap.putAll(aahk.a());
        }
        aabg aabg = this.i;
        if (aabg != null) {
            hashMap.putAll(aabg.a());
        }
        aabn aabn = this.j;
        if (aabn != null) {
            hashMap.putAll(aabn.a());
        }
        aasp aasp = this.k;
        if (aasp != null) {
            hashMap.putAll(aasp.a());
        }
        aass aass = this.l;
        if (aass != null) {
            hashMap.putAll(aass.a());
        }
        abia abia = this.m;
        if (abia != null) {
            hashMap.putAll(abia.a());
        }
        aasu aasu = this.n;
        if (aasu != null) {
            hashMap.putAll(aasu.a());
        }
        aast aast = this.o;
        if (aast != null) {
            hashMap.putAll(aast.a());
        }
        aaps aaps = this.p;
        if (aaps != null) {
            hashMap.putAll(aaps.a());
        }
        aact aact = this.q;
        if (aact != null) {
            hashMap.putAll(aact.a());
        }
        aaub aaub = this.r;
        if (aaub != null) {
            hashMap.putAll(aaub.a());
        }
        aauq aauq = this.s;
        if (aauq != null) {
            hashMap.putAll(aauq.a());
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
        return asDictionary().equals(((aaah) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_BATTERY_METRICS";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabc aabc = this.b;
        hashCode = (hashCode + (aabc != null ? aabc.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aaup aaup = this.f;
        hashCode = (hashCode + (aaup != null ? aaup.hashCode() : 0)) * 31;
        aahl aahl = this.g;
        hashCode = (hashCode + (aahl != null ? aahl.hashCode() : 0)) * 31;
        aahk aahk = this.h;
        hashCode = (hashCode + (aahk != null ? aahk.hashCode() : 0)) * 31;
        aabg aabg = this.i;
        hashCode = (hashCode + (aabg != null ? aabg.hashCode() : 0)) * 31;
        aabn aabn = this.j;
        hashCode = (hashCode + (aabn != null ? aabn.hashCode() : 0)) * 31;
        aasp aasp = this.k;
        hashCode = (hashCode + (aasp != null ? aasp.hashCode() : 0)) * 31;
        aass aass = this.l;
        hashCode = (hashCode + (aass != null ? aass.hashCode() : 0)) * 31;
        abia abia = this.m;
        hashCode = (hashCode + (abia != null ? abia.hashCode() : 0)) * 31;
        aasu aasu = this.n;
        hashCode = (hashCode + (aasu != null ? aasu.hashCode() : 0)) * 31;
        aast aast = this.o;
        hashCode = (hashCode + (aast != null ? aast.hashCode() : 0)) * 31;
        aaps aaps = this.p;
        hashCode = (hashCode + (aaps != null ? aaps.hashCode() : 0)) * 31;
        aact aact = this.q;
        hashCode = (hashCode + (aact != null ? aact.hashCode() : 0)) * 31;
        aaub aaub = this.r;
        hashCode = (hashCode + (aaub != null ? aaub.hashCode() : 0)) * 31;
        aauq aauq = this.s;
        if (aauq != null) {
            i = aauq.hashCode();
        }
        return hashCode + i;
    }
}
