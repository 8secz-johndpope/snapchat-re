package defpackage;

/* renamed from: mto */
public abstract class mto implements mha {

    /* renamed from: mto$d */
    public interface d {
        ajdp<mmt> y();
    }

    /* renamed from: mto$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mto$a */
    public interface a extends mhi<mto> {
        a a(d dVar);

        a a(mtr mtr);

        a a(mtv mtv);
    }

    /* renamed from: mto$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mtq a(ajdp<mmt> ajdp, mtr mtr, mtv mtv) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mtr, "locationRepository");
            akcr.b(mtv, "weatherRepository");
            return new mtn(ajdp, mtr, mtv);
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
        return myu.a(d().b());
    }

    public abstract mtq d();
}
