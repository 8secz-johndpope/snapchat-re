package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* renamed from: lno */
public abstract class lno {

    /* renamed from: lno$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lno$d */
    public interface d {
        Context a();

        zgb b();

        jwa c();

        jwe d();
    }

    /* renamed from: lno$a */
    public interface a {
        a a(Supplier<sjm> supplier);

        a a(ide ide);

        a a(d dVar);

        lno a();

        a b(Supplier<sso> supplier);
    }

    /* renamed from: lno$c */
    public static final class c {

        /* renamed from: lno$c$a */
        static final class a extends akcq implements akcb<smi, sti, ssi, stl, ajcx> {
            a(sso sso) {
                super(4, sso);
            }

            public final String getName() {
                return "launch";
            }

            public final akej getOwner() {
                return akde.a(sso.class);
            }

            public final String getSignature() {
                return "launch(Lcom/snap/opera/external/playlist2/model/OperaPlaylistGroup;Lcom/snap/opera/presenter/config/OperaFeatureConfiguration;Lcom/snap/opera/presenter/OperaAnalytics;Lcom/snap/opera/presenter/config/OperaPresenterContext;)Lio/reactivex/Completable;";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                smi smi = (smi) obj;
                sti sti = (sti) obj2;
                ssi ssi = (ssi) obj3;
                stl stl = (stl) obj4;
                akcr.b(smi, "p1");
                akcr.b(sti, "p2");
                akcr.b(ssi, "p3");
                akcr.b(stl, "p4");
                return ((sso) this.receiver).a(smi, sti, ssi, stl);
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final nbh a(Context context, Supplier<sso> supplier, jwa jwa, jwe jwe, zfw zfw, ide ide, Supplier<sjm> supplier2) {
            akcr.b(context, "context");
            akcr.b(supplier, "operaLauncher");
            akcr.b(jwa, "bitmapFactory");
            akcr.b(jwe, "bitmapLoaderFactory");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(ide, "attributedFeature");
            akcr.b(supplier2, "urlInterceptor");
            jwc a = jwe.a();
            akcb aVar = new a((sso) supplier.get());
            idl page = ide.getPage();
            Object obj = supplier2.get();
            akcr.a(obj, "urlInterceptor.get()");
            return new lnm(context, jwa, a, zfw, aVar, page, (sjm) obj);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide, "LensesWebViewComponent");
        }
    }

    static {
        b bVar = new b();
    }

    public abstract nbh b();
}
