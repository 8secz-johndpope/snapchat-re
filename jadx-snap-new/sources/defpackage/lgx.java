package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.base.Supplier;
import com.snap.lenses.app.data.LensesHttpInterface;
import defpackage.ajkr.f;
import defpackage.ajkr.g;
import defpackage.mwe.a;
import defpackage.mwe.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lgx */
public final class lgx implements mwe {
    final ajxe a = ajxh.a(d.a);
    final akbl<a, List<mux>> b = new h(this);
    final c c;
    final TimeZone d;
    final mhk e;
    final zfw f;
    final ajdi<aeqv, aeqv> g;
    final ajdp<Boolean> h;
    final ajdp<Boolean> i;
    final lfq j;
    final b k;
    final long l;
    final TimeUnit m;
    private final ajxe n = ajxh.a(new e(this));

    /* renamed from: lgx$c */
    public static abstract class c implements akbl<aewm, ajdx<aeqv>> {

        /* renamed from: lgx$c$a */
        public static final class a extends c {
            final Supplier<LensesHttpInterface> a;

            /* renamed from: lgx$c$a$a */
            static final class a<V> implements Callable<T> {
                private /* synthetic */ a a;

                a(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object call() {
                    return (LensesHttpInterface) this.a.a.get();
                }
            }

            /* renamed from: lgx$c$a$b */
            static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
                private /* synthetic */ aewm a;

                b(aewm aewm) {
                    this.a = aewm;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    LensesHttpInterface lensesHttpInterface = (LensesHttpInterface) obj;
                    akcr.b(lensesHttpInterface, "it");
                    return lensesHttpInterface.fetchLensSchedule(this.a);
                }
            }

            public a(Supplier<LensesHttpInterface> supplier) {
                akcr.b(supplier, "lensesHttpInterface");
                super();
                this.a = supplier;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                aewm aewm = (aewm) obj;
                akcr.b(aewm, "request");
                obj = ajdx.c((Callable) new a(this)).a((ajfc) new b(aewm));
                akcr.a(obj, "Single.fromCallable { le…chLensSchedule(request) }");
                return obj;
            }
        }

        /* renamed from: lgx$c$b */
        public static final class b extends c {
            final Supplier<LensesHttpInterface> a;

            /* renamed from: lgx$c$b$a */
            static final class a<V> implements Callable<T> {
                private /* synthetic */ b a;

                a(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object call() {
                    return (LensesHttpInterface) this.a.a.get();
                }
            }

            /* renamed from: lgx$c$b$b */
            static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
                private /* synthetic */ aewm a;

                b(aewm aewm) {
                    this.a = aewm;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    LensesHttpInterface lensesHttpInterface = (LensesHttpInterface) obj;
                    akcr.b(lensesHttpInterface, "it");
                    return lensesHttpInterface.fetchLensScheduleProto(this.a);
                }
            }

            /* renamed from: lgx$c$b$c */
            static final class c extends akcq implements akbl<adzw, aeqv> {
                public static final c a = new c();

                c() {
                    super(1);
                }

                public final String getName() {
                    return "fromProto";
                }

                public final akej getOwner() {
                    return akde.a(aeqx.class);
                }

                public final String getSignature() {
                    return "fromProto(Lcom/snapchat/proto/nano/LoadScheduledLensesResponseV2;)Lcom/snapchat/soju/android/LoadScheduledLensesResponseV2;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return aeqx.a((adzw) obj);
                }
            }

