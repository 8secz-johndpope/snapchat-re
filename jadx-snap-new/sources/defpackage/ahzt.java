package defpackage;

import java.util.ArrayList;

/* renamed from: ahzt */
public final class ahzt {
    public static ahzr a(aebh aebh) {
        ahzr ahzr = new ahzr();
        if (aebh.a.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (aeal a : aebh.a) {
                arrayList.add(affy.a(a));
            }
            if (!arrayList.isEmpty()) {
                ahzr.a = arrayList;
            }
        }
        return ahzr;
    }
}
