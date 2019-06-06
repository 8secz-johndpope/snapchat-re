package defpackage;

/* renamed from: mzi */
public abstract class mzi implements mha {

    /* renamed from: mzi$d */
    public interface d {
        ajdp<mmt> y();
    }

    /* renamed from: mzi$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mzi$a */
    public interface a extends mhi<mzi> {
        a a(d dVar);

        a a(mzk mzk);
    }

    /* renamed from: mzi$c */
    public static final class c {
        public static mzm a(ajdp<mmt> ajdp, mzk mzk) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mzk, "lensStatisticsRepository");
            return new mzh(ajdp, mzk);
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

    public abstract mzm d();
}
