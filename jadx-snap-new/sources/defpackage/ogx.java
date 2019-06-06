package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ogx */
public final class ogx extends zgi {
    final odl a;
    final ajwy<odu> b;
    final ajwy<Set<ods>> c;
    private final ajxe d = ajxh.a(new b(this));
    private final AtomicBoolean e = new AtomicBoolean(false);
    private zgb f;

    /* renamed from: ogx$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ ogx a;

        b(ogx ogx) {
            this.a = ogx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.a, "MediaPackageManagerLifecycleObserver");
        }
    }

    /* renamed from: ogx$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ ogx a;

        a(ogx ogx) {
            this.a = ogx;
        }

        public final /* synthetic */ Object call() {
            Object obj = this.a.c.get();
            akcr.a(obj, "danglingPackageDetectors.get()");
            Iterable<ods> iterable = (Iterable) obj;
            boolean z = true;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (ods a : iterable) {
                    if ((a.a() ^ 1) == 0) {
                        z = false;
                        break;
                    }
                }
            }
            ((odu) this.a.b.get()).a(z);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ogx.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public ogx(zgb zgb, odl odl, ajwy<odu> ajwy, ajwy<Set<ods>> ajwy2, zgk<b> zgk) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(odl, "mediaRenderingFeature");
        akcr.b(ajwy, "mediaPackageManager");
        akcr.b(ajwy2, "danglingPackageDetectors");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.f = zgb;
        this.a = odl;
        this.b = ajwy;
        this.c = ajwy2;
    }

    public final ajej a() {
        Object c;
        String str;
        if (this.e.compareAndSet(false, true)) {
            c = ajdx.c((Callable) new a(this)).b((ajdw) ((zfw) this.d.b()).f()).c();
            str = "Single.fromCallable {\n  …edulers.io()).subscribe()";
        } else {
            c = ajfq.INSTANCE;
            str = "Disposables.disposed()";
        }
        akcr.a(c, str);
        return c;
    }
}
