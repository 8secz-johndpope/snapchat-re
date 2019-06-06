package defpackage;

import defpackage.kqe.r;
import defpackage.mbg.a.c;
import defpackage.mbh.a;
import defpackage.mbh.b;

/* renamed from: mat */
public final class mat implements mbf {
    final kqf a;
    private final ajdp<mbh> b;
    private final mbg c;
    private final ajdu<b, b> d;
    private final zfw e;

    /* renamed from: mat$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mbh mbh = (mbh) obj;
            akcr.b(mbh, "it");
            return mbh.a();
        }
    }

    /* renamed from: mat$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((a) obj, "it");
            return c.a;
        }
    }

    /* renamed from: mat$c */
    static final class c<T> implements ajfb<defpackage.mbg.a.c> {
        private /* synthetic */ mat a;

        c(mat mat) {
            this.a = mat;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a(r.b);
        }
    }

    /* renamed from: mat$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            mbg.b bVar = (mbg.b) obj;
            akcr.b(bVar, "it");
            if (bVar instanceof mbg.b.a) {
                obj = ajdp.b(b.a.a);
                str = "Observable.just(LensButtonView.Model.Invisible)";
            } else if (bVar instanceof mbg.b.c) {
                obj = ajdp.b(new b.b());
                str = "Observable.just(LensButtonView.Model.Visible())";
            } else {
                obj = ajvo.a(ajot.a);
                str = "Observable.empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: mat$d */
    static final class d<T> implements ajfb<ajxm<? extends mbh, ? extends b>> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mbh) ajxm.a).accept((b) ajxm.b);
        }
    }

    public mat(ajdp<mbh> ajdp, mbg mbg, ajdu<b, b> ajdu, zfw zfw, kqf kqf) {
        akcr.b(ajdp, "view");
        akcr.b(mbg, "lensButtonUseCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(kqf, "analyticsEventHandler");
        this.b = ajdp;
        this.c = mbg;
        this.d = ajdu;
        this.e = zfw;
        this.a = kqf;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajej f = this.b.a((ajdw) this.e.l()).u(a.a).p(b.a).d((ajfb) new c(this)).f(this.c.a());
        akcr.a((Object) f, "view\n                .ob…lensButtonUseCase.inputs)");
        ajvv.a(ajei, f);
        Object j = this.c.b().u(e.a).a(this.d).j(ajfu.a);
        ajdp ajdp = this.b;
        akcr.a(j, "viewModels");
        f = myu.a(ajdp, j).a((ajdw) this.e.l()).f((ajfb) d.a);
        akcr.a((Object) f, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
