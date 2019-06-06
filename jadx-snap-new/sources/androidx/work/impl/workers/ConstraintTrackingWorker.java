package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.a;
import androidx.work.ListenableWorker.a.b;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.pq;
import defpackage.qg;
import defpackage.qv;
import defpackage.qw;
import defpackage.rv;
import defpackage.sn;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements qv {
    static final String d = pq.a("ConstraintTrkngWrkr");
    WorkerParameters e;
    final Object f = new Object();
    volatile boolean g = false;
    sn<a> h = new sn();
    ListenableWorker i;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$2 */
    class AnonymousClass2 implements Runnable {
        private /* synthetic */ ListenableFuture a;

        AnonymousClass2(ListenableFuture listenableFuture) {
            this.a = listenableFuture;
        }

        public final void run() {
            synchronized (ConstraintTrackingWorker.this.f) {
                if (ConstraintTrackingWorker.this.g) {
                    ConstraintTrackingWorker.this.e();
                } else {
                    ConstraintTrackingWorker.this.h.a(this.a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = workerParameters;
    }

    public final ListenableFuture<a> a() {
        this.b.c.execute(new Runnable() {
            public final void run() {
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = constraintTrackingWorker.b.b.b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                CharSequence charSequence = obj instanceof String ? (String) obj : null;
                if (TextUtils.isEmpty(charSequence)) {
                    pq.a().c(ConstraintTrackingWorker.d, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.d();
                    return;
                }
                constraintTrackingWorker.i = constraintTrackingWorker.b.e.b(constraintTrackingWorker.a, charSequence, constraintTrackingWorker.e);
                if (constraintTrackingWorker.i == null) {
                    pq.a().a(ConstraintTrackingWorker.d, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.d();
                    return;
                }
                rv b = qg.b().c.g().b(constraintTrackingWorker.b.a.toString());
                if (b == null) {
                    constraintTrackingWorker.d();
                    return;
                }
                qw qwVar = new qw(constraintTrackingWorker.a, constraintTrackingWorker);
                qwVar.a(Collections.singletonList(b));
                if (qwVar.a(constraintTrackingWorker.b.a.toString())) {
                    pq.a().a(ConstraintTrackingWorker.d, String.format("Constraints met for delegate %s", new Object[]{charSequence}), new Throwable[0]);
                    try {
                        ListenableFuture a = constraintTrackingWorker.i.a();
                        a.addListener(new AnonymousClass2(a), constraintTrackingWorker.b.c);
                        return;
                    } catch (Throwable th) {
                        pq.a().a(ConstraintTrackingWorker.d, String.format("Delegated worker %s threw exception in startWork.", new Object[]{charSequence}), th);
                        synchronized (constraintTrackingWorker.f) {
                            if (constraintTrackingWorker.g) {
                                pq.a().a(ConstraintTrackingWorker.d, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.e();
                            } else {
                                constraintTrackingWorker.d();
                            }
                            return;
                        }
                    }
                }
                pq.a().a(ConstraintTrackingWorker.d, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{charSequence}), new Throwable[0]);
                constraintTrackingWorker.e();
            }
        });
        return this.h;
    }

    public final void a(List<String> list) {
    }

    public final void b(List<String> list) {
        pq.a().a(d, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f) {
            this.g = true;
        }
    }

    public final void c() {
        super.c();
        ListenableWorker listenableWorker = this.i;
        if (listenableWorker != null) {
            listenableWorker.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.h.a(new a.a());
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        this.h.a(new b());
    }
}
