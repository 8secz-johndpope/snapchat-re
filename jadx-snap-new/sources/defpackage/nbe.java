package defpackage;

/* renamed from: nbe */
public abstract class nbe implements mha {

    /* renamed from: nbe$d */
    public interface d {
        nbd H();

        ajdp<mmt> y();
    }

    /* renamed from: nbe$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: nbe$a */
    public interface a extends mhi<nbe> {
        a a(d dVar);
    }

    /* renamed from: nbe$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final nbg a(ajdp<mmt> ajdp, nbd nbd) {
            akcr.b(ajdp, "lensCore");
            akcr.b(nbd, "wakeLock");
            return new nbc(ajdp, nbd);
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

    public abstract nbg d();
}
