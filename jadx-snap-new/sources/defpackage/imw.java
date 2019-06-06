package defpackage;

import com.snap.graphene.impl.api.upload.GrapheneUploadJob;
import defpackage.imz.a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: imw */
public final class imw implements imv {
    final ftl a;
    final aipn<hwl> b;
    private final ajxe c = ajxh.a(new a(this));
    private final ajdw d;
    private final ajwy<imz> e;

    /* renamed from: imw$a */
    static final class a extends akcs implements akbk<abmj<String, byte[]>> {
        private /* synthetic */ imw a;

        a(imw imw) {
            this.a = imw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abmj(this.a.a.f(ima.MAX_RETRY_QUEUE_SIZE), 7, TimeUnit.DAYS);
        }
    }

    /* renamed from: imw$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: imw$c */
    static final class c<T> implements ajfl<a> {
        private /* synthetic */ imw a;

        c(imw imw) {
            this.a = imw;
        }

        public final /* synthetic */ boolean test(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            return !this.a.a().c(aVar.b);
        }
    }

    /* renamed from: imw$d */
    static final class d<T, R> implements ajfc<a, ajdb> {
        private /* synthetic */ imw a;

        d(imw imw) {
            this.a = imw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "networkFailure");
            this.a.a().a(aVar.b, aVar.a);
            hwl hwl = (hwl) this.a.b.get();
            String str = aVar.b;
            akcr.b(str, "uuid");
            return hwl.a((hwg) new GrapheneUploadJob(imx.a, str));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(imw.class), "cache", "getCache()Lcom/snapchat/android/framework/collection/LRUCache;");
    }

    public imw(ajdw ajdw, ftl ftl, ajwy<imz> ajwy, aipn<hwl> aipn) {
        akcr.b(ajdw, "concurrentScheduler");
        akcr.b(ftl, "config");
        akcr.b(ajwy, "uploader");
        akcr.b(aipn, "durableJobManagerLazy");
        this.d = ajdw;
        this.a = ftl;
        this.e = ajwy;
        this.b = aipn;
    }

    public final abmj<String, byte[]> a() {
        return (abmj) this.c.b();
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "failure");
        Object e = ajdx.c((Callable) new b(aVar)).a(this.d).a((ajfl) new c(this)).e(new d(this));
        akcr.a(e, "Single.fromCallable { fa…re.id))\n                }");
        return e;
    }

    public final void a(String str) {
        akcr.b(str, "id");
        a().d(str);
    }

    public final ajdx<akxa<Void>> b(String str) {
        akcr.b(str, "id");
        Object obj = (byte[]) a().a(str);
        if (obj != null) {
            imz imz = (imz) this.e.get();
            akcr.a(obj, "it");
            ajdx a = imz.a(obj, str);
            if (a != null) {
                return a;
            }
        }
        obj = ajdx.b(akxa.a(new NoSuchElementException("Unexpected invalid key ".concat(String.valueOf(str)))));
        akcr.a(obj, "Single.just(Result.error…ted invalid key ${id}\")))");
        return obj;
    }
}
