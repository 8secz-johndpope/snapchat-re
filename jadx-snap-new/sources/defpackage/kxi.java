package defpackage;

import defpackage.miw.b;
import defpackage.miw.c;
import defpackage.miw.d;
import java.util.Map;

/* renamed from: kxi */
public final class kxi implements miw {
    final miw a;
    private final Map<mje, mje> b;

    /* renamed from: kxi$a */
    public static final class a implements c {
        private /* synthetic */ kxi a;
        private /* synthetic */ b b;

        a(kxi kxi, b bVar) {
            this.a = kxi;
            this.b = bVar;
        }

        public final ajdp<Boolean> a(mje mje) {
            akcr.b(mje, "key");
            return this.a.a.a(this.b).a(kxi.a(this.a, mje));
        }

        public final ajdp<Float> b(mje mje) {
            akcr.b(mje, "key");
            return this.a.a.a(this.b).b(kxi.a(this.a, mje));
        }

        public final ajdp<Double> c(mje mje) {
            akcr.b(mje, "key");
            return this.a.a.a(this.b).c(kxi.a(this.a, mje));
        }

        public final ajdp<Integer> d(mje mje) {
            akcr.b(mje, "key");
            return this.a.a.a(this.b).d(kxi.a(this.a, mje));
        }

        public final ajdp<Long> e(mje mje) {
            akcr.b(mje, "key");
            return this.a.a.a(this.b).e(kxi.a(this.a, mje));
        }

        public final ajdp<String> f(mje mje) {
            akcr.b(mje, "key");
            return this.a.a.a(this.b).f(kxi.a(this.a, mje));
        }
    }

    public kxi(miw miw, Map<mje, ? extends mje> map) {
        akcr.b(miw, "configurationRepository");
        akcr.b(map, "keyMap");
        this.a = miw;
        this.b = map;
    }

    public static final /* synthetic */ mje a(kxi kxi, mje mje) {
        mje mje2 = (mje) kxi.b.get(mje);
        return mje2 == null ? mje : mje2;
    }

    public final c a(b bVar) {
        akcr.b(bVar, "fallbackPolicy");
        return new a(this, bVar);
    }

    public final d a() {
        return this.a.a();
    }
}
