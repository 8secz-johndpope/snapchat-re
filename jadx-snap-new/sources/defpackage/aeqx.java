package defpackage;

import java.util.ArrayList;

/* renamed from: aeqx */
public final class aeqx {
    public static adzw a(aeqv aeqv) {
        int i;
        adzw adzw = new adzw();
        if (aeqv.a != null) {
            adzw.a = new adzo[aeqv.a.size()];
            for (i = 0; i < aeqv.a.size(); i++) {
                adzw.a[i] = aent.a((aenr) aeqv.a.get(i));
            }
        }
        if (aeqv.b != null) {
            adzw.b = new adzo[aeqv.b.size()];
            for (i = 0; i < aeqv.b.size(); i++) {
                adzw.b[i] = aent.a((aenr) aeqv.b.get(i));
            }
        }
        if (aeqv.c != null) {
            adzw.c = aeqv.c.longValue();
        }
        if (aeqv.d != null) {
            adzw.d = aeqv.d;
        }
        if (aeqv.e != null) {
            adzw.e = aeqv.e;
        }
        if (aeqv.f != null) {
            adzw.f = new adzo[aeqv.f.size()];
            for (int i2 = 0; i2 < aeqv.f.size(); i2++) {
                adzw.f[i2] = aent.a((aenr) aeqv.f.get(i2));
            }
        }
        if (aeqv.g != null) {
            adzw.g = aeqv.g.longValue();
        }
        return adzw;
    }

    public static aeqv a(adzw adzw) {
        ArrayList arrayList;
        aeqv aeqv = new aeqv();
        if (adzw.a.length > 0) {
            arrayList = new ArrayList();
            for (adzo a : adzw.a) {
                arrayList.add(aent.a(a));
            }
            if (!arrayList.isEmpty()) {
                aeqv.a = arrayList;
            }
        }
        if (adzw.b.length > 0) {
            arrayList = new ArrayList();
            for (adzo a2 : adzw.b) {
                arrayList.add(aent.a(a2));
            }
            if (!arrayList.isEmpty()) {
                aeqv.b = arrayList;
            }
        }
        aeqv.c = Long.valueOf(adzw.c);
        if (!adzw.d.isEmpty()) {
            aeqv.d = adzw.d;
        }
        if (!adzw.e.isEmpty()) {
            aeqv.e = adzw.e;
        }
        if (adzw.f.length > 0) {
            arrayList = new ArrayList();
            for (adzo a3 : adzw.f) {
                arrayList.add(aent.a(a3));
            }
            if (!arrayList.isEmpty()) {
                aeqv.f = arrayList;
            }
        }
        aeqv.g = Long.valueOf(adzw.g);
        return aeqv;
    }
}
