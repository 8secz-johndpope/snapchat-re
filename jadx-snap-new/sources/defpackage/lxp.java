package defpackage;

import defpackage.mwe.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lxp */
public final class lxp implements mwe {
    private final mwe a;
    private final ajdp<miz> b;

    /* renamed from: lxp$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            List list = (List) ajxm.a;
            if (((miz) ajxm.b) != miz.DEFAULT) {
                return list;
            }
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((mux) next).o.c) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    public lxp(mwe mwe, ajdp<miz> ajdp) {
        akcr.b(mwe, "repository");
        akcr.b(ajdp, "debugModeObservable");
        this.a = mwe;
        this.b = ajdp;
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        ajde a = this.a.a(aVar);
        Object a2 = this.b.a(ajcw.MISSING);
        akcr.a(a2, "debugModeObservable.toFl…pressureStrategy.MISSING)");
        Object d = ajvw.a(a, a2).d((ajfc) a.a);
        akcr.a(d, "repository.query(queryCr…      }\n                }");
        return d;
    }
}
