package defpackage;

/* renamed from: nar */
public abstract class nar implements mha {

    /* renamed from: nar$d */
    public interface d {
        ajdp<mmt> y();
    }

    /* renamed from: nar$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: nar$a */
    public interface a extends mhi<nar> {
        a a(d dVar);

        a a(nay nay);
    }

    /* renamed from: nar$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final nav a(nba nba, ajdp<mmt> ajdp) {
            akcr.b(nba, "userDataUseCase");
            akcr.b(ajdp, "lensCore");
            return new nav(ajdp, nba);
        }

        public static final nba a(nay nay) {
            akcr.b(nay, "userDataRepository");
            return new nai(nay);
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        Object l = d().b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }

    public final ajdp<Object> b() {
        return d().b();
    }

    public abstract nav d();
}
