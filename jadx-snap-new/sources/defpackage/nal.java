package defpackage;

import defpackage.miw.b.a;

/* renamed from: nal */
public abstract class nal implements mha {

    /* renamed from: nal$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: nal$d */
    public interface d {
        miw K_();
    }

    /* renamed from: nal$a */
    public interface a extends mhi<nal> {
        a a(ajdp<mmt> ajdp);

        a a(ide ide);

        a a(d dVar);
    }

    /* renamed from: nal$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdp<mmt> a(ajva<mmt> ajva) {
            akcr.b(ajva, "lensCore");
            return ajva;
        }

        public static final ajva<mmt> a(ajdp<mmt> ajdp) {
            akcr.b(ajdp, "lensCore");
            Object k = ajpy.k(ajdp);
            akcr.a(k, "lensCore.publish()");
            return k;
        }

        public static final naj a(mhk mhk, miw miw) {
            akcr.b(mhk, "clock");
            akcr.b(miw, "configurationRepository");
            return new naf(mhk, miw);
        }

        public static final nak a(ajdp<mmt> ajdp, naj naj, miw miw) {
            akcr.b(ajdp, "lensCore");
            akcr.b(naj, "lensUsageRepository");
            akcr.b(miw, "configurationRepository");
            return new nag(ajdp, naj, miw.a(a.a).e(mja.LENSES_ACTIVE_USER_EXPIRATION_TIME_IN_MINUTES));
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajej l = b().l();
        akcr.a((Object) l, "observe().subscribe()");
        ajvv.a(ajei, l);
        ajva e = e();
        ajun ajun = new ajun();
        e.a(ajun);
        l = ajun.a;
        akcr.a((Object) l, "lensCoreActivation.connect()");
        ajvv.a(ajei, l);
        return ajei;
    }

    public final ajdp<Object> b() {
        return myu.a(d().b());
    }

    public abstract nak d();

    public abstract ajva<mmt> e();
}
