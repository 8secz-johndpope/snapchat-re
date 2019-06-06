package defpackage;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiyu */
class aiyu implements Executor {
    private static final Logger a = Logger.getLogger(aiyu.class.getName());
    private boolean b;
    private ArrayDeque<Runnable> c;

    aiyu() {
    }

    private void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    a.log(Level.SEVERE, "Exception while executing runnable ".concat(String.valueOf(runnable)), th);
                }
            } else {
                return;
            }
        }
    }

    public void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable, "'task' must not be null.");
        if (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque(4);
            }
            this.c.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            a.log(Level.SEVERE, "Exception while executing runnable ".concat(String.valueOf(runnable)), th);
        } finally {
            if (this.c != null) {
                a();
            }
            this.b = false;
        }
    }
}
