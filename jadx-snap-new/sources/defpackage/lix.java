package defpackage;

import defpackage.mqt.a;

/* renamed from: lix */
public final class lix<S> implements mqt {
    final akbl<S, mqt> a;
    private final ajdp<S> b;

    /* renamed from: lix$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lix a;

        a(lix lix) {
            this.a = lix;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return ((mqt) this.a.a.invoke(obj)).a();
        }
    }

    public lix(ajdp<S> ajdp, akbl<? super S, ? extends mqt> akbl) {
        akcr.b(ajdp, "switch");
        akcr.b(akbl, "mapper");
        this.b = ajdp;
        this.a = akbl;
    }

    public final ajdp<a> a() {
        Object u = this.b.u(new a(this));
        akcr.a(u, "switch.switchMap { value…er.invoke(value).open() }");
        return u;
    }
}
