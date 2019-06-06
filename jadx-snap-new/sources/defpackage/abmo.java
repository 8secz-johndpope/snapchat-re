package defpackage;

import android.os.Process;

@Deprecated
/* renamed from: abmo */
public final class abmo extends Thread {
    private final int a = 10;

    public abmo(String str, Runnable runnable, int i) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
