package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zfs */
public final class zfs implements Runnable {
    static final Supplier<zgg> a = Suppliers.memoize(-$$Lambda$mLflKXnFJzfbhDem76BbCzGD9DM.INSTANCE);
    private idd b;
    private String c;
    private long d;
    private final zgg e;
    private final AtomicReference<aipn<zfq>> f;
    private final Runnable g;

    zfs(Runnable runnable, idd idd, AtomicReference<aipn<zfq>> atomicReference, zgg zgg) {
        this.e = zgg;
        this.f = atomicReference;
        this.g = runnable;
        this.b = idd;
        this.c = zfv.a(runnable);
        this.d = zgg.a();
        aipn aipn = (aipn) atomicReference.get();
        if (aipn != null) {
            ((zfq) aipn.get()).a(idd.a.getProject().projectName, idd.a.getName(), idd.b());
        }
    }

    public final void run() {
        in.a(this.b.toString());
        try {
            aipn aipn = (aipn) this.f.get();
            long a = this.e.a();
            if (aipn != null) {
                ((zfq) aipn.get()).a(this.b.a.getProject().projectName, this.b.a.getName(), this.b.b(), a);
            }
            long b = this.e.b();
            this.g.run();
            long b2 = this.e.b() - b;
            long a2 = this.e.a() - a;
            if (aipn != null) {
                ((zfq) aipn.get()).a(this.b.a.getProject().projectName, this.b.a.getName(), this.b.b(), b2, a2, a);
            }
            in.a();
        } catch (Throwable th) {
            in.a();
        }
    }
}
