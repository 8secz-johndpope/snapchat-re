package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.kpm.a;

/* renamed from: kvl */
public abstract class kvl {

    /* renamed from: kvl$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public static a a(c cVar) {
            akcr.b(cVar, "parentComponent");
            return kvk.a().a(cVar);
        }
    }

    /* renamed from: kvl$c */
    public interface c {
        Context a();

        Supplier<iha> b();

        abss c();

        gqr d();

        zgb e();

        Supplier<dib> f();

        ilv g();

        Supplier<iib> h();

        cko i();

        Supplier<ckx> j();

        ajei k();
    }

    /* renamed from: kvl$a */
    public interface a {
        a a(dpr dpr);

        a a(ide ide);

        a a(defpackage.kpm.a aVar);

        a a(c cVar);

        a a(defpackage.lbp.a aVar);

        a a(mzn mzn);

        kvl a();
    }

    static {
        b bVar = new b();
    }

    public abstract kqf b();

    public abstract mng c();

    public abstract ajdp<kqr> d();

    public abstract c f();

    public abstract a g();

    public final a h() {
        return b.a(f()).a(g());
    }
}
