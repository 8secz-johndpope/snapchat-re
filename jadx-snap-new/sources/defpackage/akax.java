package defpackage;

import java.io.Closeable;

/* renamed from: akax */
public final class akax {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ajxa.a(th, th2);
            }
        }
    }
}
