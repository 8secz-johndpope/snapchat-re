package defpackage;

import defpackage.moc.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mwn */
public final class mwn implements mvv {
    final mwh a;
    private final mok<b> b;

    /* renamed from: mwn$a */
    static final class a<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ mwn a;

        /* renamed from: mwn$a$2 */
        static final class 2<T, R> implements ajfc<Object[], R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "combined");
                Collection arrayList = new ArrayList(objArr.length);
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        arrayList.add((mux) obj2);
                        i++;
                    } else {
                        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.lens.Lens");
                    }
                }
                return (List) arrayList;
            }
        }

        /* renamed from: mwn$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mux mux = (mux) obj;
                akcr.b(mux, "lens");
                return ajyl.a(mux);
            }
        }

        a(mwn mwn) {
            this.a = mwn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            if (list.isEmpty()) {
                return mys.a();
            }
            if (list.size() == 1) {
                return mwn.a(this.a, (mux) ajyu.f(list)).d((ajfc) 1.a);
            }
            Iterable<mux> iterable = list;
            mwn mwn = this.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (mux a : iterable) {
                arrayList.add(mwn.a(mwn, a));
            }
            return ajde.a((Iterable) (List) arrayList, (ajfc) 2.a);
        }
    }

    /* renamed from: mwn$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ mwn a;
        private /* synthetic */ mux b;

        b(mwn mwn, mux mux) {
            this.a = mwn;
            this.b = mux;
        }

        public final /* synthetic */ Object apply(Object obj) {
            miq miq = (miq) obj;
            akcr.b(miq, "it");
            return this.a.a.a(this.b, miq);
        }
    }

    public mwn(mok<? super b> mok, mwh mwh) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(mwh, "lensUriHelper");
        this.b = mok;
        this.a = mwh;
    }

    public static final /* synthetic */ ajde a(mwn mwn, mux mux) {
        b a = mwn.a.a(mux, null);
        if (a != null) {
            ajde c = mwn.b.a(a).f(new b(mwn, mux)).f().c((Object) mux);
            if (c != null) {
                return c;
            }
        }
        Object b = ajde.b((Object) mux);
        akcr.a(b, "Flowable.just(lens)");
        return b;
    }

    public final /* synthetic */ akuw a(ajde ajde) {
        akcr.b(ajde, "upstream");
        ajde = mip.b(ajde, "ResourceLensContentTransformer#resolve").h(new a(this));
        akcr.a((Object) ajde, "upstream\n            .tr…          }\n            }");
        return mip.a(ajde);
    }
}
