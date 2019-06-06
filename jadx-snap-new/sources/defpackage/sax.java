package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: sax */
final class sax implements sbd {
    private final byte[] a;

    public sax(byte[] bArr) {
        akcr.b(bArr, "bytes");
        this.a = bArr;
    }

    public final InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    public final void close() {
    }
}
