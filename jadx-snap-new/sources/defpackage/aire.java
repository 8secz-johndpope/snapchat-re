package defpackage;

import android.os.Process;

/* renamed from: aire */
public abstract class aire implements Runnable {
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
