package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: gez */
public interface gez extends Closeable {
    int a();

    InputStream a(int i);

    long b();

    @Deprecated
    File b(int i);

    long c(int i);

    gez c();
}
