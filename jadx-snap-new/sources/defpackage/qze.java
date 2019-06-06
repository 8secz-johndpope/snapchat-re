package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: qze */
public final class qze {
    public static final List<String> a(aelz aelz) {
        Collection arrayList;
        akcr.b(aelz, "receiver$0");
        List arrayList2 = new ArrayList();
        aegb aegb = aelz.a;
        if (aegb != null) {
            List list = aegb.f;
            if (list != null) {
                Collection arrayList3 = new ArrayList();
                for (Object next : list) {
                    if ((ahbc.a(((ahaz) next).m) != ahbc.NONE ? 1 : null) != null) {
                        arrayList3.add(next);
                    }
                }
                Iterable<ahaz> iterable = (List) arrayList3;
                arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (ahaz ahaz : iterable) {
                    arrayList.add(ahaz.a);
                }
                arrayList2.addAll((List) arrayList);
            }
        }
        aegb aegb2 = aelz.a;
        if (aegb2 != null) {
            List list2 = aegb2.g;
            if (list2 != null) {
                Iterable<aefi> iterable2 = list2;
                arrayList = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                for (aefi aefi : iterable2) {
                    arrayList.add(aefi.a);
                }
                arrayList2.addAll((List) arrayList);
            }
        }
        return arrayList2;
    }
}
