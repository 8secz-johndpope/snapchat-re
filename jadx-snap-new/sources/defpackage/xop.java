package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: xop */
public final class xop implements gvn {
    final ajxe a = ajxh.a(new b(this));
    final ajxe b = ajxh.a(new e(this));
    final ajwy<achb<zjm, zjk>> c;
    final ajwy<zjw> d;
    final ajwy<xaj> e;
    private final ajxe f = ajxh.a(new d(this));
    private final List<String> g = ajyl.a("snapchat://notification/spectacles/settings.*");

    /* renamed from: xop$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xop$d */
    static final class d extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ xop a;

        d(xop xop) {
            this.a = xop;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.c.get();
        }
    }

    /* renamed from: xop$b */
    static final class b extends akcs implements akbk<zjw> {
        private /* synthetic */ xop a;

        b(xop xop) {
            this.a = xop;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zjw) this.a.d.get();
        }
    }

    /* renamed from: xop$e */
    static final class e extends akcs implements akbk<xaj> {
        private /* synthetic */ xop a;

        e(xop xop) {
            this.a = xop;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xaj) this.a.e.get();
        }
    }

    /* renamed from: xop$c */
    static final class c<V> implements Callable<Object> {
        private /* synthetic */ xop a;

        c(xop xop) {
            this.a = xop;
        }

        public final /* synthetic */ Object call() {
            zjf zjf = new zjf(xai.a, ((xaj) this.a.b.b()).a(), acgv.a().a(xai.c).a());
            Object b = this.a.b();
            akcr.a(b, "navHost");
            achd achd = zjf;
            Object obj = xai.b;
            akcr.a(obj, "SPECTACLES_SETTINGS_PRESENT_DEFAULT");
            zjw.a((zjw) this.a.a.b(), ojc.a, false, new acip(b, achd, obj), null, 8);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xop.class), "navHost", "getNavHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(xop.class), "deepLinkNavigator", "getDeepLinkNavigator()Lcom/snap/ui/deeplink/DeepLinkNavigator;"), new akdc(akde.a(xop.class), "spectaclesFragmentFactory", "getSpectaclesFragmentFactory()Lcom/snap/spectacles/api/SpectaclesFragmentFactory;")};
        a aVar = new a();
    }

    public xop(ajwy<achb<zjm, zjk>> ajwy, ajwy<zjw> ajwy2, ajwy<xaj> ajwy3) {
        akcr.b(ajwy, "navigationHostLazy");
        akcr.b(ajwy2, "deepLinkNavigatorLazy");
        akcr.b(ajwy3, "spectaclesFragmentFactoryLazy");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
    }

    public final List<String> a() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final achb<zjm, zjk> b() {
        return (achb) this.f.b();
    }

    public final ajcx c(Uri uri) {
        Object a;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        if (b().c && akcr.a((zjm) b().h(), xai.a)) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            a = ajcx.b((Callable) new c(this));
            str = "Completable.fromCallable…lse, navigable)\n        }";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
