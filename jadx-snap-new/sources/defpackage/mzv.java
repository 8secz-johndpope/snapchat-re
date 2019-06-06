package defpackage;

import android.content.Context;

/* renamed from: mzv */
public abstract class mzv implements mha {

    /* renamed from: mzv$d */
    public interface d {
        ide g();

        zgb h();

        ajdp<mmt> j();

        akbl<Context, jn> o();
    }

    /* renamed from: mzv$a */
    public static abstract class a implements mhi<mzv> {
        public d d;

        public abstract a a(ajdp<mih> ajdp);

        public abstract a a(d dVar);

        public abstract a b(ajdp<nab> ajdp);
    }

    /* renamed from: mzv$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mzv$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mzz a(ajdp<nab> ajdp, naa naa, ajdp<mih> ajdp2, zfw zfw) {
            akcr.b(ajdp, "viewViewProvider");
            akcr.b(naa, "touchUseCase");
            akcr.b(ajdp2, "windowRect");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mzp(ajdp, naa, mic.a((ajdp) ajdp2), zfw);
        }

        public static final naa a(ajdp<mmt> ajdp) {
            akcr.b(ajdp, "lensCore");
            return new mzs(ajdp);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("TouchComponent"));
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

    public abstract mzz d();
}