            public b(Supplier<LensesHttpInterface> supplier) {
                akcr.b(supplier, "lensesHttpInterface");
                super();
                this.a = supplier;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                aewm aewm = (aewm) obj;
                akcr.b(aewm, "request");
                obj = ajdx.c((Callable) new a(this)).a((ajfc) new b(aewm)).f(new lha(c.a));
                akcr.a(obj, "Single.fromCallable { le…rotoConverter::fromProto)");
                return obj;
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: lgx$b */
    public static abstract class b implements akbl<aeqv, List<? extends ajxm<? extends muu, ? extends List<? extends aenr>>>> {

        /* renamed from: lgx$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                aeqv aeqv = (aeqv) obj;
                akcr.b(aeqv, EventType.RESPONSE);
                ajxm[] ajxmArr = new ajxm[2];
                muu muu = muu.SCHEDULED_FRONT;
                Object obj2 = aeqv.a;
                if (obj2 == null) {
                    obj2 = ajyw.a;
                }
                ajxmArr[0] = ajxs.a(muu, obj2);
                muu = muu.SCHEDULED_REAR;
                obj = aeqv.f;
                if (obj == null) {
                    obj = ajyw.a;
                }
                ajxmArr[1] = ajxs.a(muu, obj);
                return ajym.b((Object[]) ajxmArr);
            }

            public final String toString() {
                return "LensSelector.Default";
            }
        }

        /* renamed from: lgx$b$b */
        public static final class b extends b {
            public static final b a = new b();

            private b() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                aeqv aeqv = (aeqv) obj;
                akcr.b(aeqv, EventType.RESPONSE);
                obj = aeqv.b;
                muu muu = muu.SCHEDULED_PRECACHED;
                if (obj == null) {
                    obj = ajyw.a;
                }
                return ajyl.a(ajxs.a(muu, obj));
            }

            public final String toString() {
                return "LensSelector.Prefetch";
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lgx$d */
    static final class d extends akcs implements akbk<aeqv> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aeqv aeqv = new aeqv();
            aeqv.a = ajyw.a;
            aeqv.b = ajyw.a;
            aeqv.f = ajyw.a;
            aeqv.c = Long.valueOf(1000);
            return aeqv;
        }
    }

    /* renamed from: lgx$e */
    static final class e extends akcs implements akbk<ajde<List<? extends mux>>> {
        private /* synthetic */ lgx a;

        /* renamed from: lgx$e$a */
        public static final class a<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Object obj = (Boolean) t3;
                Object obj2 = (Boolean) t2;
                aeqv aeqv = (aeqv) t1;
                akcr.a(obj2, "sponsoredLensesEnabled");
                boolean booleanValue = obj2.booleanValue();
                akcr.a(obj, "snappableLensesEnabled");
                return new a(aeqv, booleanValue, obj.booleanValue());
            }
        }

        /* renamed from: lgx$e$b */
        public static final class b extends akcs implements akbl<a, List<? extends mux>> {
            private /* synthetic */ ConcurrentHashMap a;
            private /* synthetic */ akbl b;

            public b(ConcurrentHashMap concurrentHashMap, akbl akbl) {
                this.a = concurrentHashMap;
                this.b = akbl;
                super(1);
            }

            public final List<? extends mux> invoke(a aVar) {
                ConcurrentMap concurrentMap = this.a;
                Object obj = concurrentMap.get(aVar);
                if (obj != null) {
                    return obj;
                }
                obj = this.b.invoke(aVar);
                List<? extends mux> putIfAbsent = concurrentMap.putIfAbsent(aVar, obj);
                return putIfAbsent == null ? obj : putIfAbsent;
            }
        }

        e(lgx lgx) {
            this.a = lgx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            lgx lgx = this.a;
            c cVar = lgx.c;
            aewm aewm = new aewm();
            aewm.a = lgx.d.getID();
            aewm.C = String.valueOf(lgx.e.a(TimeUnit.MILLISECONDS));
            Object a = mip.a(ign.a((ajdx) cVar.invoke(aewm), (ajdw) lgx.f.b()), "ScheduledLensRepository:fetchLensSchedule").g(new f(lgx)).f().a(lgx.g);
            akcr.a(a, "lensesFetcher(getRequest…          .compose(cache)");
            Object a2 = this.a.h.a(ajcw.LATEST);
            akcr.a(a2, "sponsoredLensesEnabled.t…kpressureStrategy.LATEST)");
            Object a3 = this.a.i.a(ajcw.LATEST);
            akcr.a(a3, "snappablesEnabled.toFlow…kpressureStrategy.LATEST)");
            ajde a4 = ajde.a((akuw) a, (akuw) a2, (akuw) a3, (ajfd) new a());
            if (a4 == null) {
                akcr.a();
            }
            akbl akbl = this.a.b;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            a.class.getSimpleName();
            List.class.getSimpleName();
            a = a4.d((ajfc) new lha(new b(concurrentHashMap, akbl)));
            akcr.a(a, "Flowables.combineLatest(…emoize(responseToLenses))");
            a4 = a.b((ajdw) this.a.f.f());
            ajfv.a(1, "bufferSize");
            f fVar = new f();
            AtomicReference atomicReference = new AtomicReference();
            ajeu a5 = ajvo.a(new ajkr(new g(atomicReference, fVar), a4, atomicReference, fVar));
            long j = this.a.l;
            Object obj = this.a.m;
            Object b = this.a.f.b();
            ajfv.a(1, "subscriberCount");
            ajfv.a(obj, "unit is null");
            ajfv.a(b, "scheduler is null");
            return ajvo.a(new ajko(a5, j, obj, b));
        }
    }

