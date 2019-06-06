package defpackage;

import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aixy */
public final class aixy implements Runnable {
    private static final Logger a = Logger.getLogger(aixy.class.getName());
    private final Runnable b;

    public aixy(Runnable runnable) {
        this.b = (Runnable) Preconditions.checkNotNull(runnable, "task");
    }

    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder("Exception while executing runnable ");
            stringBuilder.append(this.b);
            logger.log(level, stringBuilder.toString(), th);
            Preconditions.checkNotNull(th);
            if (th instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) th;
            } else if (th instanceof Error) {
                Error error = (Error) th;
            } else {
                AssertionError assertionError = new AssertionError(th);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogExceptionRunnable(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
