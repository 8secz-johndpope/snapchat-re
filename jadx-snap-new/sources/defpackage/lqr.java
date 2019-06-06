package defpackage;

import defpackage.lqx.a;

/* renamed from: lqr */
public final class lqr implements mhi<a> {
    private final b a;
    private boolean b = false;
    private akbl<mji, ajcx> c = -$$Lambda$lqr$Xi8l8bkTkDSpmhRMGvAvayMd6TE.INSTANCE;

    /* renamed from: lqr$b */
    public interface b {
        ide r();

        zgb s();

        ajdp<mmt> u();

        ajdp<lqf> w();
    }

    /* renamed from: lqr$a */
    public static abstract class a implements mha {

        /* renamed from: lqr$a$a */
        interface a {
            a a(akbl<mji, ajcx> akbl);

            a a(b bVar);

            a a(boolean z);

            a a();
        }

        public final ajej a() {
            return b().l();
        }

        public final ajdp<Object> b() {
            return ajdp.b(c().b(), d().b());
        }

        public abstract lqv c();

        public abstract lqw d();
    }

    public lqr(b bVar) {
        this.a = bVar;
    }

    public final /* synthetic */ Object a() {
        return new a().a(this.a).a(this.b).a(this.c).a();
    }

    public final lqr a(akbl<mji, ajcx> akbl) {
        this.c = akbl;
        return this;
    }

    public final lqr b() {
        this.b = true;
        return this;
    }
}
