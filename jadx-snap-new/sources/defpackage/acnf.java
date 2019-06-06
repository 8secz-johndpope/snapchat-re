package defpackage;

import com.google.common.base.Optional;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.acmy.b;
import defpackage.acnc.d;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: acnf */
public final class acnf {
    final zfw a = zgb.a(adcw.b.callsite("EggHuntReactiveModel"));
    final ajdp<Optional<addl>> b = d();
    public final ajdp<Integer> c;
    public final ajdp<Boolean> d;
    final acnh e;
    final acmz f;
    final ajwy<acmy> g;
    final ajwy<acnc> h;
    private final ajxe i = ajxh.a(f.a);
    private final ajxe j = ajxh.a(h.a);
    private final ajxe k = ajxh.a(new g(this));
    private final ajxe l = ajxh.a(new d(this));

    /* renamed from: acnf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acnf$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ acnf a;
        private /* synthetic */ addl b;

        b(acnf acnf, addl addl) {
            this.a = acnf;
            this.b = addl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "eggSet");
            if (!set.contains(this.b)) {
                this.a.a().a(this.b);
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: acnf$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ acnf a;
        final /* synthetic */ Set b;

        c(acnf acnf, Set set) {
            this.a = acnf;
            this.b = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final addl addl = (addl) obj;
            akcr.b(addl, "acquiredEgg");
            if (!this.b.add(addl)) {
                return ajvo.a(ajsn.a);
            }
            acmy acmy = (acmy) this.a.g.get();
            String str = addl.a;
            akcr.b(str, "markerId");
            igk.a(acmy.a().e().e((ajfb) new b(acmy, str)), acmy.a);
            return this.a.f.a(addl).b((ajdw) this.a.a.g()).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object apply(Object obj) {
                    acmz.b bVar = (acmz.b) obj;
                    akcr.b(bVar, "result");
                    if (bVar == acmz.b.NETWORK_FAILURE) {
                        acnh acnh = this.a.a.e;
                        Object obj2 = addl;
                        akcr.a(obj2, "acquiredEgg");
                        String str = "egg";
                        akcr.b(obj2, str);
                        acnc a = acnh.a();
                        akcr.b(obj2, str);
                        obj = a.a.e((ajfc) new d(obj2));
                        akcr.a(obj, "clientAndDatabase.flatMa…)\n            }\n        }");
                        return obj.b((ajeb) ajdx.b(this.a.b));
                    }
                    if (bVar == acmz.b.DENIED) {
                        this.a.b.remove(addl);
                    }
                    return ajdx.b(this.a.b);
                }
            });
        }
    }

    /* renamed from: acnf$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ alhu[] a;

        e(alhu[] alhuArr) {
            this.a = alhuArr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "failedAcquisitions");
            alhu[] alhuArr = this.a;
            Collection linkedHashSet = new LinkedHashSet();
            for (alhu alhu : alhuArr) {
                Object b = alhu.b();
                akcr.a(b, "it.id");
                linkedHashSet.add(new addl(b, alhu.d(), alhu.c()));
            }
            Set set = (Set) linkedHashSet;
            set.addAll(list);
            return Collections.synchronizedSet(set);
        }
    }

    /* renamed from: acnf$i */
    static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Set<addl> set = (Set) obj;
            akcr.b(set, "eggSet");
            int i = 0;
            for (addl addl : set) {
                i += addl.c;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: acnf$d */
    static final class d extends akcs implements akbk<ajdp<Set<? extends addl>>> {
        final /* synthetic */ acnf a;

        /* renamed from: acnf$d$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            2(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (Set) obj;
                akcr.b(obj, "eggSet");
                acnf acnf = this.a.a;
                obj = acnf.a().n(new c(acnf, obj)).h(obj);
                akcr.a(obj, "eggAcquisitionSubject.fl…  }.startWith(initialSet)");
                return obj;
            }
        }

        /* renamed from: acnf$d$3 */
        static final class 3<T> implements ajfb<Set<? extends addl>> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        d(acnf acnf) {
            this.a = acnf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.e.d.b()).x(new acng(new akbl<alhu[], ajdx<Set<addl>>>(this.a) {
                public final String getName() {
                    return "combineServerArrayWithFailedAcquisitions";
                }

                public final akej getOwner() {
                    return akde.a(acnf.class);
                }

                public final String getSignature() {
                    return "combineServerArrayWithFailedAcquisitions([Lsnapchat/map/nano/GameMarker;)Lio/reactivex/Single;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    alhu[] alhuArr = (alhu[]) obj;
                    akcr.b(alhuArr, "p1");
                    obj = ((acnc) ((acnf) this.receiver).h.get()).a().d((Object) ajyw.a).f(new e(alhuArr));
                    akcr.a(obj, "failedAcquisitionReposit…      )\n                }");
                    return obj;
                }
            })).u(new 2(this)).d((ajfb) 3.a).i().g(ajfu.d);
        }
    }

    /* renamed from: acnf$f */
    static final class f extends akcs implements akbk<ajwo<addl>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: acnf$g */
    static final class g extends akcs implements akbk<ajdp<addm>> {
        final /* synthetic */ acnf a;

        /* renamed from: acnf$g$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Optional optional = (Optional) obj;
                akcr.b(optional, "stateOpt");
                obj = (alid) optional.orNull();
                if (obj == null) {
                    return ajdp.b(new addm(null, false, 4));
                }
                akcr.a(obj, "stateOpt.orNull() ?:\n   …ableLeaderboard = false))");
                int d = obj.d();
                return d > 0 ? ajdp.a((long) d, TimeUnit.MILLISECONDS, (ajdw) this.a.a.a.b()).p(new ajfc<T, R>(this) {
                    private /* synthetic */ 1 a;

                    public final /* synthetic */ Object apply(Object obj) {
                        akcr.b((Long) obj, "it");
                        return acnf.a(obj, false);
                    }
                }).h(acnf.a(obj, true)) : ajdp.b(acnf.a(obj, false));
            }
        }

        g(acnf acnf) {
            this.a = acnf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.e.c.b()).u(new 1(this)).j(ajfu.a).i().g(ajfu.d);
        }
    }

    /* renamed from: acnf$h */
    static final class h extends akcs implements akbk<ajwl<Optional<addl>>> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwl.i(Optional.absent());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acnf.class), "eggAcquisitionSubject", "getEggAcquisitionSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(acnf.class), "nearbyEggSubject", "getNearbyEggSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(acnf.class), "gameStatusObservable", "getGameStatusObservable()Lio/reactivex/Observable;"), new akdc(akde.a(acnf.class), "acquiredEggsSetObservable", "getAcquiredEggsSetObservable()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public acnf(acnh acnh, acmz acmz, ajwy<acmy> ajwy, zgb zgb, ftl ftl, ajwy<acnc> ajwy2) {
        akcr.b(acnh, "serverCache");
        akcr.b(acmz, "client");
        akcr.b(ajwy, LocalMessageActionModel.ANALYTICS);
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ftl, "config");
        akcr.b(ajwy2, "failedAcquisitionRepositoryProvider");
        this.e = acnh;
        this.f = acmz;
        this.g = ajwy;
        this.h = ajwy2;
        Object g = c().p(i.a).i().g(ajfu.d);
        akcr.a(g, "acquiredEggsSetObservabl…           .autoConnect()");
        this.c = g;
        this.d = ftl.p(adew.EGG_HUNT_IS_ONBOARDED);
    }

    public static final /* synthetic */ addm a(alid alid, boolean z) {
        boolean b = alid.b();
        Object a = alid.a();
        akcr.a(a, "gameId");
        return new addm(z, b, a, alid.c());
    }

    private final ajwl<Optional<addl>> d() {
        return (ajwl) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwo<addl> a() {
        return (ajwo) this.i.b();
    }

    public final void a(addl addl) {
        d().a(Optional.fromNullable(addl));
    }

    public final ajdp<addm> b() {
        return (ajdp) this.k.b();
    }

    public final ajdp<Set<addl>> c() {
        return (ajdp) this.l.b();
    }
}
