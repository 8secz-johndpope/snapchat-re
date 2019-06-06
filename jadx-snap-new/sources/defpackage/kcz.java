package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.kgj.a;
import java.util.List;

/* renamed from: kcz */
public final class kcz implements gvn {
    final ajxe a;
    final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final List<String> e = ajyl.a("snapchat://snap_pro?..*");

    /* renamed from: kcz$c */
    static final class c extends akcq implements akbk<zjw> {
        c(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zjw) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: kcz$g */
    static final class g extends akcq implements akbk<kgj> {
        g(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (kgj) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: kcz$b */
    static final class b extends akcq implements akbk<kgm> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (kgm) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: kcz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: kcz$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        f(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = kgr.a;
            akcr.a(obj, "ImpalaFeature.INSTANCE");
            return zgb.a((ide) obj, "SnapProDeepLinkHandler");
        }
    }

    /* renamed from: kcz$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ kcz a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        d(kcz kcz, String str, String str2) {
            this.a = kcz;
            this.b = str;
            this.c = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "<anonymous parameter 0>");
            kfv a = this.a.b().a(this.b);
            kgj kgj = (kgj) this.a.b.b();
            zjm zjm = a.e;
            Object obj2 = a.f;
            akcr.a(obj2, "SnapProLauncher.GENERIC_NAVIGATION_ACTION");
            return kgj.b(zjm, obj2, this.c, a != null ? a.d() : null);
        }
    }

    /* renamed from: kcz$e */
    static final class e<T, R> implements ajfc<acig<zjm, zjk>, ajdb> {
        private /* synthetic */ kcz a;

        e(kcz kcz) {
            this.a = kcz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            acig acig = (acig) obj;
            akcr.b(acig, "navigable");
            zjw.a((zjw) this.a.a.b(), null, true, acig, null, 9);
            return ajvo.a(ajhn.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(kcz.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(kcz.class), "deepLinkNavigator", "getDeepLinkNavigator()Lcom/snap/ui/deeplink/DeepLinkNavigator;"), new akdc(akde.a(kcz.class), "snapProLauncher", "getSnapProLauncher()Lcom/snap/impala/model/businessprofile/SnapProLauncher;"), new akdc(akde.a(kcz.class), "businessProfilesManager", "getBusinessProfilesManager()Lcom/snap/impala/model/businessprofile/manager/BusinessProfilesManager;")};
        a aVar = new a();
    }

    public kcz(zgb zgb, ajwy<zjw> ajwy, ajwy<kgj> ajwy2, ajwy<kgm> ajwy3) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "deepLinkNavigator");
        akcr.b(ajwy2, "snapProLauncher");
        akcr.b(ajwy3, "businessProfilesManager");
        this.c = ajxh.a(new f(zgb));
        this.a = ajxh.a(new c(ajwy));
        this.b = ajxh.a(new g(ajwy2));
        this.d = ajxh.a(new b(ajwy3));
    }

    public final List<String> a() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final kgm b() {
        return (kgm) this.d.b();
    }

    public final ajcx c(Uri uri) {
        Object a;
        akcr.b(uri, MessageMediaRefModel.URI);
        String queryParameter = uri.getQueryParameter("route");
        if (queryParameter == null) {
            a = ajvo.a(ajhn.a);
            queryParameter = "Completable.complete()";
        } else {
            String queryParameter2 = uri.getQueryParameter("profileId");
            a = (queryParameter2 == null ? ajdp.b(Boolean.TRUE) : b().c()).n(new d(this, queryParameter2, queryParameter)).a((ajdw) ((zfw) this.c.b()).l()).a((ajfc) new e(this), false);
            queryParameter = "profilesObservable\n     …plete()\n                }";
        }
        akcr.a(a, queryParameter);
        return a;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
