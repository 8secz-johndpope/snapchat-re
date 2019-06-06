package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: py */
public abstract class py {
    private static final String a = pq.a("WorkerFactory");

    /* renamed from: py$1 */
    static class 1 extends py {
        1() {
        }

        public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = a(context, str, workerParameters);
        if (a != null) {
            return a;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                pq.a().c(a, "Could not instantiate ".concat(String.valueOf(str)), e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            pq.a().c(a, "Class not found: ".concat(String.valueOf(str)), new Throwable[0]);
            return null;
        }
    }
}
