package defpackage;

import defpackage.aivk.b;
import java.util.concurrent.TimeUnit;

/* renamed from: aivj */
public abstract class aivj<T extends aivj<T>> {
    public static aivj<?> a(String str) {
        if (aivk.a != null) {
            return aivk.a.a(str);
        }
        throw new b("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    public T a() {
        throw new UnsupportedOperationException();
    }

    public abstract T a(TimeUnit timeUnit);

    public abstract aivi b();

    public abstract T b(String str);
}
