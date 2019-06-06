package defpackage;

import defpackage.mwe.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: mwj */
public final class mwj implements mwe {
    private final Collection<mwe> a;
    private final zfw b;
    private final long c;
    private final TimeUnit d;

    /* renamed from: mwj$a */
    static final class a<T, R> implements ajfc<Object[], R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            akcr.b(objArr, "collected");
            int i = 0;
            if ((objArr.length == 0 ? 1 : null) != null) {
                return ajyw.a;
            }
            String str = "null cannot be cast to non-null type kotlin.collections.List<com.snap.lenses.lens.Lens>";
            if (objArr.length == 1) {
                obj = ajyi.c(objArr);
                if (obj != null) {
                    return (List) obj;
                }
                throw new ajxt(str);
            }
            ArrayList arrayList = new ArrayList();
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if ((((List) obj2).isEmpty() ^ 1) != 0) {
                        arrayList.addAll((Collection) obj2);
                    }
                    i++;
                } else {
                    throw new ajxt(str);
                }
            }
            return arrayList;
        }
    }

    public /* synthetic */ mwj(Collection collection, zfw zfw) {
        this(collection, zfw, TimeUnit.MILLISECONDS);
    }

    private mwj(Collection<? extends mwe> collection, zfw zfw, TimeUnit timeUnit) {
        akcr.b(collection, "lensRepositories");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "emitEmptyAfterTimeoutUnit");
        this.a = collection;
        this.b = zfw;
        this.c = 100;
        this.d = timeUnit;
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        Iterable<mwe> iterable = this.a;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (mwe a : iterable) {
            ajde a2 = a.a(aVar);
            Object obj = ajyw.a;
            ajfv.a(obj, "item is null");
            obj = ajde.b(obj);
            ajfv.a(obj, "other is null");
            Object a3 = ajvo.a(new ajla(a2, obj));
            akcr.a(a3, "it.query(queryCriteria)\n…faultIfEmpty(emptyList())");
            akuw akuw = (akuw) a3;
            arrayList.add(ajde.b((Object) ajyw.a).c(100, this.d, this.b.b()).d(akuw).b(akuw));
        }
        Object a4 = ajde.a((Iterable) (List) arrayList, (ajfc) a.a);
        akcr.a(a4, "combineLatest(lensReposi…atest allLenses\n        }");
        return a4;
    }
}
