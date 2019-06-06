package defpackage;

import defpackage.miq.c.a;
import defpackage.mpf.a.b;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: mmy */
public final class mmy implements mpf {
    final mpc a;
    final mpd b;
    private final zfw c;

    /* renamed from: mmy$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ mmy a;

        a(mmy mmy) {
            this.a = mmy;
        }

        public final /* synthetic */ Object call() {
            return this.a.a.a();
        }
    }

    /* renamed from: mmy$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return mhr.a(file, this.a);
        }
    }

    /* renamed from: mmy$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return ajxs.a(Boolean.valueOf(mhr.a(file)), file);
        }
    }

    /* renamed from: mmy$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return ((Boolean) ajxm.a).booleanValue() ? ajdp.b((File) ajxm.b) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: mmy$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            akcr.a((Object) instance, "MessageDigest.getInstance(\"SHA-256\")");
            akcr.b(file, "receiver$0");
            akcr.b(instance, "digest");
            return ajxs.a(mhr.a(mhr.a(file, instance, new ArrayList()), instance), file);
        }
    }

    /* renamed from: mmy$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ mmy a;
        private /* synthetic */ String b;

        f(mmy mmy, String str) {
            this.a = mmy;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            byte[] bArr = (byte[]) ajxm.a;
            obj = (File) ajxm.b;
            mpd mpd = this.a.b;
            String str = this.b;
            akcr.a(obj, "file");
            return mpd.a(str, obj, bArr);
        }
    }

    /* renamed from: mmy$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            a b = mhr.b(file);
            if (b != null) {
                return b;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.lenses.common.Uri");
        }
    }

    public mmy(mpc mpc, mpd mpd, zfw zfw) {
        akcr.b(mpc, "trackingDataCacheResolver");
        akcr.b(mpd, "trackingDataChecksumValidator");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = mpc;
        this.b = mpd;
        this.c = zfw;
    }

    public final ajdp<miq> a(mpf.a aVar) {
        akcr.b(aVar, "queryCriteria");
        if (akcr.a((Object) aVar, mpf.a.a.a)) {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        } else if (aVar instanceof b) {
            String str = ((b) aVar).a;
            akcr.b(str, "trackingDataName");
            Object f = ajdp.b((Callable) new a(this)).b((ajdw) this.c.f()).p(new b(str)).p(c.a).u(d.a).p(e.a).x(new f(this, str)).p(g.a).f((ajdt) ajvo.a(ajot.a));
            akcr.a(f, "Observable.fromCallable …eNext(Observable.empty())");
            StringBuilder stringBuilder = new StringBuilder("cacheCheck[");
            stringBuilder.append(str);
            stringBuilder.append(']');
            return f;
        } else {
            throw new ajxk();
        }
    }
}
