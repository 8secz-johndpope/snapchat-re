package defpackage;

import android.net.Uri;
import defpackage.sah.a;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: ghc */
public final class ghc implements jwi {
    final aipn<gfu> a;
    final ajwy<sah> b;
    final ajwy<gel> c;

    /* renamed from: ghc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ghc$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ ghc a;

        b(ghc ghc) {
            this.a = ghc;
        }

        public final /* synthetic */ Object call() {
            return (gfu) this.a.a.get();
        }
    }

    /* renamed from: ghc$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ghc a;
        private /* synthetic */ jwh b;

        c(ghc ghc, jwh jwh) {
            this.a = ghc;
            this.b = jwh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gfu gfu = (gfu) obj;
            akcr.b(gfu, "resolver");
            Uri uri = this.b.a;
            akcr.a((Object) uri, "contentUri.uri");
            idl idl = this.b.b;
            akcr.a((Object) idl, "contentUri.uiPage");
            ajdx a = gfu.a(uri, idl, false, new gdy[0]);
            return this.b.c < 0 ? a : gek.a(a, a.a((sah) this.a.b.get(), gef.a.callsite("DefaultContentUriResolver"), this.b.c, 0, 4));
        }
    }

    /* renamed from: ghc$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ jwh a;

        e(jwh jwh) {
            this.a = jwh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            jwh.a aVar;
            if (gej.a()) {
                aVar = this.a.d;
                if (aVar != null) {
                    jwt jwt;
                    int i = ghd.a[gej.f().a.ordinal()];
                    if (i == 1) {
                        jwt = jwt.NETWORK;
                    } else if (i == 2 || i == 3) {
                        jwt = jwt.DISK_CACHE;
                    } else {
                        throw new IllegalStateException();
                    }
                    aVar.a(jwt);
                }
            } else {
                aVar = this.a.d;
                if (aVar != null) {
                    Object e = gej.e();
                    String str = "it.failureReason";
                    akcr.a(e, str);
                    e = e.c();
                    akcr.a(e, "it.failureReason.error");
                    Object e2 = gej.e();
                    akcr.a(e2, str);
                    aVar.a(e, e2.a());
                }
            }
            return gej;
        }
    }

    /* renamed from: ghc$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            Closeable closeable = gej;
            obj = gej.b();
            akcr.a(obj, "it.openDefaultAsset()");
            return new ggd(closeable, obj);
        }
    }

    /* renamed from: ghc$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ ghc a;
        private /* synthetic */ jwh b;

        d(ghc ghc, jwh jwh) {
            this.a = ghc;
            this.b = jwh;
        }

        public final /* synthetic */ Object call() {
            gel gel = (gel) this.a.c.get();
            Object obj = this.b.a;
            akcr.a(obj, "contentUri.uri");
            return gel.a(new File(obj.getPath()), "glideFile");
        }
    }

    static {
        a aVar = new a();
    }

    public ghc(aipn<gfu> aipn, ajwy<sah> ajwy, ajwy<gel> ajwy2) {
        akcr.b(aipn, "contentResolverLazy");
        akcr.b(ajwy, "backoffController");
        akcr.b(ajwy2, "contentResultFactory");
        this.a = aipn;
        this.b = ajwy;
        this.c = ajwy2;
    }

    public final ajdx<InputStream> a(jwh jwh) {
        String str;
        akcr.b(jwh, "contentUri");
        Object obj = jwh.a;
        akcr.a(obj, "contentUri.uri");
        if (akgb.a("file", obj.getScheme(), true)) {
            obj = ajdx.c((Callable) new d(this, jwh));
            str = "Single.fromCallable { co…uri.path), \"glideFile\") }";
        } else {
            obj = ajdx.c((Callable) new b(this)).a((ajfc) new c(this, jwh));
            str = "Single.fromCallable { co…      }\n                }";
        }
        akcr.a(obj, str);
        Object f = obj.f(new e(jwh)).f(f.a);
        akcr.a(f, "contentResultSingle.map … it.openDefaultAsset()) }");
        return f;
    }
}
