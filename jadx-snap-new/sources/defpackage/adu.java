package defpackage;

import android.util.Log;
import java.io.File;

/* renamed from: adu */
final class adu {
    private static final File a = new File("/proc/self/fd");
    private static volatile adu d;
    private volatile int b;
    private volatile boolean c = true;

    private adu() {
    }

    static adu a() {
        if (d == null) {
            synchronized (adu.class) {
                if (d == null) {
                    d = new adu();
                }
            }
        }
        return d;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b() {
        int i = this.b + 1;
        this.b = i;
        if (i >= 50) {
            boolean z = false;
            this.b = 0;
            int length = a.list().length;
            if (length < 700) {
                z = true;
            }
            this.c = z;
            if (!this.c && Log.isLoggable("Downsampler", 5)) {
                StringBuilder stringBuilder = new StringBuilder("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                stringBuilder.append(length);
                stringBuilder.append(", limit 700");
                Log.w("Downsampler", stringBuilder.toString());
            }
        }
        return this.c;
    }
}
