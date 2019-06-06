package defpackage;

import android.location.Location;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel;
import com.snapchat.soju.android.Geofence;
import defpackage.zpq.a;
import defpackage.zpq.b;
import defpackage.zpq.c;
import defpackage.zpq.d;
import defpackage.zrj.e;
import defpackage.zrj.f;
import defpackage.zrj.g;
import defpackage.zrj.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zrc */
public final class zrc implements a {
    long a;
    final ajxe b;
    final ajxe c;
    final ajxe d;
    final ajwo<zst.a> e;
    ajej f;
    final ajdx<b> g;
    final ajdx<iha> h;
    final ilv i;
    final gqr j;
    final zsg k;
    private final ajxe l = ajxh.a(c.a);
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;

    /* renamed from: zrc$c */
    static final class c extends akcs implements akbk<idd> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zpy.a.callsite("UnlockablesCore");
        }
    }

    /* renamed from: zrc$y */
    static final class y extends akcq implements akbk<c> {
        y(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (c) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zrc$e */
    static final class e extends akcq implements akbk<ihh> {
        e(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zrc$f */
    static final class f extends akcq implements akbk<ftl> {
        f(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zrc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zrc$ad */
    static final class ad extends akcs implements akbk<zfw> {
        private /* synthetic */ zrc a;
        private /* synthetic */ zgb b;

        ad(zrc zrc, zgb zgb) {
            this.a = zrc;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.c());
        }
    }

    /* renamed from: zrc$ab */
    static final class ab extends akcs implements akbk<ajdx<d>> {
        private /* synthetic */ zrc a;
        private /* synthetic */ ajdx b;

        ab(zrc zrc, ajdx ajdx) {
            this.a = zrc;
            this.b = ajdx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.b.b((ajdw) this.a.e().f());
        }
    }

    /* renamed from: zrc$af */
    static final class af extends akcs implements akbk<ajdp<Location>> {
        private /* synthetic */ zrc a;
        private /* synthetic */ ajdx b;

        /* renamed from: zrc$af$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                zrs zrs = (zrs) obj;
                akcr.b(zrs, "it");
                return zrs.b();
            }
        }

        af(zrc zrc, ajdx ajdx) {
            this.a = zrc;
            this.b = ajdx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object d = this.b.b((ajdw) this.a.e().f()).d((ajfc) 1.a);
            akcr.a(d, "locProvider\n            …ble { it.getBetterLoc() }");
            String str = "UnlockablesCore";
            String str2 = "syncCandidateLocation";
            d = d.e((ajfb) new e(str, str2)).b((ajev) new f(str, str2)).d((ajfb) new g(str, str2, true)).c((ajev) new h(str, str2));
            akcr.a(d, "doOnSubscribe { if (fals…servable on complete\")  }");
            return ajpy.k(d).a();
        }
    }

    /* renamed from: zrc$v */
    static final class v extends akcs implements akbk<ajdp<Optional<Location>>> {
        private /* synthetic */ zrc a;
        private /* synthetic */ ajdx b;

        /* renamed from: zrc$v$1 */
        static final class 1<T, R> implements ajfc<T, ajdn<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                zrs zrs = (zrs) obj;
                akcr.b(zrs, "it");
                return zrs.c();
            }
        }

        /* renamed from: zrc$v$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Location location = (Location) obj;
                akcr.b(location, "it");
                return Optional.of(location);
            }
        }

        v(zrc zrc, ajdx ajdx) {
            this.a = zrc;
            this.b = ajdx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object g = this.b.b((ajdw) this.a.e().f()).b((ajfc) 1.a).f(2.a).b((ajdn) ajdj.b(Optional.absent())).g();
            akcr.a(g, "locProvider\n            …          .toObservable()");
            String str = "UnlockablesCore";
            String str2 = "latestLocation";
            g = g.e((ajfb) new e(str, str2)).b((ajev) new f(str, str2)).d((ajfb) new g(str, str2, true)).c((ajev) new h(str, str2));
            akcr.a(g, "doOnSubscribe { if (fals…servable on complete\")  }");
            return g;
        }
    }

    /* renamed from: zrc$r */
    static final class r extends akcs implements akbk<ajdp<Long>> {
        private /* synthetic */ zrc a;

        r(zrc zrc) {
            this.a = zrc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.h().t(zpt.LOCATION_UPDATE_FRESHNESS_THRESHOLD_MS).b((ajdw) this.a.e().f());
            akcr.a(b, "config\n            .obse…bscribeOn(schedules.io())");
            return igs.a(b);
        }
    }

    /* renamed from: zrc$q */
    static final class q extends akcs implements akbk<ajdp<Optional<Location>>> {
        private /* synthetic */ zrc a;

        /* renamed from: zrc$q$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Location location = (Location) obj;
                akcr.b(location, "it");
                return Optional.of(location);
            }
        }

        /* renamed from: zrc$q$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Long l = (Long) obj;
                akcr.b(l, "it");
                return ajdp.b(l.longValue(), TimeUnit.SECONDS);
            }
        }

        q(zrc zrc) {
            this.a = zrc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            zrc zrc = this.a;
            Object p = ((ajdp) zrc.r.b()).p(1.a);
            akcr.a(p, "syncCandidateLocation\n  … .map { Optional.of(it) }");
            ajfv.a((Object) ajdp.a(3, TimeUnit.SECONDS, (ajdw) zrc.e().b()).p(ah.a).c((ajdt) p), "other is null");
            Object a = ajdp.a(p, a);
            akcr.a(a, "this.ambWith(\n          …oncatWith(this)\n        )");
            a = a.s(new zrj.a(TimeUnit.SECONDS, this.a.e().b()));
            akcr.a(a, "this.publish { published…it, scheduler))\n        }");
            return ajpy.k(a).a().j((ajdt) this.a.h().i(zpt.UNLOCKABLES_LOCATION_LISTENING_WINDOW_SECONDS).b((ajdw) this.a.e().b()).d((ajfc) 2.a));
        }
    }

    /* renamed from: zrc$ag */
    static final class ag extends akcs implements akbk<ajdp<Optional<Location>>> {
        final /* synthetic */ zrc a;

        /* renamed from: zrc$ag$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ ag a;

            1(ag agVar) {
                this.a = agVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Long l = (Long) obj;
                akcr.b(l, "it");
                return ((ajdp) this.a.a.r.b()).e(l.longValue(), TimeUnit.MILLISECONDS, this.a.a.e().b());
            }
        }

        /* renamed from: zrc$ag$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Location location = (Location) obj;
                akcr.b(location, "it");
                return Optional.of(location);
            }
        }

        ag(zrc zrc) {
            this.a = zrc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(((ajdp) this.a.b.b()).k((ajfc) new 1(this)).p(2.a)).a();
        }
    }

    /* renamed from: zrc$x */
    static final class x implements Runnable {
        final /* synthetic */ zrc a;

        /* renamed from: zrc$x$1 */
        static final class 1<T> implements ajfb<zst.a> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: zrc$x$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ x a;

            2(x xVar) {
                this.a = xVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                zst.a aVar = (zst.a) obj;
                akcr.b(aVar, "it");
                zrc zrc = this.a.a;
                obj = zrc.g.b((ajdw) zrc.e().g()).b((ajfc) new i(aVar)).f(new j(zrc, aVar)).a((ajfb) k.a).h(l.a);
                akcr.a(obj, "netClient\n              …owable)\n                }");
                return obj.g();
            }
        }

        /* renamed from: zrc$x$3 */
        static final class 3<T, R> implements ajfc<zsu, ajdb> {
            private /* synthetic */ x a;

            3(x xVar) {
                this.a = xVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                zsu zsu = (zsu) obj;
                akcr.b(zsu, "it");
                zrc zrc = this.a.a;
                String str = "Completable.complete()";
                if (zsu.n != null) {
                    obj = ajvo.a(ajhn.a);
                    akcr.a(obj, str);
                    return obj;
                } else if (zsu.a < zrc.a) {
                    obj = ajvo.a(ajhn.a);
                    akcr.a(obj, str);
                    return obj;
                } else {
                    obj = ajcx.a((ajev) new ac(zrc, zsu)).c((ajdb) zrc.d().a(zsu));
                    akcr.a(obj, "Completable.fromAction {…ocessor.process(netData))");
                    return obj;
                }
            }
        }

        x(zrc zrc) {
            this.a = zrc;
        }

        public final void run() {
            zrc zrc = this.a;
            Object s = zrc.e.s(new zrj.a(TimeUnit.SECONDS, this.a.e().b()));
            akcr.a(s, "this.publish { published…it, scheduler))\n        }");
            zrc.f = s.d((ajfb) 1.a).k((ajfc) new 2(this)).a((ajdw) this.a.e().f()).a((ajfc) new 3(this), false).e();
        }
    }

    /* renamed from: zrc$w */
    static final class w implements Runnable {
        private /* synthetic */ zrc a;

        w(zrc zrc) {
            this.a = zrc;
        }

        public final void run() {
            ajej ajej = this.a.f;
            if (ajej != null) {
                ajej.dispose();
            }
        }
    }

    /* renamed from: zrc$d */
    static final class d<T> implements ajfl<Boolean> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: zrc$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ zrc a;
        private /* synthetic */ idd b;

        b(zrc zrc, idd idd) {
            this.a = zrc;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            zrc zrc = this.a;
            idd idd = this.b;
            obj = ajdp.b((ajdt) (ajdp) zrc.c.b(), (ajdt) (ajdp) zrc.d.b()).b((ajdt) zrc.f().d((ajfc) s.a), (ajex) new t(zrc, idd)).d((ajfb) new u(zrc));
            akcr.a(obj, "Observable.merge(geoTrig…equest)\n                }");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(idd);
            stringBuilder.append(" internalRequests");
            String stringBuilder2 = stringBuilder.toString();
            String str = "UnlockablesCore";
            obj = obj.e((ajfb) new e(str, stringBuilder2)).b((ajev) new f(str, stringBuilder2)).d((ajfb) new g(str, stringBuilder2, true)).c((ajev) new h(str, stringBuilder2));
            akcr.a(obj, "doOnSubscribe { if (fals…servable on complete\")  }");
            return obj;
        }
    }

    /* renamed from: zrc$ah */
    static final class ah<T, R> implements ajfc<T, R> {
        public static final ah a = new ah();

        ah() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            return Optional.absent();
        }
    }

    /* renamed from: zrc$aa */
    static final class aa<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ zrc a;
        final /* synthetic */ akdd.d b;
        final /* synthetic */ zss c;
        final /* synthetic */ idd d;
        final /* synthetic */ AtomicBoolean e;

        /* renamed from: zrc$aa$1 */
        static final class 1<T, R> implements ajfc<ajdp<T>, ajdt<R>> {
            final /* synthetic */ aa a;

            /* renamed from: zrc$aa$1$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ 1 a;

                1(1 1) {
                    this.a = 1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    obj = (List) obj;
                    akcr.b(obj, "unlockableList");
                    Iterable<zsm> iterable = (Iterable) obj;
                    Object obj2 = 1;
                    if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                        for (zsm zsm : iterable) {
                            Object obj3;
                            if (zsm.a == UnlockMechanism.LOCATION) {
                                obj3 = 1;
                                continue;
                            } else {
                                obj3 = null;
                                continue;
                            }
                            if (obj3 != null) {
                                break;
                            }
                        }
                    }
                    obj2 = null;
                    return obj2 != null ? ((ajdp) this.a.a.a.s.b()).p(new ajfc<T, R>(this) {
                        private /* synthetic */ 1 a;

                        public final /* synthetic */ Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            akcr.b(optional, "locationOptional");
                            Location location = (Location) optional.orNull();
                            Object obj2 = obj;
                            akcr.a(obj2, "unlockableList");
                            Collection arrayList = new ArrayList();
                            for (Object next : (Iterable) obj2) {
                                zsm zsm = (zsm) next;
                                Object obj3 = (zsm.a != UnlockMechanism.LOCATION || zrc.a(zsm, location)) ? 1 : null;
                                if (obj3 != null) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }) : ajdp.b(obj);
                }
            }

            /* renamed from: zrc$aa$1$2 */
            static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ 1 a;

                2(1 1) {
                    this.a = 1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    final List list = (List) obj;
                    akcr.b(list, "geoUnlockables");
                    return ((ajdp) this.a.a.a.s.b()).p(new ajfc<T, R>(this) {
                        private /* synthetic */ 2 a;

                        public final /* synthetic */ Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            akcr.b(optional, "it");
                            Object obj2 = list;
                            akcr.a(obj2, "geoUnlockables");
                            Location location = (Location) optional.orNull();
                            Collection arrayList = new ArrayList();
                            for (Object next : (Iterable) obj2) {
                                if (zrc.a((zsm) next, location)) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    });
                }
            }

            1(aa aaVar) {
                this.a = aaVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajdp ajdp = (ajdp) obj;
                akcr.b(ajdp, UnlockablesModel.DATA);
                return ((this.a.c instanceof zss.a) || (this.a.c instanceof zss.b)) ? ajdp.u(new 1(this)) : this.a.c.b() == UnlockMechanism.LOCATION ? zrc.a(ajdp, ajzs.a(UnlockMechanism.LOCATION)).u(new 2(this)) : zrc.a(ajdp, ajzu.a(UnlockMechanism.Companion.any(), (Object) UnlockMechanism.LOCATION));
            }
        }

        /* renamed from: zrc$aa$2 */
        static final class 2<T> implements ajfb<List<? extends zsm>> {
            private /* synthetic */ aa a;

            2(aa aaVar) {
                this.a = aaVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (this.a.e.compareAndSet(false, true)) {
                    zsg zsg = this.a.a.k;
                    idd idd = this.a.d;
                    long c = this.a.a.g().c() - this.a.b.a;
                    String str = "callsite";
                    akcr.b(idd, str);
                    zsg.a().a(ipg.DATABASE_QUERY_LATENCY.a(str, idd.toString()), c);
                    zsg = this.a.a.k;
                    idd = this.a.d;
                    akcr.b(idd, str);
                    zsg.a().c(ipg.DATABASE_QUERY.a(str, idd.toString()), 1);
                }
            }
        }

        aa(zrc zrc, akdd.d dVar, zss zss, idd idd, AtomicBoolean atomicBoolean) {
            this.a = zrc;
            this.b = dVar;
            this.c = zss;
            this.d = idd;
            this.e = atomicBoolean;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            this.b.a = this.a.g().c();
            zrc zrc = this.a;
            zss zss = this.c;
            idd idd = this.d;
            obj = zrc.f().b((ajdw) zrc.e().i()).d((ajfc) new g(zss)).a((ajdw) zrc.e().b()).u(new h(zrc));
            akcr.a(obj, "repository\n             …vable()\n                }");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(idd);
            stringBuilder.append(" dbWithCache");
            String stringBuilder2 = stringBuilder.toString();
            String str = "UnlockablesCore";
            obj = obj.e((ajfb) new e(str, stringBuilder2)).b((ajev) new f(str, stringBuilder2)).d((ajfb) new g(str, stringBuilder2, false)).c((ajev) new h(str, stringBuilder2));
            akcr.a(obj, "doOnSubscribe { if (fals…servable on complete\")  }");
            return obj.s(new 1(this)).d((ajfb) new 2(this));
        }
    }

    /* renamed from: zrc$s */
    static final class s<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            return dVar.a();
        }
    }

    /* renamed from: zrc$t */
    static final class t<T1, T2, R> implements ajex<Optional<Location>, Map<Long, ? extends byte[]>, zst.a> {
        private /* synthetic */ zrc a;
        private /* synthetic */ idd b;

        t(zrc zrc, idd idd) {
            this.a = zrc;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Optional optional = (Optional) obj;
            Map map = (Map) obj2;
            akcr.b(optional, MapboxEvent.TYPE_LOCATION);
            akcr.b(map, "checksumMap");
            return new zst.a((Location) optional.orNull(), this.a.g().a(), map, this.b, (byte) 0);
        }
    }

    /* renamed from: zrc$u */
    static final class u<T> implements ajfb<zst.a> {
        private /* synthetic */ zrc a;

        u(zrc zrc) {
            this.a = zrc;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.e.a((zst.a) obj);
        }
    }

    /* renamed from: zrc$z */
    static final class z<T> implements ajfb<List<? extends zsm>> {
        private /* synthetic */ idd a;
        private /* synthetic */ zss b;

        z(idd idd, zss zss) {
            this.a = idd;
            this.b = zss;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zrc$g */
    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ zss a;

        g(zss zss) {
            this.a = zss;
        }

        private ajdp<List<zso>> a(d dVar) {
            akcr.b(dVar, "it");
            return dVar.a(this.a);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((d) obj);
        }
    }

    /* renamed from: zrc$h */
    static final class h<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ zrc a;

        h(zrc zrc) {
            this.a = zrc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "databaseModelList");
            return this.a.h.f(new ajfc<T, R>(this) {
                private /* synthetic */ h a;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0140 in {7, 10, 11, 18, 19, 22, 23, 24, 26, 28, 30} preds:[]
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                    */
                private java.util.List<defpackage.zsm> a(defpackage.iha r23) {
                    /*
                    r22 = this;
                    r1 = r22;
                    r0 = r23;
                    r2 = "json";
                    r3 = "protobuf";
                    r4 = "serializationHelper";
                    defpackage.akcr.b(r0, r4);
                    r5 = r3;	 Catch:{ all -> 0x013e }
                    r6 = "databaseModelList";	 Catch:{ all -> 0x013e }
                    defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x013e }
                    r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x013e }
                    r6 = new java.util.ArrayList;	 Catch:{ all -> 0x013e }
                    r6.<init>();	 Catch:{ all -> 0x013e }
                    r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x013e }
                    r5 = r5.iterator();	 Catch:{ all -> 0x013e }
                    r7 = r5.hasNext();	 Catch:{ all -> 0x013e }
                    if (r7 == 0) goto L_0x013b;	 Catch:{ all -> 0x013e }
                    r7 = r5.next();	 Catch:{ all -> 0x013e }
                    r7 = (defpackage.zso) r7;	 Catch:{ all -> 0x013e }
                    r8 = r1.a;	 Catch:{ all -> 0x013e }
                    r8 = r8.a;	 Catch:{ all -> 0x013e }
                    r9 = r7.f;	 Catch:{ all -> 0x013e }
                    r9 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x013e }
                    if (r9 != 0) goto L_0x003a;	 Catch:{ all -> 0x013e }
                    goto L_0x0047;	 Catch:{ all -> 0x013e }
                    r9 = r9.longValue();	 Catch:{ all -> 0x013e }
                    r11 = 1;	 Catch:{ all -> 0x013e }
                    r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ all -> 0x013e }
                    if (r13 != 0) goto L_0x0047;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.zsn.PROTO_VERSION;	 Catch:{ all -> 0x013e }
                    goto L_0x0049;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.zsn.JSON_VERSION;	 Catch:{ all -> 0x013e }
                    r10 = defpackage.zrd.a;	 Catch:{ all -> 0x013e }
                    r9 = r9.ordinal();	 Catch:{ all -> 0x013e }
                    r9 = r10[r9];	 Catch:{ all -> 0x013e }
                    r10 = 1;
                    r11 = 0;
                    r12 = "graphene";
                    r13 = "receiver$0";
                    r14 = "parse_type";
                    if (r9 == r10) goto L_0x00c6;
                    r9 = r8.i;	 Catch:{ all -> 0x013e }
                    defpackage.akcr.b(r7, r13);	 Catch:{ all -> 0x013e }
                    defpackage.akcr.b(r9, r12);	 Catch:{ all -> 0x013e }
                    defpackage.akcr.b(r0, r4);	 Catch:{ all -> 0x013e }
                    r10 = defpackage.ipg.DATABASE_MODEL_DESERIALIZATION;	 Catch:{ all -> 0x013e }
                    r10 = r10.a(r14, r2);	 Catch:{ all -> 0x013e }
                    r12 = "UnlockableDbModel:deserializeSojuGeofilterResponse";	 Catch:{ all -> 0x013e }
                    r13 = new zrl$b;	 Catch:{ all -> 0x013e }
                    r13.<init>(r7, r0);	 Catch:{ all -> 0x013e }
                    r13 = (defpackage.akbk) r13;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.imn.a(r9, r10, r12, r13);	 Catch:{ all -> 0x013e }
                    r10 = "graphene.addTimerWithTra…rResponse::class.java)) }";	 Catch:{ all -> 0x013e }
                    defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x013e }
                    r9 = (com.google.common.base.Optional) r9;	 Catch:{ all -> 0x013e }
                    r10 = r9.isPresent();	 Catch:{ all -> 0x013e }
                    if (r10 == 0) goto L_0x00a9;	 Catch:{ all -> 0x013e }
                    r8 = new zsm;	 Catch:{ all -> 0x013e }
                    r10 = r7.b;	 Catch:{ all -> 0x013e }
                    r11 = r7.c;	 Catch:{ all -> 0x013e }
                    r12 = r7.d;	 Catch:{ all -> 0x013e }
                    r7 = r9.get();	 Catch:{ all -> 0x013e }
                    r9 = "it.get()";	 Catch:{ all -> 0x013e }
                    defpackage.akcr.a(r7, r9);	 Catch:{ all -> 0x013e }
                    r20 = r7;	 Catch:{ all -> 0x013e }
                    r20 = (defpackage.aenr) r20;	 Catch:{ all -> 0x013e }
                    r21 = 0;	 Catch:{ all -> 0x013e }
                    r15 = r8;	 Catch:{ all -> 0x013e }
                    r16 = r10;	 Catch:{ all -> 0x013e }
                    r17 = r11;	 Catch:{ all -> 0x013e }
                    r18 = r12;	 Catch:{ all -> 0x013e }
                    r15.<init>(r16, r17, r18, r20, r21);	 Catch:{ all -> 0x013e }
                    goto L_0x0134;	 Catch:{ all -> 0x013e }
                    r7 = r8.i;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.ipg.DB_DESERIALIZATION_FAILED;	 Catch:{ all -> 0x013e }
                    r9 = r9.a(r14, r2);	 Catch:{ all -> 0x013e }
                    r7.c(r9, 1);	 Catch:{ all -> 0x013e }
                    r7 = r8.j;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x013e }
                    r10 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x013e }
                    r12 = "Deserialized soju geofilter response is invalid";	 Catch:{ all -> 0x013e }
                    r10.<init>(r12);	 Catch:{ all -> 0x013e }
                    r10 = (java.lang.Throwable) r10;	 Catch:{ all -> 0x013e }
                    r8 = r8.c();	 Catch:{ all -> 0x013e }
                    goto L_0x0130;	 Catch:{ all -> 0x013e }
                    r9 = r8.i;	 Catch:{ all -> 0x013e }
                    defpackage.akcr.b(r7, r13);	 Catch:{ all -> 0x013e }
                    defpackage.akcr.b(r9, r12);	 Catch:{ all -> 0x013e }
                    r10 = defpackage.ipg.DATABASE_MODEL_DESERIALIZATION;	 Catch:{ all -> 0x013e }
                    r10 = r10.a(r14, r3);	 Catch:{ all -> 0x013e }
                    r12 = "UnlockableDbModel:deserializeProtoGeofilterResponse";	 Catch:{ all -> 0x013e }
                    r13 = new zrl$a;	 Catch:{ all -> 0x013e }
                    r13.<init>(r7);	 Catch:{ all -> 0x013e }
                    r13 = (defpackage.akbk) r13;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.imn.a(r9, r10, r12, r13);	 Catch:{ all -> 0x013e }
                    r10 = "graphene.addTimerWithTra….absent()\n        }\n    }";	 Catch:{ all -> 0x013e }
                    defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x013e }
                    r9 = (com.google.common.base.Optional) r9;	 Catch:{ all -> 0x013e }
                    r10 = r9.isPresent();	 Catch:{ all -> 0x013e }
                    if (r10 == 0) goto L_0x0114;	 Catch:{ all -> 0x013e }
                    r8 = new zsm;	 Catch:{ all -> 0x013e }
                    r10 = r7.b;	 Catch:{ all -> 0x013e }
                    r11 = r7.c;	 Catch:{ all -> 0x013e }
                    r12 = r7.d;	 Catch:{ all -> 0x013e }
                    r7 = r9.get();	 Catch:{ all -> 0x013e }
                    r7 = (defpackage.adzo) r7;	 Catch:{ all -> 0x013e }
                    r7 = defpackage.aent.a(r7);	 Catch:{ all -> 0x013e }
                    r9 = "GeofilterResponseProtoCo…erter.fromProto(it.get())";	 Catch:{ all -> 0x013e }
                    defpackage.akcr.a(r7, r9);	 Catch:{ all -> 0x013e }
                    r21 = 0;	 Catch:{ all -> 0x013e }
                    r15 = r8;	 Catch:{ all -> 0x013e }
                    r16 = r10;	 Catch:{ all -> 0x013e }
                    r17 = r11;	 Catch:{ all -> 0x013e }
                    r18 = r12;	 Catch:{ all -> 0x013e }
                    r20 = r7;	 Catch:{ all -> 0x013e }
                    r15.<init>(r16, r17, r18, r20, r21);	 Catch:{ all -> 0x013e }
                    goto L_0x0134;	 Catch:{ all -> 0x013e }
                    r7 = r8.i;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.ipg.DB_DESERIALIZATION_FAILED;	 Catch:{ all -> 0x013e }
                    r9 = r9.a(r14, r3);	 Catch:{ all -> 0x013e }
                    r7.c(r9, 1);	 Catch:{ all -> 0x013e }
                    r7 = r8.j;	 Catch:{ all -> 0x013e }
                    r9 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x013e }
                    r10 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x013e }
                    r12 = "Deserialized proto geofilter response is invalid";	 Catch:{ all -> 0x013e }
                    r10.<init>(r12);	 Catch:{ all -> 0x013e }
                    r10 = (java.lang.Throwable) r10;	 Catch:{ all -> 0x013e }
                    r8 = r8.c();	 Catch:{ all -> 0x013e }
                    r7.a(r9, r10, r8);	 Catch:{ all -> 0x013e }
                    r8 = r11;	 Catch:{ all -> 0x013e }
                    if (r8 == 0) goto L_0x0021;	 Catch:{ all -> 0x013e }
                    r6.add(r8);	 Catch:{ all -> 0x013e }
                    goto L_0x0021;	 Catch:{ all -> 0x013e }
                    r6 = (java.util.List) r6;	 Catch:{ all -> 0x013e }
                    return r6;
                    r0 = move-exception;
                    throw r0;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zrc$h$1.a(iha):java.util.List");
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return a((iha) obj);
                }
            }).i();
        }
    }

    /* renamed from: zrc$i */
    static final class i<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ zst.a a;

        i(zst.a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return bVar.a(this.a.a, this.a.d, this.a.c);
        }
    }

    /* renamed from: zrc$j */
    static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ zrc a;
        private /* synthetic */ zst.a b;

        j(zrc zrc, zst.a aVar) {
            this.a = zrc;
            this.b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0108  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r23) {
            /*
            r22 = this;
            r0 = r22;
            r1 = r23;
            r1 = (defpackage.aebf) r1;
            r2 = "it";
            defpackage.akcr.b(r1, r2);
            r2 = new ajwj;
            r3 = r0.a;
            r3 = r3.g();
            r3 = r3.a();
            r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
            r2.<init>(r1, r3, r5);
            r1 = r0.b;
            r8 = r1.a;
            r1 = r0.b;
            r4 = r1.b;
            r1 = "gtqServeResponse";
            defpackage.akcr.b(r2, r1);
            r6 = r2.b;
            r1 = r2.a;
            r2 = "gtqServeResponse.value()";
            defpackage.akcr.a(r1, r2);
            r1 = (defpackage.aebf) r1;
            r2 = r1.a;
            r3 = r2.d;
            r9 = 0;
            if (r3 != 0) goto L_0x003d;
        L_0x003b:
            r3 = new defpackage.adzo[r9];
        L_0x003d:
            r10 = new java.util.ArrayList;
            r11 = r3.length;
            r10.<init>(r11);
            r10 = (java.util.Collection) r10;
            r11 = r3.length;
            r12 = 0;
        L_0x0047:
            if (r12 >= r11) goto L_0x0053;
        L_0x0049:
            r13 = r3[r12];
            r13 = r13.a;
            r10.add(r13);
            r12 = r12 + 1;
            goto L_0x0047;
        L_0x0053:
            r10 = (java.util.List) r10;
            r10 = (java.lang.Iterable) r10;
            r3 = defpackage.ajyu.m(r10);
            r10 = r2.e;
            if (r10 != 0) goto L_0x0061;
        L_0x005f:
            r10 = new defpackage.adzo[r9];
        L_0x0061:
            r11 = new java.util.ArrayList;
            r11.<init>();
            r11 = (java.util.Collection) r11;
            r12 = r10.length;
        L_0x0069:
            if (r9 >= r12) goto L_0x007d;
        L_0x006b:
            r13 = r10[r9];
            r14 = r13.a;
            r14 = r3.contains(r14);
            r14 = r14 ^ 1;
            if (r14 == 0) goto L_0x007a;
        L_0x0077:
            r11.add(r13);
        L_0x007a:
            r9 = r9 + 1;
            goto L_0x0069;
        L_0x007d:
            r15 = r11;
            r15 = (java.util.List) r15;
            r9 = r2.h;
            r3 = r2.b;
            r10 = "unlockables.invalidFilterIds";
            defpackage.akcr.a(r3, r10);
            r10 = defpackage.ajyi.i(r3);
            r3 = r2.g;
            r11 = "unlockables.purposes";
            defpackage.akcr.a(r3, r11);
            r3 = defpackage.ajyi.i(r3);
            r3 = (java.lang.Iterable) r3;
            r11 = new java.util.ArrayList;
            r12 = 10;
            r12 = defpackage.ajyn.a(r3, r12);
            r11.<init>(r12);
            r11 = (java.util.Collection) r11;
            r3 = r3.iterator();
        L_0x00ab:
            r12 = r3.hasNext();
            if (r12 == 0) goto L_0x00bf;
        L_0x00b1:
            r12 = r3.next();
            r12 = (defpackage.adzy) r12;
            r12 = defpackage.aerl.a(r12);
            r11.add(r12);
            goto L_0x00ab;
        L_0x00bf:
            r11 = (java.util.List) r11;
            r3 = r2.a;
            r12 = "unlockables.filters";
            defpackage.akcr.a(r3, r12);
            r12 = defpackage.ajyi.i(r3);
            r3 = r2.c;
            r13 = "unlockables.bitmojiFilters";
            defpackage.akcr.a(r3, r13);
            r13 = defpackage.ajyi.i(r3);
            r3 = r2.d;
            r14 = "unlockables.lenses";
            defpackage.akcr.a(r3, r14);
            r14 = defpackage.ajyi.i(r3);
            r3 = r2.f;
            r0 = "unlockables.stickers";
            defpackage.akcr.a(r3, r0);
            r16 = defpackage.ajyi.i(r3);
            r0 = r2.j;
            r3 = "unlockables.previewCaptionStyles";
            defpackage.akcr.a(r0, r3);
            r17 = defpackage.ajyi.i(r0);
            r0 = r1.b;
            if (r0 == 0) goto L_0x0105;
        L_0x00fc:
            r0 = r0.a;
            if (r0 == 0) goto L_0x0105;
        L_0x0100:
            r0 = defpackage.ajyi.i(r0);
            goto L_0x0106;
        L_0x0105:
            r0 = 0;
        L_0x0106:
            if (r0 != 0) goto L_0x010c;
        L_0x0108:
            r0 = defpackage.ajyw.a;
            r0 = (java.util.List) r0;
        L_0x010c:
            r18 = r0;
            r0 = r2.k;
            r1 = "unlockables.checksumResponseList";
            defpackage.akcr.a(r0, r1);
            r19 = defpackage.ajyi.i(r0);
            r0 = new zsu;
            r3 = r0;
            r20 = 0;
            r21 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zrc$j.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: zrc$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ void accept(Object obj) {
            abmt.b((Throwable) obj);
        }
    }

    /* renamed from: zrc$l */
    static final class l<T, R> implements ajfc<Throwable, zsu> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            Throwable th2 = th;
            String str = "throwable";
            akcr.b(th, str);
            akcr.b(th, str);
            return new zsu(0, 0, null, null, null, null, null, null, null, null, null, null, null, null, th2, 16383);
        }
    }

    /* renamed from: zrc$m */
    static final class m<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ PersistableUnlockableType a;
        private /* synthetic */ idd b;

        m(PersistableUnlockableType persistableUnlockableType, idd idd) {
            this.a = persistableUnlockableType;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return bVar.a(this.a, this.b);
        }
    }

    /* renamed from: zrc$n */
    static final class n<T, R> implements ajfc<T, R> {
        private /* synthetic */ PersistableUnlockableType a;

        n(PersistableUnlockableType persistableUnlockableType) {
            this.a = persistableUnlockableType;
        }

        public final /* synthetic */ Object apply(Object obj) {
            zsk.a aVar = (zsk.a) obj;
            akcr.b(aVar, "it");
            if (this.a != PersistableUnlockableType.FILTER) {
                return aVar;
            }
            List list = aVar.a;
            Collection arrayList = new ArrayList();
            for (Object next : aVar.b) {
                if (akcr.a(((aenr) next).H, 0.0d)) {
                    arrayList.add(next);
                }
            }
            return new zsk.a(list, (List) arrayList, aVar.c, aVar.d, aVar.e);
        }
    }

    /* renamed from: zrc$o */
    static final class o<T, R> implements ajfc<zsk.a, ajdb> {
        private /* synthetic */ zrc a;

        o(zrc zrc) {
            this.a = zrc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            zsk.a aVar = (zsk.a) obj;
            akcr.b(aVar, "it");
            return this.a.d().a(aVar);
        }
    }

    /* renamed from: zrc$p */
    static final class p<T> implements ajfb<Throwable> {
        private /* synthetic */ PersistableUnlockableType a;

        p(PersistableUnlockableType persistableUnlockableType) {
            this.a = persistableUnlockableType;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zrc$ae */
    static final class ae<T, R> implements ajfc<T, R> {
        private /* synthetic */ Set a;

        ae(Set set) {
            this.a = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "unlockables");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (this.a.contains(((zsm) next).a)) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: zrc$ac */
    static final class ac implements ajev {
        private /* synthetic */ zrc a;
        private /* synthetic */ zsu b;

        ac(zrc zrc, zsu zsu) {
            this.a = zrc;
            this.b = zsu;
        }

        public final void run() {
            this.a.a = this.b.a;
        }
    }

    /* renamed from: zrc$ai */
    static final class ai<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ zrc a;
        final /* synthetic */ zst.b b;
        final /* synthetic */ idd c;

        /* renamed from: zrc$ai$1 */
        static final class 1<T, R> implements ajfc<T, ajdn<? extends R>> {
            private /* synthetic */ ai a;

            1(ai aiVar) {
                this.a = aiVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:8:0x0056  */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r12) {
                /*
                r11 = this;
                r12 = (defpackage.zsk.b) r12;
                r0 = "response";
                defpackage.akcr.b(r12, r0);
                r0 = r11.a;
                r0 = r0.b;
                r0 = r0 instanceof defpackage.zst.b.b;
                r1 = "Completable.complete()";
                if (r0 == 0) goto L_0x0043;
            L_0x0011:
                r0 = r11.a;
                r0 = r0.b;
                r0 = (defpackage.zst.b.b) r0;
                r0 = r0.a;
                if (r0 == 0) goto L_0x0043;
            L_0x001b:
                r1 = r11.a;
                r1 = r1.a;
                r1 = r1.d();
                r10 = new zsk$a;
                r3 = 0;
                r4 = defpackage.ajyl.a(r0);
                r5 = 0;
                r6 = 0;
                r0 = r11.a;
                r0 = r0.a;
                r0 = r0.g();
                r7 = r0.a();
                r9 = 13;
                r2 = r10;
                r2.<init>(r3, r4, r5, r6, r7, r9);
                r0 = r1.a(r10);
                goto L_0x004c;
            L_0x0043:
                r0 = defpackage.ajhn.a;
                r0 = defpackage.ajvo.a(r0);
                defpackage.akcr.a(r0, r1);
            L_0x004c:
                r1 = r11.a;
                r1 = r1.b;
                r1 = r1.b();
                if (r1 == 0) goto L_0x0087;
            L_0x0056:
                r1 = r11.a;
                r1 = r1.a;
                r2 = r11.a;
                r2 = r2.b;
                r3 = r2 instanceof defpackage.zst.b.c;
                if (r3 == 0) goto L_0x0065;
            L_0x0062:
                r2 = com.snap.core.db.column.PersistableUnlockableType.STICKER_PACK;
                goto L_0x0072;
            L_0x0065:
                r3 = r2 instanceof defpackage.zst.b.b;
                if (r3 == 0) goto L_0x006c;
            L_0x0069:
                r2 = com.snap.core.db.column.PersistableUnlockableType.LENS;
                goto L_0x0072;
            L_0x006c:
                r2 = r2 instanceof defpackage.zst.b.a;
                if (r2 == 0) goto L_0x0081;
            L_0x0070:
                r2 = com.snap.core.db.column.PersistableUnlockableType.FILTER;
            L_0x0072:
                r3 = r11.a;
                r3 = r3.c;
                r1 = r1.b(r2, r3);
                r1 = (defpackage.ajdb) r1;
                r0 = r0.b(r1);
                goto L_0x0087;
            L_0x0081:
                r12 = new ajxk;
                r12.<init>();
                throw r12;
            L_0x0087:
                r1 = r11.a;
                r1 = r1.a;
                r2 = new zsv$a$a;
                r3 = r11.a;
                r3 = r3.b;
                r3 = r3.a();
                r4 = 0;
                r2.<init>(r3, r4);
                r2 = (defpackage.zsv.a) r2;
                r1 = r1.a(r2);
                r1 = (defpackage.ajdb) r1;
                r0 = r0.b(r1);
                r1 = new zrc$ai$1$1;
                r1.<init>(r12);
                r1 = (java.util.concurrent.Callable) r1;
                r12 = r0.c(r1);
                r12 = r12.h();
                return r12;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zrc$ai$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        ai(zrc zrc, zst.b bVar, idd idd) {
            this.a = zrc;
            this.b = bVar;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "netClient");
            return bVar.a(this.b, this.c).a((ajfc) new 1(this));
        }
    }

    /* renamed from: zrc$aj */
    static final class aj<T, R> implements ajfc<d, ajdb> {
        private /* synthetic */ zsv.a a;

        aj(zsv.a aVar) {
            this.a = aVar;
        }

        private ajcx a(d dVar) {
            akcr.b(dVar, "it");
            return dVar.a(this.a);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((d) obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zrc.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(zrc.class), "processor", "getProcessor()Lcom/snap/unlockables/api/UnlockablesContract$Processor;"), new akdc(akde.a(zrc.class), "schedules", "getSchedules()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(zrc.class), "repository", "getRepository()Lio/reactivex/Single;"), new akdc(akde.a(zrc.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(zrc.class), "config", "getConfig()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(zrc.class), "syncCandidateLocation", "getSyncCandidateLocation()Lio/reactivex/Observable;"), new akdc(akde.a(zrc.class), "latestLocation", "getLatestLocation()Lio/reactivex/Observable;"), new akdc(akde.a(zrc.class), "geoUpdatePeriodMs", "getGeoUpdatePeriodMs()Lio/reactivex/Observable;"), new akdc(akde.a(zrc.class), "geoTrigger", "getGeoTrigger()Lio/reactivex/Observable;"), new akdc(akde.a(zrc.class), "timeTrigger", "getTimeTrigger()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public zrc(ajdx<b> ajdx, ajwy<ihh> ajwy, ajdx<zrs> ajdx2, zgb zgb, ajwy<c> ajwy2, ajwy<ftl> ajwy3, ajdx<d> ajdx3, ajdx<iha> ajdx4, ilv ilv, gqr gqr, zsg zsg) {
        akcr.b(ajdx, "netClient");
        akcr.b(ajwy, "clockProvider");
        akcr.b(ajdx2, "locProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "processorProvider");
        akcr.b(ajwy3, "compositeConfigurationProvider");
        akcr.b(ajdx3, "unlockablesRepository");
        akcr.b(ajdx4, "serializationHelperSingle");
        akcr.b(ilv, "graphene");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(zsg, "unlockablesGrapheneLogger");
        this.g = ajdx;
        this.h = ajdx4;
        this.i = ilv;
        this.j = gqr;
        this.k = zsg;
        this.m = ajxh.a(new y(ajwy2));
        this.n = ajxh.a(new ad(this, zgb));
        this.o = ajxh.a(new ab(this, ajdx3));
        this.p = ajxh.a(new e(ajwy));
        this.q = ajxh.a(new f(ajwy3));
        this.a = g().a();
        this.r = ajxh.a(new af(this, ajdx2));
        this.s = ajxh.a(new v(this, ajdx2));
        this.b = ajxh.a(new r(this));
        this.c = ajxh.a(new q(this));
        this.d = ajxh.a(new ag(this));
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Un…kablesRequest.FullSync>()");
        this.e = ajwo;
    }

    static boolean a(zsm zsm, Location location) {
        if (zsm.b.g == null) {
            return true;
        }
        if (location != null) {
            Geofence geofence = zsm.b.g;
            if (geofence != null) {
                return new nbq(geofence).a(location);
            }
        }
        return false;
    }

    private final ajdp<Boolean> i() {
        Object a = h().p(zpt.UNLOCKABLES_GATING_ENABLED).b((ajdw) e().f()).a((ajfl) d.a);
        akcr.a(a, "config\n                .…           .filter { it }");
        return a;
    }

    public final ajcx a(PersistableUnlockableType persistableUnlockableType, idd idd) {
        akcr.b(persistableUnlockableType, "type");
        akcr.b(idd, "callsite");
        return b(persistableUnlockableType, idd);
    }

    public final ajcx a(zsv.a aVar) {
        akcr.b(aVar, "query");
        Object e = f().e((ajfc) new aj(aVar));
        akcr.a(e, "repository\n             …      }\n                }");
        return e;
    }

    public final ajdj<zsk.b> a(zst.b bVar, idd idd) {
        akcr.b(bVar, "unlockRequest");
        akcr.b(idd, "callsite");
        Object b = this.g.b((ajdw) e().g()).b((ajfc) new ai(this, bVar, idd));
        akcr.a(b, "netClient\n            .s…          }\n            }");
        return b;
    }

    public final ajdp<List<zsm>> a(zss zss, idd idd) {
        akcr.b(zss, "query");
        akcr.b(idd, "callsite");
        Object k = i().k((ajfc) new aa(this, new akdd.d(), zss, idd, new AtomicBoolean(false)));
        if (zss instanceof zss.h) {
            long h = h().h(zpt.UNLOCK_LENS_EXPIRATION_TIMESTAMP_MILLIS);
            Object obj = (h < 0 || h > g().a()) ? 1 : null;
            if (!(obj == null || (zss instanceof zss.h.a))) {
                if (zss instanceof zss.h.c) {
                    k = k.a((ajdb) b(zss.a(), idd));
                } else if (zss instanceof zss.h.b) {
                    k = b(zss.a(), idd).a((ajdt) k);
                } else {
                    throw new ajxk();
                }
            }
        }
        akcr.a(k, "if (query is Unlockables…         result\n        }");
        ajdp a = igs.a(k);
        String str = "UnlockablesCore";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(idd);
        stringBuilder.append(" queryFor ");
        stringBuilder.append(zss.a);
        stringBuilder.append(" EligibleUnlockables");
        String stringBuilder2 = stringBuilder.toString();
        Object c = a.e((ajfb) new e(str, stringBuilder2)).b((ajev) new f(str, stringBuilder2)).d((ajfb) new g(str, stringBuilder2, false)).c((ajev) new h(str, stringBuilder2));
        akcr.a(c, "doOnSubscribe { if (fals…servable on complete\")  }");
        Object d = c.d((ajfb) new z(idd, zss));
        akcr.a(d, "if (query is Unlockables…sults\")\n                }");
        return d;
    }

    public final ajej a(idd idd) {
        akcr.b(idd, "callsite");
        Object l = i().k((ajfc) new b(this, idd)).l();
        akcr.a(l, "checkUnlockablesEnabled(…             .subscribe()");
        return l;
    }

    public final void a() {
        e().b().a((Runnable) new x(this));
    }

    /* Access modifiers changed, original: final */
    public final ajcx b(PersistableUnlockableType persistableUnlockableType, idd idd) {
        Object a = this.g.b((ajdw) e().g()).b((ajfc) new m(persistableUnlockableType, idd)).f(new n(persistableUnlockableType)).e(new o(this)).a((ajfb) new p(persistableUnlockableType));
        akcr.a(a, "netClient\n              …(it)}\")\n                }");
        return a;
    }

    public final void b() {
        e().j().a((Runnable) new w(this));
    }

    /* Access modifiers changed, original: final */
    public final idd c() {
        return (idd) this.l.b();
    }

    /* Access modifiers changed, original: final */
    public final c d() {
        return (c) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw e() {
        return (zfw) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final ajdx<d> f() {
        return (ajdx) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final ihh g() {
        return (ihh) this.p.b();
    }

    /* Access modifiers changed, original: final */
    public final ftl h() {
        return (ftl) this.q.b();
    }
}
