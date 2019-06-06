package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import androidx.work.ListenableWorker.a;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.sn;

public abstract class Worker extends ListenableWorker {
    sn<a> d;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ListenableFuture<a> a() {
        this.d = new sn();
        this.b.c.execute(new Runnable() {
            public final void run() {
                try {
                    Worker.this.d.a(Worker.this.d());
                } catch (Throwable th) {
                    Worker.this.d.a(th);
                }
            }
        });
        return this.d;
    }

    public abstract a d();
}
