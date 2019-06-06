package defpackage;

import android.net.Uri;
import android.os.CancellationSignal;
import com.brightcove.player.media.VideoFields;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import defpackage.sru.b;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "streaming/*")
/* renamed from: sse */
public class sse extends ggm {
    private final ajxe a = ajxh.a(a.a);
    private final ajwy<ryw<ryz>> b;
    private final ssa c;
    private final geo d;

    /* renamed from: sse$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ bxh a;
        private /* synthetic */ bxe b;

        b(bxh bxh, bxe bxe) {
            this.a = bxh;
            this.b = bxe;
        }

        public final /* synthetic */ Object call() {
            ssg ssg = new ssg(this.a, this.b);
            if (ssg.a.compareAndSet(true, false)) {
                try {
                    ssg.b = ssg.f.open(ssg.e);
                } catch (IOException e) {
                    ssg.f.close();
                    ssg.c = false;
                    ssg.d = new gey(-4, e);
                    ssg.a.compareAndSet(false, true);
                }
            }
            Supplier ofInstance = Suppliers.ofInstance(ssg);
            akcr.a((Object) ofInstance, "Suppliers.ofInstance(inputStream)");
            Optional of = Optional.of(ssg);
            akcr.a((Object) of, "Optional.of(inputStream)");
            return gem.a(ofInstance, "datasource", of, ssg.c, ssg.b, ssg.d);
        }
    }

    /* renamed from: sse$c */
    static final class c<T, R> implements ajfc<Throwable, gej> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "e");
            return a.a(th, null);
        }
    }

    /* renamed from: sse$d */
    static final class d implements ajev {
        private /* synthetic */ CancellationSignal a;

        d(CancellationSignal cancellationSignal) {
            this.a = cancellationSignal;
        }

        public final void run() {
            this.a.cancel();
        }
    }

    /* renamed from: sse$a */
    static final class a extends akcs implements akbk<bym> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (bym) sxs.b().get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(sse.class), "cache", "getCache()Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;");
    }

    public sse(ajwy<ryw<ryz>> ajwy, ssa ssa, geo geo) {
        akcr.b(ajwy, "networkManager");
        akcr.b(ssa, "streamingNetworkRequestProvider");
        akcr.b(geo, "contentType");
        this.b = ajwy;
        this.c = ssa;
        this.d = geo;
    }

    private final bym a() {
        return (bym) this.a.b();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Uri uri2 = uri;
        String str = MessageMediaRefModel.URI;
        akcr.b(uri2, str);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String str2 = (String) uri.getPathSegments().get(1);
        akcr.b(uri2, str);
        str = uri2.getQueryParameter("pos");
        long parseLong = str != null ? Long.parseLong(str) : 0;
        String queryParameter = uri2.getQueryParameter(VideoFields.DURATION);
        ssf ssf = new ssf(parseLong, queryParameter != null ? Long.parseLong(queryParameter) : -1);
        bxh bxh = new bxh(uri, ssf.a, ssf.b, str2);
        CancellationSignal cancellationSignal = new CancellationSignal();
        Object a = new byb(a(), new b(new bxp(), new srq.b(this.b, set, this.c, ssh.a.a(uri2.getQueryParameter("additional_header")), cancellationSignal, this.d)), new bxp(), new bxz(a()), null).createDataSource();
        akcr.a(a, "CacheDataSourceFactory(\n… null).createDataSource()");
        ajdx c = ajdx.c((Callable) new b(bxh, (bxe) a));
        akcr.a((Object) c, "Single.fromCallable {\n  …utStream.failureReason) }");
        Object c2 = gem.a(c, z).g(c.a).c((ajev) new d(cancellationSignal));
        akcr.a(c2, "Single.fromCallable {\n  …ancel()\n                }");
        return c2;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        throw new UnsupportedOperationException();
    }
}
