package defpackage;

import defpackage.moc.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mun */
public final class mun implements mvv {
    final mok<b> a;
    final mwh b;

    /* renamed from: mun$a */
    static final class a<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ mun a;

        a(mun mun) {
            this.a = mun;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            if (list.isEmpty()) {
                return mys.a();
            }
            Iterable<Object> iterable = list;
            mun mun = this.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj2 : iterable) {
                Object obj22;
                b a = mun.b.a((mux) obj22, null);
                if (a != null) {
                    mux a2 = mun.b.a((mux) obj22, mun.a.b(a));
                    if (a2 != null) {
                        obj22 = a2;
                    }
                }
                arrayList.add(obj22);
            }
            return ajde.b((List) arrayList);
        }
    }

    public mun(mok<? super b> mok, mwh mwh) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(mwh, "lensUriHelper");
        this.a = mok;
        this.b = mwh;
    }

    public final /* synthetic */ akuw a(ajde ajde) {
        akcr.b(ajde, "upstream");
        ajde = mip.b(ajde, "DirectResourceLensContentTransformer#resolve").h(new a(this));
        akcr.a((Object) ajde, "upstream\n            .tr…          }\n            }");
        return mip.a(ajde);
    }
}
