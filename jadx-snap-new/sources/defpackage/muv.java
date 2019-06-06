package defpackage;

import defpackage.mwe.a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: muv */
public final class muv implements mwe {
    private final ajxe a;

    /* renamed from: muv$a */
    static final class a extends akcs implements akbk<ajdx<mwe>> {
        private /* synthetic */ akbk a;
        private /* synthetic */ zfw b;

        a(akbk akbk, zfw zfw) {
            this.a = akbk;
            this.b = zfw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            akbk akbk = this.a;
            if (akbk != null) {
                akbk = new muw(akbk);
            }
            ajdx c = ajdx.c((Callable) akbk);
            akcr.a((Object) c, "Single.fromCallable(lensRepositoryInitializer)");
            return mip.b(c, "LazyInitializedLensRepository#lensRepositoryInitializer").b((ajdw) this.b.b()).a();
        }
    }

    /* renamed from: muv$b */
    static final class b<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mwe mwe = (mwe) obj;
            akcr.b(mwe, "it");
            return mwe.a(this.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(muv.class), "lensRepository", "getLensRepository()Lio/reactivex/Single;");
    }

    public muv(zfw zfw, akbk<? extends mwe> akbk) {
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(akbk, "lensRepositoryInitializer");
        this.a = ajxh.a(new a(akbk, zfw));
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        ajdx ajdx = (ajdx) this.a.b();
        Object bVar = new b(aVar);
        ajfv.a(bVar, "mapper is null");
        Object a = ajvo.a(new ajsg(ajdx, bVar));
        akcr.a(a, "lensRepository.flatMapPu…it.query(queryCriteria) }");
        return a;
    }
}
