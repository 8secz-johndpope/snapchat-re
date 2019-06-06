package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ahg */
public final class ahg {
    public static final Executor a = new 1();
    public static final Executor b = new 2();

    /* renamed from: ahg$1 */
    class 1 implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        1() {
        }

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    /* renamed from: ahg$2 */
    class 2 implements Executor {
        2() {
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
