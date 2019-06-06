package defpackage;

import defpackage.lqf.b.b.c;
import defpackage.maf.a;

/* renamed from: lzx */
public final class lzx implements ajdu<a, a> {
    private final ajdp<lqf> a;

    /* renamed from: lzx$a */
    static final class a<T> implements ajfl<lqf> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            lqf lqf = (lqf) obj;
            akcr.b(lqf, "it");
            return lqf instanceof c;
        }
    }

    /* renamed from: lzx$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((lqf) obj, "it");
            return new defpackage.maf.a.b(false);
        }
    }

    public lzx(ajdp<lqf> ajdp) {
        akcr.b(ajdp, "cameraLifecycle");
        this.a = ajdp;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object e = ajdp.e((ajdt) this.a.a((ajfl) a.a).p(b.a));
        akcr.a(e, "upstream.mergeWith(camer…ew.Model.Hidden(false) })");
        return (ajdt) e;
    }
}
