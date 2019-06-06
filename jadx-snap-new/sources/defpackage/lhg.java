package defpackage;

import defpackage.mwe.a;
import defpackage.mwe.a.b;
import defpackage.zss.h.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lhg */
public final class lhg implements mwe {
    final zpo a;
    final ajdu<List<zsm>, List<mux>> b;
    final zfw c;
    final ide d;
    private final ajxe e = ajxh.a(new a(this));
    private final long f;
    private final TimeUnit g;

    /* renamed from: lhg$a */
    static final class a extends akcs implements akbk<ajde<List<? extends mux>>> {
        final /* synthetic */ lhg a;

        /* renamed from: lhg$a$b */
        static final class b<V> implements Callable<T> {
            private /* synthetic */ AtomicBoolean a;

            b(AtomicBoolean atomicBoolean) {
                this.a = atomicBoolean;
            }

            public final /* synthetic */ Object call() {
                return Boolean.valueOf(this.a.compareAndSet(true, false));
            }
        }

        /* renamed from: lhg$a$a */
        public static final class a<T1, T2, R> implements ajex<zpp, Boolean, R> {
            public final R apply(zpp zpp, Boolean bool) {
                return ajxs.a(zpp, bool);
            }
        }

        a(lhg lhg) {
            this.a = lhg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            final idd callsite = this.a.d.callsite("UnlockedLensRepository");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            Object b = ajdp.b((Callable) new b(atomicBoolean));
            akcr.a(b, "Observable.fromCallable …pareAndSet(true, false) }");
            b = this.a.a.a(callsite).b((ajdt) b, (ajex) new a());
            akcr.a(b, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
            Object a = b.u(new ajfc<T, ajdt<? extends R>>(this) {
                private /* synthetic */ a b;

                /* renamed from: lhg$a$1$1 */
                static final class 1<T> implements ajfb<List<? extends zsm>> {
                    public static final 1 a = new 1();

                    1() {
                    }

                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }

                /* renamed from: lhg$a$1$a */
                static final class a<T> implements ajfb<Throwable> {
                    private /* synthetic */ 1 a;
                    private /* synthetic */ Boolean b;

                    a(1 1, Boolean bool) {
                        this.a = 1;
                        this.b = bool;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        obj = this.b;
                        String str = "isFirstQuery";
                        akcr.a(obj, str);
                        if (obj.booleanValue()) {
                            AtomicBoolean atomicBoolean = atomicBoolean;
                            Object obj2 = this.b;
                            akcr.a(obj2, str);
                            atomicBoolean.compareAndSet(obj2.booleanValue(), true);
                        }
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    ajxm ajxm = (ajxm) obj;
                    akcr.b(ajxm, "<name for destructuring parameter 0>");
                    zpp zpp = (zpp) ajxm.a;
                    obj = (Boolean) ajxm.b;
                    akcr.a(obj, "isFirstQuery");
                    ajdp j = mip.a(zpp.a((zss) obj.booleanValue() ? c.b : defpackage.zss.h.a.b, callsite), "UnlockedLensRepository:connector#query").d((ajfb) 1.a).b((ajdw) this.b.a.c.f()).j(ajfu.a);
                    akcr.a((Object) j, "connector.query(query, c…  .distinctUntilChanged()");
                    j = myu.b(j);
                    return obj.booleanValue() ? j.c((ajfb) new a(this, obj)) : j;
                }
            }).a(this.a.b);
            akcr.a(a, "connector.zipWith(isFirs…    .compose(transformer)");
            return cfc.a(a).a(ajcw.LATEST);
        }
    }

    /* renamed from: lhg$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((mux) next).a, ((defpackage.mwe.a.b) this.a).a)) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lhg.class), "lenses", "getLenses()Lio/reactivex/Flowable;");
    }

    public lhg(zpo zpo, ajdu<List<zsm>, List<mux>> ajdu, zfw zfw, long j, TimeUnit timeUnit, ide ide) {
        akcr.b(zpo, "unlockablesApi");
        akcr.b(ajdu, "transformer");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "timeoutUnit");
        akcr.b(ide, "attributedFeature");
        this.a = zpo;
        this.b = ajdu;
        this.c = zfw;
        this.f = j;
        this.g = timeUnit;
        this.d = ide;
    }

    private final ajde<List<mux>> a() {
        return (ajde) this.e.b();
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        if (!(aVar instanceof b)) {
            return a();
        }
        Object d = a().d((ajfc) new b(aVar));
        akcr.a(d, "lenses.map { lenses -> l… queryCriteria.lensId } }");
        return d;
    }
}
