package defpackage;

import android.content.Context;

/* renamed from: mge */
public abstract class mge implements mha {

    /* renamed from: mge$d */
    public interface d {
        ide g();

        zgb h();

        ajdp<mmt> j();

        akbl<Context, jn> o();
    }

    /* renamed from: mge$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mge$a */
    public static abstract class a implements mhi<mge> {
        public d c;

        public abstract a a(ajdp<mgk> ajdp);

        public abstract a a(d dVar);
    }

    /* renamed from: mge$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mgi a(ajdp<mgk> ajdp, mgj mgj, zfw zfw) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(mgj, "useCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mfw(ajdp, mgj, zfw);
        }

        public static final mgj a(ajdp<mmt> ajdp) {
            akcr.b(ajdp, "lensCore");
            return new mfx(ajdp);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("TextInputComponent"));
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

    public abstract mgi d();
}
