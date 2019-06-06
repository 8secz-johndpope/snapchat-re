package defpackage;

import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: aepv */
public final class aepv {
    public static adzs a(aept aept) {
        int i;
        adzs adzs = new adzs();
        if (aept.a != null) {
            adzs.a = aept.a;
        }
        if (aept.b != null) {
            adzs.b = aept.b;
        }
        if (aept.c != null) {
            adzs.c = aept.c;
        }
        if (aept.d != null) {
            adzs.d = aept.d;
        }
        if (aept.e != null) {
            adzs.e = aept.e;
        }
        if (!(aept.f == null || aept.f.isEmpty())) {
            if (adzs.f == null) {
                adzs.f = new HashMap();
            }
            adzs.f.putAll(aept.f);
        }
        if (aept.g != null) {
            adzs.g = aept.g;
        }
        if (aept.h != null) {
            adzs.h = aept.h.a(akrc.a).a;
        }
        if (aept.i != null) {
            adzs.i = aept.i;
        }
        if (aept.j != null) {
            adzs.j = new adzq[aept.j.size()];
            for (i = 0; i < aept.j.size(); i++) {
                adzq[] adzqArr = adzs.j;
                aepo aepo = (aepo) aept.j.get(i);
                adzq adzq = new adzq();
                if (aepo.a != null) {
                    adzq.a = aepo.a;
                }
                if (aepo.b != null) {
                    adzq.b = aepo.b;
                }
                if (aepo.c != null) {
                    adzq.c = aepo.c;
                }
                if (aepo.d != null) {
                    adzq.d = aepo.d.intValue();
                }
                if (aepo.e != null) {
                    adzq.e = aepo.e;
                }
                if (aepo.f != null) {
                    adzq.f = aepo.f;
                }
                if (aepo.g != null) {
                    adzq.g = aepo.g.intValue();
                }
                if (aepo.h != null) {
                    adzq.h = aepo.h;
                }
                if (aepo.i != null) {
                    adzq.i = aepo.i;
                }
                if (aepo.j != null) {
                    adzq.j = aepo.j;
                }
                adzqArr[i] = adzq;
            }
        }
        if (aept.k != null) {
            adzs.k = aept.k.booleanValue();
        }
        if (aept.l != null) {
            adzs.l = aept.l.booleanValue();
        }
        if (aept.m != null) {
            adzs.m = aept.m.booleanValue();
        }
        if (aept.n != null) {
            adzs.n = aept.n;
        }
        if (aept.o != null) {
            adzs.o = aept.o;
        }
        if (aept.p != null) {
            adzs.p = aept.p;
        }
        if (aept.q != null) {
            adzs.q = aept.q.booleanValue();
        }
        if (aept.r != null) {
            adzs.r = aept.r;
        }
        if (aept.s != null) {
            adzs.s = aept.s;
        }
        if (aept.t != null) {
            adzs.t = aept.t;
        }
        if (aept.u != null) {
            adzs.u = new String[aept.u.size()];
            for (i = 0; i < aept.u.size(); i++) {
                adzs.u[i] = (String) aept.u.get(i);
            }
        }
        if (aept.v != null) {
            adzs.v = aept.v;
        }
        if (aept.w != null) {
            adzs.w = aept.w;
        }
        if (aept.x != null) {
            adzs.x = aept.x;
        }
        if (aept.y != null) {
            adzs.y = aept.y;
        }
        if (aept.z != null) {
            aeqd aeqd = aept.z;
            adzv adzv = new adzv();
            if (aeqd.a != null) {
                adzv.a = aeqd.a.intValue();
            }
            if (aeqd.b != null) {
                adzv.b = aeqd.b.intValue();
            }
            adzs.z = adzv;
        }
        if (aept.A != null) {
            adzs.A = aept.A.booleanValue();
        }
        if (aept.B != null) {
            adzs.B = aept.B.longValue();
        }
        if (aept.C != null) {
            adzs.C = aept.C;
        }
        if (aept.D != null) {
            adzs.D = new adzu[aept.D.size()];
            for (int i2 = 0; i2 < aept.D.size(); i2++) {
                adzu[] adzuArr = adzs.D;
                aeqb aeqb = (aeqb) aept.D.get(i2);
                adzu adzu = new adzu();
                if (aeqb.a != null) {
                    adzu.a = aeqb.a;
                }
                if (aeqb.b != null) {
                    adzu.b = aeqb.b;
                }
                if (aeqb.c != null) {
                    adzu.c = aeqb.c;
                }
                if (aeqb.d != null) {
                    adzu.d = aeqb.d;
                }
                if (aeqb.e != null) {
                    adzu.e = aeqb.e;
                }
                if (aeqb.f != null) {
                    adzu.f = aeqb.f.longValue();
                }
                if (aeqb.g != null) {
                    adzu.g = aeqb.g.intValue();
                }
                adzuArr[i2] = adzu;
            }
        }
        if (aept.E != null) {
            adzs.E = aept.E;
        }
        if (aept.F != null) {
            adzs.F = aept.F.booleanValue();
        }
        return adzs;
    }

