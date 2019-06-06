package defpackage;

import com.snap.fidelius.deps.FideliusHttpInterface;
import com.snap.fidelius.impl.FetchFideliusUpdatesDurableJob;
import defpackage.hwm.a;
import java.util.concurrent.Callable;

/* renamed from: iav */
public final class iav implements hwm<FetchFideliusUpdatesDurableJob, ahra> {
    final FideliusHttpInterface a;
    private final zfw b = zgb.a(hyn.a.callsite("FetchFideliusUpdatesDurableJob"));
    private final ajfb<ahra> c;
    private final ajfb<Throwable> d;

    /* renamed from: iav$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ FetchFideliusUpdatesDurableJob a;

        a(FetchFideliusUpdatesDurableJob fetchFideliusUpdatesDurableJob) {
            this.a = fetchFideliusUpdatesDurableJob;
        }

        public final /* synthetic */ Object call() {
            ahqy ahqy = new ahqy();
            ahqy.a = ((iau) this.a.d).a;
            return ahqy;
        }
    }

    /* renamed from: iav$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ iav a;

        b(iav iav) {
            this.a = iav;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ahqy ahqy = (ahqy) obj;
            akcr.b(ahqy, "req");
            return this.a.a.updates(ahqy);
        }
    }

    public iav(zgb zgb, FideliusHttpInterface fideliusHttpInterface, ajfb<ahra> ajfb, ajfb<Throwable> ajfb2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(fideliusHttpInterface, "fideliusHttpInterface");
        akcr.b(ajfb, "onSuccess");
        akcr.b(ajfb2, "onFailure");
        this.a = fideliusHttpInterface;
        this.c = ajfb;
        this.d = ajfb2;
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
        FetchFideliusUpdatesDurableJob fetchFideliusUpdatesDurableJob = (FetchFideliusUpdatesDurableJob) hwg;
        String str = "durableJob";
        akcr.b(fetchFideliusUpdatesDurableJob, str);
        akcr.b(fetchFideliusUpdatesDurableJob, str);
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        FetchFideliusUpdatesDurableJob fetchFideliusUpdatesDurableJob = (FetchFideliusUpdatesDurableJob) hwg;
        akcr.b(fetchFideliusUpdatesDurableJob, "durableJob");
        return a.a(fetchFideliusUpdatesDurableJob);
    }

    public final /* bridge */ /* synthetic */ ide c() {
        return hyn.a;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        FetchFideliusUpdatesDurableJob fetchFideliusUpdatesDurableJob = (FetchFideliusUpdatesDurableJob) hwg;
        String str = "durableJob";
        akcr.b(fetchFideliusUpdatesDurableJob, str);
        akcr.b(fetchFideliusUpdatesDurableJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        FetchFideliusUpdatesDurableJob fetchFideliusUpdatesDurableJob = (FetchFideliusUpdatesDurableJob) hwg;
        akcr.b(fetchFideliusUpdatesDurableJob, "durableJob");
        return a.b(fetchFideliusUpdatesDurableJob);
    }
}