    /* renamed from: lgx$h */
    static final class h extends akcs implements akbl<a, List<? extends mux>> {
        private /* synthetic */ lgx a;

        h(lgx lgx) {
            this.a = lgx;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "<name for destructuring parameter 0>");
            aeqv aeqv = aVar.a;
            boolean z = aVar.b;
            boolean z2 = aVar.c;
            Collection arrayList = new ArrayList();
            for (ajxm ajxm : (List) this.a.k.invoke(aeqv)) {
                ajyr.a(arrayList, (Iterable) lfr.a((List) ajxm.b, this.a.j, (muu) ajxm.a, z, z2));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: lgx$f */
    static final class f<T, R> implements ajfc<Throwable, aeqv> {
        private /* synthetic */ lgx a;

        f(lgx lgx) {
            this.a = lgx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return (aeqv) this.a.a.b();
        }
    }

    /* renamed from: lgx$a */
    static final class a {
        final aeqv a;
        final boolean b;
        final boolean c;

        public a(aeqv aeqv, boolean z, boolean z2) {
            akcr.b(aeqv, EventType.RESPONSE);
            this.a = aeqv;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.a, aVar.a)) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            if ((this.c == aVar.c ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            aeqv aeqv = this.a;
            int hashCode = (aeqv != null ? aeqv.hashCode() : 0) * 31;
            int i = this.b;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.c;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ConfiguredLensesResponse(response=");
            stringBuilder.append(this.a);
            stringBuilder.append(", sponsoredLensesEnabled=");
            stringBuilder.append(this.b);
            stringBuilder.append(", snappableLensesEnabled=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: lgx$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ a a;

        g(a aVar) {
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
        aken[] akenArr = new aken[]{new akdc(akde.a(lgx.class), "emptyResponse", "getEmptyResponse()Lcom/snapchat/soju/android/LoadScheduledLensesResponseV2;"), new akdc(akde.a(lgx.class), "frontAndRearSchedules", "getFrontAndRearSchedules()Lio/reactivex/Flowable;")};
    }

    public lgx(c cVar, TimeZone timeZone, mhk mhk, zfw zfw, ajdi<aeqv, aeqv> ajdi, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, lfq lfq, b bVar, long j, TimeUnit timeUnit) {
        akcr.b(cVar, "lensesFetcher");
        akcr.b(timeZone, "timeZone");
        akcr.b(mhk, "clockProvider");
        akcr.b(zfw, "schedulers");
        akcr.b(ajdi, "cache");
        akcr.b(ajdp, "sponsoredLensesEnabled");
        akcr.b(ajdp2, "snappablesEnabled");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(bVar, "lensSelector");
        akcr.b(timeUnit, "timeoutUnit");
        this.c = cVar;
        this.d = timeZone;
        this.e = mhk;
        this.f = zfw;
        this.g = ajdi;
        this.h = ajdp;
        this.i = ajdp2;
        this.j = lfq;
        this.k = bVar;
        this.l = j;
        this.m = timeUnit;
    }

    private final ajde<List<mux>> a() {
        return (ajde) this.n.b();
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        if (akcr.a((Object) aVar, a.a.a)) {
            return a();
        }
        if (aVar instanceof b) {
            ajde a = a();
            new StringBuilder("forId:").append(((b) aVar).a);
            Object d = a.d((ajfc) new g(aVar));
            akcr.a(d, "frontAndRearSchedules\n  … queryCriteria.lensId } }");
            return d;
        }
        throw new ajxk();
    }
}
