package defpackage;

import defpackage.loj.a;
import defpackage.mny.b;

/* renamed from: lof */
public final class lof implements mha {
    final ajdp<mmt> a;
    private final loj b;

    /* renamed from: lof$c */
    static final class c extends akcq implements akbl<b, a> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Lcom/snap/lenses/core/RemoteAssetsProcessor$RemoteAssetRequest;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "p1");
            return new a(bVar);
        }
    }

    /* renamed from: lof$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.o().b();
        }
    }

    /* renamed from: lof$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lof a;

        a(lof lof) {
            this.a = lof;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final defpackage.mny.a aVar = (defpackage.mny.a) obj;
            akcr.b(aVar, "descriptor");
            return this.a.a.p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    mmt mmt = (mmt) obj;
                    akcr.b(mmt, "it");
                    return ajxs.a(mmt.o(), aVar);
                }
            });
        }
    }

    /* renamed from: lof$d */
    static final class d<T> implements ajfb<ajxm<? extends mny, ? extends mny.a>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            mny mny = (mny) ajxm.a;
            mny.a().accept((mny.a) ajxm.b);
        }
    }

    public lof(ajdp<mmt> ajdp, loj loj) {
        akcr.b(ajdp, "lensCore");
        akcr.b(loj, "remoteAssetsUseCase");
        this.a = ajdp;
        this.b = loj;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }

    /* renamed from: c */
    public final ajei a() {
        ajei ajei = new ajei();
        ajej f = this.a.u(b.a).p(new loh(c.a)).f(this.b.a());
        akcr.a((Object) f, "lensCore\n               …moteAssetsUseCase.inputs)");
        ajvv.a(ajei, f);
        f = this.b.b().p(new loh(log.a)).u(new a(this)).f((ajfb) d.a);
        akcr.a((Object) f, "remoteAssetsUseCase.outp…riptor)\n                }");
        ajvv.a(ajei, f);
        return ajei;
    }
}
