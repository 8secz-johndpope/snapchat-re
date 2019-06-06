package defpackage;

/* renamed from: mza */
public abstract class mza implements mha {

    /* renamed from: mza$d */
    public interface d {
        ajdp<mmt> y();
    }

    /* renamed from: mza$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mza$a */
    public interface a extends mhi<mza> {
        a a(ajdp<myw> ajdp);

        a a(d dVar);
    }

    /* renamed from: mza$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mzc a(ajdp<mmt> ajdp, ajdp<myw> ajdp2) {
            akcr.b(ajdp, "lensCore");
            akcr.b(ajdp2, "cameraSizeProperties");
            return new myy(ajdp, ajdp2);
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

    public abstract mzc d();
}
