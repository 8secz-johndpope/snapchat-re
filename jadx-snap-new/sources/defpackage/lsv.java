package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: lsv */
public final class lsv implements lsw {
    public static final lsv a = new lsv();

    /* renamed from: lsv$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((mux) t).u), Integer.valueOf(((mux) t2).u));
        }
    }

    private lsv() {
    }

    public static List<mux> a(List<mux> list) {
        Object next;
        akcr.b(list, "source");
        ArrayList arrayList = new ArrayList();
        Iterable iterable = list;
        Collection arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            Object obj = 1;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (((mux) next).u == -1) {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(next);
            }
        }
        List<mux> a = ajyu.a((Iterable) (List) arrayList2, (Comparator) new a());
        Collection arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            if ((((mux) next2).u == -1 ? 1 : null) != null) {
                arrayList3.add(next2);
            }
        }
        arrayList.addAll((List) arrayList3);
        for (mux mux : a) {
            arrayList.add(Math.min(mux.u, arrayList.size()), mux);
        }
        return arrayList;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return lsv.a((List) obj);
    }
}
