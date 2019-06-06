package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: akil */
public final class akil extends RuntimeException {
    static final Method a;
    public IOException b;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            declaredMethod = null;
        }
        a = declaredMethod;
    }

    public akil(IOException iOException) {
        super(iOException);
        this.b = iOException;
    }
}
