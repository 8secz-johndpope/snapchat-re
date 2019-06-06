package defpackage;

import java.util.ArrayList;

/* renamed from: ailx */
public final class ailx {
    public static adsl a(ailv ailv) {
        adsl adsl = new adsl();
        if (ailv.a != null) {
            adsl.a = ailv.a.booleanValue();
        }
        if (ailv.b != null) {
            adsl.b = ailv.b.booleanValue();
        }
        if (ailv.c != null) {
            adsl.c = ailv.c.booleanValue();
        }
        if (ailv.d != null) {
            adsl.d = ailv.d.booleanValue();
        }
        if (ailv.e != null) {
            adsl.e = new String[ailv.e.size()];
            for (int i = 0; i < ailv.e.size(); i++) {
                adsl.e[i] = (String) ailv.e.get(i);
            }
        }
        return adsl;
    }

    public static ailv a(adsl adsl) {
        ailv ailv = new ailv();
        ailv.a = Boolean.valueOf(adsl.a);
        ailv.b = Boolean.valueOf(adsl.b);
        ailv.c = Boolean.valueOf(adsl.c);
        ailv.d = Boolean.valueOf(adsl.d);
        if (adsl.e.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object add : adsl.e) {
                arrayList.add(add);
            }
            ailv.e = arrayList;
        }
        return ailv;
    }
}
