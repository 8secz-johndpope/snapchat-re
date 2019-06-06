package defpackage;

import java.io.IOException;

/* renamed from: sbx */
public final class sbx {
    public static IOException a(Throwable th) {
        return th == null ? new IOException("Can't throw null exception") : !(th.getCause() instanceof IOException) ? new IOException(th) : (IOException) th.getCause();
    }

    public static sbw a(String str) {
        return new -$$Lambda$sbx$5K0GInnCZkvn358O7PUX4ndbUXA(str);
    }
}
