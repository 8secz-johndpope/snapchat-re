package defpackage;

import defpackage.moc.b;
import defpackage.muo.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: mwm */
public final class mwm implements mvv {
    final mok<b> a;
    final mwh b;
    private final ajdp<muo> c;
    private final zfw d;
    private final long e;
    private final TimeUnit f;

    /* renamed from: mwm$a */
    static final class a<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ mwm a;

        /* renamed from: mwm$a$1 */
        static final class 1<T, R> implements ajfc<Object[], R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "lensesList");
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

        a(mwm mwm) {
            this.a = mwm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            List list = (List) ajxm.a;
            muo muo = (muo) ajxm.b;
            if (list.isEmpty()) {
                return mys.a();
            }
            Iterable<Object> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj2 : iterable) {
                Object f;
                mwm mwm = this.a;
                akcr.a((Object) muo, "priority");
                b a = mwm.b.a((mux) obj2, muo);
                if (a != null) {
                    moc moc = a;
                    f = mwm.a.a(moc).f(new b(mwm, obj2)).f();
                    if (!mwm.a.c(moc)) {
                        f = f.c(obj2);
                    }
                    if (f != null) {
                        arrayList.add(f);
                    }
                }
                f = ajde.b(obj2);
                akcr.a(f, "Flowable.just(lens)");
                arrayList.add(f);
            }
            return ajde.a((Iterable) (List) arrayList, (ajfc) 1.a);
        }
    }

    /* renamed from: mwm$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ mwm a;
        private /* synthetic */ mux b;

        b(mwm mwm, mux mux) {
            this.a = mwm;
            this.b = mux;
        }

        public final /* synthetic */ Object apply(Object obj) {
            miq miq = (miq) obj;
            akcr.b(miq, "it");
            return this.a.b.a(this.b, miq);
        }
    }

    public /* synthetic */ mwm(mok mok, mwh mwh, ajdp ajdp, zfw zfw) {
        this(mok, mwh, ajdp, zfw, TimeUnit.SECONDS);
    }

    private mwm(mok<? super b> mok, mwh mwh, ajdp<muo> ajdp, zfw zfw, TimeUnit timeUnit) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(mwh, "lensUriHelper");
        akcr.b(ajdp, "downloadPriority");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "samplingTimeUnit");
        this.a = mok;
        this.b = mwh;
        this.c = ajdp;
        this.d = zfw;
        this.e = 1;
        this.f = timeUnit;
    }

    public final /* synthetic */ akuw a(ajde ajde) {
        akcr.b(ajde, "upstream");
        ajde a = this.c.a(ajcw.LATEST);
        Object obj = this.f;
        Object b = this.d.b();
        ajfv.a(obj, "unit is null");
        ajfv.a(b, "scheduler is null");
        Object c = ajvo.a(new ajku(a, 1, obj, b)).c(a.a);
        akcr.a(c, "downloadPriority\n       …DownloadPriority.Default)");
        ajde = mip.b(ajvw.a(ajde, c), "PriorityLensContentTransformer#resolve").h(new a(this));
        akcr.a((Object) ajde, "upstream.combineLatest(\n…  }\n                    }");
        return mip.a(ajde);
    }
}
