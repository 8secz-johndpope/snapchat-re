package defpackage;

/* renamed from: mxg */
public abstract class mxg implements mha {

    /* renamed from: mxg$d */
    public interface d {
        mnr F();

        ide I();

        zgb u();

        ajdp<mmt> y();
    }

    /* renamed from: mxg$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mxg$a */
    public interface a extends mhi<mxg> {
        a a(d dVar);
    }

    /* renamed from: mxg$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mxk a(mxl mxl, ajdp<mmt> ajdp, zfw zfw) {
            akcr.b(mxl, "lensPersistenceUseCase");
            akcr.b(ajdp, "lensCore");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mxf(ajdp, mxl, zfw);
        }

        public static final mxl a(mnr mnr) {
            akcr.b(mnr, "repository");
            return new mxd(mnr);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "qualifiedSchedulers");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide, "PersistenceComponent");
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        Object l = b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }

    public final ajdp<Object> b() {
        return d().b();
    }

    public abstract mxk d();
}
