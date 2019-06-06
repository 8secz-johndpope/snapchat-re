package defpackage;

/* renamed from: mww */
public abstract class mww implements mha {

    /* renamed from: mww$d */
    public interface d {
        mwy G();

        mwe J();

        ajdp<mmt> y();
    }

    /* renamed from: mww$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mww$a */
    public interface a extends mhi<mww> {
        a a(d dVar);
    }

    /* renamed from: mww$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mwz a(ajdp<mmt> ajdp, mwe mwe, mwy mwy) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mwe, "lensRepository");
            akcr.b(mwy, "modalDialogLauncher");
            return new mwv(ajdp, mwe, mwy);
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

    public abstract mwz d();
}
