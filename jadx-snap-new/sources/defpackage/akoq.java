package defpackage;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.VmPolicy;
import java.io.Closeable;

/* renamed from: akoq */
public final class akoq implements Closeable {
    private final ThreadPolicy a;
    private final VmPolicy b;

    private akoq(ThreadPolicy threadPolicy) {
        this.a = threadPolicy;
        this.b = null;
    }

    public akoq(ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }

    public static akoq a() {
        return new akoq(StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    public final void close() {
        ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
