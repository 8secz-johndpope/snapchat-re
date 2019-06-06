package defpackage;

import com.google.common.base.Supplier;
import com.snap.core.db.api.SnapDb;

/* renamed from: lni */
public abstract class lni {

    /* renamed from: lni$d */
    public interface d {
        Supplier<gpb> a();

        zgb b();

        Supplier<SnapDb> c();
    }

    /* renamed from: lni$a */
    public interface a extends mhi<lni> {
        a a(ide ide);

        a a(d dVar);
    }

    /* renamed from: lni$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lni$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final nay a(Supplier<gpb> supplier, Supplier<SnapDb> supplier2, ide ide, zgb zgb) {
            akcr.b(supplier, "userAuthStore");
            akcr.b(supplier2, "snapDb");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            return new lnh(supplier, supplier2, ide, zgb.a(ide.callsite("UserDataRepository")));
        }
    }

    static {
        b bVar = new b();
    }

    public abstract nay a();
}
