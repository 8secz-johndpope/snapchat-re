package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: airz */
public class airz<V> extends FutureTask<V> implements airt<aisd>, aisa, aisd {
    private Object a;

    public airz(Runnable runnable, V v) {
        super(runnable, v);
        this.a = airz.b(runnable);
    }

    public airz(Callable<V> callable) {
        super(callable);
        this.a = airz.b(callable);
    }

    private static <T extends airt<aisd> & aisa & aisd> T b(Object obj) {
        return aisb.b(obj) ? (airt) obj : new aisb();
    }

    public final int a() {
        return ((aisa) b()).a();
    }

    public final void a(Throwable th) {
        ((aisd) ((aisa) b())).a(th);
    }

    public final void a(boolean z) {
        ((aisd) ((aisa) b())).a(z);
    }

    public final Collection<aisd> am_() {
        return ((airt) ((aisa) b())).am_();
    }

    public <T extends airt<aisd> & aisa & aisd> T b() {
        return (airt) this.a;
    }

    public int compareTo(Object obj) {
        return ((aisa) b()).compareTo(obj);
    }

    public final boolean g() {
        return ((airt) ((aisa) b())).g();
    }

    public final boolean h() {
        return ((aisd) ((aisa) b())).h();
    }
}
