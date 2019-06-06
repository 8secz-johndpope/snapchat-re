package defpackage;

import com.snap.blizzard.BlizzardDurableJob;
import defpackage.hwm.a;
import java.util.concurrent.Callable;

/* renamed from: dhz */
public final class dhz implements hwm<BlizzardDurableJob, Boolean> {
    final aipn<did> a;
    private final aipn<dic> b;
    private final aipn<dij> c;

    /* renamed from: dhz$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ dhz a;

        a(dhz dhz) {
            this.a = dhz;
        }

        public final /* synthetic */ Object call() {
            ((did) this.a.a.get()).a();
            return ajxw.a;
        }
    }

    public dhz(aipn<dic> aipn, aipn<dij> aipn2, aipn<did> aipn3) {
        akcr.b(aipn, "blizzard");
        akcr.b(aipn2, "blizzardTaskScheduler");
        akcr.b(aipn3, "blizzardInitializer");
        this.b = aipn;
        this.c = aipn2;
        this.a = aipn3;
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
        BlizzardDurableJob blizzardDurableJob = (BlizzardDurableJob) hwg;
        String str = "durableJob";
        akcr.b(blizzardDurableJob, str);
        akcr.b(blizzardDurableJob, str);
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        BlizzardDurableJob blizzardDurableJob = (BlizzardDurableJob) hwg;
        akcr.b(blizzardDurableJob, "durableJob");
        return a.a(blizzardDurableJob);
    }

    public final ide c() {
        return djb.a;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        BlizzardDurableJob blizzardDurableJob = (BlizzardDurableJob) hwg;
        String str = "durableJob";
        akcr.b(blizzardDurableJob, str);
        akcr.b(blizzardDurableJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        BlizzardDurableJob blizzardDurableJob = (BlizzardDurableJob) hwg;
        akcr.b(blizzardDurableJob, "durableJob");
        return a.b(blizzardDurableJob);
    }
}
