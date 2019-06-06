package defpackage;

import com.snap.subscription.api.SubscriptionCleanupJob;
import defpackage.hwm.a;
import java.util.concurrent.Callable;

/* renamed from: yvl */
public final class yvl implements hwm<SubscriptionCleanupJob, Boolean> {
    final ajwy<yut> a;
    private final zfw b;

    /* renamed from: yvl$a */
    static final class a<V> implements Callable<Object> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return ajxw.a;
        }
    }

    /* renamed from: yvl$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ yvl a;

        b(yvl yvl) {
            this.a = yvl;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(((yut) this.a.a.get()).b());
        }
    }

    /* renamed from: yvl$c */
    static final class c<T> implements ajfb<Integer> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yvl$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "it");
            boolean z = false;
            if (akcr.a(num.intValue(), 0) >= 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: yvl$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public yvl(ajwy<yut> ajwy, zfw zfw) {
        akcr.b(ajwy, "subscriptionDataSource");
        akcr.b(zfw, "schedulers");
        this.a = ajwy;
        this.b = zfw;
    }

    public final void a(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final void a(String str, Integer num) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final boolean a(Throwable th) {
        String str = "throwable";
        akcr.b(th, str);
        akcr.b(th, str);
        return false;
    }

    public final /* bridge */ /* synthetic */ void b(hwg hwg) {
        akcr.b((SubscriptionCleanupJob) hwg, "durableJob");
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        akcr.b((SubscriptionCleanupJob) hwg, "durableJob");
        Object b = ajcx.b((Callable) a.a);
        akcr.a(b, "Completable.fromCallable…CleanupJob failed\")\n    }");
        return b;
    }

    public final ide c() {
        return hbn.f;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        SubscriptionCleanupJob subscriptionCleanupJob = (SubscriptionCleanupJob) hwg;
        String str = "durableJob";
        akcr.b(subscriptionCleanupJob, str);
        akcr.b(subscriptionCleanupJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        SubscriptionCleanupJob subscriptionCleanupJob = (SubscriptionCleanupJob) hwg;
        akcr.b(subscriptionCleanupJob, "durableJob");
        return a.b(subscriptionCleanupJob);
    }
}
