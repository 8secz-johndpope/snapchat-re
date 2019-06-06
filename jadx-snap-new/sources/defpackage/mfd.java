package defpackage;

import defpackage.mfu.a.a;
import defpackage.mfu.b;
import java.util.concurrent.TimeUnit;

/* renamed from: mfd */
public final class mfd implements mfq {
    final mft a;
    final zfw b;
    final long c;
    final TimeUnit d;
    private final ajdp<mfu> e;
    private final ajdu<b, b> f;

    /* renamed from: mfd$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mfd a;

        a(mfd mfd) {
            this.a = mfd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mfu mfu = (mfu) obj;
            akcr.b(mfu, "view");
            mfd mfd = this.a;
            obj = mfd.a.b().a((ajdw) mfd.b.l()).u(new c(mfd, mfu));
            akcr.a(obj, "useCase.outputs\n        …      }\n                }");
            return obj;
        }
    }

    /* renamed from: mfd$b */
    static final class b<T> implements ajfb<ajxm<? extends mfu, ? extends defpackage.mfu.b>> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mfu) ajxm.a).accept((defpackage.mfu.b) ajxm.b);
        }
    }

    /* renamed from: mfd$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mfd a;
        private /* synthetic */ mfu b;

        /* renamed from: mfd$c$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.mfu.a.a;
            }
        }

        c(mfd mfd, mfu mfu) {
            this.a = mfd;
            this.b = mfu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (mft.b) obj;
            akcr.b(obj, "result");
            if (!akcr.a(obj, mft.b.b.b.a)) {
                return ajvo.a(ajot.a);
            }
            obj = this.b.a().a((ajfl) a.a).a(a.class);
            akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
            return obj.d(500, this.a.d, this.a.b.b());
        }
    }

    public /* synthetic */ mfd(ajdp ajdp, ajdu ajdu, mft mft, zfw zfw) {
        this(ajdp, ajdu, mft, zfw, TimeUnit.MILLISECONDS);
    }

    private mfd(ajdp<mfu> ajdp, ajdu<b, b> ajdu, mft mft, zfw zfw, TimeUnit timeUnit) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(mft, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "clickTimeoutUnit");
        this.e = ajdp;
        this.f = ajdu;
        this.a = mft;
        this.b = zfw;
        this.c = 500;
        this.d = timeUnit;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp u = this.e.a((ajdw) this.b.l()).u(new a(this));
        akbl akbl = mfe.b;
        if (akbl != null) {
            akbl = new mff(akbl);
        }
        ajej f = u.p((ajfc) akbl).f(this.a.a());
        akcr.a((Object) f, "viewProvider\n           …subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        u = this.a.b();
        akbl = mfe.a;
        if (akbl != null) {
            akbl = new mff(akbl);
        }
        Object j = u.p((ajfc) akbl).a(this.f).j(ajfu.a);
        akcr.a(j, "useCase.outputs\n        …  .distinctUntilChanged()");
        f = myu.a(this.e, j).a((ajdw) this.b.l()).f((ajfb) b.a);
        akcr.a((Object) f, "pairLatest(viewProvider,…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
