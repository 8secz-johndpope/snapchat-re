package defpackage;

import android.content.Context;
import defpackage.miw.b.a;

/* renamed from: mgp */
public abstract class mgp implements mha {

    /* renamed from: mgp$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mgp$d */
    public interface d {
        ide g();

        zgb h();

        mwe i();

        ajdp<mmt> j();

        miw l();

        akbl<Context, jn> o();
    }

    /* renamed from: mgp$a */
    public static abstract class a implements mhi<mgp> {
        public d c;

        public abstract a a(ajdp<mgv> ajdp);

        public abstract a a(d dVar);
    }

    /* renamed from: mgp$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mgt a(ajdp<mgv> ajdp, mgu mgu, zfw zfw) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(mgu, "useCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mgn(ajdp, mgu, zfw);
        }

        public static final mgu a(ajdp<mmt> ajdp, mwe mwe, miw miw) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mwe, "lensRepository");
            akcr.b(miw, "configurationRepository");
            return new mgo(ajdp, mwe, miw.a(a.a).a(mja.UPCOMING_MESSAGE_ENABLED));
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("UpcomingMessage"));
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

    public abstract mgt d();
}
