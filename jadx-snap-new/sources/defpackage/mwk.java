package defpackage;

import defpackage.mwe.a;
import defpackage.mwe.a.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: mwk */
public final class mwk implements mwe {
    final zfw a;
    final long b;
    final TimeUnit c;
    private final mwe d;

    /* renamed from: mwk$a */
    static final class a<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ mwk a;
        private /* synthetic */ defpackage.mwe.a b;
        private /* synthetic */ ajde c;

        /* renamed from: mwk$a$1 */
        static final class 1<T, R> implements ajfc<T, akuw<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                for (Object next : list) {
                    if (((mux) next).k.b()) {
                        break;
                    }
                }
                Object next2 = null;
                next2 = (mux) next2;
                if (next2 != null) {
                    ajde b = ajde.b(next2);
                    if (b != null) {
                        return b;
                    }
                }
                return ajvo.a(ajke.b);
            }
        }

        a(mwk mwk, defpackage.mwe.a aVar, ajde ajde) {
            this.a = mwk;
            this.b = aVar;
            this.c = ajde;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (List) obj;
            akcr.b(obj, "lenses");
            if (obj.isEmpty()) {
                return mys.a();
            }
            Map linkedHashMap = new LinkedHashMap();
            for (Object next : (Iterable) obj) {
                Boolean valueOf = Boolean.valueOf(((mux) next).k.b());
                ArrayList arrayList = linkedHashMap.get(valueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(valueOf, arrayList);
                }
                arrayList.add(next);
            }
            Object obj2 = (List) linkedHashMap.get(Boolean.TRUE);
            if (obj2 != null) {
                return ajde.b(obj2);
            }
            if (this.b instanceof b) {
                return ajde.b(obj);
            }
            obj = ajde.b(obj).c(2, this.a.c, this.a.a.b()).d((akuw) this.c.h(1.a));
            akcr.a(obj, "just(lenses).delay(\n    …                       })");
            return obj;
        }
    }

    public /* synthetic */ mwk(mwe mwe, zfw zfw) {
        this(mwe, zfw, TimeUnit.SECONDS);
    }

    private mwk(mwe mwe, zfw zfw, TimeUnit timeUnit) {
        akcr.b(mwe, "lensRepository");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "localLensesTimeoutTimeUnit");
        this.d = mwe;
        this.a = zfw;
        this.b = 2;
        this.c = timeUnit;
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        ajde a = this.d.a(aVar);
        Object h = a.h(new a(this, aVar, a));
        akcr.a(h, "query\n                .s…      }\n                }");
        return h;
    }
}
