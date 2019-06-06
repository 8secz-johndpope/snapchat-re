package defpackage;

import android.net.NetworkInfo;
import com.google.common.base.Optional;
import defpackage.acmz.h;
import defpackage.acmz.i;
import defpackage.acmz.j;
import defpackage.acmz.k;
import defpackage.acnc.c;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: acnh */
public final class acnh {
    final zfw a = zgb.a(adcw.b.callsite("EggHuntServerCache"));
    final ajxe b = ajxh.a(new o(this));
    final ajxe c = ajxh.a(new e(this));
    final ajxe d = ajxh.a(new d(this));
    final ajxe e = ajxh.a(f.a);
    final ajxe f = ajxh.a(h.a);
    final acmz g;
    final ifa h;
    final ajwy<acnc> i;
    private final ajxe j = ajxh.a(new c(this));
    private final ajxe k = ajxh.a(g.a);

    /* renamed from: acnh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acnh$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ addl a;

        b(addl addl) {
            this.a = addl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.acmz.b bVar = (defpackage.acmz.b) obj;
            akcr.b(bVar, "result");
            return bVar == defpackage.acmz.b.NETWORK_FAILURE ? ajvo.a(ajsn.a) : ajdx.b(this.a);
        }
    }

    /* renamed from: acnh$i */
    public static final class i<T> implements ajfl<List<? extends addl>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: acnh$j */
    public static final class j<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "eggList");
            return ajdp.b((Iterable) list);
        }
    }

    /* renamed from: acnh$k */
    public static final class k<T, R> implements ajfc<T, K> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            addl addl = (addl) obj;
            akcr.b(addl, "egg");
            return addl.a;
        }
    }

    /* renamed from: acnh$l */
    public static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ acnh a;

        public l(acnh acnh) {
            this.a = acnh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final addl addl = (addl) obj;
            akcr.b(addl, "egg");
            return ((ajdp) this.a.b.b()).n(new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ l a;

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((ajxw) obj, "it");
                    acnh acnh = this.a.a;
                    addl addl = addl;
                    akcr.a((Object) addl, "egg");
                    obj = acnh.g.a(addl).b((ajdw) acnh.a.g()).a((ajfc) new b(addl));
                    akcr.a(obj, "client.rpcAcquireGameMar…      }\n                }");
                    return obj;
                }
            }).e();
        }
    }

    /* renamed from: acnh$m */
    public static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ acnh a;

        public m(acnh acnh) {
            this.a = acnh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final addl addl = (addl) obj;
            akcr.b(addl, "egg");
            acnc a = this.a.a();
            String str = addl.a;
            akcr.b(str, "eggId");
            Object e = a.a.e((ajfc) new c(str));
            akcr.a(e, "clientAndDatabase.flatMa…)\n            }\n        }");
            return e.b((ajeb) ajdx.b(ajxw.a)).c((ajfb) new ajfb<ajxw>() {
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
    }

    /* renamed from: acnh$n */
    public static final class n<T, R> implements ajfc<Throwable, ajxw> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "error");
            return ajxw.a;
        }
    }

    /* renamed from: acnh$c */
    static final class c extends akcs implements akbk<acnc> {
        private /* synthetic */ acnh a;

        c(acnh acnh) {
            this.a = acnh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (acnc) this.a.i.get();
        }
    }

    /* renamed from: acnh$d */
    static final class d extends akcs implements akbk<ajdp<alhu[]>> {
        final /* synthetic */ acnh a;

        /* renamed from: acnh$d$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajxw) obj, "it");
                acmz acmz = this.a.a.g;
                obj = acmz.b.a((ajfc) new j(acmz)).b((ajdw) acmz.a.g()).f(new acna(new k(acmz)));
                akcr.a(obj, "httpInterface\n          …entUserGameMarkersResult)");
                return obj;
            }
        }

        /* renamed from: acnh$d$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Optional optional = (Optional) obj;
                akcr.b(optional, "it");
                if (optional.isPresent()) {
                    return (alhu[]) optional.get();
                }
                throw new Throwable("Dummy exception to force retry");
            }
        }

        /* renamed from: acnh$d$3 */
        static final class 3<T, R> implements ajfc<ajdp<Throwable>, ajdt<?>> {
            private /* synthetic */ d a;

            3(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajdp) obj, "it");
                return (ajwo) this.a.a.f.b();
            }
        }

        d(acnh acnh) {
            this.a = acnh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp p = ((ajwl) this.a.e.b()).n(new 1(this)).p(2.a);
            Object 3 = new 3(this);
            ajfv.a(3, "handler is null");
            return ajvo.a(new ajqi(p, 3)).i().g(ajfu.d);
        }
    }

    /* renamed from: acnh$e */
    static final class e extends akcs implements akbk<ajdp<Optional<alid>>> {
        final /* synthetic */ acnh a;

        /* renamed from: acnh$e$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajxw) obj, "it");
                acmz acmz = this.a.a.g;
                obj = acmz.b.a((ajfc) new h(acmz)).b((ajdw) acmz.a.g()).f(new acna(new i(acmz)));
                akcr.a(obj, "httpInterface\n          …ckCurrentGameStateResult)");
                return obj.i();
            }
        }

        /* renamed from: acnh$e$2 */
        static final class 2<T> implements ajfb<Optional<alid>> {
            private /* synthetic */ e a;

            2(e eVar) {
                this.a = eVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        e(acnh acnh) {
            this.a = acnh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b().d(5, TimeUnit.MINUTES, this.a.a.b()).u(new 1(this)).d((ajfb) new 2(this)).i().g(ajfu.d);
        }
    }

    /* renamed from: acnh$f */
    static final class f extends akcs implements akbk<ajwl<ajxw>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwl.i(ajxw.a);
        }
    }

    /* renamed from: acnh$g */
    static final class g extends akcs implements akbk<ajwl<ajxw>> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwl.i(ajxw.a);
        }
    }

    /* renamed from: acnh$h */
    static final class h extends akcs implements akbk<ajwo<ajxw>> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: acnh$o */
    static final class o extends akcs implements akbk<ajdp<ajxw>> {
        private /* synthetic */ acnh a;

        /* renamed from: acnh$o$1 */
        static final class 1<T> implements ajfl<Optional<NetworkInfo>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Optional optional = (Optional) obj;
                akcr.b(optional, "it");
                if (optional.isPresent()) {
                    obj = optional.get();
                    akcr.a(obj, "it.get()");
                    if (((NetworkInfo) obj).isConnected()) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: acnh$o$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Optional) obj, "it");
                return ajxw.a;
            }
        }

        o(acnh acnh) {
            this.a = acnh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.h.e().a((ajfl) 1.a).p(2.a).i().g(ajfu.d);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acnh.class), "failedAcquisitionRepository", "getFailedAcquisitionRepository()Lcom/snapchat/map/egghunt/EggHuntFailedAcquisitionRepository;"), new akdc(akde.a(acnh.class), "watchNetworkStatusConnected", "getWatchNetworkStatusConnected()Lio/reactivex/Observable;"), new akdc(akde.a(acnh.class), "fetchGameStateObservable", "getFetchGameStateObservable()Lio/reactivex/Observable;"), new akdc(akde.a(acnh.class), "refreshGameStateSubject", "getRefreshGameStateSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(acnh.class), "fetchAcquiredMarkersObservable", "getFetchAcquiredMarkersObservable()Lio/reactivex/Observable;"), new akdc(akde.a(acnh.class), "refreshAcquiredGameMarkersSubject", "getRefreshAcquiredGameMarkersSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(acnh.class), "retryFetchAcquiredMarkersSubject", "getRetryFetchAcquiredMarkersSubject()Lio/reactivex/subjects/PublishSubject;")};
        a aVar = new a();
    }

    public acnh(acmz acmz, zgb zgb, ifa ifa, ajwy<acnc> ajwy) {
        akcr.b(acmz, "client");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ifa, "networkManager");
        akcr.b(ajwy, "failedAcquisitionRepositoryProvider");
        this.g = acmz;
        this.h = ifa;
        this.i = ajwy;
    }

    public final acnc a() {
        return (acnc) this.j.b();
    }

    public final ajwl<ajxw> b() {
        return (ajwl) this.k.b();
    }
}
