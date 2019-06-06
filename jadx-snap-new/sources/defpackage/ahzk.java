package defpackage;

import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;

/* renamed from: ahzk */
public final class ahzk {
    public static aebe a(ahzi ahzi) {
        aebe aebe = new aebe();
        if (ahzi.a != null) {
            aebe.a = ahzi.a;
        }
        if (ahzi.b != null) {
            aebe.b = ahzi.b;
        }
        if (ahzi.c != null) {
            aebe.c = aibo.a(ahzi.c);
        }
        if (ahzi.d != null) {
            aebe.d = ahzi.d;
        }
        if (ahzi.e != null) {
            aebe.e = ahzi.e.doubleValue();
        }
        if (ahzi.f != null) {
            aebe.f = ahzi.f.doubleValue();
        }
        if (ahzi.g != null) {
            aebe.g = ahzi.g;
        }
        if (ahzi.h != null) {
            aebe.h = new aebp[ahzi.h.size()];
            for (int i = 0; i < ahzi.h.size(); i++) {
                aebe.h[i] = aibt.a((aibr) ahzi.h.get(i));
            }
        }
        if (ahzi.i != null) {
            aebe.i = ahzi.i;
        }
        if (ahzi.j != null) {
            aebe.j = ahzi.j;
        }
        if (ahzi.k != null) {
            aebe.k = ahzi.k.doubleValue();
        }
        if (ahzi.l != null) {
            aibp aibp = ahzi.l;
            aebo aebo = new aebo();
            if (aibp.a != null) {
                aebo.a = aibp.a.doubleValue();
            }
            if (aibp.b != null) {
                aebo.b = aibp.b.doubleValue();
            }
            if (aibp.c != null) {
                aebo.c = aibp.c.doubleValue();
            }
            if (aibp.d != null) {
                aebo.d = aibp.d.doubleValue();
            }
            aebe.l = aebo;
        }
        if (ahzi.m != null) {
            aebe.m = ahzi.m;
        }
        if (ahzi.n != null) {
            aebe.n = aibo.a(ahzi.n);
        }
        if (ahzi.o != null) {
            aebe.o = ahzi.o.doubleValue();
        }
        if (ahzi.p != null) {
            aebe.p = ahzi.p.doubleValue();
        }
        if (ahzi.q != null) {
            aebe.q = ahzi.q.doubleValue();
        }
        return aebe;
    }

    public static ahzi a(aebe aebe) {
        ahzi ahzi = new ahzi();
        if (!aebe.a.isEmpty()) {
            ahzi.a = aebe.a;
        }
        if (!aebe.b.isEmpty()) {
            ahzi.b = aebe.b;
        }
        if (!(aebe.c == null || MessageNano.messageNanoEquals(aebe.c, new aebn()))) {
            ahzi.c = aibo.a(aebe.c);
        }
        if (!aebe.d.isEmpty()) {
            ahzi.d = aebe.d;
        }
        ahzi.e = Double.valueOf(aebe.e);
        ahzi.f = Double.valueOf(aebe.f);
        if (!aebe.g.isEmpty()) {
            ahzi.g = aebe.g;
        }
        if (aebe.h.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (aebp a : aebe.h) {
                arrayList.add(aibt.a(a));
            }
            if (!arrayList.isEmpty()) {
                ahzi.h = arrayList;
            }
        }
        if (!aebe.i.isEmpty()) {
            ahzi.i = aebe.i;
        }
        if (!aebe.j.isEmpty()) {
            ahzi.j = aebe.j;
        }
        ahzi.k = Double.valueOf(aebe.k);
        if (!(aebe.l == null || MessageNano.messageNanoEquals(aebe.l, new aebo()))) {
            aebo aebo = aebe.l;
            aibp aibp = new aibp();
            aibp.a = Double.valueOf(aebo.a);
            aibp.b = Double.valueOf(aebo.b);
            aibp.c = Double.valueOf(aebo.c);
            aibp.d = Double.valueOf(aebo.d);
            ahzi.l = aibp;
        }
        if (!aebe.m.isEmpty()) {
            ahzi.m = aebe.m;
        }
        if (!(aebe.n == null || MessageNano.messageNanoEquals(aebe.n, new aebn()))) {
            ahzi.n = aibo.a(aebe.n);
        }
        ahzi.o = Double.valueOf(aebe.o);
        ahzi.p = Double.valueOf(aebe.p);
        ahzi.q = Double.valueOf(aebe.q);
        return ahzi;
    }
}
