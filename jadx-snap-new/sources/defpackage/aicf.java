package defpackage;

import java.util.ArrayList;

/* renamed from: aicf */
public final class aicf {
    public static aebt a(aicd aicd) {
        int i;
        aebt aebt = new aebt();
        if (aicd.a != null) {
            aebt.a = new String[aicd.a.size()];
            for (i = 0; i < aicd.a.size(); i++) {
                aebt.a[i] = (String) aicd.a.get(i);
            }
        }
        if (aicd.b != null) {
            aebt.b = new String[aicd.b.size()];
            for (i = 0; i < aicd.b.size(); i++) {
                aebt.b[i] = (String) aicd.b.get(i);
            }
        }
        if (aicd.c != null) {
            aebt.c = new String[aicd.c.size()];
            for (i = 0; i < aicd.c.size(); i++) {
                aebt.c[i] = (String) aicd.c.get(i);
            }
        }
        if (aicd.d != null) {
            aebt.d = new String[aicd.d.size()];
            for (i = 0; i < aicd.d.size(); i++) {
                aebt.d[i] = (String) aicd.d.get(i);
            }
        }
        if (aicd.e != null) {
            aebt.e = new long[aicd.e.size()];
            for (i = 0; i < aicd.e.size(); i++) {
                aebt.e[i] = ((Long) aicd.e.get(i)).longValue();
            }
        }
        if (aicd.f != null) {
            aebt.f = new String[aicd.f.size()];
            for (i = 0; i < aicd.f.size(); i++) {
                aebt.f[i] = (String) aicd.f.get(i);
            }
        }
        if (aicd.g != null) {
            aebt.g = new String[aicd.g.size()];
            for (int i2 = 0; i2 < aicd.g.size(); i2++) {
                aebt.g[i2] = (String) aicd.g.get(i2);
            }
        }
        return aebt;
    }

    public static aicd a(aebt aebt) {
        ArrayList arrayList;
        aicd aicd = new aicd();
        if (aebt.a.length > 0) {
            arrayList = new ArrayList();
            for (Object add : aebt.a) {
                arrayList.add(add);
            }
            aicd.a = arrayList;
        }
        if (aebt.b.length > 0) {
            arrayList = new ArrayList();
            for (Object add2 : aebt.b) {
                arrayList.add(add2);
            }
            aicd.b = arrayList;
        }
        if (aebt.c.length > 0) {
            arrayList = new ArrayList();
            for (Object add22 : aebt.c) {
                arrayList.add(add22);
            }
            aicd.c = arrayList;
        }
        if (aebt.d.length > 0) {
            arrayList = new ArrayList();
            for (Object add222 : aebt.d) {
                arrayList.add(add222);
            }
            aicd.d = arrayList;
        }
        if (aebt.e.length > 0) {
            arrayList = new ArrayList();
            for (long valueOf : aebt.e) {
                arrayList.add(Long.valueOf(valueOf));
            }
            aicd.e = arrayList;
        }
        if (aebt.f.length > 0) {
            arrayList = new ArrayList();
            for (Object add2222 : aebt.f) {
                arrayList.add(add2222);
            }
            aicd.f = arrayList;
        }
        if (aebt.g.length > 0) {
            arrayList = new ArrayList();
            for (Object add3 : aebt.g) {
                arrayList.add(add3);
            }
            aicd.g = arrayList;
        }
        return aicd;
    }
}
