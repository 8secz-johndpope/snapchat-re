package defpackage;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: ggd */
public final class ggd extends FilterInputStream {
    private final Closeable a;

    public ggd(Closeable closeable, InputStream inputStream) {
        akcr.b(closeable, "closeable");
        akcr.b(inputStream, "inputStream");
        super(inputStream);
        this.a = closeable;
    }

    public final void close() {
        try {
            super.close();
        } finally {
            aklc.a(this.a);
        }
    }
}
