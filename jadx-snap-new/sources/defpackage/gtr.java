package defpackage;

import com.snap.framework.developer.BuildConfigInfo;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gtr */
public final class gtr {
    final AtomicBoolean a = new AtomicBoolean(false);
    final AtomicBoolean b = new AtomicBoolean(false);
    final ajwy<ftl> c;
    final ajwy<tnj> d;
    final ajwy<abss> e;
    final ajwy<BuildConfigInfo> f;

    /* renamed from: gtr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gtr$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ gtr a;

        c(gtr gtr) {
            this.a = gtr;
        }

        public final /* synthetic */ Object call() {
            gtr gtr = this.a;
            boolean z = false;
            if (((BuildConfigInfo) gtr.f.get()).CRASHLYTICS_ENABLED) {
                if (((abss) gtr.e.get()).d()) {
                    gtr.b.set(true);
                    gtr.a.set(true);
                    return Boolean.valueOf(this.a.b.get());
                }
                String j = ((ftl) gtr.c.get()).j(gse.CRASH_SAMPLE_UUID);
                CharSequence charSequence = j;
                Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                if (obj != null) {
                    j = iig.a().toString();
                    akcr.a((Object) j, "UUIDGenerator.nonCryptoRandomUUID().toString()");
                    ((tnj) gtr.d.get()).b().a((fth) gse.CRASH_SAMPLE_UUID, j).b();
                }
                int abs = Math.abs(j.hashCode() % MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
                double e = ((ftl) gtr.c.get()).e(gse.CRASH_SAMPLE_RATE);
                if (e == -1.0d) {
                    obj = gtr.e.get();
                    akcr.a(obj, "releaseManager.get()");
                    e = ((abss) obj).o() ? 1.0d : 0.1d;
                }
                if (((double) abs) < e * 1000.0d) {
                    z = true;
                }
            }
            gtr.b.set(z);
            gtr.a.set(true);
            return Boolean.valueOf(this.a.b.get());
        }
    }

    /* renamed from: gtr$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ gtr a;

        b(gtr gtr) {
            this.a = gtr;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.b.get());
        }
    }

    static {
        a aVar = new a();
    }

    public gtr(ajwy<ftl> ajwy, ajwy<tnj> ajwy2, ajwy<abss> ajwy3, ajwy<BuildConfigInfo> ajwy4) {
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "preferences");
        akcr.b(ajwy3, "releaseManager");
        akcr.b(ajwy4, "buildConfigInfo");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
    }

    public final synchronized ajdx<Boolean> a() {
        Object c;
        if (this.a.get()) {
            c = ajdx.c((Callable) new b(this));
            akcr.a(c, "Single.fromCallable { sh…portToCrashlytics.get() }");
            return c;
        }
        c = ajdx.c((Callable) new c(this));
        akcr.a(c, "Single.fromCallable {\n  …ytics.get()\n            }");
        return c;
    }
}
