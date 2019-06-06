package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hoo */
public final class hoo implements hol {
    final ajxe a;
    final ajxe b;
    private final ajxe c;

    /* renamed from: hoo$f */
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

    /* renamed from: hoo$d */
    static final class d extends akcq implements akbk<kgy> {
        d(ajwy ajwy) {
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
            return (kgy) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hoo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hoo$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hbn.f, "PublisherProfileNavigableProvider");
        }
    }

    /* renamed from: hoo$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ hoo a;
        private /* synthetic */ Uri b;
        private /* synthetic */ String c;

        b(hoo hoo, Uri uri, String str) {
            this.a = hoo;
            this.b = uri;
            this.c = str;
        }

        public final /* synthetic */ Object call() {
            aley aley = new aley();
            aley.c(hoc.e(this.b));
            aley.a(this.c);
            Boolean a = ((yut) this.a.a.b()).a(this.c);
            aley.a(a != null ? a.booleanValue() : false);
            return aley;
        }
    }

    /* renamed from: hoo$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hoo a;

        c(hoo hoo) {
            this.a = hoo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aley aley = (aley) obj;
            akcr.b(aley, "launchInfo");
            return ((kgy) this.a.b.b()).a(aley, aaua.SNAPCODE_PAGE, aats.NOTIF_EXTERNAL);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hoo.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hoo.class), "subscriptionDataSource", "getSubscriptionDataSource()Lcom/snap/subscription/api/SubscriptionDataSource;"), new akdc(akde.a(hoo.class), "publisherProfileLauncher", "getPublisherProfileLauncher()Lcom/snap/impala/model/publishers/PublisherProfileLauncher;")};
        a aVar = new a();
    }

    public hoo(zgb zgb, ajwy<yut> ajwy, ajwy<kgy> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "subscriptionDataSource");
        akcr.b(ajwy2, "publisherProfileLauncher");
        this.c = ajxh.a(new e(zgb));
        this.a = ajxh.a(new f(ajwy));
        this.b = ajxh.a(new d(ajwy2));
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
        return akcr.a((String) ajyu.g((List) pathSegments), (Object) "edition") && hoc.b(uri) != null && hoc.d(uri) == null && hoc.e(uri) != null;
    }

    public final ajdx<acig<zjm, zjk>> b(Uri uri) {
        Object a;
        akcr.b(uri, MessageMediaRefModel.URI);
        String b = hoc.b(uri);
        if (b == null) {
            a = ajvo.a(ajsn.a);
            b = "Single.never()";
        } else {
            a = ajdx.c((Callable) new b(this, uri, b)).b((ajdw) b().h()).a((ajdw) b().l()).a((ajfc) new c(this));
            b = "Single.fromCallable {\n  …TERNAL)\n                }";
        }
        akcr.a(a, b);
        return a;
    }
}
