package defpackage;

import android.content.Context;

/* renamed from: mej */
public abstract class mej implements mha {

    /* renamed from: mej$d */
    public interface d {
        ide e();

        zgb f();

        akbl<Context, jn> g();

        kqf h();
    }

    /* renamed from: mej$a */
    public static abstract class a implements mhi<mej> {
        public d c;

        public abstract a a(ajdp<mep> ajdp);

        public abstract a a(d dVar);
    }

    /* renamed from: mej$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mej$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final men a(ajdp<mep> ajdp, meo meo, zfw zfw) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(meo, "useCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mee(ajdp, meo, zfw);
        }

        public static final meo a(kqf kqf) {
            akcr.b(kqf, "analyticsEventHandler");
            return new meh(kqf);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("FullscreenCloseButton"));
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
        return e().b();
    }

    public abstract meo d();

    public abstract men e();
}
