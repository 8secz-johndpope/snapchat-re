package defpackage;

import android.content.Context;
import defpackage.lum.b;
import defpackage.miw.b.a;

/* renamed from: luf */
public abstract class luf implements mha {

    /* renamed from: luf$d */
    public interface d {
        ide h();

        zgb i();

        ajdp<lqf> j();

        akbl<Context, jn> k();

        ajdp<mmt> l();

        miw m();

        mwe o();
    }

    /* renamed from: luf$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: luf$a */
    public static abstract class a implements mhi<luf> {
        public d e;

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(d dVar);

        public abstract a a(myv myv);

        public abstract a b(ajdp<lum> ajdp);
    }

    /* renamed from: luf$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdu<b, b> a(ajdp<Boolean> ajdp, ajdp<lqf> ajdp2, zfw zfw) {
            akcr.b(ajdp, "hideWhen");
            akcr.b(ajdp2, "cameraLifecycle");
            akcr.b(zfw, "qualifiedSchedulers");
            return new lue(ajdp, ajdp2, zfw);
        }

        public static final luk a(ajdp<lum> ajdp, lul lul, ajdu<b, b> ajdu, zfw zfw) {
            akcr.b(ajdp, "view");
            akcr.b(lul, "useCase");
            akcr.b(ajdu, "viewModelTransformer");
            akcr.b(zfw, "qualifiedSchedulers");
            return new ltz(ajdp, lul, ajdu, zfw);
        }

        public static final lul a(ajdp<mmt> ajdp, mwe mwe, myv myv, miw miw) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mwe, "lensRepository");
            akcr.b(myv, "scanCardsInteractor");
            akcr.b(miw, "configurationRepository");
            Object c = miw.a(a.a).a(mja.INFO_BUTTON_FOR_ALL).c(1);
            akcr.a(c, "configurationRepository.…                 .take(1)");
            return new luc(ajdp, mwe, myv, c);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("InfoButton"));
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

    public abstract luk d();
}
