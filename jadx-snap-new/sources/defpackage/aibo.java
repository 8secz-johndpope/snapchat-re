package defpackage;

import java.util.ArrayList;

/* renamed from: aibo */
public final class aibo {
    public static aebn a(aibm aibm) {
        int i;
        aebn aebn = new aebn();
        if (aibm.a != null) {
            aebn.a = new String[aibm.a.size()];
            for (i = 0; i < aibm.a.size(); i++) {
                aebn.a[i] = (String) aibm.a.get(i);
            }
        }
        if (aibm.b != null) {
            aebn.b = new double[aibm.b.size()];
            for (i = 0; i < aibm.b.size(); i++) {
                aebn.b[i] = ((Double) aibm.b.get(i)).doubleValue();
            }
        }
        if (aibm.c != null) {
            aebn.c = aibm.c;
        }
        if (aibm.d != null) {
            aebn.d = aibm.d.doubleValue();
        }
        if (aibm.e != null) {
            aebn.e = new double[aibm.e.size()];
            for (int i2 = 0; i2 < aibm.e.size(); i2++) {
                aebn.e[i2] = ((Double) aibm.e.get(i2)).doubleValue();
            }
        }
        return aebn;
    }

    public static aibm a(aebn aebn) {
        ArrayList arrayList;
        aibm aibm = new aibm();
        if (aebn.a.length > 0) {
            arrayList = new ArrayList();
            for (Object add : aebn.a) {
                arrayList.add(add);
            }
            aibm.a = arrayList;
        }
        if (aebn.b.length > 0) {
            arrayList = new ArrayList();
            for (double valueOf : aebn.b) {
                arrayList.add(Double.valueOf(valueOf));
            }
            aibm.b = arrayList;
        }
        if (!aebn.c.isEmpty()) {
            aibm.c = aebn.c;
        }
        aibm.d = Double.valueOf(aebn.d);
        if (aebn.e.length > 0) {
            arrayList = new ArrayList();
            for (double valueOf2 : aebn.e) {
                arrayList.add(Double.valueOf(valueOf2));
            }
            aibm.e = arrayList;
        }
        return aibm;
    }
}
