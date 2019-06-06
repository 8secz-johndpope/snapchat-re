package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.ldu.c;
import defpackage.mxs.a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: lfu */
public abstract class lfu implements c {

    /* renamed from: lfu$c */
    public interface c {
        zgb a();

        Context b();

        mxa c();

        mwp d();

        gqr e();

        Supplier<abss> f();

        Supplier<iha> g();

        sah h();
    }

    /* renamed from: lfu$a */
    public static abstract class a {
        public final Set<mwe> n = new LinkedHashSet();

        public abstract a a(ckx ckx);

        public abstract a a(Supplier<gfu> supplier);

        public abstract a a(gnk gnk);

        public abstract a a(ide ide);

        public abstract a a(Set<? extends mwe> set);

        public abstract a a(kqf kqf);

        public abstract a a(kxt kxt);

        public abstract a a(defpackage.lbp.a aVar);

        public abstract a a(lcq lcq);

        public abstract a a(lff lff);

        public abstract a a(c cVar);

        public abstract a a(mzn mzn);

        public abstract a a(zpo zpo);

        public abstract lfu a();
    }

    /* renamed from: lfu$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mxa k();

    public abstract mwe l();

    public abstract mwe m();

    public abstract mwe n();

    public abstract a o();

    public abstract ajfb<muo> p();

    public abstract lfs q();

    public abstract ldu r();

    public abstract mwa s();

    public abstract mvu t();
}
