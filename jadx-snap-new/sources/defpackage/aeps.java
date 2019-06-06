package defpackage;

import java.util.ArrayList;

/* renamed from: aeps */
public final class aeps {
    public static adzr a(aepq aepq) {
        adzr adzr = new adzr();
        if (aepq.a != null) {
            adzr.a = aepq.a;
        }
        if (aepq.b != null) {
            adzr.b = aepq.b;
        }
        if (aepq.c != null) {
            adzr.c = aepq.c;
        }
        if (aepq.d != null) {
            adzr.d = aepq.d;
        }
        if (aepq.e != null) {
            adzr.e = aepq.e;
        }
        if (aepq.f != null) {
            adzr.f = new String[aepq.f.size()];
            for (int i = 0; i < aepq.f.size(); i++) {
                adzr.f[i] = (String) aepq.f.get(i);
            }
        }
        if (aepq.g != null) {
            adzr.g = aepq.g.intValue();
        }
        return adzr;
    }

    public static aepq a(adzr adzr) {
        aepq aepq = new aepq();
        if (!adzr.a.isEmpty()) {
            aepq.a = adzr.a;
        }
        if (!adzr.b.isEmpty()) {
            aepq.b = adzr.b;
        }
        if (!adzr.c.isEmpty()) {
            aepq.c = adzr.c;
        }
        if (!adzr.d.isEmpty()) {
            aepq.d = adzr.d;
        }
        if (!adzr.e.isEmpty()) {
            aepq.e = adzr.e;
        }
        if (adzr.f.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object add : adzr.f) {
                arrayList.add(add);
            }
            aepq.f = arrayList;
        }
        aepq.g = Integer.valueOf(adzr.g);
        return aepq;
    }
}
