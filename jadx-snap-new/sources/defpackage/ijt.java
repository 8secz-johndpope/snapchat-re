package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.abzt.a;
import defpackage.ikn.c;
import defpackage.iko.d;
import defpackage.iko.e;
import defpackage.tpl.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: ijt */
public final class ijt extends tqi {
    final ajwl<Boolean> a;
    final ajwl<Boolean> b;
    final ajwl<Boolean> c;
    List<? extends abzy> d;
    tqm e;
    ajcx f;
    ajdp<Boolean> g;
    ajdp<zmy> h;
    b i;
    final ikn j;
    private final ajxe k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajei q = new ajei();
    private final ajxe r = ajxh.a(new g(this));
    private ajdp<aesf> s;
    private final ajxe t = ajxh.a(new i(this));
    private final ftl u;
    private final tvd v;

    /* renamed from: ijt$b */
    static final class b extends akcs implements akbk<ijx> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ijx) this.a.get();
        }
    }

    /* renamed from: ijt$f */
    static final class f extends akcs implements akbk<ijb> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ijb) this.a.get();
        }
    }

    /* renamed from: ijt$e */
    static final class e extends akcs implements akbk<ils> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ils) this.a.get();
        }
    }

    /* renamed from: ijt$d */
    static final class d extends akcs implements akbk<oeb> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (oeb) this.a.get();
        }
    }

    /* renamed from: ijt$c */
    static final class c extends akcs implements akbk<iko> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iko) this.a.get();
        }
    }

    /* renamed from: ijt$j */
    static final class j extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        j(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ijd.a.callsite("GeoFilterPageSection"));
        }
    }

    /* renamed from: ijt$g */
    static final class g extends akcs implements akbk<ajwl<ajdp<znh<zmy>>>> {
        private /* synthetic */ ijt a;

        g(ijt ijt) {
            this.a = ijt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ikn ikn = this.a.j;
            Object p = ikn.b.a(ikn.a()).b((ajdw) ((zfw) ikn.a.b()).f()).u(new ikn.b(ikn)).p(new c(ikn));
            akcr.a(p, "unlockablesApi.connect(c…rForResponse(it.data) } }");
            p = p.a(this.a.a(null));
            akcr.a(p, "geofiltersDataSource.get…pose(composeViewModels())");
            return ajwl.i(igs.a(p));
        }
    }

    /* renamed from: ijt$i */
    static final class i extends akcs implements akbk<ajdp<znh<zmy>>> {
        private /* synthetic */ ijt a;

        i(ijt ijt) {
            this.a = ijt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.a((ajdt) this.a.b(), ajde.a);
        }
    }

    /* renamed from: ijt$l */
    static final class l extends akcq implements akbl<Boolean, ajxw> {
        l(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return ajxw.a;
        }
    }

    /* renamed from: ijt$n */
    static final class n extends akcq implements akbl<Boolean, ajxw> {
        n(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return ajxw.a;
        }
    }

    /* renamed from: ijt$p */
    static final class p extends akcq implements akbl<Boolean, ajxw> {
        p(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return ajxw.a;
        }
    }

    /* renamed from: ijt$k */
    static final class k<T, R> implements ajfc<T, R> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abbd abbd = (abbd) obj;
            akcr.b(abbd, "sourceType");
            boolean z = (abbd == abbd.CAMERA_ROLL || abbd == abbd.MAP) ? false : true;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ijt$m */
    static final class m<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ijt a;

        /* renamed from: ijt$m$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                zmy zmy = (zmy) obj;
                akcr.b(zmy, "viewModel");
                return Boolean.valueOf(!(zmy instanceof ilj));
            }
        }

        m(ijt ijt) {
            this.a = ijt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Boolean) obj;
            akcr.b(obj, "it");
            if (obj.booleanValue()) {
                return ajdp.b(obj);
            }
            ajdp ajdp = this.a.h;
            if (ajdp == null) {
                akcr.a("currentViewModel");
            }
            return ajdp.p(1.a).h(Boolean.TRUE);
        }
    }

    /* renamed from: ijt$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            tqn tqn = (tqn) obj;
            akcr.b(tqn, "filterInfo");
            boolean z = true;
            if (!(tqn.a || tqn.b) || (tqn.c.c.isEmpty() ^ 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ijt$a */
    static final class a<Upstream, Downstream> implements ajdu<List<? extends abzy>, znh<zmy>> {
        final /* synthetic */ ijt a;
        final /* synthetic */ String b;

        /* renamed from: ijt$a$1 */
        static final class 1<T> implements ajfl<Boolean> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                return bool.booleanValue();
            }
        }

        a(ijt ijt, String str) {
            this.a = ijt;
            this.b = str;
        }

        public final /* synthetic */ ajdt apply(final ajdp ajdp) {
            akcr.b(ajdp, "source");
            return this.a.c.a((ajfl) 1.a).k((ajfc) new ajfc<T, ajdt<? extends R>>(this) {
                final /* synthetic */ a a;

                /* renamed from: ijt$a$2$1 */
                static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                    private /* synthetic */ 2 a;

                    1(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "geofilters");
                        this.a.a.a.d = list;
                        ijt ijt = this.a.a.a;
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            abzy abzy = (abzy) next;
                            b bVar = ijt.i;
                            if (bVar == null) {
                                akcr.a("previewFlavorConfig");
                            }
                            Object obj2 = (!(bVar instanceof b.b) || abzy.p() == null) ? 1 : null;
                            if (obj2 != null) {
                                arrayList.add(next);
                            }
                        }
                        List list2 = (List) arrayList;
                        ijb a = this.a.a.a.a();
                        ajdp ajdp = this.a.a.a.g;
                        if (ajdp == null) {
                            akcr.a("previewVisibleObservable");
                        }
                        return a.a(list2, ajdp, this.a.a.b);
                    }
                }

                /* renamed from: ijt$a$2$2 */
                static final class 2<T> implements ajfl<znh<zmy>> {
                    private /* synthetic */ 2 a;

                    2(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ boolean test(Object obj) {
                        znh znh = (znh) obj;
                        akcr.b(znh, "viewModels");
                        String str = this.a.a.b;
                        if (str != null) {
                            Iterable<zmy> iterable = znh;
                            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                                for (zmy zmy : iterable) {
                                    Object obj2;
                                    if ((zmy instanceof ilj) && ((ilj) zmy).c.a().equals(str)) {
                                        obj2 = 1;
                                        continue;
                                    } else {
                                        obj2 = null;
                                        continue;
                                    }
                                    if (obj2 != null) {
                                        obj = 1;
                                        break;
                                    }
                                }
                            }
                            obj = null;
                            return obj != null;
                        }
                    }
                }

                /* renamed from: ijt$a$2$3 */
                static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
                    private /* synthetic */ 2 a;

                    /* renamed from: ijt$a$2$3$1 */
                    static final class 1<T> implements ajfl<Boolean> {
                        public static final 1 a = new 1();

                        1() {
                        }

                        public final /* synthetic */ boolean test(Object obj) {
                            Boolean bool = (Boolean) obj;
                            akcr.b(bool, "it");
                            return bool.booleanValue();
                        }
                    }

                    3(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        final znh znh = (znh) obj;
                        akcr.b(znh, "viewModels");
                        return this.a.a.a.a.j(ajfu.a).a((ajfl) 1.a).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Boolean) obj, "it");
                                return znh;
                            }
                        });
                    }
                }

                /* renamed from: ijt$a$2$4 */
                static final class 4<T, R> implements ajfc<T, ajdt<? extends R>> {
                    private /* synthetic */ 2 a;

                    4(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        final znh znh = (znh) obj;
                        akcr.b(znh, "viewModels");
                        return this.a.a.a.b.p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                Boolean bool = (Boolean) obj;
                                akcr.b(bool, "stacked");
                                return bool.booleanValue() ? znk.a : znh;
                            }
                        });
                    }
                }

                /* renamed from: ijt$a$2$5 */
                static final class 5<T, R> implements ajfc<T, ajdt<? extends R>> {
                    private /* synthetic */ 2 a;

                    5(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        obj = (znh) obj;
                        akcr.b(obj, "it");
                        ajcx ajcx = this.a.a.a.f;
                        if (ajcx == null) {
                            akcr.a("delayedBind");
                        }
                        return ajcx.a((ajdt) ajdp.b(obj));
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Boolean) obj, "it");
                    obj = ajdp.u(new 1(this)).a((ajfl) new 2(this)).u(new 3(this)).u(new 4(this)).u(new 5(this)).b((ajdw) ((zfw) this.a.a.p.b()).f());
                    akcr.a(obj, "source\n                 …scribeOn(schedulers.io())");
                    return obj.a((ajdw) ((zfw) this.a.a.p.b()).l());
                }
            });
        }
    }

    /* renamed from: ijt$q */
    static final class q<V> implements Callable<Object> {
        private /* synthetic */ ijt a;
        private /* synthetic */ a b;

        q(ijt ijt, a aVar) {
            this.a = ijt;
            this.b = aVar;
        }

        public final /* synthetic */ Object call() {
            List list = this.a.d;
            if (list == null) {
                return null;
            }
            this.b.b(list);
            Iterable<abzy> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abzy a : iterable) {
                arrayList.add(a.a());
            }
            List list2 = (List) arrayList;
            tqm tqm = this.a.e;
            if (tqm == null) {
                akcr.a("stackedFiltersController");
            }
            for (abzy a2 : tqm.a().c()) {
                int indexOf = list2.indexOf(a2.a());
                if (indexOf != -1) {
                    this.b.b(indexOf);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: ijt$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            zmy zmy = (zmy) obj;
            akcr.b(zmy, "it");
            return Optional.of(zmy);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ijt.class), "createViewModelStage", "getCreateViewModelStage()Lcom/snap/geofilters/core/stage/CreateViewModelStage;"), new akdc(akde.a(ijt.class), "geofilterPreparer", "getGeofilterPreparer()Lcom/snap/geofilters/api/GeofilterPreparer;"), new akdc(akde.a(ijt.class), "geofilterOverlayCacheKeyHelper", "getGeofilterOverlayCacheKeyHelper()Lcom/snap/geofilters/utils/GeofilterOverlayCacheKeyHelper;"), new akdc(akde.a(ijt.class), "geofilerPipelineContextStore", "getGeofilerPipelineContextStore()Lcom/snap/media/api/overlay/GeofilterPipelineContextStore;"), new akdc(akde.a(ijt.class), "friendFilterDataSource", "getFriendFilterDataSource()Lcom/snap/geofilters/data/friendfilter/FriendFilterDataSource;"), new akdc(akde.a(ijt.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ijt.class), "geofiltersDataSourceSubject", "getGeofiltersDataSourceSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(ijt.class), "myViewModels", "getMyViewModels()Lio/reactivex/Observable;")};
    }

    public ijt(ikn ikn, ajwy<ijx> ajwy, ajwy<ijb> ajwy2, ajwy<ils> ajwy3, ajwy<oeb> ajwy4, ajwy<iko> ajwy5, ftl ftl, tvd tvd, zgb zgb) {
        akcr.b(ikn, "geofiltersDataSource");
        akcr.b(ajwy, "createViewModelStageProvider");
        akcr.b(ajwy2, "geofilterPreparerProvider");
        akcr.b(ajwy3, "geofilterOverlayCacheKeyHelperProvider");
        akcr.b(ajwy4, "geofilterPipelineContextStore");
        akcr.b(ajwy5, "friendFilterDataSourceProvider");
        akcr.b(ftl, "configProvider");
        akcr.b(tvd, "previewDataSource");
        akcr.b(zgb, "schedulersProvider");
        this.j = ikn;
        this.u = ftl;
        this.v = tvd;
        this.k = ajxh.a(new b(ajwy));
        this.l = ajxh.a(new f(ajwy2));
        this.m = ajxh.a(new e(ajwy3));
        this.n = ajxh.a(new d(ajwy4));
        this.o = ajxh.a(new c(ajwy5));
        this.p = ajxh.a(new j(zgb));
        Object ajwl = new ajwl();
        String str = "BehaviorSubject.create<Boolean>()";
        akcr.a(ajwl, str);
        this.a = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.b = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.c = ajwl;
    }

    private final iko f() {
        return (iko) this.o.b();
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "filtersBuilder");
        Object b = ajcx.b((Callable) new q(this, aVar));
        akcr.a(b, "Completable.fromCallable…}\n            }\n        }");
        return b;
    }

    public final ajdp<Optional<zmy>> a(abzt abzt) {
        akcr.b(abzt, "filters");
        Object g = abzt.g();
        if (g != null) {
            ijx ijx = (ijx) this.k.b();
            akcr.a(g, "it");
            ajdp p = ijx.a(g).p(h.a);
            if (p != null) {
                return p;
            }
        }
        g = ajdp.b(Optional.absent());
        akcr.a(g, "Observable.just(Optional.absent())");
        return g;
    }

    /* Access modifiers changed, original: final */
    public final ajdu<List<abzy>, znh<zmy>> a(String str) {
        return new a(this, str);
    }

    /* Access modifiers changed, original: final */
    public final ijb a() {
        return (ijb) this.l.b();
    }

    public final void a(int i) {
        if (i != 0) {
            this.a.a(Boolean.FALSE);
        }
        a().a(i);
    }

    public final void a(ajdp<aesf> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, tqm tqm, ajcx ajcx, boolean z, toz toz, tpl tpl, ajdp<zmy> ajdp4) {
        akcr.b(ajdp, "mediaTypeObservable");
        akcr.b(ajdp2, "updateEnabledObservable");
        akcr.b(ajdp3, "previewVisibleObservable");
        String str = "stackedFiltersController";
        akcr.b(tqm, str);
        akcr.b(ajcx, "delayedBind");
        akcr.b(toz, "mediaPlayerCapabilities");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp4, "currentViewModel");
        super.a(ajdp, ajdp2, ajdp3, tqm, ajcx, z, toz, tpl, ajdp4);
        this.e = tqm;
        this.f = ajcx;
        this.s = ajdp;
        this.g = ajdp3;
        this.i = tpl.b;
        this.h = ajdp4;
        iko f = f();
        b bVar = tpl.b;
        akcr.b(bVar, "previewFlavorConfig");
        ajej a = f.i.a((ajdw) ((zfw) f.a.b()).f()).a((ajfl) new iko.b(bVar)).p(new iko.c(f)).a((ajfb) d.a, (ajfb) e.a);
        akcr.a((Object) a, "quickReplyEventSubject\n … $it\")\n                })");
        ajvv.a(a, f.b);
        ajei ajei = this.q;
        r4 = new ajej[3];
        Object p = this.v.f.c(1).p(k.a);
        akcr.a(p, "previewDataSource.mediaO…                        }");
        r4[0] = p.f((ajfb) new iju(new l(this.c)));
        p = this.u.b((fth) zpt.GEOFILTER_ALLOW_GEOFILTER_PAGE_SECTION_UPDATE).d((ajfc) new m(this));
        akcr.a(p, "configProvider.getBoolea…                        }");
        r4[1] = p.f((ajfb) new iju(new n(this.a)));
        tqm tqm2 = this.e;
        if (tqm2 == null) {
            akcr.a(str);
        }
        p = tqm2.b().p(o.a).j(ajfu.a);
        akcr.a(p, "stackedFiltersController…  .distinctUntilChanged()");
        r4[2] = p.f((ajfb) new iju(new p(this.b)));
        ajei.a(r4);
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
        if (this.e != null) {
            boolean z;
            String str;
            ijc b = a().b();
            Iterator it = iip.a().iterator();
            while (true) {
                z = false;
                str = "stackedFiltersController";
                if (!it.hasNext()) {
                    break;
                }
                int i;
                aaim aaim = (aaim) it.next();
                aaim.K(Long.valueOf(b.a));
                tqm tqm = this.e;
                if (tqm == null) {
                    akcr.a(str);
                }
                Iterable<abzy> c = tqm.a().c();
                if (!(c instanceof Collection) || !((Collection) c).isEmpty()) {
                    for (abzy j : c) {
                        if (j.j()) {
                            i++;
                            if (i < 0) {
                                ajym.b();
                            }
                        }
                    }
                }
                aaim.b(Long.valueOf((long) i));
            }
            aann aann = iip.c;
            tqm tqm2 = this.e;
            if (tqm2 == null) {
                akcr.a(str);
            }
            for (abzy j2 : tqm2.a().c()) {
                iip.g = true;
                aann.a(j2.a());
            }
            iiq iiq = iip.d;
            iiq.b = b.a;
            tqm tqm3 = this.e;
            if (tqm3 == null) {
                akcr.a(str);
            }
            iiq.a(tqm3.a().c());
            aahr aahr = iip.f;
            tqm3 = this.e;
            if (tqm3 == null) {
                akcr.a(str);
            }
            if (tqm3.a().c().size() > 0) {
                z = true;
            }
            aahr.a(Boolean.valueOf(z));
        }
    }

    /* Access modifiers changed, original: final */
    public final ajwl<ajdp<znh<zmy>>> b() {
        return (ajwl) this.r.b();
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
        Object e = abzt.e();
        if (e != null) {
            b().a(ajdp.b((Object) znk.a));
            ajwl b = b();
            ajdp b2 = ajdp.b(e);
            abzy g = abzt.g();
            b.a(b2.a(a(g != null ? g.a() : null)).i().a());
        }
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> d() {
        return (ajdp) this.t.b();
    }

    public final Map<Integer, Integer> e() {
        ajxm[] ajxmArr = new ajxm[2];
        Integer valueOf = Integer.valueOf(R.layout.filter_page_geo);
        Integer valueOf2 = Integer.valueOf(1);
        ajxmArr[0] = ajxs.a(valueOf, valueOf2);
        ajxmArr[1] = ajxs.a(Integer.valueOf(R.layout.filter_page_geo_animated), valueOf2);
        return ajzm.a(ajxmArr);
    }

    public final void onDispose() {
        ((ils) this.m.b()).a().clear();
        ((oeb) this.n.b()).a.clear();
        a().a();
        f().b.dispose();
        this.q.dispose();
    }
}
