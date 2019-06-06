package defpackage;

import android.content.Context;
import defpackage.lxc.c;

/* renamed from: lwv */
public final class lwv implements mhi<a> {
    public ajdp<lxc> a;
    public ajdp<Boolean> b;
    public final b c;

    /* renamed from: lwv$b */
    public interface b {
        ide h();

        zgb i();

        ajdp<lqf> j();

        akbl<Context, jn> k();

        ajdp<mmt> l();

        kqf n();

        mwe o();

        lxh p();
    }

    /* renamed from: lwv$a */
    public static abstract class a implements mha {

        /* renamed from: lwv$a$a */
        public interface a {
            a a(ajdp<lxc> ajdp);

            a a(b bVar);

            a a();

            a b(ajdp<Boolean> ajdp);
        }

        public final ajej a() {
            Object l = b().l();
            akcr.a(l, "observe().subscribe()");
            return l;
        }

        public final ajdp<Object> b() {
            return c().b();
        }

        public abstract lxa c();
    }

    public lwv(b bVar) {
        akcr.b(bVar, "parentComponent");
        this.c = bVar;
        Object b = ajdp.b(c.a);
        akcr.a(b, "just(CtaView.Noop)");
        this.a = b;
        b = ajvo.a(ajot.a);
        akcr.a(b, "empty()");
        this.b = b;
    }

    public final /* synthetic */ Object a() {
        return lxd.d().a(this.c).a(this.a).b(this.b).a();
    }
}
