package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.snap.core.durablejob.schedulers.work.WorkManagerWorker;

/* renamed from: gca */
public final class gca {

    /* renamed from: gca$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gca$b */
    public static final class b extends py {
        private final gcc a;

        public b(gcc gcc) {
            akcr.b(gcc, "injector");
            this.a = gcc;
        }

        public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            akcr.b(context, "appContext");
            akcr.b(str, "workerClassName");
            akcr.b(workerParameters, "workerParameters");
            return new WorkManagerWorker(context, workerParameters, this.a);
        }
    }

    static {
        a aVar = new a();
    }

    protected gca() {
    }
}
