package defpackage;

import android.os.Build.VERSION;
import android.os.CancellationSignal;

/* renamed from: ij */
public final class ij {
    public boolean a;
    public Object b;
    public boolean c;

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public final Object b() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.b == null) {
                this.b = new CancellationSignal();
                if (this.a) {
                    ((CancellationSignal) this.b).cancel();
                }
            }
            obj = this.b;
        }
        return obj;
    }
}
