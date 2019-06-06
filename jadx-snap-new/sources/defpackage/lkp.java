package defpackage;

import com.snap.core.db.api.SnapDb;

/* renamed from: lkp */
public abstract class lkp {

    /* renamed from: lkp$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lkp$d */
    public interface d {
        SnapDb a();

        zgb b();
    }

    /* renamed from: lkp$a */
    public static abstract class a {
        public abstract a a(ide ide);

        public abstract a a(d dVar);

        public abstract lkp a();
    }

    /* renamed from: lkp$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mnr a(SnapDb snapDb, zfw zfw, ide ide) {
            akcr.b(snapDb, "snapDb");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(ide, "attributedFeature");
            return new lkt(snapDb, zfw, ide);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("LensesPersistenceComponent"));
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mnr b();
}
