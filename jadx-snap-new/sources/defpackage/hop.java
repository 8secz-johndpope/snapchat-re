package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hop */
public final class hop implements hol {
    final ajxe a;
    final ajxe b;
    private final ajxe c;

    /* renamed from: hop$f */
    static final class f extends akcq implements akbk<yut> {
        f(ajwy ajwy) {
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
            return (yut) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hop$e */
    static final class e extends akcq implements akbk<khb> {
        e(ajwy ajwy) {
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
            return (khb) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hop$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hop$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        d(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hbn.f, "ShowProfileNavigableProvider");
        }
    }

    /* renamed from: hop$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ hop a;
        private /* synthetic */ Uri b;
        private /* synthetic */ long c;
        private /* synthetic */ String d;

        b(hop hop, Uri uri, long j, String str) {
            this.a = hop;
            this.b = uri;
            this.c = j;
            this.d = str;
        }

        public final /* synthetic */ Object call() {
            alfb alfb = new alfb();
            alfb.a(hoc.d(this.b));
            alfb.f(hoc.e(this.b));
            alfb.a(this.c);
            Boolean a = ((yut) this.a.a.b()).a(this.d);
            alfb.a(a != null ? a.booleanValue() : false);
            return alfb;
        }
    }

    /* renamed from: hop$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hop a;

        c(hop hop) {
            this.a = hop;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alfb alfb = (alfb) obj;
            akcr.b(alfb, "launchInfo");
            return ((khb) this.a.b.b()).a(alfb, aaua.SNAPCODE_PAGE, aats.NOTIF_EXTERNAL);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hop.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hop.class), "subscriptionDataSource", "getSubscriptionDataSource()Lcom/snap/subscription/api/SubscriptionDataSource;"), new akdc(akde.a(hop.class), "showProfileLauncher", "getShowProfileLauncher()Lcom/snap/impala/model/shows/ShowProfileLauncher;")};
        a aVar = new a();
    }

    public hop(zgb zgb, ajwy<yut> ajwy, ajwy<khb> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "subscriptionDataSource");
        akcr.b(ajwy2, "showProfileLauncher");
        this.c = ajxh.a(new d(zgb));
        this.a = ajxh.a(new f(ajwy));
        this.b = ajxh.a(new e(ajwy2));
    }

    private final zfw b() {
        return (zfw) this.c.b();
    }

    public final int a() {
        return 1;
    }

    public final boolean a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object pathSegments = uri.getPathSegments();
        akcr.a(pathSegments, "uri.pathSegments");
        return (!akcr.a((String) ajyu.g((List) pathSegments), (Object) "edition") || hoc.a(uri) != null || hoc.b(uri) == null || hoc.d(uri) == null || hoc.e(uri) == null) ? false : true;
    }

    public final ajdx<acig<zjm, zjk>> b(Uri uri) {
        Object a;
        akcr.b(uri, MessageMediaRefModel.URI);
        String b = hoc.b(uri);
        String str = "Single.never()";
        if (b != null) {
            Long f = akga.f(b);
            if (f != null) {
                a = ajdx.c((Callable) new b(this, uri, f.longValue(), b)).b((ajdw) b().h()).a((ajdw) b().l()).a((ajfc) new c(this));
                str = "Single.fromCallable {\n  …TERNAL)\n                }";
                akcr.a(a, str);
                return a;
            }
        }
        a = ajvo.a(ajsn.a);
        akcr.a(a, str);
        return a;
    }
}
