package defpackage;

import android.net.Uri;
import defpackage.gfr.a;
import defpackage.tte.h;
import defpackage.tte.i;
import defpackage.tte.k;
import defpackage.tte.l;
import defpackage.tte.m;
import defpackage.tte.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ttf */
public final class ttf implements ajej {
    public boolean a;
    public volatile boolean b;
    final tte c;
    final toc d;
    public final ftl e;
    private final ajxe f = ajxh.a(new k(this));
    private final ajxe g = ajxh.a(b.a);
    private final ajxe h = ajxh.a(f.a);
    private final ajxe i = ajxh.a(d.a);
    private final ajxe j = ajxh.a(new c(this));
    private final ajxe k = ajxh.a(new e(this));
    private final zgb l;

    /* renamed from: ttf$b */
    static final class b extends akcs implements akbk<ajei> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    /* renamed from: ttf$f */
    static final class f extends akcs implements akbk<ajwl<List<? extends acae>>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwl.i(ajyw.a);
        }
    }

    /* renamed from: ttf$d */
    static final class d extends akcs implements akbk<ajwl<ajdp<List<? extends ttd>>>> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: ttf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ttf$k */
    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ ttf a;

        k(ttf ttf) {
            this.a = ttf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.d.callsite("FilterCarouselDataSource"));
        }
    }

    /* renamed from: ttf$c */
    static final class c extends akcs implements akbk<ajdp<List<? extends ajxm<? extends acae, ? extends kaz<jwj>>>>> {
        private /* synthetic */ ttf a;

        /* renamed from: ttf$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "filterDatas");
                Iterable<ttd> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (ttd ttd : iterable) {
                    arrayList.add(ajxs.a(ttd.a, ttd.b));
                }
                return (List) arrayList;
            }
        }

        c(ttf ttf) {
            this.a = ttf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.a((ajdt) this.a.d(), ajde.a).a((ajdw) this.a.a().h()).p(1.a).c();
        }
    }

    /* renamed from: ttf$e */
    static final class e extends akcs implements akbk<ArrayList<aehv>> {
        private /* synthetic */ ttf a;

        e(ttf ttf) {
            this.a = ttf;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.a.c.c;
        }
    }

    /* renamed from: ttf$g */
    public static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ List a;
        private /* synthetic */ List b;

        public g(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "contextFilterTypes");
            return ajyu.d((Collection) ajyu.d((Collection) this.a, (Iterable) list), (Iterable) this.b);
        }
    }

    /* renamed from: ttf$h */
    public static final class h<T> implements ajfb<Boolean> {
        private /* synthetic */ ttf a;

        public h(ttf ttf) {
            this.a = ttf;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ttf ttf = this.a;
            akcr.a(obj, "enabled");
            ttf.a = obj.booleanValue();
        }
    }

    /* renamed from: ttf$i */
    public static final class i<T> implements ajfl<Boolean> {
        private /* synthetic */ ttf a;

        public i(ttf ttf) {
            this.a = ttf;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            return bool.booleanValue() && !this.a.b;
        }
    }

    /* renamed from: ttf$j */
    public static final class j<T> implements ajfb<Boolean> {
        private /* synthetic */ ttf a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ ajdp c;

        public j(ttf ttf, ajdp ajdp, ajdp ajdp2) {
            this.a = ttf;
            this.b = ajdp;
            this.c = ajdp2;
        }

        public final /* synthetic */ void accept(Object obj) {
            tte tte = this.a.c;
            ajei b = this.a.b();
            ajdp ajdp = this.b;
            ajdp ajdp2 = this.c;
            String str = "FilterCarouselDataSource";
            akcr.b(str, "tag");
            akcr.b(b, "compositeDisposable");
            akcr.b(ajdp, "snapBitmapObservable");
            akcr.b(ajdp2, "snapRotationDataObservable");
            gfu a = tte.a();
            Object appendPath = a.b().buildUpon().appendPath("sky_model");
            akcr.a(appendPath, "it");
            ftw.a(appendPath, "sky_model_v1.0.2.dnn", "context-filter/sky_model_v1.0.2.dnn.zip", "");
            Uri build = appendPath.build();
            akcr.a((Object) build, "SnapContentBaseUriProvid…                }.build()");
            Object a2 = a.a(build, (idl) toc.d.getPage(), true, new gdy[0]).d((ajfb) h.a).a((ajfc) i.a);
            akcr.a(a2, "contentResolver.resolve(…  }\n                    }");
            Object e = ajdp.e();
            akcr.a(e, "snapBitmapObservable.firstOrError()");
            ajdx a3 = ajwd.a(a2, (ajeb) e);
            a2 = ajdp2.e();
            akcr.a(a2, "snapRotationDataObservable.firstOrError()");
            obj = ajwd.a(a3, (ajeb) a2).a((ajdw) ((zfw) tte.b.b()).b()).a((ajfc) new k(tte, str)).a((ajfc) new l(tte, str, ajdp2, b)).d((ajfb) m.a).c((Object) ajyw.a).b((ajev) new n(tte));
            akcr.a(obj, "loadSkyModel()\n         …spose()\n                }");
            this.a.d().a(obj.i());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ttf.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ttf.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(ttf.class), "contextFilterTypesUpdateSubject", "getContextFilterTypesUpdateSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(ttf.class), "contextFilterDataSourceSubject", "getContextFilterDataSourceSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(ttf.class), "contextFilterData", "getContextFilterData()Lio/reactivex/Observable;"), new akdc(akde.a(ttf.class), "contextFilterMetadataList", "getContextFilterMetadataList()Ljava/util/ArrayList;")};
        a aVar = new a();
    }

    public ttf(tte tte, toc toc, zgb zgb, ftl ftl) {
        akcr.b(tte, "contextFilterDataSource");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ftl, "configurationProvider");
        this.c = tte;
        this.d = toc;
        this.l = zgb;
        this.e = ftl;
    }

    public final zfw a() {
        return (zfw) this.f.b();
    }

    public final ajei b() {
        return (ajei) this.g.b();
    }

    public final ajwl<List<acae>> c() {
        return (ajwl) this.h.b();
    }

    public final ajwl<ajdp<List<ttd>>> d() {
        return (ajwl) this.i.b();
    }

    public final void dispose() {
        b().dispose();
    }

    public final ajdp<List<ajxm<acae, kaz<jwj>>>> e() {
        return (ajdp) this.j.b();
    }

    public final ArrayList<aehv> f() {
        return (ArrayList) this.k.b();
    }

    public final boolean isDisposed() {
        return b().isDisposed();
    }
}
