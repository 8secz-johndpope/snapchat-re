package defpackage;

import android.content.Context;
import defpackage.mbw.a;

/* renamed from: mbn */
public abstract class mbn implements mha {

    /* renamed from: mbn$d */
    public interface d {
        ide d();

        zgb e();

        akbl<Context, jn> f();

        miw g();

        ajdp<lqf> h();
    }

    /* renamed from: mbn$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mbn$a */
    public static abstract class a implements mhi<mbn> {
        public d d;

        public abstract a a(ajdp<mih> ajdp);

        public abstract a a(d dVar);

        public abstract a b(ajdp<mbw> ajdp);
    }

    /* renamed from: mbn$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdu<a, a> a(ajdp<lqf> ajdp, ajdp<mih> ajdp2) {
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(ajdp2, "windowRect");
            return mic.a(new mbx(ajdp), mic.a((ajdp) ajdp2));
        }

        public static final mbt a(ajdp<mbw> ajdp, mbv mbv, ajdu<a, a> ajdu, zfw zfw) {
            akcr.b(ajdp, "view");
            akcr.b(mbv, "useCase");
            akcr.b(ajdu, "observableTransformer");
            akcr.b(zfw, "schedulers");
            return new mbj(ajdp, mbv, ajdu, zfw);
        }

        public static final mbu a(miw miw) {
            akcr.b(miw, "configurationRepository");
            return new mbk(miw);
        }

        public static final mbv a(mbu mbu) {
            akcr.b(mbu, "settings");
            return new mbl(mbu);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("LensButtonTooltip"));
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

    public abstract mbv d();

    public abstract mbt e();
}
