package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajdz;
import defpackage.ajej;
import defpackage.ajwh;
import defpackage.sj;
import defpackage.sn;
import java.util.concurrent.Executor;

public abstract class RxWorker extends ListenableWorker {
    static final Executor d = new sj();
    private a<androidx.work.ListenableWorker.a> e;

    static class a<T> implements ajdz<T>, Runnable {
        final sn<T> a = new sn();
        private ajej b;

        a() {
            this.a.addListener(this, RxWorker.d);
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            ajej ajej = this.b;
            if (ajej != null) {
                ajej.dispose();
            }
        }

        public final void a(ajej ajej) {
            this.b = ajej;
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.a((Object) t);
        }

        public final void run() {
            if (this.a.isCancelled()) {
                a();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ListenableFuture<androidx.work.ListenableWorker.a> a() {
        this.e = new a();
        e().b(d()).a(ajwh.a(this.b.d.c())).a(this.e);
        return this.e.a;
    }

    public void c() {
        super.c();
        a aVar = this.e;
        if (aVar != null) {
            aVar.a();
            this.e = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public ajdw d() {
        return ajwh.a(this.b.c);
    }

    public abstract ajdx<androidx.work.ListenableWorker.a> e();
}
