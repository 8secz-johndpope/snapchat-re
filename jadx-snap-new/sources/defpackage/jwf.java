package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: jwf */
public final class jwf extends FilterInputStream {
    public final String a;
    public final boolean b;

    public /* synthetic */ jwf(String str, InputStream inputStream) {
        this(str, inputStream, true);
    }

    public jwf(String str, InputStream inputStream, byte b) {
        this(str, inputStream);
    }

    public jwf(String str, InputStream inputStream, boolean z) {
        akcr.b(str, "cacheKey");
        akcr.b(inputStream, "delegate");
        super(inputStream);
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return this.a;
    }
}
