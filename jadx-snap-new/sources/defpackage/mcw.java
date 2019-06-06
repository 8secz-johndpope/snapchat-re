package defpackage;

import defpackage.mde.b;
import java.util.concurrent.TimeUnit;

/* renamed from: mcw */
public final class mcw implements ajdu<b, b> {
    final zfw a;

    /* renamed from: mcw$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mcw a;

        /* renamed from: mcw$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Long) obj, "it");
                return new b.b(true);
            }
        }

        a(mcw mcw) {
            this.a = mcw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (b) obj;
            akcr.b(obj, "viewModel");
            if (obj instanceof defpackage.mde.b.a) {
                return ajdp.a(3400, TimeUnit.MILLISECONDS, (ajdw) this.a.a.b()).p(1.a).h(obj);
            }
            if (obj instanceof b.b) {
                return ajdp.b(obj);
            }
            throw new ajxk();
        }
    }

    public mcw(zfw zfw) {
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = zfw;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object u = ajdp.u(new a(this));
        akcr.a(u, "upstream.switchMap { vie…)\n            }\n        }");
        return (ajdt) u;
    }
}
