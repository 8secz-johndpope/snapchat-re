package defpackage;

import defpackage.mwe.a;
import defpackage.mwe.a.b;
import defpackage.zss.b.d;
import defpackage.zss.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: lfp */
public final class lfp implements mwe {
    final zpo a;
    final ajdu<List<zsm>, List<mux>> b;
    final a c;
    final ide d;
    final zfw e;
    final long f;
    final TimeUnit g;
    private final ajxe h = ajxh.a(new b(this));

    /* renamed from: lfp$a */
    public static abstract class a implements akbw<zpp, idd, ajdp<List<? extends zsm>>> {

        /* renamed from: lfp$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                zpp zpp = (zpp) obj;
                idd idd = (idd) obj2;
                akcr.b(zpp, "connector");
                akcr.b(idd, "attributedCallsite");
                return zpp.a((zss) e.b, idd);
            }

            public final String toString() {
                return "LensSelector.Default";
            }
        }

        /* renamed from: lfp$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                zpp zpp = (zpp) obj;
                idd idd = (idd) obj2;
                akcr.b(zpp, "connector");
                akcr.b(idd, "attributedCallsite");
                return zpp.a((zss) d.b, idd);
            }

            public final String toString() {
                return "LensSelector.Prefetch";
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lfp$b */
    static final class b extends akcs implements akbk<ajde<List<? extends mux>>> {
        final /* synthetic */ lfp a;

        /* renamed from: lfp$b$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;
            private /* synthetic */ idd b;

            /* renamed from: lfp$b$a$1 */
            static final class 1<T> implements ajfb<List<? extends zsm>> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }

            a(b bVar, idd idd) {
                this.a = bVar;
                this.b = idd;
            }

            public final /* synthetic */ Object apply(Object obj) {
                zpp zpp = (zpp) obj;
                akcr.b(zpp, "connector");
                ajdp j = mip.a((ajdp) this.a.a.c.invoke(zpp, this.b), "GeoLensRepository:lensSelector").d((ajfb) 1.a).j(ajfu.a);
                akcr.a((Object) j, "lensSelector(connector, … }.distinctUntilChanged()");
                return myu.b(j);
            }
        }

        b(lfp lfp) {
            this.a = lfp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            idd callsite = this.a.d.callsite("GeoLensRepository");
            Object a = this.a.a.a(callsite).b((ajdw) this.a.e.f()).u(new a(this, callsite)).a(this.a.b);
            akcr.a(a, "unlockables\n                .compose(transformer)");
            return a.i().g(this.a.f, this.a.g, this.a.e.b()).a(ajcw.LATEST);
        }
    }

    /* renamed from: lfp$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((mux) next).a, ((b) this.a).a)) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lfp.class), "allGeoLenses", "getAllGeoLenses()Lio/reactivex/Flowable;");
    }

    public lfp(zpo zpo, ajdu<List<zsm>, List<mux>> ajdu, a aVar, ide ide, zfw zfw, long j, TimeUnit timeUnit) {
        akcr.b(zpo, "unlockablesApi");
        akcr.b(ajdu, "transformer");
        akcr.b(aVar, "lensSelector");
        akcr.b(ide, "attributedFeature");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "unlockablesConnectionTimeoutUnit");
        this.a = zpo;
        this.b = ajdu;
        this.c = aVar;
        this.d = ide;
        this.e = zfw;
        this.f = j;
        this.g = timeUnit;
    }

    private final ajde<List<mux>> a() {
        return (ajde) this.h.b();
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        if (akcr.a((Object) aVar, a.a.a)) {
            return a();
        }
        if (aVar instanceof b) {
            Object d = a().d((ajfc) new c(aVar));
            akcr.a(d, "allGeoLenses.map {\n     …ia.lensId }\n            }");
            return d;
        }
        throw new ajxk();
    }
}
