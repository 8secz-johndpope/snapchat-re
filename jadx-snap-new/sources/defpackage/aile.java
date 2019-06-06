package defpackage;

import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;

/* renamed from: aile */
public final class aile {
    public static adsj a(ailc ailc) {
        adsj adsj = new adsj();
        if (ailc.a != null) {
            adsj.a = ailc.a;
        }
        if (ailc.b != null) {
            adsj.b = ailc.b;
        }
        if (ailc.c != null) {
            adsj.c = ailc.c;
        }
        if (ailc.d != null) {
            adsj.d = ailc.d;
        }
        if (ailc.e != null) {
            adsj.e = ailc.e;
        }
        if (ailc.f != null) {
            adsj.f = ailc.f;
        }
        if (ailc.g != null) {
            adsj.g = ailc.g.longValue();
        }
        if (ailc.h != null) {
            adsj.h = ailc.h;
        }
        if (ailc.i != null) {
            adsj.i = ailc.i.doubleValue();
        }
        if (ailc.j != null) {
            adsj.j = ailc.j;
        }
        if (ailc.k != null) {
            adsj.k = ailx.a(ailc.k);
        }
        if (ailc.l != null) {
            adsj.l = new String[ailc.l.size()];
            for (int i = 0; i < ailc.l.size(); i++) {
                adsj.l[i] = (String) ailc.l.get(i);
            }
        }
        if (ailc.m != null) {
            adsj.m = ailc.m.longValue();
        }
        if (ailc.n != null) {
            adsj.n = ailc.n.longValue();
        }
        if (ailc.o != null) {
            adsj.o = ailc.o;
        }
        if (ailc.p != null) {
            adsj.p = ailc.p;
        }
        if (ailc.q != null) {
            adsj.q = ailc.q;
        }
        if (ailc.r != null) {
            adsj.r = ailc.r;
        }
        if (ailc.s != null) {
            adsj.s = ailc.s;
        }
        return adsj;
    }

    public static ailc a(adsj adsj) {
        ailc ailc = new ailc();
        if (!adsj.a.isEmpty()) {
            ailc.a = adsj.a;
        }
        if (!adsj.b.isEmpty()) {
            ailc.b = adsj.b;
        }
        if (!adsj.c.isEmpty()) {
            ailc.c = adsj.c;
        }
        if (!adsj.d.isEmpty()) {
            ailc.d = adsj.d;
        }
        if (!adsj.e.isEmpty()) {
            ailc.e = adsj.e;
        }
        if (!adsj.f.isEmpty()) {
            ailc.f = adsj.f;
        }
        ailc.g = Long.valueOf(adsj.g);
        if (!adsj.h.isEmpty()) {
            ailc.h = adsj.h;
        }
        ailc.i = Double.valueOf(adsj.i);
        if (!adsj.j.isEmpty()) {
            ailc.j = adsj.j;
        }
        if (!(adsj.k == null || MessageNano.messageNanoEquals(adsj.k, new adsl()))) {
            ailc.k = ailx.a(adsj.k);
        }
        if (adsj.l.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object add : adsj.l) {
                arrayList.add(add);
            }
            ailc.l = arrayList;
        }
        ailc.m = Long.valueOf(adsj.m);
        ailc.n = Long.valueOf(adsj.n);
        if (!adsj.o.isEmpty()) {
            ailc.o = adsj.o;
        }
        if (!adsj.p.isEmpty()) {
            ailc.p = adsj.p;
        }
        if (!adsj.q.isEmpty()) {
            ailc.q = adsj.q;
        }
        if (!adsj.r.isEmpty()) {
            ailc.r = adsj.r;
        }
        if (!adsj.s.isEmpty()) {
            ailc.s = adsj.s;
        }
        return ailc;
    }
}
