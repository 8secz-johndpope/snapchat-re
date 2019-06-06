package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ovh.f;
import defpackage.ovh.g;
import defpackage.ovh.h;
import defpackage.pfl.a;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "memories_mini_thumbnail")
/* renamed from: pet */
public final class pet extends ggm {
    final pex a;
    final gee b;
    final ovh c;
    final pfl d;
    private final ajxe e;

    /* renamed from: pet$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: pet$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ pet a;
        private /* synthetic */ Uri b;

        c(pet pet, Uri uri) {
            this.a = pet;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            return new ghx(new gey(-3, new peh(this.a.a, "Content does not exist.", (byte) 0)));
        }
    }

    /* renamed from: pet$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pet a;
        private /* synthetic */ Set b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;
        private /* synthetic */ a e;

        b(pet pet, Set set, Set set2, boolean z, a aVar) {
            this.a = pet;
            this.b = set;
            this.c = set2;
            this.d = z;
            this.e = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            oqs oqs = (oqs) obj;
            akcr.b(oqs, "it");
            gee gee = this.a.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(oqs.a);
            stringBuilder.append(".mini_thumbnail");
            String stringBuilder2 = stringBuilder.toString();
            geo geo = this.a.a;
            Set set = this.b;
            ovh ovh = this.a.c;
            String str = oqs.a;
            akcr.b(str, "snapId");
            Object b = ajdx.c((Callable) new f(ovh, str)).b((ajdw) ovh.c().i());
            akcr.a(b, "Single\n                .…eOn(schedulers.queries())");
            ajdx a = gee.a(new gew(stringBuilder2, null, gem.a((ajdx) b, "media"), gii.c(new ggh(oqs.b).b(), null, 2), geo, set, this.c, 262)).a(this.d);
            akcr.a((Object) a, "contentManager\n         …tResult(closeOnTerminate)");
            return pnk.a(a, phi.CACHE_FETCH, this.e.e, false);
        }
    }

    /* renamed from: pet$d */
    static final class d<T> implements ajfb<gej> {
        private /* synthetic */ a a;

        d(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            a aVar = this.a;
            pej pej = pej.ContentManager;
            akcr.a(obj, "it");
            aVar.a(pej, obj.f().a);
            boolean a = obj.a();
            a aVar2 = this.a;
            aVar2.b = a;
            if (!a) {
                obj = obj.e();
                akcr.a(obj, "it.failureReason");
                aVar2.a = pfo.a(obj);
            }
        }
    }

    /* renamed from: pet$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ a a;

        e(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a = new phl(phh.UNKNOWN);
        }
    }

    /* renamed from: pet$f */
    static final class f implements ajev {
        private /* synthetic */ pet a;
        private /* synthetic */ a b;

        f(pet pet, a aVar) {
            this.a = pet;
            this.b = aVar;
        }

        public final void run() {
            this.a.d.a(this.b);
        }
    }

    /* renamed from: pet$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ oiy b;

        g(zgb zgb, oiy oiy) {
            this.a = zgb;
            this.b = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("MemoriesGridMiniThumbnailUriHandler"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(pet.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public pet(pex pex, gee gee, ovh ovh, pfl pfl, oiy oiy, zgb zgb) {
        akcr.b(pex, "contentType");
        akcr.b(gee, "contentManager");
        akcr.b(ovh, "memoriesDownloadRepository");
        akcr.b(pfl, "uriHandlerAnalytics");
        akcr.b(oiy, "feature");
        akcr.b(zgb, "schedulersProvider");
        this.a = pex;
        this.b = gee;
        this.c = ovh;
        this.d = pfl;
        this.e = ajxh.a(new g(zgb, oiy));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Object b;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        a a = this.d.a((geo) this.a);
        String queryParameter = uri.getQueryParameter("ID");
        if (queryParameter == null) {
            pet pet = this;
            a.a = new phl(phh.MISSING_ID);
            pet.d.a(a);
            b = ajdx.b(ghx.a.a((Throwable) new IllegalArgumentException("missing ID"), null));
            str = "Single.just(FailedConten…Exception(\"missing ID\")))";
        } else {
            ovh ovh = this.c;
            akcr.b(queryParameter, "entryId");
            ajdj a2 = ovh.c.c(queryParameter).f(g.a).a((ajfc) new h(ovh));
            akcr.a((Object) a2, "entryRepository.getSnapI…      }\n                }");
            ajdx a3 = pnk.a(a2, phi.REQUEST_INFO, a.e, false).a((ajdw) ((zfw) this.e.b()).b()).d((ajfc) new b(this, set, set2, z, a)).a((ajeb) ajdx.c((Callable) new c(this, uri)));
            akcr.a((Object) a3, "memoriesDownloadReposito…t.\")))\n                })");
            b = pnk.a(a3, phi.ALL, a.e, false).c((ajfb) new d(a)).d((ajfb) new e(a)).b((ajev) new f(this, a));
            str = "memoriesDownloadReposito…lytics)\n                }";
        }
        akcr.a(b, str);
        return b;
    }
}
