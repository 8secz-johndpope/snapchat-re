package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.abzt.a;
import defpackage.twa.b;
import defpackage.twa.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ttq */
public final class ttq extends tqi {
    ajcx a;
    String b;
    private tqm c;
    private ajdp<aesf> d;
    private Map<aesf, znh<zmy>> e;
    private final ajxe f;
    private final ajei g = new ajei();
    private final ajxe h;

    /* renamed from: ttq$c */
    static final class c extends akcs implements akbk<twa> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (twa) this.a.get();
        }
    }

    /* renamed from: ttq$g */
    static final class g extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ ttq a;
        private /* synthetic */ ajwy b;

        /* renamed from: ttq$g$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str;
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                if (bool.booleanValue()) {
                    ttq ttq = this.a.a;
                    obj = ttq.a().a().p(new a(ttq)).p(b.a);
                    str = "filterInteractor.input.m… { Seekables.copyOf(it) }";
                } else {
                    obj = ajdp.b(znk.a((List) ajyw.a));
                    str = "Observable.just(Seekable…ist<AdapterViewModel>()))";
                }
                akcr.a(obj, str);
                return obj;
            }
        }

        /* renamed from: ttq$g$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ g a;

            2(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (znh) obj;
                akcr.b(obj, "it");
                ajcx ajcx = this.a.a.a;
                if (ajcx == null) {
                    akcr.a("delayedBind");
                }
                return ajcx.a((ajdt) ajdp.b(obj));
            }
        }

        g(ttq ttq, ajwy ajwy) {
            this.a = ttq;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ftl) this.b.get()).b((fth) tum.LENSES_IN_FILTER_CAROUSEL).i().k((ajfc) new 1(this)).u(new 2(this));
        }
    }

    /* renamed from: ttq$d */
    static final class d<T> implements ajfl<tqn> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            tqn tqn = (tqn) obj;
            akcr.b(tqn, "it");
            return tqn.c.f != null;
        }
    }

    /* renamed from: ttq$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            tqn tqn = (tqn) obj;
            akcr.b(tqn, "it");
            return tqn.c.f;
        }
    }

    /* renamed from: ttq$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ ttq a;

        f(ttq ttq) {
            this.a = ttq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            this.a.b = str;
            return new c(str);
        }
    }

    /* renamed from: ttq$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ ttq a;

        a(ttq ttq) {
            this.a = ttq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "result");
            Iterable<defpackage.twa.a> iterable = bVar.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (defpackage.twa.a aVar : iterable) {
                defpackage.tue.a aVar2 = (this.a.b == null || !akcr.a(aVar.a, this.a.b)) ? defpackage.tue.a.IDLE : akcr.a(bVar.b, this.a.b) ? defpackage.tue.a.DONE : defpackage.tue.a.IN_PROGRESS;
                arrayList.add(new tue(aVar.a, aVar.b, aVar2));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: ttq$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ttq.class), "filterInteractor", "getFilterInteractor()Lcom/snap/preview/lenses/carousel/FilterCarouselInteractor;"), new akdc(akde.a(ttq.class), "myViewModels", "getMyViewModels()Lio/reactivex/Observable;")};
    }

    public ttq(ajwy<twa> ajwy, ajwy<ftl> ajwy2) {
        akcr.b(ajwy, "interactorProvider");
        akcr.b(ajwy2, "configProvider");
        this.f = ajxh.a(new c(ajwy));
        this.h = ajxh.a(new g(this, ajwy2));
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "filtersBuilder");
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    public final ajdp<Optional<zmy>> a(abzt abzt) {
        akcr.b(abzt, "filters");
        Object b = ajdp.b(Optional.absent());
        akcr.a(b, "Observable.just(Optional.absent())");
        return b;
    }

    /* Access modifiers changed, original: final */
    public final twa a() {
        return (twa) this.f.b();
    }

    public final void a(int i) {
    }

    public final void a(ajdp<aesf> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, tqm tqm, ajcx ajcx, boolean z, toz toz, tpl tpl, ajdp<zmy> ajdp4) {
        akcr.b(ajdp, "mediaTypeObservable");
        akcr.b(ajdp2, "updateEnabledObservable");
        akcr.b(ajdp3, "previewVisibleObservable");
        akcr.b(tqm, "stackedFiltersController");
        akcr.b(ajcx, "delayedBind");
        akcr.b(toz, "mediaPlayerCapabilities");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp4, "currentAdapterViewModel");
        super.a(ajdp, ajdp2, ajdp3, tqm, ajcx, z, toz, tpl, ajdp4);
        this.d = ajdp;
        this.c = tqm;
        this.a = ajcx;
        this.e = new ConcurrentHashMap();
        this.g.a(tqm.b().a((ajfl) d.a).p(e.a).j(ajfu.a).p(new f(this)).f(a().b()));
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> d() {
        return (ajdp) this.h.b();
    }

    public final Map<Integer, Integer> e() {
        return ajzl.a(ajxs.a(Integer.valueOf(R.layout.filter_page_lens), Integer.valueOf(1)));
    }

    public final void onDispose() {
        Map map = this.e;
        if (map == null) {
            akcr.a("seekableViewModelCache");
        }
        map.clear();
        this.g.a();
    }
}