    public static aept a(adzs adzs) {
        ArrayList arrayList;
        aept aept = new aept();
        if (!adzs.a.isEmpty()) {
            aept.a = adzs.a;
        }
        if (!adzs.b.isEmpty()) {
            aept.b = adzs.b;
        }
        if (!adzs.c.isEmpty()) {
            aept.c = adzs.c;
        }
        if (!adzs.d.isEmpty()) {
            aept.d = adzs.d;
        }
        if (!adzs.e.isEmpty()) {
            aept.e = adzs.e;
        }
        if (!(adzs.f == null || adzs.f.isEmpty())) {
            aept.f = adzs.f;
        }
        if (!adzs.g.isEmpty()) {
            aept.g = adzs.g;
        }
        if (adzs.h > 0) {
            aept.h = new akrm(adzs.h, akrc.a);
        }
        if (!adzs.i.isEmpty()) {
            aept.i = adzs.i;
        }
        if (adzs.j.length > 0) {
            arrayList = new ArrayList();
            for (adzq adzq : adzs.j) {
                aepo aepo = new aepo();
                if (!adzq.a.isEmpty()) {
                    aepo.a = adzq.a;
                }
                if (!adzq.b.isEmpty()) {
                    aepo.b = adzq.b;
                }
                if (!adzq.c.isEmpty()) {
                    aepo.c = adzq.c;
                }
                aepo.d = Integer.valueOf(adzq.d);
                if (!adzq.e.isEmpty()) {
                    aepo.e = adzq.e;
                }
                if (!adzq.f.isEmpty()) {
                    aepo.f = adzq.f;
                }
                aepo.g = Integer.valueOf(adzq.g);
                if (!adzq.h.isEmpty()) {
                    aepo.h = adzq.h;
                }
                if (!adzq.i.isEmpty()) {
                    aepo.i = adzq.i;
                }
                if (!adzq.j.isEmpty()) {
                    aepo.j = adzq.j;
                }
                arrayList.add(aepo);
            }
            if (!arrayList.isEmpty()) {
                aept.j = arrayList;
            }
        }
        aept.k = Boolean.valueOf(adzs.k);
        aept.l = Boolean.valueOf(adzs.l);
        aept.m = Boolean.valueOf(adzs.m);
        if (!adzs.n.isEmpty()) {
            aept.n = adzs.n;
        }
        if (!adzs.o.isEmpty()) {
            aept.o = adzs.o;
        }
        if (!adzs.p.isEmpty()) {
            aept.p = adzs.p;
        }
        aept.q = Boolean.valueOf(adzs.q);
        if (!adzs.r.isEmpty()) {
            aept.r = adzs.r;
        }
        if (!adzs.s.isEmpty()) {
            aept.s = adzs.s;
        }
        if (!adzs.t.isEmpty()) {
            aept.t = adzs.t;
        }
        if (adzs.u.length > 0) {
            arrayList = new ArrayList();
            for (Object add : adzs.u) {
                arrayList.add(add);
            }
            aept.u = arrayList;
        }
        if (!adzs.v.isEmpty()) {
            aept.v = adzs.v;
        }
        if (!adzs.w.isEmpty()) {
            aept.w = adzs.w;
        }
        if (!adzs.x.isEmpty()) {
            aept.x = adzs.x;
        }
        if (!adzs.y.isEmpty()) {
            aept.y = adzs.y;
        }
        if (!(adzs.z == null || MessageNano.messageNanoEquals(adzs.z, new adzv()))) {
            adzv adzv = adzs.z;
            aeqd aeqd = new aeqd();
            aeqd.a = Integer.valueOf(adzv.a);
            aeqd.b = Integer.valueOf(adzv.b);
            aept.z = aeqd;
        }
        aept.A = Boolean.valueOf(adzs.A);
        aept.B = Long.valueOf(adzs.B);
        if (!adzs.C.isEmpty()) {
            aept.C = adzs.C;
        }
        if (adzs.D.length > 0) {
            arrayList = new ArrayList();
            for (adzu adzu : adzs.D) {
                aeqb aeqb = new aeqb();
                if (!adzu.a.isEmpty()) {
                    aeqb.a = adzu.a;
                }
                if (!adzu.b.isEmpty()) {
                    aeqb.b = adzu.b;
                }
                if (!adzu.c.isEmpty()) {
                    aeqb.c = adzu.c;
                }
                if (!adzu.d.isEmpty()) {
                    aeqb.d = adzu.d;
                }
                if (!adzu.e.isEmpty()) {
                    aeqb.e = adzu.e;
                }
                aeqb.f = Long.valueOf(adzu.f);
                aeqb.g = Integer.valueOf(adzu.g);
                arrayList.add(aeqb);
            }
            if (!arrayList.isEmpty()) {
                aept.D = arrayList;
            }
        }
        if (!adzs.E.isEmpty()) {
            aept.E = adzs.E;
        }
        aept.F = Boolean.valueOf(adzs.F);
        return aept;
    }
}
