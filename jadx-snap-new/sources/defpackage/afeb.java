package defpackage;

import java.util.ArrayList;

/* renamed from: afeb */
public final class afeb {
    public static aeaj a(afdx afdx) {
        aeaj aeaj = new aeaj();
        if (afdx.a != null) {
            aeaj.a = afdx.a;
        }
        if (afdx.b != null) {
            aeaj.b = afdx.b;
        }
        if (afdx.c != null) {
            aeaj.c = afdx.c;
        }
        if (afdx.d != null) {
            aeaj.d = afdx.d;
        }
        if (afdx.e != null) {
            aeaj.e = afdx.e.booleanValue();
        }
        if (afdx.f != null) {
            aeaj.f = afdx.f;
        }
        if (afdx.g != null) {
            aeaj.g = afdx.g;
        }
        if (afdx.h != null) {
            aeaj.h = afdx.h;
        }
        if (afdx.i != null) {
            aeaj.i = new aeak[afdx.i.size()];
            for (int i = 0; i < afdx.i.size(); i++) {
                aeak[] aeakArr = aeaj.i;
                afdz afdz = (afdz) afdx.i.get(i);
                aeak aeak = new aeak();
                if (afdz.a != null) {
                    aeak.a = afdz.a;
                }
                if (afdz.b != null) {
                    aeak.b = afdz.b;
                }
                if (afdz.c != null) {
                    aeak.c = afdz.c.longValue();
                }
                if (afdz.d != null) {
                    aeak.d = afdz.d.longValue();
                }
                aeakArr[i] = aeak;
            }
        }
        return aeaj;
    }

    public static afdx a(aeaj aeaj) {
        afdx afdx = new afdx();
        if (!aeaj.a.isEmpty()) {
            afdx.a = aeaj.a;
        }
        if (!aeaj.b.isEmpty()) {
            afdx.b = aeaj.b;
        }
        if (!aeaj.c.isEmpty()) {
            afdx.c = aeaj.c;
        }
        if (!aeaj.d.isEmpty()) {
            afdx.d = aeaj.d;
        }
        afdx.e = Boolean.valueOf(aeaj.e);
        if (!aeaj.f.isEmpty()) {
            afdx.f = aeaj.f;
        }
        if (!aeaj.g.isEmpty()) {
            afdx.g = aeaj.g;
        }
        if (!aeaj.h.isEmpty()) {
            afdx.h = aeaj.h;
        }
        if (aeaj.i.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (aeak aeak : aeaj.i) {
                afdz afdz = new afdz();
                if (!aeak.a.isEmpty()) {
                    afdz.a = aeak.a;
                }
                if (!aeak.b.isEmpty()) {
                    afdz.b = aeak.b;
                }
                afdz.c = Long.valueOf(aeak.c);
                afdz.d = Long.valueOf(aeak.d);
                arrayList.add(afdz);
            }
            if (!arrayList.isEmpty()) {
                afdx.i = arrayList;
            }
        }
        return afdx;
    }
}
