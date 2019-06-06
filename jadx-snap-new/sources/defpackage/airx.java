package defpackage;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: airx */
public abstract class airx<Params, Progress, Result> extends airs<Params, Progress, Result> implements airt<aisd>, aisa, aisd {
    private final aisb e = new aisb();

    /* renamed from: airx$a */
    static class a<Result> implements Executor {
        final airx a;
        private final Executor b;

        public a(Executor executor, airx airx) {
            this.b = executor;
            this.a = airx;
        }

        public final void execute(Runnable runnable) {
            this.b.execute(new airz<Result>(runnable) {
                public final <T extends airt<aisd> & aisa & aisd> T b() {
                    return a.this.a;
                }
            });
        }
    }

    public int a() {
        return this.e.a();
    }

    public final void a(aisd aisd) {
        if (this.b == 1) {
            this.e.a(aisd);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public final void a(Throwable th) {
        this.e.a(th);
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a(new a(executorService, this), (Object[]) paramsArr);
    }

    public final void a(boolean z) {
        this.e.a(z);
    }

    public final Collection<aisd> am_() {
        return this.e.am_();
    }

    public int compareTo(Object obj) {
        return airw.a(this, obj);
    }

    public final boolean g() {
        return this.e.g();
    }

    public final boolean h() {
        return this.e.h();
    }
}
